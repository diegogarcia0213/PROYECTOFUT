package co.ucentral.GestionFutbol.Servicio;

import co.ucentral.GestionFutbol.Persistencia.Dto.UsuarioDto;
import co.ucentral.GestionFutbol.Persistencia.Entidades.Usuario;

public interface UsuarioServicio {
    public Usuario guardar(UsuarioDto registroDTO);
}
