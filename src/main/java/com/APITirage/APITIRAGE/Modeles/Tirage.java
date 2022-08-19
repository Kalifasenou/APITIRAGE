package com.APITirage.APITIRAGE.Modeles;

import javax.persistence.*;

@Entity
public class Tirage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    String libelletirage;
    @ManyToOne
    @JoinColumn(name = "id_postulant")
    Postulant postulant;
}
