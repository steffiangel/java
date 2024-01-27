package com.mycompany.mavenproject5.main;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Steff
 */
public class order extends javax.swing.JFrame {

    /**
     * Creates new form order
     */
    public order() {
        initComponents();
        connect();
        Load();
    }
    Connection con;
    PreparedStatement pat;
    DefaultTableModel def;
     
    public void connect()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/Student","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(order.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Load()
    {
        try {
            pat=con.prepareStatement("select *from `order`");
            ResultSet rs=pat.executeQuery();
            ResultSetMetaData rss=rs.getMetaData();
            int c;
            c=rss.getColumnCount();
            def=(DefaultTableModel)jTable2.getModel();
            def.setRowCount(0);
            while(rs.next())
            {
                Vector v=new Vector();
                for(int i=0;i<c;i++)
                {
                    v.add(rs.getString("id"));
                     v.add(rs.getString("name"));
                      v.add(rs.getString("contact"));
                       v.add(rs.getString("address"));
                        v.add(rs.getString("greenTea"));
                         v.add(rs.getString("cardamomTea"));
                          v.add(rs.getString("purpleTea"));
                           v.add(rs.getString("Total"));
                }
                def.addRow(v);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtGreen = new javax.swing.JTextField();
        txtCard = new javax.swing.JTextField();
        txtPur = new javax.swing.JTextField();
        home = new javax.swing.JButton();
        order134 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        o_search = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Name");

        jLabel2.setText("Contact");

        jLabel3.setText("Address");

        jLabel4.setText("Green Tea");

        jLabel5.setText("Cardomen Tea");

        jLabel6.setText("Purple Tea");

        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });

        home.setBackground(new java.awt.Color(144, 118, 75));
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        order134.setBackground(new java.awt.Color(130, 105, 63));
        order134.setForeground(new java.awt.Color(255, 255, 255));
        order134.setText("ORDER NOW");
        order134.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order134MouseClicked(evt);
            }
        });
        order134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order134ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel7.setText("Note: for veiwing order enter contact info and click on search");

        o_search.setBackground(new java.awt.Color(135, 115, 70));
        o_search.setForeground(new java.awt.Color(255, 255, 255));
        o_search.setText("SEARCH");
        o_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                o_searchMouseClicked(evt);
            }
        });
        o_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o_searchActionPerformed(evt);
            }
        });

        jLabel9.setText("Delete");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setText("update");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCard)
                            .addComponent(txtGreen)
                            .addComponent(txtContact)
                            .addComponent(txtAddress)
                            .addComponent(txtPur, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(order134)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(home))
                            .addComponent(o_search, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(4, 4, 4)
                .addComponent(order134)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(o_search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(home)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(137, 113, 72));

        jLabel8.setFont(new java.awt.Font("Sylfaen", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ORDER NOW !!!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", " name", "contact", "address", "gt", "ct", "pt", "total"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {                                     
order obj1=new order();
mainscreen b1=new mainscreen();
obj1.setVisible(false);
b1.setVisible(true);
dispose();
    }                                    

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void order134ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }                                        

    private void o_searchActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void order134MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        try {
            String name,contact,address;
            int total,G_T,C_T,P_T;
            name=txtName.getText();
            contact=txtContact.getText();
            address=txtAddress.getText();
            
            String greenText = txtGreen.getText();
            G_T = greenText.isEmpty() ? 0 : Integer.parseInt(greenText);


            String cardText = txtCard.getText();
            C_T = cardText.isEmpty() ? 0 : Integer.parseInt(cardText);

            String purText = txtPur.getText();
            P_T = purText.isEmpty() ? 0 : Integer.parseInt(purText);
            
            total = (G_T * 100) + (C_T * 150) + (P_T * 200);
            pat=con.prepareStatement("insert into `order`(name,contact,address,greenTea,cardamomTea,purpleTea,Total)values(?,?,?,?,?,?,?)");
            pat.setString(1,name);
            pat.setString(2,contact);
            pat.setString(3,address);
            pat.setInt(4,G_T);
            pat.setInt(5,C_T);
            pat.setInt(6,P_T);
            pat.setInt(7,total);
            pat.executeUpdate();
            JOptionPane.showMessageDialog(this,"ORDER Added\nTOTAL : "+total);
            Load();
            txtName.setText("");
            txtContact.setText("");
            txtAddress.setText("");
            txtGreen.setText("");
            txtCard.setText("");
            txtPur.setText("");
            
            txtName.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                     

    private void o_searchMouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        def=(DefaultTableModel)jTable2.getModel();
            
            int rows = jTable2.getRowCount();
            boolean record=false;
            String contact1 =txtContact.getText();
            for(int i=0;i<rows;i++){
                String n = (String) jTable2.getValueAt(i, 2);
            if(contact1.equals(n)){
            txtName.setText(def.getValueAt(i, 1).toString());
            txtContact.setText(def.getValueAt(i, 2).toString());
            txtAddress.setText(def.getValueAt(i, 3).toString());
            //int g=Integer.parseInt(def.getValueAt(i, 4).toString());
            txtGreen.setText(def.getValueAt(i,4).toString());
            txtCard.setText(def.getValueAt(i, 5).toString());
            txtPur.setText(def.getValueAt(i, 6).toString());
            int ID=Integer.parseInt(def.getValueAt(i, 0).toString());
            JOptionPane.showMessageDialog(this,"Record found at "+ID+". \n Name: "+def.getValueAt(i, 1)+"\n Contact: "+def.getValueAt(i, 2)+"\n Address: "+def.getValueAt(i, 3)+"\n Total:"+def.getValueAt(i, 7));
            record=true;
            break;
            }
            }
            if(!record){
                JOptionPane.showMessageDialog(this,"No Records Found");
            }
    }                                     

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {                                     
       def=(DefaultTableModel)jTable2.getModel();
        String contact2 =txtContact.getText();
        boolean record=false;
        int id=0;
        int rows = jTable2.getRowCount();
            for(int i=0;i<rows;i++){
                String n = (String) jTable2.getValueAt(i, 2);
            if(contact2.equals(n)){
             id=Integer.parseInt(def.getValueAt(i, 0).toString());
            //JOptionPane.showMessageDialog(this,"Record found at "+ID+" Deleted.");
            record=true;
            break;
            }
            }
            if(!record){
                JOptionPane.showMessageDialog(this,"No Records Found");
            }
        try {
            pat=con.prepareStatement("delete from `order` where id=?");
            pat.setInt(1, id);
            pat.executeUpdate();
            JOptionPane.showMessageDialog(this,"Records Deleted");
            Load();
            txtName.setText("");
            txtContact.setText("");
            txtAddress.setText("");
            txtGreen.setText("");
            txtCard.setText("");
            txtPur.setText("");
            txtName.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(order.class.getName()).log(Level.SEVERE, null, ex);
        
    }   
    }                                    

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {                                      
         def=(DefaultTableModel)jTable2.getModel();
        String contact3 =txtContact.getText();
        boolean record=false;
        int id1=0;
        int rows = jTable2.getRowCount();
            for(int i=0;i<rows;i++){
                String n = (String) jTable2.getValueAt(i, 2);
            if(contact3.equals(n)){
             id1=Integer.parseInt(def.getValueAt(i, 0).toString());
            //JOptionPane.showMessageDialog(this,"Record found at "+ID+" Deleted.");
            record=true;
            break;
            }
            }
            if(!record){
                JOptionPane.showMessageDialog(this,"No Records Found");
            }
            try {
            
            int total1,G_T1,C_T1,P_T1;
            
            
            String greenText1 = txtGreen.getText();
            G_T1 = greenText1.isEmpty() ? 0 : Integer.parseInt(greenText1);


            String cardText1 = txtCard.getText();
            C_T1 = cardText1.isEmpty() ? 0 : Integer.parseInt(cardText1);

            String purText1 = txtPur.getText();
            P_T1 = purText1.isEmpty() ? 0 : Integer.parseInt(purText1);
            
            total1 = (G_T1 * 100) + (C_T1 * 150) + (P_T1 * 200);
            pat=con.prepareStatement("update `order` set greenTea=?,cardamomTea=?,purpleTea=?,Total=? where id=?");
            pat.setInt(1, G_T1);
            pat.setInt(2, C_T1);
            pat.setInt(3, P_T1);
            pat.setInt(4, total1);
            pat.setInt(5, id1);
            pat.executeUpdate();
            JOptionPane.showMessageDialog(this,"Records Updated");
            Load();
            txtName.setText("");
            txtContact.setText("");
            txtAddress.setText("");
            txtGreen.setText("");
            txtCard.setText("");
            txtPur.setText("");
            txtName.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(order.class.getName()).log(Level.SEVERE, null, ex);
        
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
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton o_search;
    private javax.swing.JButton order134;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCard;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtGreen;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPur;
    // End of variables declaration                   
}