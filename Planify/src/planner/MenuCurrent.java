/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package planner;

import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.ListModel;
import static planner.dbconnection.c;

public class MenuCurrent extends javax.swing.JFrame {

    String username;
    
        public MenuCurrent(String note, String user, DefaultListModel listDataMon, DefaultListModel listDataTue, DefaultListModel listDataWed, DefaultListModel listDataThu, DefaultListModel listDataFri, DefaultListModel listDataSat, DefaultListModel listDataSun) throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        username = user;
        TA_Notes.setText(note);
        JL_Monday.setModel(listDataMon);
        JL_Tuesday.setModel(listDataTue);
        JL_Wednesday.setModel(listDataWed);
        JL_Thursday.setModel(listDataThu);
        JL_Friday.setModel(listDataFri);
        JL_Saturday.setModel(listDataSat);
        JL_Sunday.setModel(listDataSun);
    }

     public void muncul(){
        TA_Notes.setText("");
        DefaultListModel<String> emptyListModel = new DefaultListModel<>();

        // Set the empty model to each JList
        JL_Monday.setModel(emptyListModel);
        JL_Tuesday.setModel(emptyListModel);
        JL_Wednesday.setModel(emptyListModel);
        JL_Thursday.setModel(emptyListModel);
        JL_Friday.setModel(emptyListModel);
        JL_Saturday.setModel(emptyListModel);
        JL_Sunday.setModel(emptyListModel);
    }
     
    MenuCurrent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN_Monday = new javax.swing.JButton();
        BTN_Tuesday = new javax.swing.JButton();
        BTN_Wednesday = new javax.swing.JButton();
        BTN_Thursday = new javax.swing.JButton();
        BTN_Friday = new javax.swing.JButton();
        BTN_Saturday = new javax.swing.JButton();
        BTN_Sunday = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JL_Monday = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        JL_Tuesday = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        JL_Wednesday = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        JL_Thursday = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        JL_Friday = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        JL_Saturday = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        JL_Sunday = new javax.swing.JList<>();
        BTN_Back = new javax.swing.JButton();
        BTN_Save = new javax.swing.JButton();
        BTN_Reset = new javax.swing.JButton();
        SP_TA = new javax.swing.JScrollPane();
        TA_Notes = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_Monday.setBackground(new java.awt.Color(254, 250, 224));
        BTN_Monday.setFont(new java.awt.Font("Montserrat", 1, 11)); // NOI18N
        BTN_Monday.setForeground(new java.awt.Color(51, 51, 51));
        BTN_Monday.setText("Monday");
        BTN_Monday.setBorder(null);
        BTN_Monday.setPreferredSize(new java.awt.Dimension(90, 25));
        BTN_Monday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_MondayActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_Monday, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        BTN_Tuesday.setBackground(new java.awt.Color(254, 250, 224));
        BTN_Tuesday.setFont(new java.awt.Font("Montserrat", 1, 11)); // NOI18N
        BTN_Tuesday.setForeground(new java.awt.Color(51, 51, 51));
        BTN_Tuesday.setText("Tuesday");
        BTN_Tuesday.setBorder(null);
        BTN_Tuesday.setIconTextGap(0);
        BTN_Tuesday.setPreferredSize(new java.awt.Dimension(90, 25));
        BTN_Tuesday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_TuesdayActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_Tuesday, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        BTN_Wednesday.setBackground(new java.awt.Color(254, 250, 224));
        BTN_Wednesday.setFont(new java.awt.Font("Montserrat", 1, 11)); // NOI18N
        BTN_Wednesday.setForeground(new java.awt.Color(51, 51, 51));
        BTN_Wednesday.setText("Wednesday");
        BTN_Wednesday.setBorder(null);
        BTN_Wednesday.setPreferredSize(new java.awt.Dimension(100, 25));
        BTN_Wednesday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_WednesdayActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_Wednesday, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        BTN_Thursday.setBackground(new java.awt.Color(254, 250, 224));
        BTN_Thursday.setFont(new java.awt.Font("Montserrat", 1, 11)); // NOI18N
        BTN_Thursday.setForeground(new java.awt.Color(51, 51, 51));
        BTN_Thursday.setText("Thursday");
        BTN_Thursday.setBorder(null);
        BTN_Thursday.setPreferredSize(new java.awt.Dimension(90, 25));
        BTN_Thursday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ThursdayActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_Thursday, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, -1, -1));

        BTN_Friday.setBackground(new java.awt.Color(254, 250, 224));
        BTN_Friday.setFont(new java.awt.Font("Montserrat", 1, 11)); // NOI18N
        BTN_Friday.setForeground(new java.awt.Color(51, 51, 51));
        BTN_Friday.setText("Friday");
        BTN_Friday.setBorder(null);
        BTN_Friday.setPreferredSize(new java.awt.Dimension(90, 25));
        BTN_Friday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_FridayActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_Friday, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 150, -1, -1));

        BTN_Saturday.setBackground(new java.awt.Color(254, 250, 224));
        BTN_Saturday.setFont(new java.awt.Font("Montserrat", 1, 11)); // NOI18N
        BTN_Saturday.setForeground(new java.awt.Color(51, 51, 51));
        BTN_Saturday.setText("Saturday");
        BTN_Saturday.setBorder(null);
        BTN_Saturday.setPreferredSize(new java.awt.Dimension(90, 25));
        BTN_Saturday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SaturdayActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_Saturday, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 150, -1, -1));

        BTN_Sunday.setBackground(new java.awt.Color(254, 250, 224));
        BTN_Sunday.setFont(new java.awt.Font("Montserrat", 1, 11)); // NOI18N
        BTN_Sunday.setForeground(new java.awt.Color(51, 51, 51));
        BTN_Sunday.setText("Sunday");
        BTN_Sunday.setBorder(null);
        BTN_Sunday.setPreferredSize(new java.awt.Dimension(90, 25));
        BTN_Sunday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SundayActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_Sunday, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 150, -1, -1));

        JL_Monday.setBackground(new java.awt.Color(254, 250, 229));
        JL_Monday.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 16)); // NOI18N
        jScrollPane1.setViewportView(JL_Monday);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 130, 510));

        JL_Tuesday.setBackground(new java.awt.Color(254, 250, 229));
        JL_Tuesday.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 16)); // NOI18N
        jScrollPane9.setViewportView(JL_Tuesday);

        getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 140, 510));

        JL_Wednesday.setBackground(new java.awt.Color(254, 250, 229));
        JL_Wednesday.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 6)); // NOI18N
        jScrollPane3.setViewportView(JL_Wednesday);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 140, 510));

        JL_Thursday.setBackground(new java.awt.Color(254, 250, 229));
        JL_Thursday.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 16)); // NOI18N
        jScrollPane4.setViewportView(JL_Thursday);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 140, 510));

        JL_Friday.setBackground(new java.awt.Color(254, 250, 229));
        JL_Friday.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 16)); // NOI18N
        jScrollPane5.setViewportView(JL_Friday);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 200, 140, 510));

        JL_Saturday.setBackground(new java.awt.Color(254, 250, 229));
        JL_Saturday.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 16)); // NOI18N
        jScrollPane6.setViewportView(JL_Saturday);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 200, 130, 510));

        JL_Sunday.setBackground(new java.awt.Color(254, 250, 229));
        JL_Sunday.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 16)); // NOI18N
        jScrollPane7.setViewportView(JL_Sunday);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 200, 140, 510));

        BTN_Back.setBackground(new java.awt.Color(255, 255, 255));
        BTN_Back.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        BTN_Back.setText("Back");
        BTN_Back.setBorder(null);
        BTN_Back.setPreferredSize(new java.awt.Dimension(65, 23));
        BTN_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BackActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 753, 70, 30));

        BTN_Save.setBackground(new java.awt.Color(255, 255, 255));
        BTN_Save.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        BTN_Save.setText("Save notes");
        BTN_Save.setBorder(null);
        BTN_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SaveActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 780, 110, 40));

        BTN_Reset.setBackground(new java.awt.Color(255, 255, 255));
        BTN_Reset.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        BTN_Reset.setText("RESET");
        BTN_Reset.setBorder(null);
        BTN_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ResetActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 800, 90, 30));

        TA_Notes.setBackground(new java.awt.Color(254, 250, 229));
        TA_Notes.setColumns(20);
        TA_Notes.setRows(5);
        SP_TA.setViewportView(TA_Notes);

        getContentPane().add(SP_TA, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 776, 950, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_components/curretpage (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_MondayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_MondayActionPerformed
        // TODO add your handling code here:
        this.dispose();

        try {
            new taskDaily("Monday", username, dbconnection.getListDaily(username, "Monday", "do"), dbconnection.getListDaily(username, "Monday", "decide"), dbconnection.getListDaily(username, "Monday", "delegate"), dbconnection.getListDaily(username, "Monday", "delete")).setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MenuCurrent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTN_MondayActionPerformed

    private void BTN_TuesdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_TuesdayActionPerformed
        // TODO add your handling code here:
        this.dispose();

        try {
            new taskDaily("Tuesday", username, dbconnection.getListDaily(username, "Tuesday", "do"), dbconnection.getListDaily(username, "Tuesday", "decide"), dbconnection.getListDaily(username, "Tuesday", "delegate"), dbconnection.getListDaily(username, "Tuesday", "delete")).setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MenuCurrent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTN_TuesdayActionPerformed

    private void BTN_WednesdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_WednesdayActionPerformed
        // TODO add your handling code here:
        this.dispose();

        try {
            new taskDaily("Wednesday", username, dbconnection.getListDaily(username, "Wednesday", "do"), dbconnection.getListDaily(username, "Wednesday", "decide"), dbconnection.getListDaily(username, "Wednesday", "delegate"), dbconnection.getListDaily(username, "Wednesday", "delete")).setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MenuCurrent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTN_WednesdayActionPerformed

    private void BTN_ThursdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ThursdayActionPerformed
        // TODO add your handling code here:
        this.dispose();

        try {
            new taskDaily("Thursday", username, dbconnection.getListDaily(username, "Thursday", "do"), dbconnection.getListDaily(username, "Thursday", "decide"), dbconnection.getListDaily(username, "Thursday", "delegate"), dbconnection.getListDaily(username, "Thursday", "delete")).setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MenuCurrent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTN_ThursdayActionPerformed

    private void BTN_FridayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_FridayActionPerformed
        // TODO add your handling code here:
        this.dispose();

        try {
            new taskDaily("Friday", username, dbconnection.getListDaily(username, "Friday", "do"), dbconnection.getListDaily(username, "Friday", "decide"), dbconnection.getListDaily(username, "Friday", "delegate"), dbconnection.getListDaily(username, "Friday", "delete")).setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MenuCurrent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTN_FridayActionPerformed

    private void BTN_SaturdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SaturdayActionPerformed
        // TODO add your handling code here:
        this.dispose();

        try {
            new taskDaily("Saturday", username, dbconnection.getListDaily(username, "Saturday", "do"), dbconnection.getListDaily(username, "Saturday", "decide"), dbconnection.getListDaily(username, "Saturday", "delegate"), dbconnection.getListDaily(username, "Saturday", "delete")).setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MenuCurrent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTN_SaturdayActionPerformed

    private void BTN_SundayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SundayActionPerformed
        // TODO add your handling code here:
        this.dispose();

        try {
            new taskDaily("Sunday", username, dbconnection.getListDaily(username, "Sunday", "do"), dbconnection.getListDaily(username, "Sunday", "decide"), dbconnection.getListDaily(username, "Sunday", "delegate"), dbconnection.getListDaily(username, "Sunday", "delete")).setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MenuCurrent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTN_SundayActionPerformed

    private void BTN_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BackActionPerformed
        this.dispose();
    }//GEN-LAST:event_BTN_BackActionPerformed

    private void BTN_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SaveActionPerformed
        try{
            dbconnection.InsertData("UPDATE notes SET note = ('" + TA_Notes.getText() + "') WHERE username = '" + username + "'");
            JOptionPane.showMessageDialog(null, "Submitted to database");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_BTN_SaveActionPerformed

    private void BTN_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ResetActionPerformed
        // TODO add your handling code here:
        try {
            int dialogResult = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin melakukan reset dan menyimpan informasi di halaman ini ke dalam history?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            if(dialogResult == JOptionPane.YES_OPTION){
                int g = -1;
                while(g<0){
                    String input = JOptionPane.showInputDialog("Input your week name : ");
                    String sql = "INSERT INTO history (username, namaWeek, notes) VALUES ('" + username + "', '" + input + "', (SELECT note FROM notes WHERE username = '" + username + "'))";
                    String sql2 = "INSERT INTO detail_history SELECT (SELECT id FROM history WHERE username = '" + username + "' AND namaWeek = '" + input + "'), W.todo, W.day, W.category FROM history H JOIN weeklist W ON W.username = H.username WHERE W.username = '" + username + "' AND H.namaWeek = '" + input + "'";
                    if(input.length()>0){
                        g++;
                        dbconnection.InsertData(sql);
                        dbconnection.InsertData(sql2);
                        System.out.println("Inputted!");
                        muncul();
                    }else{
                        System.out.println("Please enter your week name!");
                    }
                }
                dbconnection.InsertData("DELETE FROM weeklist WHERE username = '" + username + "'");
                dbconnection.InsertData("UPDATE notes SET note = NULL WHERE username = '" + username + "'");
            }else{
                JOptionPane.showMessageDialog(this, "Failed");
            }

        } catch (Exception ex) {
            Logger.getLogger(menu_delete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTN_ResetActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCurrent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCurrent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCurrent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCurrent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCurrent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Back;
    private javax.swing.JButton BTN_Friday;
    private javax.swing.JButton BTN_Monday;
    private javax.swing.JButton BTN_Reset;
    private javax.swing.JButton BTN_Saturday;
    private javax.swing.JButton BTN_Save;
    private javax.swing.JButton BTN_Sunday;
    private javax.swing.JButton BTN_Thursday;
    private javax.swing.JButton BTN_Tuesday;
    private javax.swing.JButton BTN_Wednesday;
    private javax.swing.JList<String> JL_Friday;
    private javax.swing.JList<String> JL_Monday;
    private javax.swing.JList<String> JL_Saturday;
    private javax.swing.JList<String> JL_Sunday;
    private javax.swing.JList<String> JL_Thursday;
    private javax.swing.JList<String> JL_Tuesday;
    private javax.swing.JList<String> JL_Wednesday;
    private javax.swing.JScrollPane SP_TA;
    private javax.swing.JTextArea TA_Notes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables
}
