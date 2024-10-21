package co.ucentral.GestionFutbol.Persistencia.Entidades;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "jugadores")
@Entity

public class Jugador {

    @Id
    @Column(name = "Codigo_Jugador")
    public long Codigo;

    @Column(name = "Nombre")
    public String Nombre;

    @Column(name = "Apellido")
    public String Apellidos;

}
