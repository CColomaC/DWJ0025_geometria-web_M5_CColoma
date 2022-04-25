package modelo;

public class Rectangulo {

	//ATRIBUTOS
	private int base;
	private int altura;
	
	//CONSTRUCTORES
	public Rectangulo() {
		super();
	}

	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	//CALCULOS
	public int calcularArea() {
		return base * altura;
	}
	
	public int calcularPerimetro() {
		return (base *2) + (altura * 2);
	}
	
	//GETTERS Y SETTTERS
	public int getBase() {
		return base;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}


}

