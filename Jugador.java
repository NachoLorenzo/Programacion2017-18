package Jugador;

public class Jugador { //Creamos la clase jugador (en un paquete nuevo)
	//Definimos atributos de Jugador
	private String Nombre; //Private porque los atributos se utilizarán solo en esta clase
	private String Apellidos;
	private int Edad;
	private int Puntos;
	
	//Declaramos los get / set para recoger(get) y modificar(set) los datos
	
	public String getNombre(){ //Será public porque los datos queremos mostrarlos fuera de esta clase
		return Nombre;
	}
	public void setNombre(String Nombre){
		this.Nombre = Nombre; 
	}	
	public String getApellidos(){
		return Apellidos;
	}
	public void setApellidos(String Apellidos){
		this.Apellidos = Apellidos;
	}
	public int getEdad(){
		return Edad;
	}
	public void setEdad(int Edad){
		this.Edad = Edad;
	}
	public int getPuntos(){
		return Puntos;
	}
	public void setPuntos(int Puntos){
		this.Puntos = Puntos;
	}
	
	public Jugador(){
		
	}
	public String toString(){
		return this.Nombre+" "+ this.Apellidos+" "+this.Edad;
	}
	

}
