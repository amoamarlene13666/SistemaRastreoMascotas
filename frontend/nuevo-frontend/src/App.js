import React from 'react';
import PetManagement from './pages/PetManagement/PetManagement';

function App() {
  return (
    <div style={{ fontFamily: 'Arial, sans-serif', margin: '20px' }}>
      <header style={{ backgroundColor: '#4CAF50', padding: '10px', color: 'white', textAlign: 'center' }}>
        <h1>Sistema de Rastreo de Mascotas</h1>
      </header>
      <main style={{ padding: '20px' }}>
        <PetManagement />
      </main>
      <footer style={{ marginTop: '20px', textAlign: 'center', color: '#555' }}>
        <p>&copy; 2025 Sistema de Rastreo de Mascotas</p>
      </footer>
    </div>
  );
}

export default App;