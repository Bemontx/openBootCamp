package co.com;

public class Bucles {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] nombres = {"Pedro", "Pepe", "Papu", "Pipo"};
		
		//ciclo for
		for(int i = 0; i < nombres.length; i++ ) {
			System.out.println(nombres[i] + " Estudia en Open Boot Camp.");
		}
		
		System.out.println();
		System.out.println();
		
		//ciclo while
		try {
			int i = 0;
			while(nombres.length < 10) {
				System.out.println(nombres[i] + " Estudia ciclos for, while, for each.");
				i++;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println();
		
		//for each
		for(String nombre : nombres) {
			System.out.println(nombre + " Estudia java.");
		}
	}

}
