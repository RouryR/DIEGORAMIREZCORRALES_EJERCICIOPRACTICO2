/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Controller;
import DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Domain.Usuario;
import DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author ROURY
 */
@Controller
@RequestMapping("/sesion")
public class SesionController {

    private String hashContrasena(String contrasena) {
    try {
        // Crea un objeto MessageDigest para el algoritmo SHA-256
        MessageDigest digest = MessageDigest.getInstance("SHA-256");

        // Aplica el hash a la contraseña
        byte[] hashBytes = digest.digest(contrasena.getBytes(StandardCharsets.UTF_8));

        // Convierte el hash de bytes a una representación hexadecimal
        StringBuilder hexString = new StringBuilder();
        for (byte hashByte : hashBytes) {
            String hex = Integer.toHexString(0xff & hashByte);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString();
    } catch (NoSuchAlgorithmException e) {
        // Manejo de excepciones en caso de que no se encuentre el algoritmo
        e.printStackTrace();
        // Podrías lanzar una excepción personalizada o retornar un valor predeterminado en caso de error
        return null;
    }
}
    
    
    
    @Autowired
    private UsuarioService authService;

    @GetMapping("/InicioSesion")
    public String mostrarPaginaLogin(Model model) {
        model.addAttribute("usuarioAutenticado", false);
        return "/sesion/InicioSesion";  
    }

    @PostMapping("/login")
public String autenticar(@RequestParam String correo, @RequestParam String contrasena, HttpSession session, Model model) {
    // Hashea la contraseña antes de autenticar
    String contrasenaHash = hashContrasena(contrasena);
    
    Usuario usuarioAutenticado = authService.autenticarUsuario(correo, contrasenaHash);

    if (usuarioAutenticado != null) {
        session.setAttribute("usuarioAutenticado", true);
        session.setAttribute("usuario", usuarioAutenticado);
        return "redirect:/usuario/UsuarioPage";
    } else {
        model.addAttribute("error", "Credenciales inválidas");
        return "/sesion/InicioSesion";
    }
}



}
