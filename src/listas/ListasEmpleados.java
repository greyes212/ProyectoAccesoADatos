package listas;


import java.util.TreeMap;
import clases.Empleados;
/**
 * Clase que gestiona una lista de empleados utilizando un TreeMap.
 */
public class ListasEmpleados {
	 private static ListasEmpleados instancia;
	private static  TreeMap<String, Empleados> empleados ;
	/**
     * Constructor privado para garantizar el patron Singleton.
     * Inicializa la coleccion de empleados como un TreeMap.
     */
	    public ListasEmpleados() {	
	        
	    	empleados = new TreeMap<String, Empleados>();
	    }
	    /**
	     * Obtiene la instancia unica de la clase ListasEmpleados siguiendo el patron Singleton.
	     * @return La instancia de ListasEmpleados.
	     */
	    public static ListasEmpleados getInstancia() {
	        if (instancia == null) {
	            instancia = new ListasEmpleados();
	        }
	        return instancia;
	    }
	    /**
	     * Busca un empleado por su ID en la lista de empleados.
	     * @param id El ID del empleado a buscar.
	     * @return El empleado encontrado o null si no se encontro ningun empleado con ese ID.
	     */
	    public Empleados buscarPorID(String id) {
	        Empleados emp = null;
	        
	        // Recorrer la colección
	        for (Empleados c : empleados.values()) {
	            if (id.equals(c.getId())) {
	                emp = c;
	                
	                break; // Se encontró el empleado, podemos salir del bucle
	            }
	            
	        }
	            return emp;    
	        }
	    
	    /**
	     * Agrega un empleado a la lista de empleados.
	     * @param key La clave o ID del empleado.
	     * @param empleado El objeto Empleados que se va a agregar.
	     * @return 'true' si el empleado se agrego con exito, 'false' si ya existe un empleado con la misma clave.
	     */
	    public  boolean addEmpleado(String key, Empleados empleado) {
	    	if(!empleados.containsValue(empleado)) {
	    		empleados.put(key, empleado);
	    		return true;
	    	}
	    	else {
	    		return false;
	    	}
	    	
	    }
	    /**
	     * Elimina un empleado de la lista de empleados por su clave o ID.
	     * @param key La clave o ID del empleado que se va a eliminar.
	     * @return 'true' si el empleado se elimino con exito, 'false' si no se encontro un empleado con esa clave.
	     */
	    public  boolean removeEmpleado(String key) {
	    	if(empleados.containsKey(key)) {
	    	empleados.remove(key);
	    	return true;
	    	}else {
	    		return false;
	    	}
	    }
	    /**
	     * Obtiene la lista de empleados almacenada en esta instancia.
	     * @return Un TreeMap que contiene a los empleados.
	     */
	    public TreeMap<String, Empleados> getEmpleados(){
	    	return empleados;
	    }
		
}
