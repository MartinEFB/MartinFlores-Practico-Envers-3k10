package org.example;


import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
@Builder
@Entity
@Table(name = "Domicilio")
@Audited
public class Domicilio implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @Column(name = "nombreCalle")
        private String nombreCalle;
        @Column(name = "numero", unique = true)
        private int numero;

        @OneToOne(mappedBy = "domicilio")
        private Cliente cliente;



}
