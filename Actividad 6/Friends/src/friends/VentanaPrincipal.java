/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package friends;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;
import java.util.Scanner;
import javax.swing.JOptionPane;


        
/**
 *
 * @author Leandro
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel2.setText("Number");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnRead.setText("Read");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumber)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addGap(18, 18, 18)
                        .addComponent(btnRead)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnRead)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(jButton5))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
       
        try { 
                String nameNumberString;
                String name;
                long number;
                int index;

                // Using file pointer creating the file.
                File file = new File("friendsContact.txt");

                if (!file.exists()==false) {
                    file.createNewFile();
                }
                RandomAccessFile raf  = new RandomAccessFile(file,"rw");
                boolean found = false ;

                // Traversing the file
                // getFilePointer() give the current offset
                // value from start of the file.
                while (raf.getFilePointer() < raf.length()) {

                    // reading line from the file.
                    nameNumberString = raf.readLine();

                    // splitting the string to get name and
                    // number
                    String[] lineSplit = nameNumberString.split("!");

                    // separating name and number.
                    name = lineSplit[0];
                    number = Long.parseLong(lineSplit[1]);

                    // Print the contact data
      
                    JOptionPane.showMessageDialog(null, "Friend Name: "+ name +" "+ "Contact Numeber: "+ number, "INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                         raf.close();
                }
        }
 
            catch(IOException ioe){
 
                JOptionPane.showConfirmDialog(null,"ioe","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
            }
            catch(NumberFormatException nef){
 
                JOptionPane.showConfirmDialog(null,"nef","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
            }
       

    }//GEN-LAST:event_btnReadActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        try {
                String newName= txtName.getText();
                long newNumber = Long.parseLong(txtNumber.getText());
                String nameNumberString;
                String name;
                int index;
                long number;
                
                File file = new File("friendsContact.txt");
                
                if (!file.exists()==false){
                    file.createNewFile();
                }
                RandomAccessFile raf = new RandomAccessFile(file,"rw");
                boolean found = false ;
                
                while (raf.getFilePointer()< raf.length()){
                    nameNumberString = raf.readLine();
                    String[] lineSplit = nameNumberString.split("!");
                    
                    name = lineSplit[0];
                    number = Long.parseLong(lineSplit[1]);
                    
                    if ( name.equals(newName)|| number == newNumber ){
                        found = true ;
                        break;
                        
                    }
                    
                    
                }
                if (found == false) {
                    nameNumberString = newName + "!" + String.valueOf(newNumber);
                    
                    raf.writeBytes(nameNumberString);
                    raf.writeBytes(System.lineSeparator());
                    JOptionPane.showMessageDialog(null, "Contact added", "INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                     raf.close();
                     
                     
                 }
                else { 
                    raf.close();
                    
                    JOptionPane.showConfirmDialog(null,"Contact alredy exist","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                    

                }
                
        }
        catch(IOException ioe){
            JOptionPane.showConfirmDialog(null,"ioe","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
            
            
        }
        catch (NumberFormatException nef){
            JOptionPane.showConfirmDialog(null,"nef","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
                        String newName= txtName.getText();
                        long newNumber = Long.parseLong(txtNumber.getText());
                        String nameNumberString;
                        String name;
                        int index;
                        long number;

                        File file = new File("friendsContact.txt");

                        if (!file.exists()==false){
                            file.createNewFile();
                        }
                        RandomAccessFile raf = new RandomAccessFile(file,"rw");
                        boolean found = false ;

                        while (raf.getFilePointer()< raf.length()){
                            nameNumberString = raf.readLine();
                            String[] lineSplit = nameNumberString.split("!");

                            name = lineSplit[0];
                            number = Long.parseLong(lineSplit[1]);

                            if ( name.equals(newName)|| number == newNumber ){
                                found = true ;
                                break;

                            }


                        }
                        if (found == true) {
 
                            // Creating a temporary file
                            // with file pointer as tmpFile.
                            File tmpFile = new File("temp.txt");

                            // Opening this temporary file
                            // in ReadWrite Mode
                            RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");

                            // Set file pointer to start
                            raf.seek(0);

                            // Traversing the friendsContact.txt file
                            while (raf.getFilePointer() < raf.length()) {

                                // Reading the contact from the file
                                nameNumberString = raf.readLine();

                                index = nameNumberString.indexOf('!');
                                name = nameNumberString.substring(0, index);

                                // Check if the fetched contact
                                // is the one to be updated
                                if (name.equals(newName)) {
                                    nameNumberString= name + "!" + String.valueOf(newNumber);
                                }

                                // Add this contact in the temporary
                                // file
                                tmpraf.writeBytes(nameNumberString);

                                // Add the line separator in the
                                // temporary file
                                tmpraf.writeBytes(
                                    System.lineSeparator());
                            }

                            // The contact has been updated now
                            // So copy the updated content from
                            // the temporary file to original file.

                            // Set both files pointers to start
                            raf.seek(0);
                            tmpraf.seek(0);

                            // Copy the contents from
                            // the temporary file to original file.
                            while (tmpraf.getFilePointer()
                                   < tmpraf.length()) {
                                raf.writeBytes(tmpraf.readLine());
                                raf.writeBytes(System.lineSeparator());
                            }

                            // Set the length of the original file
                            // to that of temporary.
                            raf.setLength(tmpraf.length());

                            // Closing the resources.
                            tmpraf.close();
                            raf.close();

                            // Deleting the temporary file
                            tmpFile.delete();

                            JOptionPane.showConfirmDialog(null," Friend updated. ","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                        }

                        // The contact to be updated
                        // could not be found
                        else {

                            // Closing the resources.
                            raf.close();

                            // Print the message
                            JOptionPane.showConfirmDialog(null," Input name"+ " does not exists. ","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
 
        catch (IOException ioe) {
            JOptionPane.showConfirmDialog(null,"ioe","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        }
 
        catch (NumberFormatException nef) {
            JOptionPane.showConfirmDialog(null,"nef","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        }
    








    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
            try {
                        String newName= txtName.getText();
                        long newNumber = Long.parseLong(txtNumber.getText());
                        String nameNumberString;
                        String name;
                        int index;
                        long number;

                        File file = new File("friendsContact.txt");

                        if (!file.exists()==false){
                            file.createNewFile();
                        }
                        RandomAccessFile raf = new RandomAccessFile(file,"rw");
                        boolean found = false ;

                        while (raf.getFilePointer()< raf.length()){
                            nameNumberString = raf.readLine();
                            String[] lineSplit = nameNumberString.split("!");

                            name = lineSplit[0];
                            number = Long.parseLong(lineSplit[1]);

                            if ( name.equals(newName)|| number == newNumber ){
                                found = true ;
                                break;

                            }


                        }
                        if (found == true) {
 
                            // Creating a temporary file
                            // with file pointer as tmpFile.
                            File tmpFile = new File("temp.txt");

                            // Opening this temporary file
                            // in ReadWrite Mode
                            RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");

                            // Set file pointer to start
                            raf.seek(0);

                            // Traversing the friendsContact.txt file
                            while (raf.getFilePointer() < raf.length()) {

                                // Reading the contact from the file
                                nameNumberString = raf.readLine();

                                index = nameNumberString.indexOf('!');
                                name = nameNumberString.substring(0, index);

                                // Check if the fetched contact
                                // is the one to be updated
                                if (name.equals(newName)) {
                                  continue;
                                }
                                tmpraf.writeBytes(nameNumberString);
 
                                // Add the line separator in the
                                // temporary file
                                tmpraf.writeBytes(
                                    System.lineSeparator());
                }
 
                        // The contact has been deleted now
                        // So copy the updated content from
                        // the temporary file to original file.

                        // Set both files pointers to start
                                raf.seek(0);
                                tmpraf.seek(0);

                                // Copy the contents from
                                // the temporary file to original file.
                                while (tmpraf.getFilePointer()
                                       < tmpraf.length()) {
                                    raf.writeBytes(tmpraf.readLine());
                                    raf.writeBytes(System.lineSeparator());
                                }

                                // Set the length of the original file
                                // to that of temporary.
                                raf.setLength(tmpraf.length());

                                // Closing the resources.
                                tmpraf.close();
                                raf.close();

                                // Deleting the temporary file
                                tmpFile.delete();

                                JOptionPane.showConfirmDialog(null," Friend Deleted. ","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                            }
 
                        // The contact to be deleted
                        // could not be found
                        else {

                                        // Closing the resources.
                                        raf.close();

                                        // Print the message
                                        JOptionPane.showConfirmDialog(null," Input name"+ " does not exists. ","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }

        catch (IOException ioe) {
            JOptionPane.showConfirmDialog(null,"ioe","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        }
 
        catch (NumberFormatException nef) {
            JOptionPane.showConfirmDialog(null,"nef","INFORMATION_MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        }
    
    
        
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        txtName.setText("");
        txtNumber.setText("");
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
}
