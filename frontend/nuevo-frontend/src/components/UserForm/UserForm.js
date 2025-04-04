import React, { useState } from 'react';
import './UserForm.css';

function UserForm() {
  const [formData, setFormData] = useState({
    nombre: '',
    apellido: '',
    correo: '',
    contraseña: '',
    telefono: ''
  });

  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log('Datos enviados:', formData);
  };

  return (
    <form className="user-form" onSubmit={handleSubmit}>
      <input type="text" name="nombre" placeholder="Nombre" onChange={handleChange} />
      <input type="text" name="apellido" placeholder="Apellido" onChange={handleChange} />
      <input type="email" name="correo" placeholder="Correo electrónico" onChange={handleChange} />
      <input type="password" name="contraseña" placeholder="Contraseña" onChange={handleChange} />
      <input type="tel" name="telefono" placeholder="Teléfono" onChange={handleChange} />
      <button type="submit">Registrar</button>
    </form>
  );
}

export default UserForm;