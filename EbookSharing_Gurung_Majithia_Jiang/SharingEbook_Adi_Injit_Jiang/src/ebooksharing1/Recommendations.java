/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebooksharing1;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author aditimajithia
 */
public class Recommendations extends javax.swing.JFrame {

    private static String username1 = "";
    private String bName = "";

    public Recommendations(String username) {
        this.username1 = username;
        initComponents();
        perform();
        //this.username = username;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 153, 0));

        jLabel1.setText("jLabel16");

        jLabel2.setText("             ");

        jLabel3.setText("jLabel18");

        jLabel4.setText("jLabel16");

        jLabel5.setText("             ");

        jLabel6.setText("jLabel18");

        jLabel7.setText("jLabel16");

        jLabel8.setText("             ");

        jLabel9.setText("jLabel18");

        jLabel10.setText("jLabel16");

        jLabel11.setText("             ");

        jLabel12.setText("jLabel18");

        jLabel13.setText("jLabel16");

        jLabel14.setText("             ");

        jLabel15.setText("jLabel18");

        jButton1.setText("Close Page");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(98, 98, 98)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel7))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(73, 73, 73)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)))))
                    .addComponent(jButton1))
                .addContainerGap(491, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel7)
                        .addComponent(jLabel10)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void perform() {
        try {
            DbConnector dbc = new DbConnector();
            Connection conn = dbc.Connects();
            String sql = "SELECT LASTBOOK_READ FROM UserInfo  WHERE username = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username1);
            ResultSet rs = pst.executeQuery();
            int lbr = 0;
            while (rs.next()) {
                lbr = rs.getInt("LASTBOOK_READ");
            }
            //System.out.println("lbr value "+lbr);
            String sql2 = "SELECT CATEGORY FROM BOOKINFO WHERE BOOKID = ?";
            PreparedStatement pst2 = conn.prepareStatement(sql2);
            pst2.setInt(1, lbr);
            ResultSet rs2 = pst2.executeQuery();

            String cat = "";
            while (rs2.next()) {
                cat = rs2.getString("CATEGORY");
            }
            //System.out.println("Working \n");
            if (lbr == -1) {
//                String sql1 = "SELECT bookid FROM (\n"
//                        + "   SELECT\n"
//                        + "     ROW_NUMBER() OVER () AS R,\n"
//                        + "bookinfo.bookid from Bookinfo order by reading_total_duration desc\n"
//                        + ") AS TR\n"
//                        + "   WHERE R <= " + 5;
                String sql1 = "SELECT bookinfo.bookid from Bookinfo order by reading_total_duration desc";
                PreparedStatement pst1 = conn.prepareStatement(sql1);
                ResultSet rs1 = pst1.executeQuery();
                int count = 0;
                int[] allr = new int[5];

                while (rs1.next() && count < 5) {

                    if (count == 0) {
                        int bid = rs1.getInt("bookid");
                        jLabel2.setIcon(getImage(bid));
                        jLabel1.setText(getBookName(bid));
                        jLabel3.setText("Author: " + getBookAuthor(bid));
                        //count++;
                       // System.out.println(bid);
                    }
                    if (count == 1) {
                        int bid = rs1.getInt("bookid");
                        jLabel5.setIcon(getImage(bid));
                        jLabel4.setText(getBookName(bid));
                        jLabel6.setText("Author: " + getBookAuthor(bid));
                        //count++;
                       // System.out.println(bid);
                    }
                    if (count == 2) {
                        int bid = rs1.getInt("bookid");
                        jLabel8.setIcon(getImage(bid));
                        jLabel7.setText(getBookName(bid));
                        jLabel9.setText("Author: " + getBookAuthor(bid));
                        //System.out.println(bid);
                        //count++;
                    }
                    if (count == 3) {
                        int bid = rs1.getInt("bookid");
                        jLabel11.setIcon(getImage(bid));
                        jLabel10.setText(getBookName(bid));
                        jLabel12.setText("Author: " + getBookAuthor(bid));
                        //count++;
                       // System.out.println(bid);
                    }
                    if (count == 4) {
                        int bid = rs1.getInt("bookid");
                        jLabel14.setIcon(getImage(bid));
                        jLabel13.setText(getBookName(bid));
                        jLabel15.setText("Author: " + getBookAuthor(bid));
                        //count++;
                       // System.out.println(bid);
                    }
                    count++;
                }

            } else {
               // System.out.println("Working \n");
               // System.out.println(cat);

                String sql1 = "SELECT bookinfo.bookid from Bookinfo where category = ? order by reading_total_duration desc";
                PreparedStatement pst1 = conn.prepareStatement(sql1);
                pst1.setString(1, cat);
                ResultSet rs1 = pst1.executeQuery();
                int count = 0;
                while (rs1.next() && count < 5) {
                    if (count == 0) {
                        int bid = rs1.getInt("bookid");
                        jLabel2.setIcon(getImage(bid));
                        jLabel1.setText(getBookName(bid));
                        jLabel3.setText("Author: " + getBookAuthor(bid));
                        //count++;
                     //   System.out.println(bid);
                    }
                    if (count == 1) {
                        int bid = rs1.getInt("bookid");
                        jLabel5.setIcon(getImage(bid));
                        jLabel4.setText(getBookName(bid));
                        jLabel6.setText("Author: " + getBookAuthor(bid));
                        //count++;
                      //  System.out.println(bid);
                    }
                    if (count == 2) {
                        int bid = rs1.getInt("bookid");
                        jLabel8.setIcon(getImage(bid));
                        jLabel7.setText(getBookName(bid));
                        jLabel9.setText("Author: " + getBookAuthor(bid));
                       // System.out.println(bid);
                        //count++;
                    }
                    if (count == 3) {
                        int bid = rs1.getInt("bookid");
                        jLabel11.setIcon(getImage(bid));
                        jLabel10.setText(getBookName(bid));
                        jLabel12.setText("Author: " + getBookAuthor(bid));
                        //count++;
                      //  System.out.println(bid);
                    }
                    if (count == 4) {
                        int bid = rs1.getInt("bookid");
                        jLabel14.setIcon(getImage(bid));
                        jLabel13.setText(getBookName(bid));
                        jLabel15.setText("Author: " + getBookAuthor(bid));
                        //count++;
                       // System.out.println(bid);
                    }
                    count++;
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(Recommendations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getBookName(int bookid) {
        String bname = "";
        try {
            DbConnector dbc = new DbConnector();
            Connection conn = dbc.Connects();
            String sql = "SELECT bookname from bookinfo where bookid = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, bookid);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                bname = rs.getString("bookname");

            }

        } catch (SQLException ex) {
            Logger.getLogger(Recommendations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bname;
    }

    public String getBookAuthor(int bookid) {
        String bauth = "";
        try {
            DbConnector dbc = new DbConnector();
            Connection conn = dbc.Connects();
            String sql = "SELECT author from bookinfo where bookid = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, bookid);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                bauth = rs.getString("author");

            }

        } catch (SQLException ex) {
            Logger.getLogger(Recommendations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bauth;
    }

    public ImageIcon getImage(int bookid) {
        ResultSet rs = null;
        PreparedStatement pst = null;
        Blob image = null;

        byte[] imgData = null;
        DbConnector dbc = new DbConnector();
        Connection conn = dbc.Connects();
        String sql = "SELECT bookname, cover FROM bookinfo  where bookid = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, bookid);
            rs = pst.executeQuery();
            while (rs.next()) {
                image = rs.getBlob("Cover");
                imgData = image.getBytes(1, (int) image.length());
                bName = rs.getString("BookName");
            }

        } catch (Exception e) {
            //Logger.getLogger(ReviewRateFrame.class.getName()).log(Level.SEVERE, null, ex);
            e.printStackTrace();
        }
        return new ImageIcon(new ImageIcon(imgData).getImage().getScaledInstance(100, 125, java.awt.Image.SCALE_SMOOTH));
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
            java.util.logging.Logger.getLogger(Recommendations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recommendations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recommendations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recommendations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Recommendations ro = new Recommendations(username1);
                ro.setVisible(true);
                ro.perform();

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
