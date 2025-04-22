package com.corhuila.app_movil_g2.services;
import java.util.List;

import com.corhuila.app_movil_g2.models.Cliente;
public interface IClienteService {

    public List<Cliente> findAll();

    public Cliente findById(Long id);

    public Cliente save(Cliente cliente);

    public void delete(Long id);
}