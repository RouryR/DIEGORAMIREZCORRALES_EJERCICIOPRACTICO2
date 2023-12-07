package DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Controller;
import DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Domain.Usuario;
import DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Domain.Vuelos;
import DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Service.VuelosService;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@Slf4j
@RequestMapping("/usuario")
public class UsuarioPageController {

    @Autowired
    private VuelosService vuelosService;

    @GetMapping("/UsuarioPage")
    public String inicio(Model model, HttpSession session) {
        // Verifica si el usuario está autenticado
        if (session.getAttribute("usuarioAutenticado") != null) {
            // Verificar que el atributo es del tipo esperado antes de hacer el cast
            Object usuarioAtributo = session.getAttribute("usuario");
            if (usuarioAtributo instanceof Usuario) {
                // Si el usuario es del tipo esperado, obtén el objeto Usuario
                Usuario usuario = (Usuario) usuarioAtributo;
                model.addAttribute("usuario", usuario);

                // Obtén la lista de vuelos disponibles desde el servicio
                List<Vuelos> vuelosDisponibles = vuelosService.getVuelosDisponibles();
                
                // Agrega los vuelos al modelo
                model.addAttribute("vuelos", vuelosDisponibles);
                model.addAttribute("totalVuelos", vuelosDisponibles.size());

                // Devuelve la vista correspondiente (por ejemplo, "/usuario/UsuarioPage")
                return "/usuario/UsuarioPage";
            } else {
                // Manejar el caso en el que el atributo no es del tipo esperado
                return "redirect:/login"; // Redirige a la página de inicio de sesión
            }
        } else {
            // Manejar el caso en el que el atributo no está presente
            return "redirect:/login"; // Redirige a la página de inicio de sesión
        }
    }
}



    
    
 




