package eiffage.domain;

public class User {

    private Integer id;
    private String code;
    private Employe employe;

    public User() {
    }

    public User(Integer id, String code, Employe employe) {
        this.id = id;
        this.code = code;
        this.employe = employe;
    }

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

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
}
