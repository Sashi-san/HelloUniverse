public class Planete {
    String  nom;
    String  matiere;
    long    diametre;
    int     tour;

    void revolution(int angle){
        tour=angle/360;
        System.out.println(nom+" a effectué "+tour+" tours complet autour de son étoile.");
    }
    void rotation(int angle){
        tour=angle/360;
        System.out.println(nom+" a effectué "+tour+" tours complet autour d'elle même");
    }
}
