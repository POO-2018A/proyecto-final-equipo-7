package juegoNaruto;

import java.applet.AudioClip;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class GUITest00_Personajes extends javax.swing.JFrame {

    AudioClip audio;
    ArrayList<Object> jugadores = new ArrayList();
    Control controller = new Control();
    DefaultComboBoxModel modeloComboBoxPlayer1, modeloComboBoxPlayer2; //Ok, voy a hacer así, ojalá os sirva 
    int jugador1, jugador2; //Esto declaro porque voy a comprar entre items (Posiciones de items) de los jugadores que se seleccionen
    /**
     * Creates new form GUITest00_Personajes
     */
    public GUITest00_Personajes() {
        initComponents();
        ponerFondo();
        ponerAudio();
        
        jugadores = controller.cargarObjetos("jugadores.dat"); //Cargar los archivos
        llenarCombo(); //Siempre es importante llenar el combo box, luego de cargar los archivos jajaja
        
        buttonJugar.setEnabled(false); //Mi boton jugar me llevará a mi otra ventana (Que aún no vemos)
        buttonJugador2.setEnabled(false); // El jugador 2 está bloqueado hasta que seleccion el jugador 1
        comboBoxPlayer2.setEnabled(false); // El combo box del jugador 2 está bloquedo hasta que seleccione el jugador 1
        this.setLocationRelativeTo(null); //Esto hará que el juego se imprima en el centro de la pantalla, pues null hace referencia a eso, "la pantalla de nuestro PC"
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBoxPlayer1 = new javax.swing.JComboBox();
        comboBoxPlayer2 = new javax.swing.JComboBox();
        comboBoxPersonaje = new javax.swing.JComboBox();
        buttonJugador1 = new javax.swing.JButton();
        buttonJugador2 = new javax.swing.JButton();
        buttonJugar = new javax.swing.JButton();
        buttonVolver = new javax.swing.JButton();
        buttonPersonaje = new javax.swing.JButton();
        labelJugador1 = new javax.swing.JLabel();
        labelJugador2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getContentPane().add(comboBoxPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 190, 35));

        getContentPane().add(comboBoxPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, 190, 35));

        getContentPane().add(comboBoxPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 250, 35));

        buttonJugador1.setText("SELECCIONAR");
        buttonJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJugador1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, 35));

        buttonJugador2.setText("SELECCIONAR");
        buttonJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJugador2ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 60, -1, 35));

        buttonJugar.setText("¡A LA BATALLA!");
        getContentPane().add(buttonJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 640, -1, 40));

        buttonVolver.setText("VOLVER");
        buttonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(buttonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 640, -1, 40));

        buttonPersonaje.setText("SELECCIONAR PERSONAJE");
        getContentPane().add(buttonPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 630, -1, 40));

        labelJugador1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelJugador1.setForeground(new java.awt.Color(255, 255, 255));
        labelJugador1.setText("Jugador 1:");
        getContentPane().add(labelJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 35, -1, -1));

        labelJugador2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        labelJugador2.setForeground(new java.awt.Color(255, 255, 255));
        labelJugador2.setText("Jugador 2:");
        getContentPane().add(labelJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 34, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filtrar un personaje:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVolverActionPerformed
        // TODO add your handling code here:
        audio.stop(); //Cada vez que aplaste el boton voler a Registro, esta cancion se detiene
         
        GUITest00_Jugador jugador = new GUITest00_Jugador(); //Instancio mi clase de registro (La invoco)
        jugador.setVisible(true); //Y digo, has que esa ventana ser visible
        this.setVisible(false); //Y que esta ya no lo sea
       
    }//GEN-LAST:event_buttonVolverActionPerformed

    private void buttonJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJugador1ActionPerformed
        // TODO add your handling code here:
        buttonJugador2.setEnabled(true); //En  este boton (Botón de jugdor 1), lo que hacemos es que cada vez que lo aplastemos, el botón del jugador 2 se desbloqueará
        comboBoxPlayer2.setEnabled(true); //Al igual que el combo box del jugador 2
        modeloComboBoxPlayer2 = new DefaultComboBoxModel(jugadores.toArray()); //Una vez debloqueado el combo box del jugador 2, coloca en el modelo del combo los items de mi lista de jugadores
        comboBoxPlayer2.setModel(modeloComboBoxPlayer2); //Y también a mi combo, mandale ese modelo ya hechito
        
        jugador1 = comboBoxPlayer1.getSelectedIndex(); //Coge la posición del item que seleccionó del combo Box (Del jugador 1)
           
       
        
    }//GEN-LAST:event_buttonJugador1ActionPerformed

    private void buttonJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJugador2ActionPerformed
        // TODO add your handling code here:
        jugador2 = comboBoxPlayer2.getSelectedIndex(); //Coge la posición del item que seleccionó del combo Box (Del jugador 2)
        
        if(jugador1 == jugador2){ //Compara, si son iguales
            comboBoxPlayer2.setEnabled(false); //El combo box del jugador 2
            buttonJugador2.setEnabled(false); //Y el boton del jugador 2, se bloquean
            
            //Y presenta estos mensajes:
            int iconoError = JOptionPane.ERROR_MESSAGE;
            int iconoOpcion = JOptionPane.INFORMATION_MESSAGE;
            JOptionPane.showMessageDialog(rootPane, "SELECCIÓN NO VÁLIDA: Escogiste 2 veces al mismo ninja", "ERROR", iconoError);
            JOptionPane.showMessageDialog(rootPane, "Pruba elijiendo a dos ninjas diferentes...", "INFORMACIÓN", iconoOpcion);
            
        }else{ //De lo contrario, si no son iguales, ya quedan seleccionados esos ninjas...
            comboBoxPlayer1.setEnabled(false);
            buttonJugador1.setEnabled(false);
            comboBoxPlayer2.setEnabled(false);
            buttonJugador2.setEnabled(false);
        }
    }//GEN-LAST:event_buttonJugador2ActionPerformed

    private void ponerFondo(){
        ImageIcon imagenFondo01, fondo01;
    
        imagenFondo01 = new ImageIcon(getClass().getResource("/imagenes/Naruto13.gif"));
        fondo01 = new ImageIcon(imagenFondo01.getImage().getScaledInstance(labelFondo.getWidth(), labelFondo.getHeight(), Image.SCALE_DEFAULT));
        labelFondo.setIcon(fondo01);
   

    }
    
      private void ponerAudio(){
    
        audio = java.applet.Applet.newAudioClip(getClass().getResource("/sonido/Naruto.wav"));
        audio.play();
     }
      
   private void llenarCombo() { //Cada vez que llames a esta funcion
        
        if (jugadores.size() > 0) { //Simepre que la lista no este vacia
            
            comboBoxPlayer1.setEnabled(true); //El combo box del jugador 1 es visible, y tendrá archivos cargados! (Ver init components)
           
            jugadores = controller.cargarObjetos("jugadores.dat"); //Carga los archivos
            modeloComboBoxPlayer1 = new DefaultComboBoxModel(jugadores.toArray()); //Coloca esos en m modelo
            comboBoxPlayer1.setModel(modeloComboBoxPlayer1); //Coloca en mi combo
            
           //Listo..
    
        } else {
            comboBoxPlayer1.setEnabled(false);
            comboBoxPlayer2.setEnabled(false);
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
            java.util.logging.Logger.getLogger(GUITest00_Personajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUITest00_Personajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUITest00_Personajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUITest00_Personajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUITest00_Personajes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonJugador1;
    private javax.swing.JButton buttonJugador2;
    private javax.swing.JButton buttonJugar;
    private javax.swing.JButton buttonPersonaje;
    private javax.swing.JButton buttonVolver;
    private javax.swing.JComboBox comboBoxPersonaje;
    private javax.swing.JComboBox comboBoxPlayer1;
    private javax.swing.JComboBox comboBoxPlayer2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelJugador1;
    private javax.swing.JLabel labelJugador2;
    // End of variables declaration//GEN-END:variables
}
