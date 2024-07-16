package com.alura.forohubSpring.domain.topic;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name="Topico")
@Table(name="topicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(unique = true)
    private String usuario;
    private String titulo;
    private String mensaje;
    private String fecha;
    private String status;
    @Column(unique = true)
    private String autor;
    private String curso;
    private Boolean activo;




    //Constructor
    public Topico(DatosRegistroTopico datosRegistroTopico){
        this.usuario = datosRegistroTopico.usuario();
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.fecha = datosRegistroTopico.fecha();
        this.status = datosRegistroTopico.status();
        this.autor = datosRegistroTopico.autor();
        this.curso = datosRegistroTopico.curso();
        this.activo = true;
    }




    //Metodos
    public void actualizarDatos(DatosActualizarTopico datosActualizarMedico) {
        if (datosActualizarMedico.titulo() != null){
            this.titulo = datosActualizarMedico.titulo();
        }

        if (datosActualizarMedico.mensaje() != null){
            this.mensaje = datosActualizarMedico.mensaje();
        }

        if (datosActualizarMedico.fecha() != null){
            this.fecha = datosActualizarMedico.fecha();
        }

        if (datosActualizarMedico.status() != null){
            this.status = datosActualizarMedico.status();
        }

        if (datosActualizarMedico.autor() != null){
            this.autor = datosActualizarMedico.autor();
        }

        if (datosActualizarMedico.curso() != null){
            this.curso = datosActualizarMedico.curso();
        }

    }



    public void desactivarTopico() {
        this.activo = false;
    }



    //Getters
    public Long getId() {
        return Id;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getFecha() {
        return fecha;
    }

    public String getStatus() {
        return status;
    }

    public String getAutor() {
        return autor;
    }

    public String getCurso() {
        return curso;
    }

}
