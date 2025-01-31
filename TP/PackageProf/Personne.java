package PackageProf;


    public class Personne {
        private String nom;
        private String prenom;

        
        public Personne(String nom, String prenom) {
            this.nom = nom;
            this.prenom = prenom;
        }
        
        public Personne(String prenom) {
            this.prenom = prenom;
        }
        
        public String getNom() {
            return nom;
        }

        
        public String getPrenom() {
            return prenom;
        }


		public String toString() {
			if(nom==null)
			{
				return "Personne [Prenom =" + prenom + "]";
			}
			return "Personne [Nom=" + nom + ", Prenom=" + prenom + "]";
			
		}


}