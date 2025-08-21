package com.compra.spring_boot_microservice_compra.service;

import java.util.List;

import com.compra.spring_boot_microservice_compra.model.Compra;

public interface CompraService {
    public Compra saveCompra(Compra compra);

    List<Compra> findAllComprasOfUser(Long userId);

}
