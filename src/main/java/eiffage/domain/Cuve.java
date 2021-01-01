package eiffage.domain;

public class Cuve {

    private Integer id;
    private String code;
    private String nomCuve;
    private Integer volumeCuve;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNomCuve() {
        return nomCuve;
    }

    public void setNomCuve(String nomCuve) {
        this.nomCuve = nomCuve;
    }

    public Integer getVolumeCuve() {
        return volumeCuve;
    }

    public void setVolumeCuve(Integer volumeCuve) {
        this.volumeCuve = volumeCuve;
    }

    public Cuve(Integer id, String code, String nomCuve, Integer volumeCuve) {
        this.id = id;
        this.code = code;
        this.nomCuve = nomCuve;
        this.volumeCuve = volumeCuve;
    }

    public Cuve() {
    }
}
