package hospital;
import javax.swing.table.*;
import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class DeletePatientsDetails extends javax.swing.JInternalFrame {
    int npcode;

    public DeletePatientsDetails() {
        initComponents();
    npcode();
    }
private void npcode(){
try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "dps123");
    String SQL = "Select * from patients";
    ResultSet rs = con.createStatement().executeQuery(SQL);
    while (rs.next())
    {
        npcode=Integer.parseInt(rs.getString("pcode"));
    }
    npcode=npcode+1;
    jTextField1.setText(""+npcode);
    }
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();

        setTitle("delete Patients Details");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Delete Patients Details");

        jButton1.setText("Add Patients to List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel2.setText("PCode");

        jTextField1.setEditable(false);

        jLabel3.setText("Name");

        jLabel4.setText("Age");

        jLabel5.setText("Gender");

        jLabel6.setText("Address");

        jLabel7.setText("Contact");

        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel9.setText("Test");

        jRadioButton1.setText("Male");

        jRadioButton2.setText("Female");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MRI", "X-RAY", "Citi Scan", "Blood Test", "noner" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gurgaon", "South delhi", "rewadi", "hauzkauj", "karol Bagh", "Sn", "Others" }));

        jLabel10.setText("City");

        jRadioButton3.setText("Indoor Patient");

        jRadioButton4.setText("Outdoor Patient");

        jLabel11.setText("Doctor");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dr. Risha", "Dr.Virender", "Dr. Ankita", "", "Dr. Kanika", "Dr. niyati" }));

        jButton2.setText("Delete Patients");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jRadioButton3)))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jRadioButton1)
                            .addGap(18, 18, 18)
                            .addComponent(jRadioButton2))
                        .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(jButton5)
                        .addComponent(jButton2)))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(30, 30, 30)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultListModel dModel =(DefaultListModel) jList1.getModel();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "dps123");
            Statement stmt = null;
            ResultSet rs = null;

            String SQL="SELECT * FROM patients";
            stmt = con.createStatement();
            rs =stmt.executeQuery(SQL);
            while(rs.next()){
                String name    = jTextField2.getText();
                String age     = jTextField3.getText();
                String ngender = null,nadmit = null,test = null,city = null,doctor= null;
          String nname = jTextField2.getText();
          String nage =  jTextField3.getText();
          if(jRadioButton1.isSelected()==true)
          {
                ngender = "Male";
                jRadioButton1.setSelected(false);
          }
          if(jRadioButton2.isSelected()==true)
          {
                ngender = "Female";
                jRadioButton2.setSelected(false);
          }
          String naddress = jTextField5.getText();
          String ncontact=  jTextField6.getText();
          if(jRadioButton3.isSelected()==true)
          {
                nadmit="IP";
                jRadioButton3.setSelected(false);
          }
          if(jRadioButton4.isSelected()==true)
          {
                nadmit="OPD";
                jRadioButton4.setSelected(false);
          }
              if(jComboBox1.getSelectedItem().equals("Mri")){
              test="Mri";
               }
              if(jComboBox1.getSelectedItem().equals("x-ray")){
              test="x-ray";
              }
              if(jComboBox1.getSelectedItem().equals("citiscan")){
              test="citiscan";
              }
              if(jComboBox1.getSelectedItem().equals("blood test")){
              test="blood test";
              }
              if(jComboBox1.getSelectedItem().equals("none")){
              test="none";
              }
             if(jComboBox2.getSelectedItem().equals("gurgaon")){
              city="gurgaon";
               }
              if(jComboBox2.getSelectedItem().equals("south delhi")){
              city="south delhi";
              }
              if(jComboBox2.getSelectedItem().equals("rewadi")){
              city="rewadi";
              }
              if(jComboBox2.getSelectedItem().equals("karol bagh")){
              city="karol bagh";
              }
              if(jComboBox2.getSelectedItem().equals("sn")){
              city="sn";
              }
              if(jComboBox2.getSelectedItem().equals("other")){
              city="other";
              }
          if(jComboBox3.getSelectedItem().equals("dr. risha")){
              doctor="Dr, risha";
               }
              if(jComboBox3.getSelectedItem().equals("dr. virender")){
              doctor="dr. virender";
              }
              if(jComboBox3.getSelectedItem().equals("dr. ankita")){
              doctor="dr. ankita";
              }
              if(jComboBox3.getSelectedItem().equals("dr. kanika")){
              doctor="dr. kanika";
              }
              if(jComboBox3.getSelectedItem().equals("dr niyati")){
              doctor="dr niyati";
              }
              if(jComboBox2.getSelectedItem().equals("other")){
              doctor="other";
              }
                String address = jTextField5.getText();
                String contact = jTextField6.getText();
                dModel.addElement(name+ "-" +age+ "-" +ngender+ "-" +address+ "-"+city+"-" +contact+ "-" +nadmit+"-"+test );
            }
            jList1.setModel(dModel);
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
}//GEN-LAST:event_jButton1ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "dps123");
            Statement stmt = null;
            ResultSet rs = null;

            String npcode= (String)jList1.getSelectedValue();
            npcode =npcode.substring(0,3).trim();

            String SQL = "SELECT * FROM patients where pcode= "+(npcode);
            stmt =con.createStatement();
            rs= stmt.executeQuery(SQL);

            stmt= con.createStatement();

            rs= stmt.executeQuery(SQL);
            jTextField1.enableInputMethods(false);
            while (rs.next()) {
                String name   = rs.getString("name");
                String age    = rs.getString("age");
                String ngender = null,nadmit = null,test = null,city = null,doctor;
              if(jRadioButton1.isSelected()==true)
          {
                ngender = "Male";
                jRadioButton1.setSelected(false);
          }
          if(jRadioButton2.isSelected()==true)
          {
                ngender = "Female";
                jRadioButton2.setSelected(false);
          }
          String naddress = jTextField5.getText();
          String ncontact=  jTextField6.getText();
          if(jRadioButton3.isSelected()==true)
          {
                nadmit="IP";
                jRadioButton3.setSelected(false);
          }
          if(jRadioButton4.isSelected()==true)
          {
                nadmit="OPD";
                jRadioButton4.setSelected(false);
          }
              if(jComboBox1.getSelectedItem().equals("Mri")){
              test="Mri";
               }
              if(jComboBox1.getSelectedItem().equals("x-ray")){
              test="x-ray";
              }
              if(jComboBox1.getSelectedItem().equals("citiscan")){
              test="citiscan";
              }
              if(jComboBox1.getSelectedItem().equals("blood test")){
              test="blood test";
              }
              if(jComboBox1.getSelectedItem().equals("none")){
              test="none";
              }
             if(jComboBox2.getSelectedItem().equals("gurgaon")){
              city="gurgaon";
               }
              if(jComboBox2.getSelectedItem().equals("south delhi")){
              city="south delhi";
              }
              if(jComboBox2.getSelectedItem().equals("rewadi")){
              city="rewadi";
              }
              if(jComboBox2.getSelectedItem().equals("karol bagh")){
              city="karol bagh";
              }
              if(jComboBox2.getSelectedItem().equals("sn")){
              city="sn";
              }
              if(jComboBox2.getSelectedItem().equals("other")){
              city="other";
              }
          if(jComboBox3.getSelectedItem().equals("dr. risha")){
              doctor="Dr, risha";
               }
              if(jComboBox3.getSelectedItem().equals("dr. virender")){
              doctor="dr. virender";
              }
              if(jComboBox3.getSelectedItem().equals("dr. ankita")){
              doctor="dr. ankita";
              }
              if(jComboBox3.getSelectedItem().equals("dr. kanika")){
              doctor="dr. kanika";
              }
              if(jComboBox3.getSelectedItem().equals("dr niyati")){
              doctor="dr niyati";
              }
              if(jComboBox3.getSelectedItem().equals("other")){
              doctor="other";
              }
                String address= rs.getString("address");
                String contact= rs.getString("contact");
                jTextField2.setText(name);
                jTextField3.setText(age);
                jTextField5.setText(address);
                jTextField6.setText(contact);
                 }

        } catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
            e.printStackTrace();
        }
}//GEN-LAST:event_jList1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "dps123");
            Statement stmt = null;
            ResultSet rs = null;

            stmt =con.createStatement();
            String name   = jTextField2.getText();
            String age =    jTextField3.getText();
            String ngender = null,nadmit = null,test = null,city = null,doctor;
           if(jRadioButton1.isSelected()==true)
          {
                ngender = "Male";
                jRadioButton2.setSelected(false);
          }
          if(jRadioButton2.isSelected()==true)
          {
                ngender = "Female";
                jRadioButton1.setSelected(false);
          }
          String naddress = jTextField5.getText();
          String ncontact=  jTextField6.getText();
          if(jRadioButton3.isSelected()==true)
          {
                nadmit="IP";
                jRadioButton4.setSelected(false);
          }
          if(jRadioButton4.isSelected()==true)
          {
                nadmit="OPD";
                jRadioButton3.setSelected(false);
          }
              if(jComboBox1.getSelectedItem().equals("Mri")){
              test="Mri";
               }
              if(jComboBox1.getSelectedItem().equals("x-ray")){
              test="x-ray";
              }
              if(jComboBox1.getSelectedItem().equals("citiscan")){
              test="citiscan";
              }
              if(jComboBox1.getSelectedItem().equals("blood test")){
              test="blood test";
              }
              if(jComboBox1.getSelectedItem().equals("none")){
              test="n";
              }
             if(jComboBox2.getSelectedItem().equals("gurgaon")){
              city="gurgaon";
               }
              if(jComboBox2.getSelectedItem().equals("south delhi")){
              city="south delhi";
              }
              if(jComboBox2.getSelectedItem().equals("rewadi")){
              city="rewadi";
              }
              if(jComboBox2.getSelectedItem().equals("karol bagh")){
              city="karol bagh";
              }
              if(jComboBox2.getSelectedItem().equals("sn")){
              city="sn";
              }
              if(jComboBox2.getSelectedItem().equals("other")){
              city="other";
              }
          if(jComboBox3.getSelectedItem().equals("dr. risha")){
              doctor="Dr, risha";
               }
              if(jComboBox3.getSelectedItem().equals("dr. virender")){
              doctor="dr. virender";
              }
              if(jComboBox3.getSelectedItem().equals("dr. ankita")){
              doctor="dr. ankita";
              }
              if(jComboBox3.getSelectedItem().equals("dr. kanika")){
              doctor="dr. kanika";
              }
              if(jComboBox2.getSelectedItem().equals("dr niyati")){
              doctor="dr niyati";
              }
              if(jComboBox2.getSelectedItem().equals("other")){
              doctor="other";
              }
            String address= jTextField5.getText();
            String contact= jTextField6.getText();
            String strSQL ="delete from patients where pcode= "+(npcode)+"";

            int rowsEffected= stmt.executeUpdate(strSQL);
            if(rowsEffected ==0)
                JOptionPane.showMessageDialog(this ,"Record does not exists");
            else
                JOptionPane.showMessageDialog(this ,"Record deleted");
            System.out.print(rowsEffected+"rows effected");

        } catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
            e.printStackTrace();
        }
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
}//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}
