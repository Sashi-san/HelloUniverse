public class HelloUniverse {

    public static void main(String... args){
        System.out.println("Hello Universe!");

        Planete mercure=new Planete();
        mercure.nom="Mercure";
        mercure.matiere="tellurique";
        mercure.diametre=4880;
        Planete venus=new Planete();
        venus.nom="Venus";
        venus.matiere="tellurique";
        venus.diametre=12100;
        Planete terre=new Planete();
        terre.nom="Terre";
        terre.matiere="tellurique";
        terre.diametre=12756;
        Planete mars=new Planete();
        mars.nom="Mars";
        mars.matiere="tellurique";
        mars.diametre=6792;
        Planete jupiter=new Planete();
        jupiter.nom="Jupiter";
        jupiter.matiere="gazeuse";
        jupiter.diametre=142984;
        Planete saturne=new Planete();
        saturne.nom="Saturne";
        saturne.matiere="gazeuse";
        saturne.diametre=120536;
        Planete uranus=new Planete();
        uranus.nom="Uranus";
        uranus.matiere="gazeuse";
        uranus.diametre=51118;
        Planete neptune=new Planete();
        neptune.nom="Neptune";
        neptune.matiere="gazeuse";
        neptune.diametre=49532;

       // System.out.println(jupiter.nom+" est une planète "+jupiter.matiere+" avec un diamètre de "+jupiter.diametre+" kilomètres.");
        neptune.revolution(-3542);
        mars.rotation(-684);
        venus.rotation(1250);

    }

}