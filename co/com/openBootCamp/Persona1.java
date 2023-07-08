package co.com.openBootCamp;

public class Persona1 {

	
	//atributos
	private String name;
	private int age;
	private double height;
	private boolean healthCondition;
	
	
	
	//construcotres
	public Persona1() {
		
	}
	
	public Persona1(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	
	
	
	//metodos getter y setter
	
	public boolean getHealthCondition() {
		return healthCondition;
	}

	public void setHealthCondition(boolean healthCondition) {
		this.healthCondition = healthCondition;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	

}
