package vista;

import clases.Empleados;
import listas.ListasEmpleados;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

/**
 * Clase que representa la ventana de Busqueda de empleados en la aplicacion.
 * Permite buscar un empleado el la lista por ID y eliminarlo.
 * 
 */
public class Busqueda extends javax.swing.JInternalFrame {
	ListasEmpleados listaEmpleados= ListasEmpleados.getInstancia();
	
	/**
	 * Constructor de la clase Busqueda.
	 * Inicializa la ventana y sus componentes.
	 */
    public Busqueda() {
        initComponents();
    }

    /**
     * Inicializa los componentes de la interfaz de usuario.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        dspFondo = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        botonBuscar.setFont(new Font("Tahoma", Font.PLAIN, 20));
        botonBuscar.setText("BUSCAR");
        botonBuscar.setIcon(new ImageIcon(Busqueda.class.getResource("/vista/iconos/Buscar.gif")));
        botonBuscar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String id = idtext.getText();
        		
        		buscarEmpleadoPorID(id);
        	}
        });
        nombretxt = new javax.swing.JTextField();
        nombretxt.setEnabled(false);
        apellidotxt = new javax.swing.JTextField();
        apellidotxt.setEnabled(false);
        idtext = new javax.swing.JTextField();
        dnitxt = new javax.swing.JTextField();
        dnitxt.setEnabled(false);
        numSegtxt = new javax.swing.JTextField();
        numSegtxt.setEnabled(false);
        fec_nactxt = new javax.swing.JTextField();
        fec_nactxt.setEnabled(false);

        setClosable(true);
        setTitle("Electronic Arc's");

        dspFondo.setBackground(new java.awt.Color(0, 153, 153));
        dspFondo.setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("DNI:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("BUSQUEDA");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("ID:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("NOMBRE:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("APELLIDO:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("FECHA NACIMIENTO:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setText("NºSEGURIDAD SOCIAL:");

        dspFondo.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dspFondo.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dspFondo.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dspFondo.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dspFondo.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dspFondo.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dspFondo.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dspFondo.setLayer(botonBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dspFondo.setLayer(nombretxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dspFondo.setLayer(apellidotxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dspFondo.setLayer(idtext, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dspFondo.setLayer(dnitxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dspFondo.setLayer(numSegtxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dspFondo.setLayer(fec_nactxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        
        JButton BorrarCampos = new JButton("Borrar Campos");
        BorrarCampos.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		limpiar();
        	}
        });
        BorrarCampos.setFont(new Font("Tahoma", Font.PLAIN, 20));
        BorrarCampos.setIcon(new ImageIcon(Busqueda.class.getResource("/vista/iconos/Eliminar.gif")));

        javax.swing.GroupLayout dspFondoLayout = new javax.swing.GroupLayout(dspFondo);
        dspFondoLayout.setHorizontalGroup(
        	dspFondoLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(dspFondoLayout.createSequentialGroup()
        			.addGap(35)
        			.addGroup(dspFondoLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(dspFondoLayout.createSequentialGroup()
        					.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
        					.addComponent(numSegtxt, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
        				.addGroup(dspFondoLayout.createSequentialGroup()
        					.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
        					.addGroup(dspFondoLayout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        						.addComponent(apellidotxt, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(dspFondoLayout.createSequentialGroup()
        					.addGap(6)
        					.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(fec_nactxt, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
        				.addGroup(dspFondoLayout.createSequentialGroup()
        					.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
        					.addComponent(idtext, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
        				.addGroup(dspFondoLayout.createSequentialGroup()
        					.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
        					.addComponent(nombretxt, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
        				.addGroup(dspFondoLayout.createSequentialGroup()
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
        					.addComponent(dnitxt, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)))
        			.addGap(28)
        			.addGroup(dspFondoLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(BorrarCampos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(botonBuscar, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))
        			.addGap(126))
        );
        dspFondoLayout.setVerticalGroup(
        	dspFondoLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(dspFondoLayout.createSequentialGroup()
        			.addGroup(dspFondoLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(dspFondoLayout.createSequentialGroup()
        					.addGap(20)
        					.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        					.addGap(37)
        					.addGroup(dspFondoLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(idtext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(dspFondoLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        						.addComponent(dnitxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(dspFondoLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        						.addComponent(nombretxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(dspFondoLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        						.addComponent(apellidotxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(dspFondoLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        						.addComponent(numSegtxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(dspFondoLayout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        						.addComponent(fec_nactxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(dspFondoLayout.createSequentialGroup()
        					.addGap(195)
        					.addComponent(botonBuscar, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
        					.addGap(48)
        					.addComponent(BorrarCampos, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(172, Short.MAX_VALUE))
        );
        dspFondo.setLayout(dspFondoLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dspFondo)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dspFondo)
                .addContainerGap())
        );

        pack();
    }
    /**
     * Busca un empleado en la base de datos por su ID y muestra los detalles si se encuentra.
     *
     * @param id El ID del empleado a buscar.
     * @return El objeto Empleados encontrado, o null si no se encuentra.
     */
    public Empleados buscarEmpleadoPorID(String id) {
        Empleados empleado = listaEmpleados.buscarPorID(id);

        if (empleado != null) {
            // Se encontró el empleado
            nombretxt.setText(empleado.getNombre());
            apellidotxt.setText(empleado.getApellidos());
            dnitxt.setText(empleado.getDni());
            numSegtxt.setText(empleado.getSeguridadSocial());
            fec_nactxt.setText(empleado.getFecha_nac());
        } else {
            // No se encontró el empleado, mostrar un JOptionPane
            JOptionPane.showMessageDialog(this, "No se ha encontrado el empleado con ID " + id, "Empleado no encontrado", JOptionPane.WARNING_MESSAGE);
        }

        return empleado;
    }
    /**
     * Limpia los campos de texto en la interfaz de busqueda.
     */
    public void limpiar(){
    	idtext.setText(null);
		dnitxt.setText(null);
		nombretxt.setText(null);
		apellidotxt.setText(null);
		numSegtxt.setText(null);
		fec_nactxt.setText(null);
	}


    
    private javax.swing.JDesktopPane dspFondo;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JTextField apellidotxt;
    private javax.swing.JTextField idtext;
    private javax.swing.JTextField dnitxt;
    private javax.swing.JTextField numSegtxt;
    private javax.swing.JTextField fec_nactxt;
}
