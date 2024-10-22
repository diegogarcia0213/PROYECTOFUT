package co.ucentral.GestionFutbol.Controladores;


import co.ucentral.GestionFutbol.Persistencia.Dto.UsuarioDto;
import co.ucentral.GestionFutbol.Servicio.UsuarioServicio;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class UsuarioControlador {
    private UsuarioServicio usuarioServicio;

    public UsuarioControlador(UsuarioServicio usuarioServicio) {
        super();
        this.usuarioServicio = usuarioServicio;
    }

    @ModelAttribute("usuario")
    public UsuarioDto retornarNuevoUsuarioDto() {
        return new UsuarioDto();
    }

    @GetMapping
    public String mostrarFormularioDeRegritro() {
        return "registro";
    }

    @PostMapping
    public String regitrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioDto registroDTO) {
        usuarioServicio.guardar(registroDTO);
        return "redirect:/registro?exito";
    }
}