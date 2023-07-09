package co.com;

public class SumaIvaIncluido {

	double iva;
	
	
	static double compra(double valor) {
		return valor * 1.19;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(compra(250));
	}

}
