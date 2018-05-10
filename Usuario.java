package BD;

import java.sql.Connection;

public class Usuario {
	private static ConexionDB jugadoresDB;//OBJETO DE LA CLASE CONEXIONDB PARA CONECTAR A LA BASE DE DATOS 'JUGADORES'
	private static boolean connected=false;//BOOLEAN PARA COMPROBAR LA CONEXIÓN
	
	public static void main(String[] args){
		//GENERAMOS EL OBJETO
		jugadoresDB = new ConexionDB("localhost", "Jugadores", "root", ""); //HOST, BBDD, USER, PASS
		
		//EJEMPLO PARA UN HOST EXTERNO
		//jugadoresDB = ConexcionDB("mysql.hostinger.es","nombre_BBDD","nombre_usuario","contraseña");
		
		//ESTABLECEMOS LA CONEXION
		connected = jugadoresDB.connectDB();
		
		//COMPROBAMOS
		if(connected){
			System.out.println("CONECTADO CON ÉXITO");
		}
		else System.out.println("ERROR EN LA CONEXIÓN");
	}
}
