package co.com.openBootCamp;

public abstract class SmartPhone {
	//atributos
		private double display;
		private int camaras;
		private boolean trueTone;
		private int peso;
		private String color;
		
		
		//constructor
		public SmartPhone() {
			
		}
		
		public SmartPhone(double display, int camaras, boolean trueTone, String color) {
			this.display = display;
			this.camaras = camaras;
			this.trueTone = trueTone;
			this.color = color;
		}
		
		//metodos getter - setter
		public double getDisplay() {
			return display;
		}

		public void setDisplay(double display) {
			this.display = display;
		}

		public int getCamaras() {
			return camaras;
		}

		public void setCamaras(int camaras) {
			this.camaras = camaras;
		}

		public boolean isTrueTone() {
			return trueTone;
		}

		public void setTrueTone(boolean trueTone) {
			this.trueTone = trueTone;
		}

		public int getPeso() {
			return peso;
		}

		public void setPeso(int peso) {
			this.peso = peso;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public abstract void crearIphone();
}
