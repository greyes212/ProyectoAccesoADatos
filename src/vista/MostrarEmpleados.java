package vista;

import java.util.Map;
import java.util.TreeMap;

import javax.swing.table.DefaultTableModel;

import clases.Empleados;
import listas.ListasEmpleados;
import javax.swing.ImageIcon;

/**
 * La clase MostrarEmpleados es una ventana interna que muestra una tabla con la lista de empleados.
 * Permite cargar y mostrar la lista de empleados almacenados en la aplicacion.
 */
public class MostrarEmpleados extends javax.swing.JInternalFrame {
	ListasEmpleados listaEmpleados= ListasEmpleados.getInstancia();
	/**
     * Crea una nueva instancia de la clase MostrarEmpleados.
     */
    public MostrarEmpleados() {
        initComponents();
    }

    /**
     * Inicializa los componentes de la interfaz de usuario.
     */
    @SuppressWarnings("unchecked")	
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        CargarEmpleadosTabla = new javax.swing.JButton();
        CargarEmpleadosTabla.setIcon(new ImageIcon(MostrarEmpleados.class.getResource("/vista/iconos/Reporte1.gif")));

        setClosable(true);
        setTitle("Electronic Arc's");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "DNI", "NOMBRE", "APELLIDO", "NUMERO S.S", "FECHA NAC"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        CargarEmpleadosTabla.setText("Cargar Empleados");
        CargarEmpleadosTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarEmpleados(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(CargarEmpleadosTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CargarEmpleadosTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }
    /**
     * Carga y muestra la lista de empleados en la tabla.
     *
     * @param evt El evento de accion.
     */
    public void CargarEmpleados(java.awt.event.ActionEvent evt) {
    	
    	    DefaultTableModel model = (DefaultTableModel) tabla.getModel();
    	    model.setRowCount(0); // Limpia la tabla

    	    TreeMap<String, Empleados> listasEmpleados = listaEmpleados.getEmpleados();

    	    for (Map.Entry<String, Empleados> entry : listasEmpleados.entrySet()) {
    	        Empleados empleado = entry.getValue();
    	        Object[] rowData = {
    	            entry.getKey(),
    	            empleado.getDni(),
    	            empleado.getNombre(),
    	            empleado.getApellidos(),
    	            empleado.getSeguridadSocial(),
    	            empleado.getFecha_nac()
    	        };
    	        model.addRow(rowData);
    	        
    	    }
    	}


    
    private javax.swing.JButton CargarEmpleadosTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
   
}
