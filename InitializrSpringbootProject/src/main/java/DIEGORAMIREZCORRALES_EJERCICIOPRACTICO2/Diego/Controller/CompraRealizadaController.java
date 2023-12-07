/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ROURY
 */
@Controller
@RequestMapping("/compra") //nombre de la carpeta
public class CompraRealizadaController {
    @GetMapping("/CompraRealizada") //nombre del html
    public String acercade() {

        return "/compra/CompraRealizada"; 
    }
}
