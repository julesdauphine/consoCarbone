package consoCarbone;

public abstract class ConsoCarbone implements comparable{
	protected int id;
	private static int nb;
	protected double impact;
	
	public ConsoCarbone(){
		this.id = nb++;
		
	}
	
	public int getid(){
		return id;
	}
	
	public void setid(int id){
		this.id = id;
	}
	
	@Override
	public String toString (){
		return "L'identificateur de cet objet est "+ this.id;
	}
	
	@Override
	public int compareTo (ConsoCarbone o){
		if (this.impact > o.impact){
			return 1;
		}
		else if (this.impact == o.impact){
			return 0;
		}
		else{
			return -1;
		}
	}
				

	public static void main(String args[]){
		ConsoCarbone test = new ConsoCarbone();
		alimentation test1 = new alimentation(0,0);
		System.out.println(test.getid());
		test.setid(10);
		System.out.println(test.getid());
		System.out.println(test1.getid());
		System.out.println(test.toString());
	 }	
}
