package eiffage.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity(name = "Employe")
public class Employe {

   // @Column(name = "id")
   // @Id// SANS ID DAKOY BAGN

    private Integer id;
    private String matricule;
    private String prenom;
    private String nom;
    private int telephone;
    private String email;
    private String adresse;
    private String sexe;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Employe() {
    }

    public Employe(Integer id, String matricule, String prenom,
                   String nom, int telephone, String email,
                   String adresse, String sexe) {
        this.id = id;
        this.matricule = matricule;
        this.prenom = prenom;
        this.nom = nom;
        this.telephone = telephone;
        this.email = email;
        this.adresse = adresse;
        this.sexe = sexe;
    }

}
