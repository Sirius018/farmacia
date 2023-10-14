package com.farmacia.web.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario")
    private int idUsuario;

    @Column(name = "Nombres")
    private String nombres;

    @Column(name = "Apellidos")
    private String apellidos;

    @Column(name = "Dni")
    private int dni;

    @Column(name = "Email")
    private String email;

    @Column(name = "Usuario")
    private String usuario;

    @Column(name = "Contraseña")
    private String contraseña;

    @Column(name = "TipoUsuario")
    private String tipoUsuario;

    @Column(name = "Estado")
    private String estado;
}
