package com.APITirage.APITIRAGE.Modeles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="postulanttire")
public class PostulantTire {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private  String  nom, prenom, numero, email;
    @ManyToOne
    @JoinColumn(name = "id_tirage")
    private Tirage tirage;
}
