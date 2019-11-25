/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comtech.payroll.system;

import java.awt.Toolkit;
import javax.swing.ImageIcon;



/**
 *
 * @author sahil mittal
 */
public class Menu_final extends javax.swing.JFrame 
{
    ImageIcon icon;
    public Menu_final()
    {
        initComponents();
        // setExtendedState(JFrame.MAXIMIZED_BOTH);
        // lbl_emp.setText(String.valueOf(Emp.empId).toString());
        lbl_emp.setText(Emp.empusername);
        icon =new ImageIcon("C:\\Users\\sahil mittal\\Documents\\NetBeansProjects\\comtech payroll system\\Final_Images\\Jframe_icon.png");
        setIconImage(icon.getImage());
        
       
//        Menu_final ne=new Menu_final();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        add_employee1 = new javax.swing.JButton();
        add_employee = new javax.swing.JButton();
        add_employee3 = new javax.swing.JButton();
        add_employee5 = new javax.swing.JButton();
        add_employee2 = new javax.swing.JButton();
        add_employee4 = new javax.swing.JButton();
        add_employee6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbl_emp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_employee1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_employee1.setText("Employee Management");
        add_employee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_employee1ActionPerformed(evt);
            }
        });
        jPanel1.add(add_employee1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 220, 70));

        add_employee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_employee.setText("Payslip");
        add_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_employeeActionPerformed(evt);
            }
        });
        jPanel1.add(add_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 210, 70));

        add_employee3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_employee3.setText("Update Salary");
        add_employee3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_employee3ActionPerformed(evt);
            }
        });
        jPanel1.add(add_employee3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 210, 70));

        add_employee5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_employee5.setText("Deductions");
        add_employee5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_employee5ActionPerformed(evt);
            }
        });
        jPanel1.add(add_employee5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 220, 70));

        add_employee2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_employee2.setText("Register Employee");
        add_employee2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_employee2ActionPerformed(evt);
            }
        });
        jPanel1.add(add_employee2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 220, 70));

        add_employee4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_employee4.setText("Allowances");
        add_employee4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_employee4ActionPerformed(evt);
            }
        });
        jPanel1.add(add_employee4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 220, 70));

        add_employee6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_employee6.setText("Salary Calculation");
        add_employee6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_employee6ActionPerformed(evt);
            }
        });
        jPanel1.add(add_employee6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 210, 70));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, -1));

        lbl_emp.setBackground(new java.awt.Color(255, 255, 255));
        lbl_emp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_emp.setForeground(new java.awt.Color(255, 255, 255));
        lbl_emp.setText("Name");
        jPanel1.add(lbl_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sahil mittal\\Documents\\NetBeansProjects\\comtech payroll system\\src\\Project pictures'\\main_menu.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1098, 632));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sahil mittal\\Documents\\NetBeansProjects\\comtech payroll system\\Final_Images\\logout.png")); // NOI18N
        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\sahil mittal\\Documents\\NetBeansProjects\\comtech payroll system\\Final_Images\\close .png")); // NOI18N
        jMenuItem2.setText("Close");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Employee");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon("C:\\Users\\sahil mittal\\Documents\\NetBeansProjects\\comtech payroll system\\Final_Images\\add.png")); // NOI18N
        jMenuItem5.setText("Register Employee");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon("C:\\Users\\sahil mittal\\Documents\\NetBeansProjects\\comtech payroll system\\Final_Images\\manage.png")); // NOI18N
        jMenuItem6.setText("Manage Employees");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu8.setText("About");

        jMenuItem3.setIcon(new javax.swing.ImageIcon("C:\\Users\\sahil mittal\\Documents\\NetBeansProjects\\comtech payroll system\\Final_Images\\payroll.png")); // NOI18N
        jMenuItem3.setText("Version 1.0");
        jMenu8.add(jMenuItem3);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void add_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_employeeActionPerformed
        // TODO add your handling code here:
       Employee_Payslip object=new Employee_Payslip();
        object.setVisible(true);
    }//GEN-LAST:event_add_employeeActionPerformed

    private void add_employee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_employee1ActionPerformed
        // TODO add your handling code here:
        Employee_Management object=new Employee_Management();
        object.setVisible(true);
    }//GEN-LAST:event_add_employee1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        login x=new login();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Register_Employee object=new Register_Employee();
        object.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Employee_Management object=new Employee_Management();
        object.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void add_employee2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_employee2ActionPerformed
        // TODO add your handling code here:
        Register_Employee object=new Register_Employee();
        object.setVisible(true);
    }//GEN-LAST:event_add_employee2ActionPerformed

    private void add_employee3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_employee3ActionPerformed
        Update_Salary object=new Update_Salary();
        object.setVisible(true);
    }//GEN-LAST:event_add_employee3ActionPerformed

    private void add_employee4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_employee4ActionPerformed
        // TODO add your handling code here:
        Employee_Allowances object=new Employee_Allowances();
        object.setVisible(true);
    }//GEN-LAST:event_add_employee4ActionPerformed

    private void add_employee5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_employee5ActionPerformed
        // TODO add your handling code here:
        Employee_Deductions object=new Employee_Deductions();
        object.setVisible(true);
    }//GEN-LAST:event_add_employee5ActionPerformed

    private void add_employee6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_employee6ActionPerformed
        // TODO add your handling code here:
        Employee_Salary object=new Employee_Salary();
        object.setVisible(true);
    }//GEN-LAST:event_add_employee6ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu_final object=new Menu_final();
                object.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_employee;
    private javax.swing.JButton add_employee1;
    private javax.swing.JButton add_employee2;
    private javax.swing.JButton add_employee3;
    private javax.swing.JButton add_employee4;
    private javax.swing.JButton add_employee5;
    private javax.swing.JButton add_employee6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_emp;
    // End of variables declaration//GEN-END:variables

//    private void Seticon() {
//        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("global.png")));
//    }
}
