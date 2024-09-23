package com.example.Dia3.service;

import org.springframework.stereotype.Service;
import com.example.Dia3.model.Plato;
import com.example.Dia3.repository.PlatoRepository;

import java.util.List;

@Service
public class PlatoService {
    private final PlatoRepository platoRepository;

    public PlatoService(PlatoRepository platoRepository) {
        this.platoRepository = platoRepository;
    }

    public Plato agregarPlato(Plato plato) {
        return platoRepository.save(plato);
    }

    public List<Plato> listarPlatos() {
        return platoRepository.findAll();
    }

    public Plato actualizarPlato(Plato plato) {
        return platoRepository.save(plato);
    }

    public void eliminarPlato(int id) {
        platoRepository.deleteById(id);
    }
}
