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
        Jugadores jugadorSeleccionado = (Jugadores) comboBoxNinja.getSelectedItem(); //Hago esto para coger el item de mi comboBox, y "convertirlo a Jugador"
        
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
        Jugadores jugadorSeleccionado = (Jugadores) comboBoxNinja.getSelectedItem(); //Hago esto para coger el item de mi comboBox, y "convertirlo a Jugador". Recuerda que esto me devolvería la dirección en memoria si fuera un objeto nada más...
        boolean existe = false; //Esta variable me ayudará a comprobar si ya existe ese jugador que se pretende modificar
        
        //Esto lo que hace es guardar el nuevo texto que he modificado cuando filtré el combobox, y presioné modificar
        String nuevoNombre   = textNombre.getText();
        String nuevoApellido = textApellido.getText();
        String nuevaCedula   = textCedula.getText();
        String nuevoUsaurio  = textUsuario.getText();
        
        //Instancio, llamo a mi clase Jugadores y le mando como valor inicial el texto modificado!... Excepto el ID, ese no va a cambiar, si se modifica segurá ocupando la misma posicion
        Jugadores jugadorModificado = new Jugadores(jugadorSeleccionado.getId(),nuevoNombre, nuevoApellido,nuevaCedula, nuevoUsaurio, 0 );
        
        for(Object item: jugadores){ //Para cada elemento de tipo Objeto de mi lista de jugadores
            Jugadores otrosJugadores = (Jugadores) item; //Hago un "casting", para convertir todos esos items a "Jugadores"
      
            if(jugadorModificado.getNombre().equals(otrosJugadores.getNombre())){ //Si el nombre del jugador que modifique, es como el de otro jugaro
                if(jugadorModificado.getApellido().equals(otrosJugadores.getApellido())){ //Y además el apellido, del jugador que modifique
                    if(jugadorModificado.getCedula().equals(otrosJugadores.getCedula())){ // y además el número de cédula
                        if(jugadorModificado.getUsuario().equals(otrosJugadores.getUsuario())){ //Y el nombre del usuario son iguales,
                        
                            existe = true; //Este jugador ya existe...
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

                break; //Deja de comparar.
                }
        }
        
        if(existe == false){ //Si el jugador no existe
            
            //Al jugador seleccionado (Del ComboBox) colocale estos atributos:
            jugadorSeleccionado.setNombre(nuevoNombre);
            jugadorSeleccionado.setApellido(nuevoApellido);
            jugadorSeleccionado.setCedula(nuevaCedula);
            jugadorSeleccionado.setUsuario(nuevoUsaurio);

            //Un arreglo para diseñar el orden en el que irán los atributos en la tabla.
            Object jugadoresPro[] = {jugadorSeleccionado.getId(), jugadorSeleccionado.getNombre(), jugadorSeleccionado.getApellido(), jugadorSeleccionado.getCedula(), jugadorSeleccionado.getUsuario()};
            DefaultTableModel model = (DefaultTableModel) tableJugadores.getModel(); //No hicimos una tabla, sino que ya le pusimos por defecto las columnas
                                                                                    //Por eso debemos obtener ese modelo.

            int posicionItem = comboBoxNinja.getSelectedIndex();
            model.removeRow(posicionItem); //Eliminar de la tabla el item de la posicion "p"
            jugadores.remove(posicionItem); //Eliminar de la lista el item de la posicion "p"
            
            model.insertRow(posicionItem, jugadoresPro); //Colocar el modificado en la tabla (En la posicion "p") en el orden: jugadoresPro
            jugadores.add(posicionItem, jugadorSeleccionado); //Colocar el modificado en la lista, en la posicion escogida, y sobreescrbiendo al jugador 
            controller.escribirObjeto("jugadores.dat", jugadores); //Archivar el cambio
            llenarCombo(); //Funcion Llenar combo para evidenciar el cambio en el comboBox
        }
        
       
        limpiar();
        buttonModificar.setEnabled(false);
        buttonEliminar.setEnabled(false);
        
    }//GEN-LAST:event_buttonModificarActionPerformed

    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarActionPerformed
        // TODO add your handling code here:
        System.out.println("Eliminando...");
        Jugadores jugadorSeleccionado = (Jugadores) comboBoxNinja.getSelectedItem();  //Hago esto para coger el item de mi comboBox, y "convertirlo a Jugador"
        DefaultTableModel model = (DefaultTableModel) tableJugadores.getModel(); //Obtengo el modelo, la tabla que cree de forma estática. (Es decir no le puse yo los titulos, ni una matriz de datos, sino que yo cree desde el modelo)

        //Eliminar es tan sencillo como...
        int posicionItem = comboBoxNinja.getSelectedIndex(); //Este tendrá la posicion del item seleccionado
        model.removeRow(posicionItem); //Eliminará al item que esté en la posicion "x" de la tabla
        jugadores.remove(jugadorSeleccionado); //Elimiará al item "Jugador seleccionado" de mi lista de jugadores
        controller.escribirObjeto("jugadores.dat", jugadores); //Guardará esos cambios en un archivo
        
        llenarCombo(); //Evidenciaremos el cambio en el comboBox 
        limpiar(); //Los campos del textField quedarán vacios
        buttonModificar.setEnabled(false); 
        buttonEliminar.setEnabled(false);
        
    }//GEN-LAST:event_buttonEliminarActionPerformed

    private void buttonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarActionPerformed
        // TODO add your handling code here:
        System.out.println("Registrando..."); //Cuando se presione el boton registrar imprimirá esto: Registrando...
        contador++; //El contador aumentará en 1 
        int victorias = 0; //El numero de victorias es 0 (Todavía no jugamos, nadie ha peleado)
        boolean existe = false;
        
        //Este constrctor tiene como parámetros el contador, el nombre, el apellido...todos esos atributos tomados de los textfields
        String nombre = textNombre.getText();
        String apellido = textApellido.getText();
        String cedula = textCedula.getText();
        String usuario = textUsuario.getText();
        
        Jugadores jugador = new Jugadores(contador, nombre , apellido, cedula , usuario , victorias);
        
       //Vamo a comparar...
        for(Object item: jugadores){ //Para cada elemento de tipo Objeto de mi lista de jugadores
            Jugadores otrosJugadores = (Jugadores) item; //Hago un "casting", para convertir todos esos items a "Jugadores" ¿Para qué? para que no compare: @#$123Reg con Kakashi por ejemplo
      
            if(jugador.getNombre().equals(otrosJugadores.getNombre())){ //Si el nombre del jugador que registré, es como el de otro jugador
                if(jugador.getApellido().equals(otrosJugadores.getApellido())){ //Y además también el apellido, del jugador que registré
                    if(jugador.getCedula().equals(otrosJugadores.getCedula())){ // y además también el número de cédula
                        if(jugador.getUsuario().equals(otrosJugadores.getUsuario())){ //Y el por si fuera poco, el nombre del usuario también son iguales,
                        
                            existe = true; //Este jugador ya existe...
                            int iconoAdvertencia = JOptionPane.WARNING_MESSAGE;
                            JOptionPane.showMessageDialog(rootPane, "Ya existe ese jugador!", "INFORMACIÓN", iconoAdvertencia); //Mensajse
                            
                            break; //Deja de comparar.
                            }                      
                        }
                    }
                }
        }
        if(existe == false){ //Si ese jugador no exite
            jugadores.add(jugador); //Añadelo a mi lista de jugadores
            controller.escribirObjeto("jugadores.dat", jugadores); //Escribe en el archivo: "jugadores.dat" mi lista "jugadores" actualizada
            jugadores = controller.cargarObjetos("jugadores.dat"); //Cargalos (Los lee y escribe) 
            limpiar(); //Limpia los textefield
            llenarCombo(); //Llama a la funcion de llenar el combo
            //Para la tabla...
            //Puedo declarar variables e ir colocando el valor de esas y mandando a la tabla, pro ejemplo
            //int id = jugador.getId();
            //String nombre = jugador.getNombre(); ...etc...
            // Object jugadorRegistrado[] = {id, nombre, etc...}; O puedo mandar ahí mismo
            Object jugadorRegistrado[] = {jugador.getId(), jugador.getNombre(), jugador.getApellido(), jugador.getCedula(), jugador.getUsuario(), jugador.getVictorias()};
            DefaultTableModel model = (DefaultTableModel) tableJugadores.getModel(); //Una vez obtenido mi modelo de tabla
            model.addRow(jugadorRegistrado); //Añado a mi fila, ese jugador.
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
        audio = java.applet.Applet.newAudioClip(getClass().getResource("/sonido/Shalala.wav"));
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
        if (jugadores.size() > 0) { //Siempre que mi lista sea mayor a cero
            buttonPersonaje.setEnabled(true); //El boton personaje está habilitado (Es decir el boton que te llevará a seleccionar personaje)
            comboBoxNinja.setEnabled(true); //el combo Box cedula está tambien habilitado
            jugadores = controller.cargarObjetos("jugadores.dat"); //Luego cargo mis archivos.... 
            modeloComboBox = new DefaultComboBoxModel(jugadores.toArray()); //le mando a mi modelo de combo box mis jugadores...
            comboBoxNinja.setModel(modeloComboBox); //Coloco ese modelo a mi combo!
            
        } else { //De no ser así (De no haber ni un jugador registrado)
            buttonPersonaje.setEnabled(false); //El botón personaje está muerto
            comboBoxNinja.setEnabled(false); //Y en el combo no hay nada que filtrar
        }
    }

    private void llenarTabla() { //Llenar tabla
        if (jugadores.size() > 0) { //Siempre que existan jugadores 
            Jugadores palyer = new Jugadores(); //Instancio (Haciendo ref. al constructor vacío...)
            DefaultTableModel model = (DefaultTableModel) tableJugadores.getModel();  //Instancio una tabla (Recuerda que esto es necesario para obtener el modelo)
            for (int i = 0; i < jugadores.size(); i++) { //hago ref. al constructor vacio e itero...
                palyer = (Jugadores) jugadores.get(i); //Para obtener mediante un casting (Estoy convirtiendo mi lista de objetos jugadores, que es un arraylist de objetos, a jugadores), y los voy obteneindo acrode a sus posiciones

                //Luego, simplemente doy el orden de cómo ese objeto "player" irá en la tabla:
                Object jugadrosChidoris[] = {palyer.getId(), palyer.getNombre(), palyer.getApellido(), palyer.getCedula(), palyer.getUsuario()};
                model.insertRow(i, jugadrosChidoris); //Inserto en una posicion de la tabla, el arreglo deo objetos  (Las filas)
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
