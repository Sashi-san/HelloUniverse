public class Planete {
    String  nom;
    String  matiere;
    long    diametre;
    int     tour;
    int     totalVisiteurs;

    void revolution(int angle){
        tour=angle/360;
        System.out.println(nom+" a effectué "+tour+" tours complet autour de son étoile.");
    }
    void rotation(int angle){
        tour=angle/360;
        System.out.println(nom+" a effectué "+tour+" tours complet autour d'elle même");
    }
    void accueillirVaisseau(int nouveauxHumains){
        totalVisiteurs=totalVisiteurs+nouveauxHumains;
    }
    void accueillirVaisseau(String vaisseau){
        if(vaisseau=="CHASSEUR"){
            totalVisiteurs=totalVisiteurs+3;
        }else if(vaisseau=="FREGATE"){
            totalVisiteurs=totalVisiteurs+12;
        }else if(vaisseau=="CROISEUR"){
            totalVisiteurs=totalVisiteurs+50;
        }
    }
}
