package co.ucentral.GestionFutbol.Servicio;

import co.ucentral.GestionFutbol.Persistencia.Dto.UsuarioDto;
import co.ucentral.GestionFutbol.Persistencia.Entidades.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UsuarioServicio extends UserDetailsService {
    public Usuario guardar(UsuarioDto registroDTO);

    public List<Usuario> listarUsuarios();
}
