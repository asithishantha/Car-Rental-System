/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import databaseconnect.dbconnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author USER
 */
public class customerreg extends javax.swing.JFrame {

    
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    public customerreg() {
        initComponents();
        
        //make db connection
        con=dbconnect.connect();
        tableload();
        
        
        fnamebox.setBackground(new Color(0,0,0,64));
         lnamebox.setBackground(new Color(0,0,0,64)); 
         addressbox.setBackground(new Color(0,0,0,64));
         contactbox.setBackground(new Color(0,0,0,64));
         searchbox.setBackground(new Color(0,0,0,64));
         
         
         table.setBackground(new Color(0,0,0,0));
        ((DefaultTableCellRenderer)table.getDefaultRenderer(Object.class)).setBackground(new Color(0,0,0,0));
         
        table.setGridColor(Color.WHITE);
         
         table.setForeground(Color.WHITE);
         
         scroll.setBackground(new Color(0,0,0,0));
         scroll.setOpaque(false);
         table.setOpaque(false);
        ((DefaultTableCellRenderer)table.getDefaultRenderer(Object.class)).setOpaque(false);
        scroll.getViewport().setOpaque(false);
                
         
         
         
         
    }
    
    public void tableload()
    {
        try {
            String sql= "select customerid,firstname,lastname,address,contactnumber from customer";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();  //assign rs variable
            
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
        }
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        customerbox = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        contactbox = new javax.swing.JTextField();
        addressbox = new javax.swing.JTextField();
        lnamebox = new javax.swing.JTextField();
        fnamebox = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        searchbutton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        searchbox = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 986, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 608, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1104, 710));
        setSize(new java.awt.Dimension(114, 710));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CustomerID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 130, 150, 20);

        customerbox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        customerbox.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(customerbox);
        customerbox.setBounds(560, 130, 60, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FirstName");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(240, 180, 90, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LastName");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(240, 230, 90, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(240, 280, 70, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ContactNumber");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(240, 340, 134, 25);

        contactbox.setBackground(new java.awt.Color(0, 0, 0));
        contactbox.setForeground(new java.awt.Color(255, 255, 255));
        contactbox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contactbox.setBorder(null);
        contactbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactboxActionPerformed(evt);
            }
        });
        jPanel1.add(contactbox);
        contactbox.setBounds(460, 340, 300, 30);

        addressbox.setBackground(new java.awt.Color(0, 0, 0));
        addressbox.setForeground(new java.awt.Color(255, 255, 255));
        addressbox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addressbox.setBorder(null);
        jPanel1.add(addressbox);
        addressbox.setBounds(460, 280, 300, 30);

        lnamebox.setBackground(new java.awt.Color(0, 0, 0));
        lnamebox.setForeground(new java.awt.Color(255, 255, 255));
        lnamebox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lnamebox.setBorder(null);
        lnamebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameboxActionPerformed(evt);
            }
        });
        jPanel1.add(lnamebox);
        lnamebox.setBounds(460, 230, 300, 30);

        fnamebox.setBackground(new java.awt.Color(0, 0, 0));
        fnamebox.setForeground(new java.awt.Color(255, 255, 255));
        fnamebox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fnamebox.setBorder(null);
        fnamebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameboxActionPerformed(evt);
            }
        });
        jPanel1.add(fnamebox);
        fnamebox.setBounds(460, 170, 300, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(460, 420, 250, 2);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(460, 200, 300, 10);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(460, 260, 300, 20);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(460, 310, 300, 30);
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(460, 370, 300, 20);

        searchbutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\icons\\icons8_Search_35px.png")); // NOI18N
        searchbutton.setBorder(null);
        searchbutton.setContentAreaFilled(false);
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(searchbutton);
        searchbutton.setBounds(720, 390, 40, 30);

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\icons\\icons8_Trash_64px.png")); // NOI18N
        jButton3.setText("jButton3");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(890, 250, 120, 73);

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\icons\\icons8_Edit_Property_52px.png")); // NOI18N
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(880, 360, 135, 53);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\icons\\icons8_Add_User_Male_52px_1.png")); // NOI18N
        jButton2.setText("jButton2");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(920, 170, 70, 53);

        searchbox.setBackground(new java.awt.Color(0, 0, 0));
        searchbox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        searchbox.setForeground(new java.awt.Color(255, 255, 255));
        searchbox.setBorder(null);
        searchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchboxActionPerformed(evt);
            }
        });
        jPanel1.add(searchbox);
        searchbox.setBounds(460, 392, 250, 30);

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\icons\\icons8_Home_60px.png")); // NOI18N
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(30, 30, 61, 50);

        table.setBackground(new java.awt.Color(0, 0, 0));
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title5"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        scroll.setViewportView(table);

        jPanel1.add(scroll);
        scroll.setBounds(200, 460, 680, 220);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\gui\\small1.jpg")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(3508, 2480));
        jLabel1.setMinimumSize(new java.awt.Dimension(3553, 2480));
        jLabel1.setPreferredSize(new java.awt.Dimension(3553, 2480));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -50, 1240, 810);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1080, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lnameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameboxActionPerformed

    private void fnameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameboxActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        int a =JOptionPane.showConfirmDialog(null,"Do you want to update!");
        
       if(a==0)
       {
        String id=customerbox.getText();
        String fname= fnamebox.getText();
        String lname= lnamebox.getText();
        String address= addressbox.getText();
        String contact= contactbox.getText();
        
        String sql= "UPDATE customer SET firstname= '"+fname+"', lastname= '"+lname+"', address= '"+address+"', contactnumber= '"+contact+"' where customerid= '"+id+"'";
           try {
                pst=con.prepareStatement(sql);
                pst.executeUpdate(sql);
                tableload();
             
       
                 }
           catch (Exception e) {
           } 
           
           
       }
       
           
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void searchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchboxActionPerformed

    private void contactboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactboxActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
