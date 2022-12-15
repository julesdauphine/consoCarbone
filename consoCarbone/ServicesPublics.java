package consoCarbone;

public class ServicesPublics {
	private static SerivesPublics instance;
	private double impact;
	
	private ServicesPublics (double impact){
		this.impact = impact;
	}
	
	public static ServicesPublics getInstance(double impact){
		if ( instance == null){
			instance = new ServicesPublics(impact);
		}
		return instance;
	}
}
