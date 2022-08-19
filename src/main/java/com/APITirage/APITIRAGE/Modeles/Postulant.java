package com.APITirage.APITIRAGE.Modeles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Postulant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nom, prenom, numero, email;
    @ManyToOne
    @JoinColumn(name = "id_liste")
    private Liste liste;
}
