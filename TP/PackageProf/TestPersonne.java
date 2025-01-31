package PackageProf;

public class TestPersonne {
    public static void main(String[] args) {
        Personne p1 = new Personne("Agostelini","Laurence");
//        System.out.println("Nom: " + p1.getNom());
//        System.out.println("Prénom: " + p1.getPrenom());
        System.out.println(p1.toString());
        Personne p2 = new Personne ("Lolo") ;
        System.out.println(p2.toString()) ;
        
    }
}
