package com.rastreo.mascotas;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/mascotas")
public class MascotaController {

    @Autowired
    private MascotaRepository mascotaRepository;

    // Registrar una nueva mascota
    @PostMapping
    public Mascota registrarMascota(@RequestBody Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    // Listar todas las mascotas
    @GetMapping
    public List<Mascota> listarMascotas() {
        return mascotaRepository.findAll();
    }

    // Obtener detalles de una mascota específica por ID
    @GetMapping("/{id}")
    public Mascota obtenerMascota(@PathVariable Long id) {
        return mascotaRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Mascota no encontrada con ID: " + id));
    }

    // Actualizar los datos de una mascota
    @PutMapping("/{id}")
    public Mascota actualizarMascota(@PathVariable Long id, @RequestBody Mascota mascotaActualizada) {
        return mascotaRepository.findById(id).map(mascota -> {
            mascota.setNombre(mascotaActualizada.getNombre());
            mascota.setRaza(mascotaActualizada.getRaza());
            mascota.setEdad(mascotaActualizada.getEdad());
            return mascotaRepository.save(mascota);
        }).orElseThrow(() -> new RuntimeException("Mascota no encontrada con ID: " + id));
    }

    // Eliminar una mascota por ID
    @DeleteMapping("/{id}")
    public void eliminarMascota(@PathVariable Long id) {
        mascotaRepository.deleteById(id);
    }
}