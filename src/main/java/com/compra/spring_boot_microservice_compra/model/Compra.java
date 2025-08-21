package com.compra.spring_boot_microservice_compra.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import jakarta.persistence.Id;
import lombok.Data;

// clase que representa un mapeo con una tabla en la base de datos
@Entity
// nombre con el que aparece la tabla en la base de datos
@Table(name = "compra")
// genera getter y setter automáticamente
@Data
public class Compra {

    @Id // indica que es la clave primaria
    // representa la forma en la que va a generar el id (automatico incremental)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // indicamos que nombre de la base de datos va a tener
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "inmueble_id", nullable = false)
    private Long inmuebleId;

    @Column(name = "title", length = 100, nullable = false)
    private String title;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "buy_date", nullable = false)
    private LocalDateTime buyDate;
}
