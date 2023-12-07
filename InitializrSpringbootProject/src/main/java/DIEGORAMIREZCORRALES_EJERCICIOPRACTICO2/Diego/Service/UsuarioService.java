/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Service;

import DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Domain.Usuario;

/**
 *
 * @author ROURY
 */
public interface UsuarioService {
    Usuario autenticarUsuario(String correo, String contrasena );
    Usuario save(Usuario nombre_usuario );
}
