package com.APITirage.APITIRAGE.Modeles;

import javax.persistence.*;

@Entity
public class PostulantTire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    String  nom, prenom, numero, email;
    @ManyToOne
    @JoinColumn(name = "id_tirage")
    Tirage tirage;
}
