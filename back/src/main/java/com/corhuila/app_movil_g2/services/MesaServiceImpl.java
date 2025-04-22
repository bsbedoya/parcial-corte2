package com.corhuila.app_movil_g2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.corhuila.app_movil_g2.models.Mesa;
import com.corhuila.app_movil_g2.repositories.IMesaRepository;

@Service
public class MesaServiceImpl implements IMesaService {

   
 @Autowired
    private IMesaRepository mesaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Mesa> findAll() {
        return (List<Mesa>) mesaRepository.findAll();
    }


    @Override
    public Mesa findById(Long id) {
        return mesaRepository.findById(id).orElse(null);
    }

    @Override
    public Mesa save(Mesa mesa) {
        return mesaRepository.save(mesa);
    }

    @Override
    public void delete(Long id) {
        mesaRepository.deleteById(id);
    }

}