-      maininterface main=new maininterface();
      main.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String fname= fnamebox.getText();
        String lname= lnamebox.getText();
        String address= addressbox.getText();
        String contact= contactbox.getText();
        
        try {
            
        String q= "insert into customer (firstname,lastname,address,contactnumber) value('"+fname+"','"+lname+"','"+address+"','"+contact+"')";
        pst=con.prepareStatement(q);
        pst.execute();
         tableload();
        
        } catch (Exception e) {
        }
      
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        int r=table.getSelectedRow();
        String id= table.getValueAt(r, 0).toString();
        String fname= table.getValueAt(r, 1).toString();
        String lname= table.getValueAt(r, 2).toString();
        String address= table.getValueAt(r, 3).toString();
         String contact= table.getValueAt(r, 4).toString();
         
         
         customerbox.setText(id);
         fnamebox.setText(fname);
         lnamebox.setText(lname);
         addressbox.setText(address);
         contactbox.setText(contact);
              
         
                         
                         
    }//GEN-LAST:event_tableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       int x=JOptionPane.showConfirmDialog(null,"Do you want to delete?");
       
       
       if(x==0)
       {
       
       String id=customerbox.getText();
       String sql="delete from customer where customerid='"+id+"'";
           try {
               pst=con.prepareStatement(sql);
               pst.execute();
               tableload();
               
           } catch (Exception e) {
           }
       
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
         String name=searchbox.getText();
         String sql="select customerid,firstname,lastname,address,contactnumber from customer where firstname LIKE '%"+name+"%'";
        try {
              pst=con.prepareStatement(sql);
         rs=pst.executeQuery();
          table.setModel(DbUtils.resultSetToTableModel(rs));
         
        } catch (Exception e) {
        }
    }//GEN-LAST:event_searchbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(customerreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customerreg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressbox;
    private javax.swing.JTextField contactbox;
    private javax.swing.JLabel customerbox;
    private javax.swing.JTextField fnamebox;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField lnamebox;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextField searchbox;
    private javax.swing.JButton searchbutton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}