package com.example.Dia3.controller;

import com.example.Dia3.model.Mesa;
import com.example.Dia3.service.MesaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mesas")
public class MesaController {

    private final MesaService mesaService;

    public MesaController(MesaService mesaService) {
        this.mesaService = mesaService;
    }

    @PostMapping
    public ResponseEntity<Mesa> agregarMesa(@RequestBody Mesa mesa) {
        return ResponseEntity.ok(mesaService.agregarMesa(mesa));
    }

    @GetMapping
    public ResponseEntity<List<Mesa>> listarMesas() {
        return ResponseEntity.ok(mesaService.listarMesas());
    }

    @PutMapping
    public ResponseEntity<Mesa> actualizarMesa(@RequestBody Mesa mesa) {
        return ResponseEntity.ok(mesaService.actualizarMesa(mesa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarMesa(@PathVariable int id) {
        mesaService.eliminarMesa(id);
        return ResponseEntity.ok().build();
    }
}