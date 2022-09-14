package com.APITirage.APITIRAGE.Modeles;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tirage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(unique = true)
    private String libelletirage;
    private Date dateTirage;
    @ManyToOne
    @JoinColumn(name = "id_liste")
    @JsonIgnore
    private Liste liste;
}
