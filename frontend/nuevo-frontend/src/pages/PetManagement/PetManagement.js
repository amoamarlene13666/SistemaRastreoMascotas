import React, { useState } from 'react';
import PetCard from '../../components/PetCard/PetCard';

import './PetManagement.css';

function PetManagement() {
  const [pets, setPets] = useState([
    { id: 1, nombre: 'Firulais', especie: 'Perro', raza: 'Golden Retriever', edad: 5 },
    { id: 2, nombre: 'Michi', especie: 'Gato', raza: 'Siames', edad: 2 },
  ]);

  const [newPet, setNewPet] = useState({
    nombre: '',
    especie: '',
    raza: '',
    edad: '',
  });

  const handleChange = (e) => {
    setNewPet({ ...newPet, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (newPet.nombre && newPet.especie && newPet.raza && newPet.edad) {
      const petWithId = { ...newPet, id: pets.length + 1 };
      setPets([...pets, petWithId]);
      setNewPet({ nombre: '', especie: '', raza: '', edad: '' }); // Limpiar formulario
    }
  };

  return (
    <div className="pet-management">
      <h1>Gestión de Mascotas</h1>
      <form onSubmit={handleSubmit} className="pet-form">
        <input
          type="text"
          name="nombre"
          placeholder="Nombre de la mascota"
          value={newPet.nombre}
          onChange={handleChange}
        />
        <input
          type="text"
          name="especie"
          placeholder="Especie (Perro, Gato, etc.)"
          value={newPet.especie}
          onChange={handleChange}
        />
        <input
          type="text"
          name="raza"
          placeholder="Raza"
          value={newPet.raza}
          onChange={handleChange}
        />
        <input
          type="number"
          name="edad"
          placeholder="Edad"
          value={newPet.edad}
          onChange={handleChange}
        />
        <button type="submit">Registrar Mascota</button>
      </form>

      <div className="pet-list">
        {pets.map((pet) => (
          <PetCard key={pet.id} pet={pet} />
        ))}
      </div>
    </div>
  );
}

export default PetManagement;