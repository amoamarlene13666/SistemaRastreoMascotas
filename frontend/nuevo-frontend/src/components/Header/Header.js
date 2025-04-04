import React from 'react';
import './Header.css';

function Header() {
  return (
    <header className="header">
      <h1>Sistema de Rastreo de Mascotas</h1>
      <nav>
        <a href="/">Inicio</a>
        <a href="/pets">Gestión de Mascotas</a>
        <a href="/users">Gestión de Usuarios</a>
      </nav>
    </header>
  );
}

export default Header;