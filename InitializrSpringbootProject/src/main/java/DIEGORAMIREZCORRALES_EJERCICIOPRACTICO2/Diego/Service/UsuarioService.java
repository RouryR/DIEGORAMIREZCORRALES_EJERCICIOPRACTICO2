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

    // Método para autenticar a un usuario dado su correo y contraseña
    // Retorna el objeto Usuario si la autenticación es exitosa, de lo contrario, retorna null
    Usuario autenticarUsuario(String correo, String contrasena);

    // Método para guardar un nuevo usuario en la base de datos
    // Retorna el objeto Usuario guardado
    Usuario save(Usuario usuario);
}

