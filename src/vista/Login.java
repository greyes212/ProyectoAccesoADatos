/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;

import clases.Empleados;
import listas.ListasEmpleados;
import javax.swing.ImageIcon;



/**
 * La clase Login representa la interfaz de inicio de sesion de la aplicacion.
 * Los usuarios pueden ingresar sus credenciales para acceder al sistema.
 */
	public class Login extends javax.swing.JFrame {
	  static ListasEmpleados listaEmpleados= ListasEmpleados.getInstancia();
	  /**
	     * Crea una nueva instancia de la clase Login.
	     */
    public Login() {
        initComponents();
    }

    /**
     * Inicializa los componentes de la interfaz de usuario.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        dspFondo = new javax.swing.JDesktopPane();
        IngresarAMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuariotxt = new javax.swing.JTextField();
        contrasenatxt = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Electronics Arc's");

        dspFondo.setBackground(new java.awt.Color(0, 153, 153));

        IngresarAMenu.setIcon(new ImageIcon(Login.class.getResource("/vista/iconos/InicioSesion.gif"))); // NOI18N
        IngresarAMenu.setText("INGRESAR");
        IngresarAMenu.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            	cargarFicherosALista();
                IngresarAMenuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("CONTRASEÑA:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setIcon(new ImageIcon(Login.class.getResource("/vista/iconos/Alumno.gif"))); // NOI18N
        jLabel2.setText("LOGIN");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("USUARIO:");

        dspFondo.setLayer(IngresarAMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dspFondo.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dspFondo.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dspFondo.setLayer(usuariotxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dspFondo.setLayer(contrasenatxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dspFondo.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dspFondoLayout = new javax.swing.GroupLayout(dspFondo);
        dspFondo.setLayout(dspFondoLayout);
        dspFondoLayout.setHorizontalGroup(
            dspFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dspFondoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(dspFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(dspFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dspFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(usuariotxt, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                        .addComponent(contrasenatxt)
                        .addComponent(IngresarAMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        dspFondoLayout.setVerticalGroup(
            dspFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dspFondoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(dspFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dspFondoLayout.createSequentialGroup()
                        .addComponent(usuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addGroup(dspFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contrasenatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addComponent(IngresarAMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

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
    public void cargarFicherosALista() {
        try {
            File file = new File("empleados.txt");
            Scanner scanner = new Scanner(file);

            Empleados empleado = null;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                String[] parts = line.split(":");
                String key = parts[0].trim();
                String value = parts[1].trim();

                if (key.equals("ID")) {
                    // Si es una nueva entrada de empleado, crea un nuevo objeto Empleados
                    empleado = new Empleados(value,null, null, null, null, null);
                    
                } else {
                    // Completa los detalles del empleado según la clave
                    switch (key) {
                        case "DNI":
                            empleado.setDni(value);
                            break;
                        case "Nombre":
                            empleado.setNombre(value);
                            break;
                        case "Apellidos":
                            empleado.setApellidos(value);
                            break;
                        case "Seguridad Social":
                            empleado.setSeguridadSocial(value);
                            break;
                        case "Fecha de Nacimiento":
                            empleado.setFecha_nac(value);
                            // Agregar el empleado al TreeMap con el ID como clave
                            listaEmpleados.addEmpleado(empleado.getId(), empleado);
                            break;
                    }
                }
            }

            // Cerrar el Scanner
            scanner.close();

           
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + e.getMessage());
        }
    }
    
    /**
     * Carga las credenciales de usuario desde un archivo 'credenciales.txt'
     * y verifica si las credenciales ingresadas por el usuario coinciden con las almacenadas.
     * Si las credenciales son correctas, redirige al usuario al menú principal.
     */
    public void IngresarAMenuActionPerformed(java.awt.event.ActionEvent evt) {
    	String archivo = "credenciales.txt"; // Nombre del archivo a leer
    	
        Map<String, String> credenciales = new HashMap<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea en nombre de usuario y contraseña usando ":"
                String[] partes = linea.split(":");
                if (partes.length == 2) {
                    String usuario = partes[0];
                    String contrasena = partes[1];
                    credenciales.put(usuario, contrasena);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ahora, tienes un mapa (usuariosYContrasenas) que contiene los usuarios y contraseñas leídos del archivo.
        // Puedes acceder a ellos como desees.
        String usuarioIngresado = usuariotxt.getText();
        String contrasenaIngresada = new String(contrasenatxt.getPassword());

        if (credenciales.containsKey(usuarioIngresado)) {
            String contrasenaCorrecta = credenciales.get(usuarioIngresado);
            if (contrasenaCorrecta.equals(contrasenaIngresada)) {
                // Contraseña correcta, puedes proceder al menú.
                Menu menu = new Menu();
                this.dispose();
                menu.setVisible(true);
                JOptionPane.showMessageDialog(this, "BIENVENIDO A LA PLATAFORMA", "EXITO", JOptionPane.INFORMATION_MESSAGE);
            } else {
            	JOptionPane.showMessageDialog(this, "CONTRASEÑA INCORRECTA", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
        	JOptionPane.showMessageDialog(this, "USUARIO INCORRECTO", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * El metodo principal que inicia la aplicacion.
     *
     * @param args Los argumentos de linea de comandos.
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IngresarAMenu;
    private javax.swing.JDesktopPane dspFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField contrasenatxt;
    private javax.swing.JTextField usuariotxt;
    // End of variables declaration//GEN-END:variables
}
