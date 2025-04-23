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

import com.corhuila.app_movil_g2.models.Reserva;
import com.corhuila.app_movil_g2.services.IReservaService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ReservaRestController {

    @Autowired
    private IReservaService reservaService;

    @GetMapping("/reserva")
    public List<Reserva> listarReservas() {
        return reservaService.findAll();
    }

    @GetMapping("/reserva/{id}")
    public Reserva obtenerReserva(@PathVariable Long id) {
        return reservaService.findById(id);
    }

    @PostMapping("/reserva")
    @ResponseStatus(HttpStatus.CREATED)
    public Reserva registrarReserva(@RequestBody Reserva reserva) {
        return reservaService.save(reserva);
    }

    @PutMapping("/reserva/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Reserva actualizarReserva(@RequestBody Reserva reserva, @PathVariable Long id) {
        Reserva reservaActual = reservaService.findById(id);

        reservaActual.setFecha(reserva.getFecha());
        reservaActual.setHora(reserva.getHora());
        reservaActual.setDescripcion(reserva.getDescripcion());
      

        return reservaService.save(reservaActual);

        
    }

    @DeleteMapping("/reserva/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminarReserva(@PathVariable Long id) {
        reservaService.delete(id);
}
}