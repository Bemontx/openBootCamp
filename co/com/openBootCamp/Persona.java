package co.com.openBootCamp;

public class Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona1 persona = new Persona1();
		
		persona.setName("Pedro");
		persona.setAge(23);
		persona.setHeight(1.72);
		persona.setHealthCondition(true);
		
		System.out.println(persona.getName() + " estudiante java.");
		System.out.println("Curso openBootCamp.");
		System.out.println(persona.getAge());
		System.out.println(persona.getHeight());
		System.out.println(persona.getHealthCondition() + " excelente estado fisico.");

	}

}
