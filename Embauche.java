package Administration;

import java.util.Date;

public class Embauche extends Employe {
	private float salaire;
	Date dateEmbauche;
	
	
	//Constructeur
	public Embauche() {
		super();
		this.salaire = salaire;
		this.dateEmbauche = dateEmbauche;
	}



	
	//Getter et Setter
	
	public float getSalaire() {
		return salaire;
	}


	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}


	public Date getDateEmbauche() {
		return dateEmbauche;
	}


	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	
	
	
	public void ListerEmbaucheService() {
		
		
	}
	
	
	
}
