package BD;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
//import com.mysql.jdbc.Connection;

//�������ESTA CLASE ES REAPROVECHABLE PARA CUALQUIER PROGRAMA QUE QUIERA CONECTARSE A UNA BBDD!!!!!!!
public class ConexionDB {
	
	static final String CONTROLADOR_MYSQL= "com.mysql.jdbc.Driver";
	
	//DATOS DE LA BBDD
	private String host;//HOST DONDE EST� LA BASE DE DATOS
	private String bbdd;//NOMBRE DE LA BASE DE DATOS
	private String user;//NOMBRE USUARIO PARA ACCEDER
	private String pass;//CONTRASE�A DEL USUARIO
	private String url; //PROPORCIONA AL DRIVERMANAGER LA DIRECCI�N DE CONEXI�N 
							
	
	//CONEXI�N
	private Connection conexion = null; //MANEJA LA CONEXI�N
	
	//CONSTRUCTOR (LE PASAMOS LOS DATOS PARA LA CONEXI�N)
	public ConexionDB(String HOST, String BBDD, String USER, String PASS){
		this.host=HOST;
		this.bbdd=BBDD;
		this.user=USER;
		this.pass=PASS;
		this.url="jdbc:mysql://"+this.host+"/"+this.bbdd;
	}
	
	//M�TODO PARA CONECTAR A LA BASE DE DATOS
	public boolean connectDB(){//BOOLEAN PARA QUE DEVUELVA UN VALOR QUE PODAMOS COMPROBAR Y DEMUESTRE SI NOS HEMOS CONECTADO
		try{
			//CARGAMOS EL CONTROLADOR MYSQL, EL CUAL SE REGISTRA AUTOMATICAMENTE
			Class.forName(CONTROLADOR_MYSQL);
			//NOS CONECTAMOS
			conexion = DriverManager.getConnection(this.url,this.user,this.pass);
		}
		
		catch(SQLException excepcionSql){//NO ENCUENTRA LA BASE DE DATOS
			excepcionSql.printStackTrace();
			return false;
			
		}catch(ClassNotFoundException noEncontroClase){//NO ENCUENTRA EL DRIVER PARA LA CONEXI�N
			noEncontroClase.printStackTrace();
			return false;
		}//SI TODO ES CORRECTO, SE CONECTA Y DEVUELVE TRUE
		return true;
		
		}
	
	//DEVUELVE UNA INSTANCIA DE LA CONEXI�N POR SI QUEREMOS MANIPULARLA DESDE FUERA DE LA CLASE
	public Connection getConexion(){
		return this.conexion;
	}
	
	
	
}
