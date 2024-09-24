package com.example.Dia3.controller;

import com.example.Dia3.model.Plato;
import com.example.Dia3.service.PlatoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/platos")
public class PlatoController {

    private final PlatoService platoService;

    public PlatoController(PlatoService platoService) {
        this.platoService = platoService;
    }

    @PostMapping
    public ResponseEntity<Plato> agregarPlato(@RequestBody Plato plato) {
        return ResponseEntity.ok(platoService.agregarPlato(plato));
    }

    @GetMapping
    public ResponseEntity<List<Plato>> listarPlatos() {
        return ResponseEntity.ok(platoService.listarPlatos());
    }

    @PutMapping
    public ResponseEntity<Plato> actualizarPlato(@RequestBody Plato plato) {
        return ResponseEntity.ok(platoService.actualizarPlato(plato));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPlato(@PathVariable int id) {
        platoService.eliminarPlato(id);
        return ResponseEntity.ok().build();
    }
}
