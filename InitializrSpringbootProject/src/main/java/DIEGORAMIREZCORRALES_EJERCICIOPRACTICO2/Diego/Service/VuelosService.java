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

    @Autowired
    public VuelosService(VuelosDao vuelosDao) {
        this.vuelosDao = vuelosDao;
    }

    public List<Vuelos> getVuelosDisponibles() {
        return vuelosDao.findAll();
    }


}
