package Administration;

public class Journalier extends Employe {
	
	private String duree;
	private String forfait;
	//Constructeur
	
	
	public Journalier() {
		super(String duree, String forfait);
		this.duree = duree;
		this.forfait = forfait;
	}

	//getter et setter
	public String getDuree() {
		return duree;
	}
	
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public String getForfait() {
		return forfait;
	}
	public void setForfait(String forfait) {
		this.forfait = forfait;
	}
	
	
	
	//Fonction lister Journalier
	public void ListerJournalier(){
		System.out.println(getId());
		System.out.println(getNomComplet());
		
	}
	
	
	
	
	
	

}
