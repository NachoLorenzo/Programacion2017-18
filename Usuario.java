package BD;

import java.sql.Connection;

public class Usuario {
	private static ConexionDB jugadoresDB;//OBJETO DE LA CLASE CONEXIONDB PARA CONECTAR A LA BASE DE DATOS 'JUGADORES'
	private static boolean connected=false;//BOOLEAN PARA COMPROBAR LA CONEXI�N
	
	public static void main(String[] args){
		//GENERAMOS EL OBJETO
		jugadoresDB = new ConexionDB("localhost", "Jugadores", "root", ""); //HOST, BBDD, USER, PASS
		
		//EJEMPLO PARA UN HOST EXTERNO
		//jugadoresDB = ConexcionDB("mysql.hostinger.es","nombre_BBDD","nombre_usuario","contrase�a");
		
		//ESTABLECEMOS LA CONEXION
		connected = jugadoresDB.connectDB();
		
		//COMPROBAMOS
		if(connected){
			System.out.println("CONECTADO CON �XITO");
		}
		else System.out.println("ERROR EN LA CONEXI�N");
	}
}
