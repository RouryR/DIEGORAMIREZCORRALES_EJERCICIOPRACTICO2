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
    @Autowired
    private UsuarioDao usuarioDao;  

    @Override
    public Usuario autenticarUsuario(String correo, String contrasena) {

        return usuarioDao.findByCorreoAndContrasena(correo, contrasena);
    }
    
    @Override
    public Usuario save(Usuario nombre_usuario ) {
        usuarioDao.save(nombre_usuario );
        return nombre_usuario ;
    }
}
