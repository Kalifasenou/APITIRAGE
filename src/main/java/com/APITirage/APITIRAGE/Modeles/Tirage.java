package com.APITirage.APITIRAGE.Modeles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tirage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String libelletirage;
    @ManyToOne
    @JoinColumn(name = "id_postulant")
    private Postulant postulant;
}
