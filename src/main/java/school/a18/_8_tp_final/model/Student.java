package school.a18._8_tp_final.model;

public class Student {
    private String nom;
    private String prenom;
    private String specialite;

    public Student(String nom, String prenom, String specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return String.format("""
                Nom: %s
                Prenom: %s
                Specialite: %s 
                """, this.nom, this.prenom, this.specialite);
    }
}
