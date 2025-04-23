package com.corhuila.app_movil_g2.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.app_movil_g2.models.Mesa;
import com.corhuila.app_movil_g2.services.IMesaService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class MesaRestController {

     @Autowired
    private IMesaService mesaService;

    @GetMapping("/mesa")
    public List<Mesa> listarMesas() {
        return mesaService.findAll();
    }

    @GetMapping("/mesa/{id}")
    public Mesa obtenerMesa(@PathVariable Long id) {
        return mesaService.findById(id);
    }

    @PostMapping("/mesa")
    @ResponseStatus(HttpStatus.CREATED)
    public Mesa registrarMesa(@RequestBody Mesa mesa) {
        return mesaService.save(mesa);
    }

    @PutMapping("/mesa/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Mesa actualizarMesa(@RequestBody Mesa mesa, @PathVariable Long id) {
        Mesa mesaActual = mesaService.findById(id);

        if (mesaActual != null) {
            mesaActual.setNumero(mesa.getNumero());
            mesaActual.setCapacidad(mesa.getCapacidad());
            mesaActual.setDisponible(mesa.isDisponible());
        }

        return mesaService.save(mesaActual);
    }

    @DeleteMapping("/mesa/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminarMesa(@PathVariable Long id) {
        mesaService.delete(id);

}
}
