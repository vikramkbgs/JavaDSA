package polymorphism;

public class PaltinumAccount extends GoldAccount{

	@Override
	public void chequeBooks() {
		System.out.println("Unlimited");
	}

	@Override
	public void rateOfInterest() {
		System.out.println("6% Year");
	}
	
	public static void main(String[] args) {
		GoldAccount g = new GoldAccount();
		g.onlineBanking();
		g.chequeBooks();
		g.rateOfInterest();
		System.out.println("After Polymorphism : ");
		PaltinumAccount p = new PaltinumAccount();
		p.onlineBanking();
		p.chequeBooks();
		p.rateOfInterest();
	}
}
