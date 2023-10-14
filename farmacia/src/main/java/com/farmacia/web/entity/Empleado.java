package com.farmacia.web.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEmpleado")
    private int idEmpleado;

    @Column(name = "Nombres")
    private String nombres;

    @Column(name = "Apellidos")
    private String apellidos;

    @Column(name = "Especialidad")
    private String especialidad;

    @Column(name = "Sexo")
    private String sexo;

    @Column(name = "Dni")
    private int dni;

    @Column(name = "Email")
    private String email;

    @Column(name = "Telefono")
    private int telefono;

    @Column(name = "Direccion")
    private String direccion;

    @Column(name = "HoraIngreso")
    private String horaIngreso;

    @Column(name = "HoraSalida")
    private String horaSalida;

    @Column(name = "Sueldo")
    private double sueldo;

    @Column(name = "Estado")
    private String estado;

    @OneToOne
    private Usuario usuario;


}
