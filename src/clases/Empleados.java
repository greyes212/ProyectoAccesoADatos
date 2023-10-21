package clases;


import java.util.Objects;
import java.util.TreeMap;



/**
 * Clase que representa a un empleado.
 */
public class Empleados implements Comparable<Empleados>{

	private String dni;
	private String nombre;
	private String apellidos;
	private String seguridadSocial;
	private String fecha_nac;
	private String id;
	
	/**
     * Constructor de la clase con ID especificado.
     * @param id El ID del empleado.
     * @param dni El numero de DNI del empleado.
     * @param nombre El nombre del empleado.
     * @param apellidos Los apellidos del empleado.
     * @param seguridadSocial El numero de seguridad social del empleado.
     * @param fecha_nac La fecha de nacimiento del empleado.
     */
	public Empleados(String id,String dni, String nombre, String apellidos, String seguridadSocial, String fecha_nac) {
		this.dni = dni; 
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.seguridadSocial = seguridadSocial;
		this.fecha_nac = fecha_nac;
		this.id=id;
	}
	
	/**
     * Constructor de la clase sin ID especificado.
     * Genera un ID aleatorio para el empleado.
     * @param dni El numero de DNI del empleado.
     * @param nombre El nombre del empleado.
     * @param apellidos Los apellidos del empleado.
     * @param seguridadSocial El numero de seguridad social del empleado.
     * @param fecha_nac La fecha de nacimiento del empleado.
     */
	public Empleados(String dni, String nombre, String apellidos, String seguridadSocial, String fecha_nac) {
		this.dni = dni; 
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.seguridadSocial = seguridadSocial;
		this.fecha_nac = fecha_nac;
		this.id = generarID();
	}
	 /**
     * Genera un ID aleatorio para el empleado.
     * El ID consta de tres letras seguidas de tres numeros.
     * @return El ID generado aleatoriamente.
     */
	private String generarID() {
		
		String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		StringBuilder idBuilder = new StringBuilder();
		
		for(int i = 0; i < 3; i++) {
			
			int index = (int) (letras.length() * Math.random());
			idBuilder.append(letras.charAt(index));
		}
		
		for(int i = 0; i < 3; i++) {
			
			idBuilder.append((int) (Math.random() * 10));
			
		}
		
		return idBuilder.toString();
	}
	
   //getters y setters generados automaticamente
	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setSeguridadSocial(String seguridadSocial) {
		this.seguridadSocial = seguridadSocial;
	}

	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getSeguridadSocial() {
		return seguridadSocial;
	}

	public String getFecha_nac() {
		return fecha_nac;
	}
	/**
	 *
     * Representacion en forma de cadena de este objeto empleado.
     * @return Una cadena que contiene la informacion del empleado.
     */
	@Override
	public String toString() {
		return "Empleados [id=" + id +" dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", seguridadSocial="
				+ seguridadSocial + ", fecha_nach=" + fecha_nac + "]";
	}
	/**
     * Compara dos empleados por ID.
     * @param o El empleado con el que se compara.
     * @return Un valor negativo, cero o un valor positivo si este empleado es menor, igual o mayor que el empleado dado en terminos de ID.
     */
	@Override
	public int compareTo(Empleados o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.getId());
	}
	 /**
     * Compara si dos empleados son iguales basandose en su numero de DNI.
     * @param obj El objeto a comparar con este empleado.
     * @return `true` si los empleados son iguales, `false` en caso contrario.
     */																																	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleados other = (Empleados) obj;
		return Objects.equals(dni, other.dni);
	}
	
}
