/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Dao;

import DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Domain.Vuelos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ROURY
 */
public interface VuelosDao extends JpaRepository<Vuelos, Long> {
    List<Vuelos> findAll();  // Asegúrate de tener este método en la interfaz.
}
