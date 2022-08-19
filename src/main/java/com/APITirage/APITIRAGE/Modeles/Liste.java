package com.APITirage.APITIRAGE.Modeles;

import javax.persistence.*;

@Entity
public class Liste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    String libelleliste;
    String dateliste;

}
