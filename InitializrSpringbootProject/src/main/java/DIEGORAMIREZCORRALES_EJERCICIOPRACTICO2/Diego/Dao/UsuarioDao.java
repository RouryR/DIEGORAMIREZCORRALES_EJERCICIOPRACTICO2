/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Dao;

import DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ROURY
 */
public interface UsuarioDao extends JpaRepository<Usuario, Long> {
    Usuario findByCorreoAndContrasena(String correo, String contrasena );
}
