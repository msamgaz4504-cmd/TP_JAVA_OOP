package exercice1;

public class Personne{
    private String cin;
    private String nom;
    private String prenom;
    private String email;
    private int age;

    public void initialiser(String cin, String nom, String prenom, String email, int age ){
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.age = age;
    }

    public void afficherPersonne(){
        System.out.println(" Nom: " + this.nom + " Prenom: " + this.prenom + " CIN: " + this.cin + " Email: " + this.email + " Age: " + this.age);
    }
}

