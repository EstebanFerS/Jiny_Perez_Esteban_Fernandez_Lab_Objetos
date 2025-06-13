/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Tablero extends javax.swing.JFrame {
    
    private JButton[][] casillas = new JButton[3][3];
   
    private char[][] tablero= {
    {' ', ' ', ' '},
    {' ', ' ', ' '},
    {' ', ' ', ' '}
    };

    private boolean JugadorX = true; 
    
    public Tablero() {
        initComponents(); 
        this.setLocationRelativeTo(null);

        casillas[0][0] = casilla0;
        casillas[0][1] = casilla1;
        casillas[0][2] = casilla2;
        casillas[1][0] = casilla3;
        casillas[1][1] = casilla4;
        casillas[1][2] = casilla5;
        casillas[2][0] = casilla6;
        casillas[2][1] = casilla7;
        casillas[2][2] = casilla8;

         Listeners();
    }
    
    private void Listeners(){
       for (int i=0; i<3; i++){
           for(int j=0; j<3; j++){
               int fila=i;
               int columna=j;
                casillas [i][j].addActionListener(e -> CasillaAElegir(fila, columna));
           }
       } 
    }
    
    private void CasillaAElegir(int fila, int columna){
        if (tablero[fila][columna]!=' '){
            JOptionPane.showMessageDialog(this,"Esta casilla ya esta ocupada. Elige otra.");
            return;
        }
        
        tablero[fila][columna]= JugadorX ? 'X' : 'O'; 
        casillas[fila][columna].setText(JugadorX ? "X" : "O");
        
        if (Ganador(JugadorX? 'X' : 'O')) {
            JOptionPane.showMessageDialog(this, "Gano el jugador " + (JugadorX ? "X" : "O") + "!");
            reiniciar();
            return;
        }

        if (tableroLleno()) {
            JOptionPane.showMessageDialog(this, "¡Empate!");
            reiniciar();
            return;
        }

        JugadorX= !JugadorX;
    } 


    private boolean Ganador(char ficha) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == ficha && tablero[i][1] == ficha && tablero[i][2] == ficha)
                return true;
        }

        for (int i = 0; i < 3; i++) {
            if (tablero[0][i] == ficha && tablero[1][i] == ficha && tablero[2][i] == ficha)
                return true;
        }

        if (tablero[0][0] == ficha && tablero[1][1] == ficha && tablero[2][2] == ficha)
            return true;
        if (tablero[0][2] == ficha && tablero[1][1] == ficha && tablero[2][0] == ficha)
            return true;

        return false;
    } 
    
    private boolean tableroLleno() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (tablero[i][j] == ' ')
                    return false;
        return true;
    }

    private void reiniciar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
                casillas [i][j].setText("");
            }
        }
        JugadorX = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        casilla2 = new javax.swing.JButton();
        casilla0 = new javax.swing.JButton();
        casilla1 = new javax.swing.JButton();
        casilla5 = new javax.swing.JButton();
        casilla3 = new javax.swing.JButton();
        casilla4 = new javax.swing.JButton();
        casilla6 = new javax.swing.JButton();
        casilla7 = new javax.swing.JButton();
        casilla8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(450, 400));
        jPanel1.setLayout(null);

        casilla2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla2ActionPerformed(evt);
            }
        });
        jPanel1.add(casilla2);
        casilla2.setBounds(200, 20, 90, 90);
        jPanel1.add(casilla0);
        casilla0.setBounds(20, 20, 90, 90);
        jPanel1.add(casilla1);
        casilla1.setBounds(110, 20, 90, 90);
        jPanel1.add(casilla5);
        casilla5.setBounds(200, 110, 90, 90);
        jPanel1.add(casilla3);
        casilla3.setBounds(20, 110, 90, 90);
        jPanel1.add(casilla4);
        casilla4.setBounds(110, 110, 90, 90);
        jPanel1.add(casilla6);
        casilla6.setBounds(20, 200, 90, 90);
        jPanel1.add(casilla7);
        casilla7.setBounds(110, 200, 90, 90);
        jPanel1.add(casilla8);
        casilla8.setBounds(200, 200, 90, 90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casilla2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla2ActionPerformed

    /**     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Tablero().setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton casilla0;
    private javax.swing.JButton casilla1;
    private javax.swing.JButton casilla2;
    private javax.swing.JButton casilla3;
    private javax.swing.JButton casilla4;
    private javax.swing.JButton casilla5;
    private javax.swing.JButton casilla6;
    private javax.swing.JButton casilla7;
    private javax.swing.JButton casilla8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
