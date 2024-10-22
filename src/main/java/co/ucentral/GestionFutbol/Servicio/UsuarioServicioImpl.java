package co.ucentral.GestionFutbol.Servicio;

import co.ucentral.GestionFutbol.Persistencia.Dto.UsuarioDto;
import co.ucentral.GestionFutbol.Persistencia.Entidades.Rol;
import co.ucentral.GestionFutbol.Persistencia.Entidades.Usuario;
import co.ucentral.GestionFutbol.Persistencia.Repositorios.UsuarioRepositorio;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {

    private UsuarioRepositorio usuarioRepositorio;

    public UsuarioServicioImpl(UsuarioRepositorio usuarioRepositorio) {
        super();
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @Override
    public Usuario guardar(UsuarioDto registroDTO) {
        Usuario usuario = new Usuario(registroDTO.getNombre(),
                registroDTO.getApellido(), registroDTO.getEmail(),
                registroDTO.getPassword(), Arrays.asList(new Rol("ROLE_USER")));
        return usuarioRepositorio.save(usuario);
    }

}