/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package planner;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static planner.dbconnection.c;
/**
 *
 * @author Lenovo
 */
public class menu_edit extends javax.swing.JFrame {

    /**
     * Creates new form menu_edit
     */
    String hariCurr;
    String username;
    
    public menu_edit(String hari, String user) {
        initComponents();
        setLocationRelativeTo(this);        
        hariCurr = hari;
        username = user;
        muncul();
        this.setLocationRelativeTo(null);
    }

    public final void muncul(){
        try{
            CB_Event.removeAllItems();
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/weeklyplanner", "root", "");
            ResultSet rs = c.createStatement().executeQuery("SELECT * FROM weeklist WHERE username = '" + username + "' AND day = '" + hariCurr + "'");
            while(rs.next()){
                String todo = rs.getString("todo");
                CB_Event.addItem(todo);
            }
        }catch(ClassNotFoundException | SQLException ex){
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CB_Event = new javax.swing.JComboBox<>();
        TF_Event = new javax.swing.JTextField();
        CB_Day = new javax.swing.JComboBox<>();
        CB_Category = new javax.swing.JComboBox<>();
        backButton = new javax.swing.JButton();
        simpanButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CB_Event.setBackground(new java.awt.Color(254, 250, 229));
        CB_Event.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        getContentPane().add(CB_Event, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 820, 50));

        TF_Event.setBackground(new java.awt.Color(254, 250, 229));
        TF_Event.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        TF_Event.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_EventActionPerformed(evt);
            }
        });
        getContentPane().add(TF_Event, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 820, 50));

        CB_Day.setBackground(new java.awt.Color(254, 250, 229));
        CB_Day.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        CB_Day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));
        CB_Day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_DayActionPerformed(evt);
            }
        });
        getContentPane().add(CB_Day, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 820, 50));

        CB_Category.setBackground(new java.awt.Color(254, 250, 229));
        CB_Category.setEditable(true);
        CB_Category.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        CB_Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "do", "decide", "delegate", "delete" }));
        getContentPane().add(CB_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, 820, 50));

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        backButton.setText("Back");
        backButton.setBorder(null);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 775, 80, 40));

        simpanButton.setBackground(new java.awt.Color(255, 255, 255));
        simpanButton.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        simpanButton.setText("Save");
        simpanButton.setBorder(null);
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });
        getContentPane().add(simpanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 705, 210, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_components/edit.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_EventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_EventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_EventActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try {
            new taskDaily(hariCurr, username, dbconnection.getListDaily(username, hariCurr, "do"), dbconnection.getListDaily(username, hariCurr, "decide"), dbconnection.getListDaily(username, hariCurr, "delegate"), dbconnection.getListDaily(username, hariCurr, "delete")).setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MenuCurrent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        // TODO add your handling code here:

        String sql = "UPDATE weeklist SET todo = '" + TF_Event.getText() + "', category = '" + CB_Category.getSelectedItem() + "', day = '" + CB_Day.getSelectedItem() + "' WHERE todo = '" + CB_Event.getSelectedItem() + "' AND username = '" + username + "' AND day = '" + hariCurr + "'";
        try {
            if("".equals(TF_Event.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "You didn't input anything", "Error",
                    JOptionPane.ERROR_MESSAGE);
            }else{
                dbconnection.InsertData(sql);
                JOptionPane.showMessageDialog(this, "Updated !");
            }
            TF_Event.setText("");
            muncul();

        }catch (Exception ex) {
            Logger.getLogger(menu_edit.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_simpanButtonActionPerformed

    private void CB_DayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_DayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_DayActionPerformed

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
            java.util.logging.Logger.getLogger(menu_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_edit("","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_Category;
    private javax.swing.JComboBox<String> CB_Day;
    private javax.swing.JComboBox<String> CB_Event;
    private javax.swing.JTextField TF_Event;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton simpanButton;
    // End of variables declaration//GEN-END:variables
}
