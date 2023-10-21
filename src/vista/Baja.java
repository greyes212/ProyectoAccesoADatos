/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;


import javax.swing.JOptionPane;

import clases.Empleados;
import listas.ListasEmpleados;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;

/**
 * Clase que representa la ventana de baja de empleados en la aplicacion.
 * Permite eliminar un empleado de la lista.
 * @author Amin
 */
public class Baja extends javax.swing.JInternalFrame {
	ListasEmpleados listaEmpleados= ListasEmpleados.getInstancia();
	Alta a=new Alta();
	/**
	 * Constructor de la clase Baja.
	 * Inicializa la ventana y sus componentes.
	 */
    public Baja() {
    	
        initComponents();
        
    }
    /**
	 * Inicializa los componentes visuales de la ventana.
	 */	
    @SuppressWarnings("unchecked")
     private void initComponents() {

        dspFondo = new javax.swing.JDesktopPane();
        IngresarAMenu = new javax.swing.JButton();
        IngresarAMenu.setIcon(new ImageIcon(Baja.class.getResource("/vista/iconos/Eliminar.gif")));
        jLabel2 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Electronics Arc's");

        dspFondo.setBackground(new java.awt.Color(0, 153, 153));
        dspFondo.setAutoscrolls(true);

        IngresarAMenu.setText("DAR DE BAJA");
        /**
    	 * Manejador de eventos para el boton 'DAR DE BAJA'.
    	 * Elimina un empleado de la lista utilizando el ID proporcionado.
    	 * Muestra mensajes de error en caso de que el ID no se encuentre en la lista.
    	 */
        IngresarAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	String id = idtxt.getText();
            	darDebaja(id);
            	
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("BAJA");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("ID:");

        dspFondo.setLayer(IngresarAMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dspFondo.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dspFondo.setLayer(idtxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dspFondo.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dspFondoLayout = new javax.swing.GroupLayout(dspFondo);
        dspFondoLayout.setHorizontalGroup(
        	dspFondoLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(dspFondoLayout.createSequentialGroup()
        			.addGap(58)
        			.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
        			.addGap(28)
        			.addComponent(idtxt, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
        			.addGap(38)
        			.addComponent(IngresarAMenu, GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        			.addGap(74))
        		.addGroup(dspFondoLayout.createSequentialGroup()
        			.addContainerGap(284, Short.MAX_VALUE)
        			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        			.addGap(244))
        );
        dspFondoLayout.setVerticalGroup(
        	dspFondoLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(dspFondoLayout.createSequentialGroup()
        			.addGap(45)
        			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
        			.addGroup(dspFondoLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        				.addComponent(idtxt, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        				.addComponent(IngresarAMenu, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
        			.addGap(268))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dspFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }
     /**
 	 * Elimina un empleado de la lista de empleados.
 	 * @param ID El ID del empleado que se va a eliminar.
 	 */
    public void darDebaja(String ID){
    	boolean var=listaEmpleados.removeEmpleado(ID);
    	if(var==false) {
    		JOptionPane.showMessageDialog(this, "No se encontre el ID proporcionado: "+ID, "ERROR", JOptionPane.ERROR_MESSAGE);
    	}
    	else {
    		a.imprimirLista(listaEmpleados.getEmpleados(),"empleados.txt");
    		limpiar();
    		JOptionPane.showMessageDialog(this, "El empleado se borro exitosamente", "EXITO", JOptionPane.INFORMATION_MESSAGE);
    	}
    }
    /**
	 * Limpia el campo de entrada de ID en la ventana de baja de empleados.
	 */
    public void limpiar() {
    	idtxt.setText(null);
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IngresarAMenu;
    private javax.swing.JDesktopPane dspFondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField idtxt;
    // End of variables declaration//GEN-END:variables
}