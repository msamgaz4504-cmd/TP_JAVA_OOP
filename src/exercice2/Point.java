package exercice2;

public class Point {
    private char nom;
    private double abscisse;

    public void initialiser(char nom, double abscisse){
        this.nom = nom;
        this.abscisse = abscisse;
    }

    public void initialiser(Point autrePoint){
        this.nom = autrePoint.nom;
        this.abscisse = autrePoint.abscisse;
    }

    public void afficherPoint(){
        System.out.println(" Nom: " + this.nom + " Abscisse: " + this.abscisse);
    }

    public void translate(double x){
        this.abscisse += x;
    }

    public static void main(String[] args){
        Point point1 = new Point();
        point1.initialiser('a', 4.0);
        System.out.println("\n------Point avant Translation------\n");
        point1.afficherPoint();
        System.out.println("\n------Point Apres Translation------\n");
        point1.translate(4);
        point1.afficherPoint();
    }
}