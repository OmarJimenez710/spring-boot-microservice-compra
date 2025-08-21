package com.compra.spring_boot_microservice_compra.service;

import com.compra.spring_boot_microservice_compra.model.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import com.compra.spring_boot_microservice_compra.repository.CompraRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

//servicio --> toma los peticiones del lado del controlador, y se va a comunicar con el repositorio, para poder generar las operacioenes adecucadas en la base de datos 

@Service
public class CompraServiceImp implements CompraService {

    // Inyeccion de dependencias
    @Autowired
    private CompraRepository compraRepository;

    @Override
    public Compra saveCompra(Compra compra) {

        // localdateTime.now() --> fecha y hora actual
        compra.setBuyDate(LocalDateTime.now());

        // el metodo save de JpaRepository ademas de insertar un registro en la base de
        // datos, regresa ese mismo objeto (incluyendo varios otros datos como el id)

        return compraRepository.save(compra);
    }

    @Override
    public List<Compra> findAllComprasOfUser(Long userId) {
        return compraRepository.findAllByUserId(userId);
    }

}
