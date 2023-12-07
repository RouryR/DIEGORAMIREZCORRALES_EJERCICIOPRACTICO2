/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Service;

import DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Dao.VuelosDao;
import DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Domain.Vuelos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ROURY
 */
@Service
public class VuelosService {

    private final VuelosDao vuelosDao;

    // Constructor que inyecta una instancia de VuelosDao al servicio
    @Autowired
    public VuelosService(VuelosDao vuelosDao) {
        this.vuelosDao = vuelosDao;
    }

    // Método para obtener todos los vuelos disponibles
    // Retorna una lista de objetos Vuelos que representa los vuelos almacenados en la base de datos
    public List<Vuelos> getVuelosDisponibles() {
        return vuelosDao.findAll();
    }
}

