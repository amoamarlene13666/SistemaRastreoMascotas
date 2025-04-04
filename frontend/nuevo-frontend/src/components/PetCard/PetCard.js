import React from 'react';
import './PetCard.css';

function PetCard({ pet }) {
  return (
    <div className="pet-card">
      <h3>{pet.nombre}</h3>
      <p><strong>Especie:</strong> {pet.especie}</p>
      <p><strong>Raza:</strong> {pet.raza}</p>
      <p><strong>Edad:</strong> {pet.edad} años</p>
    </div>
  );
}

export default PetCard;