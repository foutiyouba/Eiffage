package eiffage.domain;

public class Voiture {

    private Integer id;
    private Short code;
    private String nomVoiture;
    private Employe employe;

    public Voiture(Integer id, Short code,
                   String nomVoiture, Employe employe) {
        this.id = id;
        this.code = code;
        this.nomVoiture = nomVoiture;
        this.employe = employe;
    }

    public Voiture() {
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getCode() {
        return code;
    }

    public void setCode(Short code) {
        this.code = code;
    }

    public String getNomVoiture() {
        return nomVoiture;
    }

    public void setNomVoiture(String nomVoiture) {
        this.nomVoiture = nomVoiture;
    }
}
