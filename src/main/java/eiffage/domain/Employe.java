package eiffage.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Employe")
public class Employe {

    @Column(name = "id")
    @Id// SANS ID DAKOY BAGN
    private Integer id;
    @Column(name = "code")
    private String code;
}
