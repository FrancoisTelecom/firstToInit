package firstClass;

public class Ville {
private String nomVille;
private String nomPays;
private int nbHabitants;


	public Ville(){
		System.out.println("Ville!");
		setNomPays("Inconnu");
		setNomVille("Inconnu");
		setNbHabitants(0);

	}
	public int getNbHabitants() {
		return nbHabitants;
	}
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	public String getNomPays() {
		return nomPays;
	}
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	public String getNomVille() {
		return nomVille;
	}
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}
	public Ville(String pNom, int pNb, String pPays){
		System.out.println("Création d'une ville avec attributs");
		setNomVille(pNom);
		setNomPays(pPays);
		setNbHabitants(pNb);
	}
}