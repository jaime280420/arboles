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
    @Column(name = "id_arbol")
    private Long id_arbol;
    private String descripcion;
    private String nombre_comun;
    private String años_vida;
    private String rutaImagen;
    private boolean activo;

    public Arbol() {
    }

    public Arbol(String descripcion, String nombre_comun, String años_vida, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.nombre_comun = nombre_comun;
        this.años_vida = años_vida;
        this.rutaImagen = rutaImagen;
        this.activo = activo;

    }

    
}
