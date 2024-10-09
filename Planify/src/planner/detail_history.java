/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package planner;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class detail_history extends javax.swing.JFrame {

    /**
     * Creates new form detail_history
     * @param user
     * @param namaWeek
     */
    
    String username;
    String namaweek;
    public detail_history(String user, String namaWeek) throws Exception {
        initComponents();
        username = user;
        namaweek = namaWeek;
        JL_Monday.setModel(dbconnection.getDailyHistory(user, namaWeek, "Monday"));
        JL_Tuesday.setModel(dbconnection.getDailyHistory(user, namaWeek, "Tuesday"));
        JL_Wednesday.setModel(dbconnection.getDailyHistory(user, namaWeek, "Wednesday"));
        JL_Thursday.setModel(dbconnection.getDailyHistory(user, namaWeek, "Thursday"));
        JL_Friday.setModel(dbconnection.getDailyHistory(user, namaWeek, "Friday"));
        JL_Saturday.setModel(dbconnection.getDailyHistory(user, namaWeek, "Saturday"));
        JL_Sunday.setModel(dbconnection.getDailyHistory(user, namaWeek, "Sunday"));
        JL_namaWeek.setText(namaWeek);
        TA_Notes.setText(dbconnection.getNoteHistory(user, namaWeek));
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JB_Back = new javax.swing.JButton();
        BT_DeleteHistory = new javax.swing.JButton();
        BT_ChangeName = new javax.swing.JButton();
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
        SP_TA = new javax.swing.JScrollPane();
        TA_Notes = new javax.swing.JTextArea();
        JL_namaWeek = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JB_Back.setBackground(new java.awt.Color(255, 255, 255));
        JB_Back.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        JB_Back.setText("Back");
        JB_Back.setBorder(null);
        JB_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_BackActionPerformed(evt);
            }
        });
        getContentPane().add(JB_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 80, 30));

        BT_DeleteHistory.setBackground(new java.awt.Color(255, 255, 255));
        BT_DeleteHistory.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        BT_DeleteHistory.setText("Delete History");
        BT_DeleteHistory.setBorder(null);
        BT_DeleteHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_DeleteHistoryActionPerformed(evt);
            }
        });
        getContentPane().add(BT_DeleteHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 75, 160, 30));

        BT_ChangeName.setBackground(new java.awt.Color(255, 255, 255));
        BT_ChangeName.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        BT_ChangeName.setText("Change Name");
        BT_ChangeName.setBorder(null);
        BT_ChangeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ChangeNameActionPerformed(evt);
            }
        });
        getContentPane().add(BT_ChangeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 75, 150, 30));

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
        getContentPane().add(BTN_Tuesday, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

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
        getContentPane().add(BTN_Sunday, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 150, -1, -1));

        JL_Monday.setBackground(new java.awt.Color(254, 250, 229));
        JL_Monday.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 16)); // NOI18N
        jScrollPane1.setViewportView(JL_Monday);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 130, 510));

        JL_Tuesday.setBackground(new java.awt.Color(254, 250, 229));
        JL_Tuesday.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 16)); // NOI18N
        jScrollPane9.setViewportView(JL_Tuesday);

        getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 140, 510));

        JL_Wednesday.setBackground(new java.awt.Color(254, 250, 229));
        JL_Wednesday.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 16)); // NOI18N
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

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 200, 140, 510));

        JL_Sunday.setBackground(new java.awt.Color(254, 250, 229));
        JL_Sunday.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 16)); // NOI18N
        jScrollPane7.setViewportView(JL_Sunday);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 200, 140, 510));

        TA_Notes.setEditable(false);
        TA_Notes.setBackground(new java.awt.Color(254, 250, 229));
        TA_Notes.setColumns(20);
        TA_Notes.setRows(5);
        SP_TA.setViewportView(TA_Notes);

        getContentPane().add(SP_TA, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 780, 1290, -1));

        JL_namaWeek.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JL_namaWeek.setText("Ini buat week");
        getContentPane().add(JL_namaWeek, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_components/weeklyhistory (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_BackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try {
            new Menu_history(dbconnection.getHistoryModel(username), username).setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Homee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JB_BackActionPerformed

    private void BT_DeleteHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_DeleteHistoryActionPerformed
        // TODO add your handling code here:
        try {
            int dialogResult = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
                dbconnection.InsertData("DELETE FROM detail_history WHERE id = (SELECT id FROM history WHERE namaWeek = '" + namaweek + "')");
                dbconnection.InsertData("DELETE FROM history WHERE username = '" + username + "' AND namaWeek = '" + namaweek + "'");
                JOptionPane.showMessageDialog(this, "Deleted !");
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Data tidak dihapus");
            }

        } catch (Exception ex) {
            Logger.getLogger(menu_delete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BT_DeleteHistoryActionPerformed

    private void BT_ChangeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ChangeNameActionPerformed
        // TODO add your handling code here:
        try {
            int g = -1;
            while(g<0){
                String input = JOptionPane.showInputDialog("Input your week name : ");
                String sql = "UPDATE history SET namaWeek = '" + input + "' WHERE namaWeek = '" + namaweek + "'";
                if(input.length()>0){
                    g++;
                    dbconnection.InsertData(sql);
                    System.out.println("Changed!");
                    JL_namaWeek.setText(input);
                    namaweek = input;
                }else{
                    System.out.println("Please enter your week name!");
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(menu_delete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BT_ChangeNameActionPerformed

    private void BTN_MondayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_MondayActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_BTN_MondayActionPerformed

    private void BTN_TuesdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_TuesdayActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_BTN_TuesdayActionPerformed

    private void BTN_WednesdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_WednesdayActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_BTN_WednesdayActionPerformed

    private void BTN_ThursdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ThursdayActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_BTN_ThursdayActionPerformed

    private void BTN_FridayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_FridayActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_BTN_FridayActionPerformed

    private void BTN_SaturdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SaturdayActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_BTN_SaturdayActionPerformed

    private void BTN_SundayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SundayActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_BTN_SundayActionPerformed

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
            java.util.logging.Logger.getLogger(detail_history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(detail_history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(detail_history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(detail_history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new detail_history("","").setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(detail_history.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Friday;
    private javax.swing.JButton BTN_Monday;
    private javax.swing.JButton BTN_Saturday;
    private javax.swing.JButton BTN_Sunday;
    private javax.swing.JButton BTN_Thursday;
    private javax.swing.JButton BTN_Tuesday;
    private javax.swing.JButton BTN_Wednesday;
    private javax.swing.JButton BT_ChangeName;
    private javax.swing.JButton BT_DeleteHistory;
    private javax.swing.JButton JB_Back;
    private javax.swing.JList<String> JL_Friday;
    private javax.swing.JList<String> JL_Monday;
    private javax.swing.JList<String> JL_Saturday;
    private javax.swing.JList<String> JL_Sunday;
    private javax.swing.JList<String> JL_Thursday;
    private javax.swing.JList<String> JL_Tuesday;
    private javax.swing.JList<String> JL_Wednesday;
    private javax.swing.JLabel JL_namaWeek;
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
