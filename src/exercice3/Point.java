package exercice3;

public class Point{
    private String nom;
    private double abscisse;

    public Point(String nom, double abscisse){
        this.nom = nom;
        this.abscisse = abscisse;
    }

    public void affiche(){
        System.out.println(" Nom: " + this.nom + " Abscisse: " + this.abscisse);
    }

    public void translate(double x){
        this.abscisse += x;
    }

    public static void main(String[] args){
        Point point1 = new Point("b", 4.0);
        System.out.println("\n------Point avant Translation------\n");
        point1.affiche();
        System.out.println("\n------Point Apres Translation------\n");
        point1.translate(-3);
        point1.affiche();
    }
}