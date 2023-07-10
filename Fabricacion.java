package co.com.openBootCamp;

public class Fabricacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone iPhone = new Iphone11();
		SmartPhone iPhone2 = new Iphone12_pro();

		iPhone.crearIphone();
		iPhone.setCamaras(2);
		iPhone.setDisplay(6.06);
		iPhone.setPeso(194);
		iPhone.setTrueTone(true);
		iPhone.setColor("red");
		
		System.out.println(iPhone.getColor());
		System.out.println();
		
		iPhone2.crearIphone();
		iPhone2.setCamaras(3);
		iPhone2.setDisplay(6.1);
		iPhone2.setPeso(187);
		iPhone2.setColor("gold");
		
		System.out.println(iPhone2.getColor());
	}

}
