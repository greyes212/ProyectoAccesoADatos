/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import vista.Alta;
import javax.swing.ImageIcon;

/**
 * La clase Menu representa la ventana principal de la aplicacion.
 * Permite al usuario acceder a las funciones de dar de alta, dar de baja, buscar, mostrar empleados y salir.
 */
	public class Menu extends javax.swing.JFrame {
	/**
     * Crea una nueva instancia de la clase Menu.
     */
    public Menu() {
        initComponents();
    }

    /**
     * Inicializa los componentes de la interfaz de usuario.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        dspFondo = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuAlta = new javax.swing.JMenuItem();
        Jmenu2 = new javax.swing.JMenu();
        MenuBaja = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuBuscar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Electronics Arc's");

        dspFondo.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout dspFondoLayout = new javax.swing.GroupLayout(dspFondo);
        dspFondo.setLayout(dspFondoLayout);
        dspFondoLayout.setHorizontalGroup(
            dspFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        dspFondoLayout.setVerticalGroup(
            dspFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );

        jMenuBar1.setAutoscrolls(true);

        jMenu1.setText("Dar de Alta");

        MenuAlta.setIcon(new ImageIcon(Menu.class.getResource("/vista/iconos/Usuario.gif"))); // NOI18N
        MenuAlta.setText("ALTA");
        MenuAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAltaActionPerformed(evt);
            }
        });
        jMenu1.add(MenuAlta);

        jMenuBar1.add(jMenu1);

        Jmenu2.setText("Dar de Baja");

        MenuBaja.setIcon(new ImageIcon(Menu.class.getResource("/vista/iconos/Eliminar.gif"))); // NOI18N
        MenuBaja.setText("BAJA");
        MenuBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBajaActionPerformed(evt);
            }
        });
        Jmenu2.add(MenuBaja);

        jMenuBar1.add(Jmenu2);

        jMenu4.setText("Mostrar Empleados");

        jMenuItem1.setIcon(new ImageIcon(Menu.class.getResource("/vista/iconos/Imprimir.gif"))); // NOI18N
        jMenuItem1.setText("Imprimir Empleados");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Buscar Empleados");

        MenuBuscar.setIcon(new ImageIcon(Menu.class.getResource("/vista/iconos/Buscar2.gif"))); // NOI18N
        MenuBuscar.setText("BUSCAR");
        MenuBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBuscarActionPerformed(evt);
            }
        });
        jMenu3.add(MenuBuscar);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Terminar");

        MenuSalir.setIcon(new ImageIcon(Menu.class.getResource("/vista/iconos/Salir.gif"))); // NOI18N
        MenuSalir.setText("SALIR");
        MenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalirActionPerformed(evt);
            }
        });
        jMenu2.add(MenuSalir);
        MenuSalir.getAccessibleContext().setAccessibleName("");

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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
     * Abre la ventana de alta de empleados.
     *
     * @param evt El evento de accion.
     */
    public void MenuAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAltaActionPerformed
        Alta alta=new Alta();
        dspFondo.add(alta);
        alta.setVisible(true);
    }
    
    /**
     * Abre la ventana de baja de empleados.
     *
     * @param evt El evento de accion.
     */
    public void MenuBajaActionPerformed(java.awt.event.ActionEvent evt) {
       Baja baja=new Baja();
       dspFondo.add(baja);
       baja.setVisible(true);
    }
    /**
     * Cierra la ventana principal y finaliza la aplicación.
     * @param evt El evento de accion.
     */
    public void MenuSalirActionPerformed(java.awt.event.ActionEvent evt) {
       dispose();
    }
    /**
     * Abre la ventana de busqueda de empleados.
     *
     * @param evt El evento de accion.
     */
    public void MenuBuscarActionPerformed(java.awt.event.ActionEvent evt) {
        Busqueda busqueda=new Busqueda();
        dspFondo.add(busqueda);
        busqueda.setVisible(true);
    }
    /**
     * Abre la ventana para mostrar la lista de empleados.
     *
     * @param evt El evento de accion.
     */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        MostrarEmpleados mostrar=new MostrarEmpleados();
        dspFondo.add(mostrar);
        mostrar.setVisible(true);
    }

  

    
    private javax.swing.JMenu Jmenu2;
    private javax.swing.JMenuItem MenuAlta;
    private javax.swing.JMenuItem MenuBaja;
    private javax.swing.JMenuItem MenuBuscar;
    private javax.swing.JMenuItem MenuSalir;
    private javax.swing.JDesktopPane dspFondo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
