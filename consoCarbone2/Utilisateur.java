package consoCarbone2;

public class Utilisateur {
	private Alimentation alimentation;
	private Bienconso bienconso;
	private Logement logement;
	private Transport transport;
	private ServicesPublics services;
		
	public Utilisateur (Alimentation alimentation, Bienconso bienconso, Logement logement, Transport transport, ServicesPublics services){
		this.alimentation = alimentation;
		this.bienconso = bienconso;
		this.logement = logement;
		this.transport = transport;
		this.services = services;
	}
	
	public double calculerEmpreinte (){
		return alimentation.getimpact() + bienconso.getimpact() + logement.getimpact() + transport.getimpact() + services.getimpact();
	}
		
	public void detaillerEmpreinte (){
		System.out.println("L'empreinte carbone de cet(te) Utilisateur(trice) est \nEn alimentation : "+ alimentation.getimpact() +"\nEn dépenses annuelles : "+ bienconso.getimpact() + "\n En logement : " + logement.getimpact() + "\n En transport : " + transport.getimpact() + "\n En services : " + services.getimpact());
	}
}

	public String ordonner (
/**



*/
