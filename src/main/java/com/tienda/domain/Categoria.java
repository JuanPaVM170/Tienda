package com.tienda.domain;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.Data;



@Data
@Table(name="Categoria")
public class Categoria implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_categoria")
   private long idCategoria;
   private String descripcion;
   @Column(name="ruta_imagen")
   private String rutaImagen;
   private boolean activo;

    public Categoria() {
    }

    public Categoria(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
           
           
}
