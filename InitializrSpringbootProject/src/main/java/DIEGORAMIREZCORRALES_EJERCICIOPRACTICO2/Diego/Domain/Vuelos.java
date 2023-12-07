/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.Date;

@Entity
public class Vuelos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Vuelos")
    private Long id_Vuelos;

    private String numero_vuelo;
    private String destino;
    private Date fecha_salida;
    private String modelo_avion;
    public Vuelos() {
    }

    public Long getId_Vuelos() {
        return id_Vuelos;
    }

    public void setId_Vuelos(Long id_Vuelos) {
        this.id_Vuelos = id_Vuelos;
    }

    public String getNumero_vuelo() {
        return numero_vuelo;
    }

    public void setNumero_vuelo(String numero_vuelo) {
        this.numero_vuelo = numero_vuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getModelo_avion() {
        return modelo_avion;
    }

    public void setModelo_avion(String modelo_avion) {
        this.modelo_avion = modelo_avion;
    }

    public Vuelos(Long id_Vuelos, String numero_vuelo, String destino, Date fecha_salida, String modelo_avion) {
        this.id_Vuelos = id_Vuelos;
        this.numero_vuelo = numero_vuelo;
        this.destino = destino;
        this.fecha_salida = fecha_salida;
        this.modelo_avion = modelo_avion;
    }

    

}
