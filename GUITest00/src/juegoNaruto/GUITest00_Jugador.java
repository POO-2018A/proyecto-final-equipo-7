package juegoNaruto;

import java.awt.Image;
import java.applet.AudioClip;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author HP
 */
public class GUITest00_Jugador extends javax.swing.JFrame {
    AudioClip audio;
    int contador = 0;
    ArrayList<Object> jugadores = new ArrayList<>();
    DefaultComboBoxModel modeloComboBox;
    Control controller = new Control();
    

    /**
     * Creates new form GUITest00_Jugador
     */
    public GUITest00_Jugador() {
        initComponents();
       
        ponerAudio();
        
        jugadores = controller.cargarObjetos("jugadores.dat");
        ponerFondo();
        llenarCombo();
        llenarTabla();
        
        if (jugadores.size() > 0) {
            Jugadores ultimo = (Jugadores) jugadores.get(jugadores.size() - 1);
            contador = ultimo.getId();
        }
        
        
        buttonModificar.setEnabled(false);
        buttonEliminar.setEnabled(false);
        this.setLocationRelativeTo(null);

    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelCedula = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textApellido = new javax.swing.JTextField();
        textCedula = new javax.swing.JTextField();
        textUsuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableJugadores = new javax.swing.JTable();
        buttonRegistrar = new javax.swing.JButton();
        buttonEliminar = new javax.swing.JButton();
        buttonModificar = new javax.swing.JButton();
        comboBoxNinja = new javax.swing.JComboBox();
        labelNombre1 = new javax.swing.JLabel();
        buttonPersonaje = new javax.swing.JButton();
        labelFondo = new javax.swing.JLabel();

        jScrollPane2.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombre.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelNombre.setText("NOMBRE:");
        getContentPane().add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 70, 20));

        labelApellido.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelApellido.setText("APELLIDO:");
        getContentPane().add(labelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 60, -1));

        labelCedula.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelCedula.setText("CÉDULA:");
        getContentPane().add(labelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, -1));

        labelUsuario.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelUsuario.setText("USUARIO:");
        getContentPane().add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 60, -1));
        getContentPane().add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 100, 26));
        getContentPane().add(textApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 26));
        getContentPane().add(textCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 100, 26));
        getContentPane().add(textUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 100, 26));

        tableJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Apellido", "Cedula", "Usuario", "Victorias"
            }
        ));
        jScrollPane1.setViewportView(tableJugadores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 420, 240));

        buttonRegistrar.setText("REGISTRAR");
        buttonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 120, 35));

        buttonEliminar.setText("ELIMINAR");
        buttonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 120, 35));

        buttonModificar.setText("MODIFICAR");
        buttonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 120, 35));

        comboBoxNinja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNinjaActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxNinja, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 220, 30));

        labelNombre1.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        labelNombre1.setText("SELECCIONAR JUGADOR");
        getContentPane().add(labelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 150, 20));

        buttonPersonaje.setText("SELECCIONAR PERSONAJE");
        buttonPersonaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPersonajeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 600, 210, 35));
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxNinjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxNinjaActionPerformed
        // TODO add your handling code here:
        Jugadores jugadorSeleccionado = (Jugadores) comboBoxNinja.getSelectedItem(); 
        
        //Guardo en variables los atributos de mi item seleccionado:
        String nombre   = jugadorSeleccionado.getNombre();
        String apellido = jugadorSeleccionado.getApellido();
        String cedula   = jugadorSeleccionado.getCedula();
        String usuario  = jugadorSeleccionado.getUsuario();
        
        //En mis campos de texto, hago que esos atributos sean visibles (Y se puedan modificar)
        textNombre.setText(nombre);
        textApellido.setText(apellido);
        textCedula.setText(cedula);
        textUsuario.setText(usuario);
        
        //Hago que mis botones sean o no habilitados
        buttonRegistrar.setEnabled(false); 
        buttonModificar.setEnabled(true);
        buttonEliminar.setEnabled(true);
        
    }//GEN-LAST:event_comboBoxNinjaActionPerformed

    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed
        // TODO add your handling code here:
        System.out.println("Modificando...");
        Jugadores jugadorSeleccionado = (Jugadores) comboBoxNinja.getSelectedItem(); 
        boolean existe = false;
        
        String nuevoNombre   = textNombre.getText();
        String nuevoApellido = textApellido.getText();
        String nuevaCedula   = textCedula.getText();
        String nuevoUsaurio  = textUsuario.getText();
        
        
        Jugadores jugadorModificado = new Jugadores(jugadorSeleccionado.getId(),nuevoNombre, nuevoApellido,nuevaCedula, nuevoUsaurio, 0 );
        
        for(Object item: jugadores){ 
            Jugadores otrosJugadores = (Jugadores) item; 
      
            if(jugadorModificado.getNombre().equals(otrosJugadores.getNombre())){ 
                if(jugadorModificado.getApellido().equals(otrosJugadores.getApellido())){ 
                    if(jugadorModificado.getCedula().equals(otrosJugadores.getCedula())){ 
                        if(jugadorModificado.getUsuario().equals(otrosJugadores.getUsuario())){ 
                        
                            existe = true; 
                            int iconoInformacion = JOptionPane.INFORMATION_MESSAGE;
                            JOptionPane.showMessageDialog(rootPane, "Ya existe ese jugador!", "INFORMACIÓN", iconoInformacion); //Mensajse
                            
                            break; //Deja de comparar.
                            }                      
                        }
                    }
                }
            
            if(jugadorModificado.getCedula().equals(otrosJugadores.getCedula())){ //Si incluso solo su cédula es la misma
                existe = true; //Este jugador ya existe...
                int iconoInformacion = JOptionPane.INFORMATION_MESSAGE;
                JOptionPane.showMessageDialog(rootPane, "Ya existe ese jugador!", "INFORMACIÓN", iconoInformacion); //Mensajse

                break; 
                }
        }
        
        if(existe == false){ 
            
          
            jugadorSeleccionado.setNombre(nuevoNombre);
            jugadorSeleccionado.setApellido(nuevoApellido);
            jugadorSeleccionado.setCedula(nuevaCedula);
            jugadorSeleccionado.setUsuario(nuevoUsaurio);

            
            Object jugadoresPro[] = {jugadorSeleccionado.getId(), jugadorSeleccionado.getNombre(), jugadorSeleccionado.getApellido(), jugadorSeleccionado.getCedula(), jugadorSeleccionado.getUsuario()};
            DefaultTableModel model = (DefaultTableModel) tableJugadores.getModel();
                                                                                    

            int posicionItem = comboBoxNinja.getSelectedIndex();
            model.removeRow(posicionItem);
            jugadores.remove(posicionItem); 
            
            model.insertRow(posicionItem, jugadoresPro); 
            jugadores.add(posicionItem, jugadorSeleccionado); 
            controller.escribirObjeto("jugadores.dat", jugadores); 
            llenarCombo(); 
        }
        
       
        limpiar();
        buttonModificar.setEnabled(false);
        buttonEliminar.setEnabled(false);
        
    }//GEN-LAST:event_buttonModificarActionPerformed

    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarActionPerformed
        // TODO add your handling code here:
        System.out.println("Eliminando...");
        Jugadores jugadorSeleccionado = (Jugadores) comboBoxNinja.getSelectedItem();  
        DefaultTableModel model = (DefaultTableModel) tableJugadores.getModel(); 
        int posicionItem = comboBoxNinja.getSelectedIndex(); 
        model.removeRow(posicionItem); 
        jugadores.remove(jugadorSeleccionado); 
        controller.escribirObjeto("jugadores.dat", jugadores); 
        
        llenarCombo(); 
        limpiar(); 
        buttonModificar.setEnabled(false); 
        buttonEliminar.setEnabled(false);
        
    }//GEN-LAST:event_buttonEliminarActionPerformed

    private void buttonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarActionPerformed
        // TODO add your handling code here:
        System.out.println("Registrando..."); 
        contador++; 
        int victorias = 0;
        boolean existe = false;
        
        String nombre = textNombre.getText();
        String apellido = textApellido.getText();
        String cedula = textCedula.getText();
        String usuario = textUsuario.getText();
        
        Jugadores jugador = new Jugadores(contador, nombre , apellido, cedula , usuario , victorias);
        
       //Vamo a comparar...
        for(Object item: jugadores){ 
            Jugadores otrosJugadores = (Jugadores) item; 
      
            if(jugador.getNombre().equals(otrosJugadores.getNombre())){ 
                if(jugador.getApellido().equals(otrosJugadores.getApellido())){ 
                    if(jugador.getCedula().equals(otrosJugadores.getCedula())){ 
                        if(jugador.getUsuario().equals(otrosJugadores.getUsuario())){ 
                        
                            existe = true; 
                            int iconoAdvertencia = JOptionPane.WARNING_MESSAGE;
                            JOptionPane.showMessageDialog(rootPane, "Ya existe ese jugador!", "INFORMACIÓN", iconoAdvertencia); //Mensajse
                            
                            break; 
                            }                      
                        }
                    }
                }
        }
        if(existe == false){ 
            jugadores.add(jugador); 
            controller.escribirObjeto("jugadores.dat", jugadores); 
            jugadores = controller.cargarObjetos("jugadores.dat");
            limpiar(); 
            llenarCombo(); 
            //Para la tabla...
            //Puedo declarar variables e ir colocando el valor de esas y mandando a la tabla, pro ejemplo
            //int id = jugador.getId();
            //String nombre = jugador.getNombre(); ...etc...
            // Object jugadorRegistrado[] = {id, nombre, etc...}; O puedo mandar ahí mismo
            Object jugadorRegistrado[] = {jugador.getId(), jugador.getNombre(), jugador.getApellido(), jugador.getCedula(), jugador.getUsuario(), jugador.getVictorias()};
            DefaultTableModel model = (DefaultTableModel) tableJugadores.getModel(); 
            model.addRow(jugadorRegistrado); 
        }
        
    }//GEN-LAST:event_buttonRegistrarActionPerformed

    private void buttonPersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPersonajeActionPerformed
        // TODO add your handling code here:
        audio.stop();
        
        GUITest00_Personajes abrir = new GUITest00_Personajes();
        //abrir.nombre = txtnombre.getText();
        abrir.setVisible(true);
        this.setVisible(false);
  
    }//GEN-LAST:event_buttonPersonajeActionPerformed

     private void ponerFondo(){
        
        //Imagen de fondo para el Panel 
        ImageIcon imagenFondo01, fondo01;
    
        //Fondo Registro Jugador:
        imagenFondo01 = new ImageIcon(getClass().getResource("/imagenes/Equipo7.gif")); //Direccion de la imagen
        fondo01 = new ImageIcon(imagenFondo01.getImage().getScaledInstance(labelFondo.getWidth(), labelFondo.getHeight(), Image.SCALE_DEFAULT)); //Ajustar ancho y largo de la imagen
        labelFondo.setIcon(fondo01); //Colocar en un label
      

    }
     
     private void ponerAudio(){
        audio = java.applet.Applet.newAudioClip(getClass().getResource("/juegoNaruto/Shalala.wav"));
        audio.play();
     }
     
       public void limpiar() {
        textNombre.setText(null);
        textApellido.setText(null);
        textCedula.setText(null);
        textUsuario.setText(null);
        buttonRegistrar.setEnabled(true);
    }

    private void llenarCombo() { //Llenar combo
        if (jugadores.size() > 0) { 
            buttonPersonaje.setEnabled(true); 
            comboBoxNinja.setEnabled(true); 
            jugadores = controller.cargarObjetos("jugadores.dat");
            modeloComboBox = new DefaultComboBoxModel(jugadores.toArray()); 
            comboBoxNinja.setModel(modeloComboBox); 
            
        } else { 
            buttonPersonaje.setEnabled(false); 
            comboBoxNinja.setEnabled(false); 
        }
    }

    private void llenarTabla() { //Llenar tabla
        if (jugadores.size() > 0) {
            Jugadores palyer = new Jugadores(); 
            DefaultTableModel model = (DefaultTableModel) tableJugadores.getModel(); 
            for (int i = 0; i < jugadores.size(); i++) { 
                palyer = (Jugadores) jugadores.get(i); 
                
                Object jugadrosChidoris[] = {palyer.getId(), palyer.getNombre(), palyer.getApellido(), palyer.getCedula(), palyer.getUsuario()};
                model.insertRow(i, jugadrosChidoris); 
            }
        }
    }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUITest00_Jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUITest00_Jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUITest00_Jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUITest00_Jugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUITest00_Jugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JButton buttonModificar;
    private javax.swing.JButton buttonPersonaje;
    private javax.swing.JButton buttonRegistrar;
    private javax.swing.JComboBox comboBoxNinja;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombre1;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JTable tableJugadores;
    private javax.swing.JTextField textApellido;
    private javax.swing.JTextField textCedula;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
}
