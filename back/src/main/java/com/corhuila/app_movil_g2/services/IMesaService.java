package com.corhuila.app_movil_g2.services;

import java.util.List;


import com.corhuila.app_movil_g2.models.Mesa;

public interface IMesaService {

    List<Mesa> findAll();
    Mesa findById(Long id);
    Mesa save(Mesa mesa);
    void delete(Long id);
}
