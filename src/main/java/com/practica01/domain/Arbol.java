package com.practica01.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "arbol")
public class Arbol implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idArbol")
    private Long idArbol;
    private String descripcion;
    private String nombreComun;
    private String añosVida;
    private String rutaImagen;
    private boolean activo;

    public Arbol() {
    }

    public Arbol(String descripcion, String nombreComun, String añosvida, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.nombreComun = nombreComun;
        this.añosVida = añosVida;
        this.rutaImagen = rutaImagen;
        this.activo = activo;

    }

}
