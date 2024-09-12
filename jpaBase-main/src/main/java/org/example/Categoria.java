package org.example;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
@Builder
@Entity
@Table(name = "Categoria")
@Audited
public class Categoria implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @Column(name = "denominacion")
        private String denominacion;

        @ManyToMany(mappedBy = "categorias")
        @Builder.Default
        private List<Articulo> articulos = new ArrayList<Articulo>();




}
