package com.compra.spring_boot_microservice_compra.repository;

import com.compra.spring_boot_microservice_compra.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CompraRepository extends JpaRepository<Compra, Long> {
    // JpaRepository --> Genera los metodos por defecto para generar consultas
    // (CRUD)
    // - Compra: Entidad sobre la cual se va a trabajar ciertas operaciones
    // - Long: Tipo de dato de la clave primaria de la entidad Compra

    // auque JpaRepository ya tiene implementados, si queremos generar otros, lo
    // realizamos de la siguiente manera:

    List<Compra> findAllByUserId(Long userId);

}
