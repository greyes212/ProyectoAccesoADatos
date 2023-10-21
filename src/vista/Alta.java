/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import clases.Empleados;
import listas.ListasEmpleados;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;

/**
 * Clase que representa la ventana de Alta de empleados en la aplicacion.
 * Permite dar de alta a un empleado.
 * @author Gian
 */
public class Alta extends javax.swing.JInternalFrame {
	ListasEmpleados listaEmpleados= ListasEmpleados.getInstancia();
	/**
	 * Constructor de la clase Alta.
	 * Inicializa la ventana y sus componentes.
	 */
	public Alta() {
		initComponents();
	}

	
	/**
	 * Inicializa los componentes visuales de la ventana.
	 */
	@SuppressWarnings("unchecked")
	private void initComponents() {

		dspFondo = new javax.swing.JDesktopPane();
		jLabel2 = new javax.swing.JLabel();
		nombretxt = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		dnitxt = new javax.swing.JTextField();
		apellidotxt = new javax.swing.JTextField();
		fechtxt = new javax.swing.JTextField();
		SegSoctxt = new javax.swing.JTextField();
		BotonDarDeALta = new javax.swing.JButton();
		BotonDarDeALta.setIcon(new ImageIcon(Alta.class.getResource("/vista/iconos/Empleado.gif")));

		setClosable(true);
		setMaximizable(true);
		setTitle("Electronic Arc's");
		setAutoscrolls(true);

		dspFondo.setBackground(new java.awt.Color(0, 153, 153));

		jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
		jLabel2.setText("ALTA");

		jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
		jLabel3.setText("DNI:");

		jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
		jLabel4.setText("NOMBRE:");

		jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
		jLabel5.setText("APELLIDO:");

		jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
		jLabel6.setText("NºSEGURIDAD SOCIAL:");

		jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
		jLabel7.setText("FECHA DE NACIMIENTO:");

		BotonDarDeALta.setText("DAR DE ALTA");
		BotonDarDeALta.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BotonDarDeALtaActionPerformed(evt);
				
			}
		});

		dspFondo.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
		dspFondo.setLayer(nombretxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
		dspFondo.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
		dspFondo.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
		dspFondo.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
		dspFondo.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
		dspFondo.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
		dspFondo.setLayer(dnitxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
		dspFondo.setLayer(apellidotxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
		dspFondo.setLayer(fechtxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
		dspFondo.setLayer(SegSoctxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
		dspFondo.setLayer(BotonDarDeALta, javax.swing.JLayeredPane.DEFAULT_LAYER);

		javax.swing.GroupLayout dspFondoLayout = new javax.swing.GroupLayout(dspFondo);
		dspFondoLayout.setHorizontalGroup(
			dspFondoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(dspFondoLayout.createSequentialGroup()
					.addGap(58)
					.addGroup(dspFondoLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(dspFondoLayout.createSequentialGroup()
							.addGroup(dspFondoLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))
							.addGap(31)
							.addGroup(dspFondoLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(fechtxt, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
								.addComponent(SegSoctxt, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
								.addComponent(apellidotxt, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
								.addComponent(nombretxt, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
								.addComponent(dnitxt, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)))
						.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
						.addGroup(dspFondoLayout.createSequentialGroup()
							.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addGap(386)
							.addComponent(BotonDarDeALta, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
						.addGroup(dspFondoLayout.createSequentialGroup()
							.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addGap(50)
							.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(72, Short.MAX_VALUE))
		);
		dspFondoLayout.setVerticalGroup(
			dspFondoLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(dspFondoLayout.createSequentialGroup()
					.addGap(21)
					.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addGroup(dspFondoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(dnitxt, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(dspFondoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(nombretxt, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(dspFondoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addComponent(apellidotxt, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(BotonDarDeALta, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(dspFondoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(SegSoctxt, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(dspFondoLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(fechtxt, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(179, Short.MAX_VALUE))
		);
		dspFondo.setLayout(dspFondoLayout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(dspFondo, javax.swing.GroupLayout.Alignment.TRAILING)
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(dspFondo, javax.swing.GroupLayout.Alignment.TRAILING)
				);

		pack();
	}
	/**
	 * Manejador de eventos para el boton "DAR DE ALTA".
	 * Valida los datos ingresados y agrega un nuevo empleado a la lista si son validos.
	 * Muestra mensajes de error en caso contrario.
	 * @param evt Evento de accion del botón
	 */
	private void BotonDarDeALtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDarDeALtaActionPerformed
		if (camposEstanRellenos() && validarDatos()) {
			agregarEmpleado();
		} else {
			JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos antes de dar de alta un empleado.", "Campos Incompletos", JOptionPane.WARNING_MESSAGE);
		}
	}
	/**
	 * Agrega un nuevo empleado a la lista de empleados.
	 */
	private void agregarEmpleado() {

		String dni = dnitxt.getText();
		String nombre = nombretxt.getText();
		String apellidos = apellidotxt.getText();
		String seguridadSocial = SegSoctxt.getText();
		String fechaNacimiento = fechtxt.getText();

		Empleados nuevoEmpleado = new Empleados (dni, nombre, apellidos, seguridadSocial, fechaNacimiento);

		String id = nuevoEmpleado.getId();
		
		boolean var=listaEmpleados.addEmpleado(id, nuevoEmpleado);
		if(var==false) {
			JOptionPane.showMessageDialog(this, "No se agrego el empleado por DNI repetido", "ERROR", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(this, "Empleado agregado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
			limpiar();
		}

		imprimirLista(listaEmpleados.getEmpleados(), "empleados.txt");


	}
	
	/**
	 * Valida los datos ingresados en los campos de entrada.
	 * @return `true` si todos los datos son validos, `false` si hay algun dato no valido.
	 */
	public boolean validarDatos() {
		
		boolean comp = false;
		
		if(validarDni() && 
				validarNombre() &&
				validarApellidos()&&
				validarNumeroSS()&&
				validarFechaNacimiento()) {
		
			comp = true;
		}
		
		return comp;
		
	
	}
	/**
	 * Valida el formato del DNI ingresado.
	 * @return `true` si el DNI es valido, `false` si no cumple con el formato requerido.
	 */
	public boolean validarDni() {
		String dni = dnitxt.getText();
        boolean bo = true;

        if (dni.length() != 9) {
            JOptionPane.showMessageDialog(this, "Formato del DNI Incorrecto ", "Error", JOptionPane.ERROR_MESSAGE);
            bo = false;
        } else {
            String numeros = dni.substring(0, 8);
            if (!numeros.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Los Primeros 8 caracteres deben ser numeros", "Error", JOptionPane.ERROR_MESSAGE);
                bo = false;
            }
            else {

                char letra = dni.charAt(8);
                if (!Character.isLetter(letra) || !Character.isUpperCase(letra)) {
                    JOptionPane.showMessageDialog(this, "El último caracter debe ser una letra mayuscula", "Error", JOptionPane.ERROR_MESSAGE);
                    bo = false;
                }
                else {
                    bo=true;
                }
            }
        }

        return bo;
    }

	/**
	 * Valida el formato del nombre ingresado.
	 * @return `true` si el nombre es valido, `false` si no cumple con el formato requerido.
	 */
	public boolean validarNombre() {

		String nombre = nombretxt.getText();
		
		boolean p = true;

		if (!nombre.matches("[a-zA-Z]+")) {
			JOptionPane.showMessageDialog(this, "El nombre no debe contener numeros ni otros simbolos", "Error", JOptionPane.ERROR_MESSAGE);
		
			 p = false;
		}
		return p;
	}

	/**
	 * Valida el formato de los apellidos ingresados.
	 * @return `true` si los apellidos son validos, `false` si no cumplen con el formato requerido.
	 */
	public boolean validarApellidos() {

		String apellido = apellidotxt.getText();
		
		boolean p = true;

		if (!apellido.matches("[a-zA-Z]+")) {
			JOptionPane.showMessageDialog(this, "Los apellidos no debe contener numeros ni otros caracteres que no sean letras", "Error", JOptionPane.ERROR_MESSAGE);
			
			p = false;
		}
		return p;
	}
	/**
	 * Valida el formato del numero de seguridad social ingresado.
	 * @return true si el numero de seguridad social es valido, `false` si no cumple con el formato requerido.
	 */
	public boolean validarNumeroSS() {

		String seguridadSocial = SegSoctxt.getText();
		
		boolean p = true;
		if (seguridadSocial.length() != 9) {
	        JOptionPane.showMessageDialog(this, "Formato de la seguridad social Incorrecto ", "Error", JOptionPane.ERROR_MESSAGE);
	        p=false;
		}
		else {
			
		if (!seguridadSocial.matches("\\d+")) {
			JOptionPane.showMessageDialog(this, "La cadena debe contener solo numeros", "Error", JOptionPane.ERROR_MESSAGE);
			 
			p = false;
		}
		}
		
		return p;
	}
	/**
	 * Valida el formato de la fecha de nacimiento ingresada.
	 * @return `true` si la fecha de nacimiento es valida, `false` si no cumple con el formato requerido.
	 */
	public boolean validarFechaNacimiento() {
		String fecha = fechtxt.getText();
        boolean p = true;

        if (!fecha.matches("\\d{2}/\\d{2}/\\d{2}")) {
            JOptionPane.showMessageDialog(this, "El formato de la fecha no es valido. Debe ser dd/MM/yy. Todo en numeros y separado por '/'", "Error", JOptionPane.ERROR_MESSAGE);
            p = false;
        } else {
            // Extraer dia, mes y año
            String[] partes = fecha.split("/");
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);

            if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
                JOptionPane.showMessageDialog(this, "La fecha contiene valores fuera de rango. Los días deben estar entre 1 y 31, y los meses entre 1 y 12.", "Error", JOptionPane.ERROR_MESSAGE);
                p = false;
            }
        }

        return p;
    }
	/**
	 * Limpia los campos de entrada en la ventana de alta de empleados.
	 */
	public void limpiar(){
		dnitxt.setText(null);
		nombretxt.setText(null);
		apellidotxt.setText(null);
		SegSoctxt.setText(null);
		fechtxt.setText(null);
	}
	/**
	 * Imprime la lista de empleados en un archivo de texto.
	 * @param listaEmpleados Lista de empleados a imprimir.
	 * @param empleadosss Nombre del archivo de salida.
	 */
	public void imprimirLista(TreeMap<String, Empleados> listaEmpelados, String empleadosss) {

		try(PrintWriter writer = new PrintWriter(new FileWriter(empleadosss))){

			for(Map.Entry<String, Empleados> entry : listaEmpleados.getEmpleados().entrySet()) {

				Empleados empleado = entry.getValue();

				writer.println("ID:" + entry.getKey() + 
						"\n" + "DNI:" + empleado.getDni() +
						"\n" + "Nombre:" + empleado.getNombre() +
						"\n" + "Apellidos:" + empleado.getApellidos() +
						"\n" + "Seguridad Social:" + empleado.getSeguridadSocial() +
						"\n" + "Fecha de Nacimiento:" + empleado.getFecha_nac());

			}
		}catch(IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "Error al dar de alta al empleados", "ERROR", JOptionPane.INFORMATION_MESSAGE);
			limpiar();
		}
	}

	/**
	 * Verifica si todos los campos de entrada estan rellenados.
	 * @return 'true' si todos los campos están rellenados, 'false' si falta algun dato.
	 */
	public boolean camposEstanRellenos() {
		return !dnitxt.getText().isEmpty() &&
				!nombretxt.getText().isEmpty() &&
				!apellidotxt.getText().isEmpty() &&
				!SegSoctxt.getText().isEmpty() &&
				!fechtxt.getText().isEmpty();
	}


	
	private javax.swing.JButton BotonDarDeALta;
	private javax.swing.JTextField SegSoctxt;
	private javax.swing.JTextField apellidotxt;
	private javax.swing.JTextField dnitxt;
	private javax.swing.JDesktopPane dspFondo;
	private javax.swing.JTextField fechtxt;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JTextField nombretxt;
	
}
