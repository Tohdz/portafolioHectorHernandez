/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")

public class categoria implements Serializable {
    
    private static final long serialVersionUID= 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public categoria() {
    }

    public categoria(String categoria, boolean activo) {
        this.descripcion = categoria;
        this.activo = activo;
    }
            
    
}
