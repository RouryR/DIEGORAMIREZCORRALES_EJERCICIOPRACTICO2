/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Service.Impl;

import DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Dao.UsuarioDao;
import DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Domain.Usuario;
import DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ROURY
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {

    // Inyección de dependencia del UsuarioDao en el servicio
    @Autowired
    private UsuarioDao usuarioDao;

    // Método para autenticar a un usuario dado su correo y contraseña
    // Retorna un objeto Usuario que representa al usuario autenticado, o null si no se encuentra
    @Override
    public Usuario autenticarUsuario(String correo, String contrasena) {
        return usuarioDao.findByCorreoAndContrasena(correo, contrasena);
    }

    // Método para guardar un usuario en la base de datos
    // Retorna el usuario guardado
    @Override
    public Usuario save(Usuario usuario) {
        usuarioDao.save(usuario);
        return usuario;
    }
}

