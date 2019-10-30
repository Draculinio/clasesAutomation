package vehiculos;

public class Auto {
	private String marca;
	private String modelo;
	private int fechaConstruccion;
	private int puertas;
	private String color;
	private int velocidadMaxima;
	private int velocidadActual;
	public boolean encendido;
	
	public Auto(String marca, String modelo, int fechaConstruccion, int puertas, String color, int velocidadMaxima) {
		this.marca = marca;
		this.modelo = modelo;
		this.fechaConstruccion = fechaConstruccion;
		this.puertas = puertas;
		this.color = color;
		this.velocidadMaxima = velocidadMaxima;
		this.velocidadActual = 0;
		this.encendido = false;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void ponerMarca(String m) {
		marca = m;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getColor() {
		String color = "Algo";
		return color;
	}
	
	public void encender() {
		this.encendido = true;
	}
	
	public String estaEncendido() {
		if(this.encendido == true) {
			return "El auto esta encendido";
		}else {
			return "El auto no esta encendido";
		}
		
	}
	
	public void acelerar(int velocidad) {
		if(this.encendido == true) {
			if(velocidadActual+velocidad>velocidadMaxima) {
				this.velocidadActual = velocidad;
			}else {
				System.out.println("No se puede acelerar mas");
			}
		}else {
			System.out.println("Debe encender el auto");
		}	
	}
	
	public int getVelocidadActual() {
		return this.velocidadActual;
	}
	
}
