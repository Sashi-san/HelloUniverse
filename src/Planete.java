public class Planete {
    String nom;
    int diametre;
    String matiere;
    int totalVisiteurs;
    Atmosphere atmosphere;
    Vaisseau vaisseauAccoste;

    int revolution(int degres){
        System.out.println("Je suis la planète "+nom+" et je tourne autour de mon étoile de "+degres+" degrés.");
        return degres/360;
    }

    int rotation(int degres){
        System.out.println("Je suis la planète "+nom+" et je tourne sur moi-même de "+degres+" degrés.");
        return degres/360;
    }

    void accueillirVaisseau(int nbHumains){
        totalVisiteurs+=nbHumains;
    }

    Vaisseau accueillirVaisseau(Vaisseau vaisseau){
        Vaisseau vaisseauReturn = null;

        if(vaisseauAccoste == null)
            vaisseauAccoste = vaisseau;
        else{
            vaisseauReturn = vaisseauAccoste;
            vaisseauAccoste = vaisseau;
        }


        if (vaisseau.typeVaisseau.equals("CHASSEUR")){
            totalVisiteurs+=vaisseau.totalVisiteurs;
        }
        else if (vaisseau.typeVaisseau.equals("FREGATE")){
            totalVisiteurs+=vaisseau.totalVisiteurs;
        }
        else if (vaisseau.typeVaisseau.equals("CROISEUR")){
            totalVisiteurs+=vaisseau.totalVisiteurs;
        }

        return vaisseauReturn;
    }
}