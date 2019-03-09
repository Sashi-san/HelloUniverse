public class HelloUniverse {

    public static void main(String... args) {
        Planete mercure = new Planete();
        mercure.nom = "Mercure";
        mercure.diametre = 4880;
        mercure.matiere = "Tellurique";
        Planete venus = new Planete();
        venus.nom = "Venus";
        venus.diametre = 12100;
        venus.matiere = "Tellurique";
        Planete terre = new Planete();
        terre.nom = "Terre";
        terre.diametre = 12756;
        terre.matiere = "Tellurique";
        Planete mars = new Planete();
        mars.nom = "Mars";
        mars.diametre = 6792;
        mars.matiere = "Tellurique";
        Planete jupiter = new Planete();
        jupiter.nom = "Jupiter";
        jupiter.diametre = 142984;
        jupiter.matiere = "Gazeuse";
        Planete saturne = new Planete();
        saturne.nom = "Saturne";
        saturne.diametre = 120536;
        saturne.matiere = "Gazeuse";
        Planete uranus = new Planete();
        uranus.nom = "Uranus";
        uranus.diametre = 51118;
        uranus.matiere = "Gazeuse";
        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";


        Vaisseau v1 = new Vaisseau();
        v1.totalVisiteurs = 9;
        v1.typeVaisseau = "FREGATE";

        Vaisseau v2 = new Vaisseau();
        v2.totalVisiteurs = 42;
        v2.typeVaisseau = "CROISEUR";


        Vaisseau medic = jupiter.accueillirVaisseau(v1);

        if(medic != null)
            System.out.println("Un vaisseau de type "+medic.typeVaisseau+" doit s'en aller.");

        System.out.println("Le nombre d'humains ayant déjà séjourné sur " + jupiter.nom + " est actuellement de " + jupiter.totalVisiteurs );


        medic = jupiter.accueillirVaisseau(v2);
        if(medic != null)
            System.out.println("Un vaisseau de type "+medic.typeVaisseau+" doit s'en aller.");

        System.out.println("Le nombre d'humains ayant déjà séjourné sur " + jupiter.nom + " est actuellement de " + jupiter.totalVisiteurs );



    }

}
