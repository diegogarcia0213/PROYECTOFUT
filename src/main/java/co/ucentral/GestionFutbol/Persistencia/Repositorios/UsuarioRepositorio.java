package co.ucentral.GestionFutbol.Persistencia.Repositorios;


import co.ucentral.GestionFutbol.Persistencia.Entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
}
