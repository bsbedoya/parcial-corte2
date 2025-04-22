package com.corhuila.app_movil_g2.services;

import java.util.List;
import com.corhuila.app_movil_g2.models.Reserva;

public interface IReservaService {

    public List<Reserva> findAll();

    public Reserva findById(Long id);

    public Reserva save(Reserva reserva);

    public void delete(Long id);
}
