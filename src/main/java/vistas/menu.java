/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.JOptionPane;

/**
 *
 * @author xxzofxx
 */

public class menu extends javax.swing.JFrame {

    
    
    
    
    
    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eMate = new javax.swing.JButton();
        ejRedaccion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eMate.setBackground(new java.awt.Color(0, 102, 204));
        eMate.setText("Ejercicios de Matematicas");
        eMate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eMateActionPerformed(evt);
            }
        });
        getContentPane().add(eMate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 224, -1));

        ejRedaccion.setBackground(new java.awt.Color(102, 102, 255));
        ejRedaccion.setText("Ortografía");
        ejRedaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejRedaccionActionPerformed(evt);
            }
        });
        getContentPane().add(ejRedaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 189, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/xxzofxx/Descargas/calculador.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 63, 72, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/xxzofxx/Descargas/estera.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 172, 68, 48));

        jLabel4.setIcon(new javax.swing.ImageIcon("/home/xxzofxx/Imágenes/fondo.jpeg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 550, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void matematicas(){
    
    
        int menu; // iniciamos variable para el menu 
                
          do{
          
              String MateVentana = JOptionPane.showInputDialog("1. suma  \n\n 2. Resta");
          
              
              menu = Integer.parseInt(MateVentana); //Guarada opcion de menu

              
              switch(menu){
              
                  case 1:
                      
                      int numUno =  (int) (Math.random()*25+1);
                      int numDos = (int) (Math.random()*25+1);
                      
                      
                       String capturaSuma = JOptionPane.showInputDialog("la suma de : " + numUno + " y " + numDos + " es : " );
                        
                        int sumaRegistrada = Integer.parseInt(capturaSuma);
                      
                       int sumaCorrecta = numUno + numDos;
                       
                       if (sumaRegistrada == sumaCorrecta) {
                          
                           
                           JOptionPane.showMessageDialog(null, "correcto, tipeaste " + capturaSuma +" y la respuesta es  " + sumaCorrecta);
                           
                      } else {
                       
                       
                           JOptionPane.showMessageDialog(null, "incorrecto, tipeaste" + capturaSuma + " y la respuesta correcta es " + sumaCorrecta);
                       
                       
                       }
                      
                      
                      
                      break;
                      
                      
                      
                  case 2: 
                      
                      
                       
                      int numUnoResta =  (int) (Math.random()*10+1);
                      int numDosResta = (int) (Math.random()*10+1);
                      
                      
                       String capturaResta = JOptionPane.showInputDialog("la Resta de : " + numUnoResta + " y " + numDosResta + " es : " );
                        
                        int restaRegistrada = Integer.parseInt(capturaResta);
                      
                       int restaCorrecta = numUnoResta - numDosResta;
                       
                       if (restaRegistrada == restaCorrecta) {
                          
                           
                           JOptionPane.showMessageDialog(null, "correcto, tipeaste " + capturaResta +" y la respuesta es  " + restaCorrecta);
                           
                      } else {
                       
                       
                           JOptionPane.showMessageDialog(null, "incorrecto, tipeaste" + capturaResta + " y la respuesta correcta es " + restaCorrecta);
                       
                       
                       }
                      
                      
                      
                      break;
                      
                   
                      
                      
                      
                      
              
              }
              
          } while (menu != 3); {
    
    
    
    
    }     
                
        
    
    }
    
    
    
    
    private void eMateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eMateActionPerformed
        // TODO add your handling code here:
        
        matematicas();
        
        
    }//GEN-LAST:event_eMateActionPerformed

    private void ejRedaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejRedaccionActionPerformed
        // TODO add your handling code here:
        
        
         
                             ortografia ortografia = new ortografia(); //llamada
            
            ortografia.setVisible(true);
            this.hide();
        
        
    }//GEN-LAST:event_ejRedaccionActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eMate;
    private javax.swing.JButton ejRedaccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
