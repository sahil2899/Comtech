/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comtech.payroll.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author sahil mittal
 */
public class Salary extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
    /** Creates new form Salary */
    public Salary() {
        initComponents();
        conn=db.java_db();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_month = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        txt_cal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txt_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));

        txt_cal.setText("Calculate");
        txt_cal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_calActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(txt_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(683, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_cal)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 422, Short.MAX_VALUE)
                .addComponent(txt_cal)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(954, 526));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_calActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_calActionPerformed
        // TODO add your handling code here:
        try
        {
            String sql="select SI.salary as SI_salary,Grade.HRA as Grade_HRA ,"
                    + "Grade.DA as Grade_DA ,Grade.Bonus as Grade_Bonus,"
                    + "Grade.Medical as Grade_Medical,Allowance.AdditionalHRA as Hra,"
                    + "Allowance.AdditionalBonus as Bonus,Allowance.AdditionalMedical as Medical,"
                    + "Allowance.OverTimeAmount as OverAmount,Allowance.Gift as Gift,Allowance.AdditionalDA as Da,"
                    + "SI.id as SI_id "
                    + "from Staff_informations SI \n" +
                    "Left outer join Grade On SI.GradeID=Grade.GradeDescription\n" +
                    "Left outer join Allowance On SI.id=Allowance.Emp_id ";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            while(rs.next())
            {
            String SI_id=rs.getString("SI_id");
            int id=Integer.parseInt(SI_id);
            
            String SI_salary=rs.getString("SI_salary");
            int salary=Integer.parseInt(SI_salary);
          
            String Grade_HRA=rs.getString("Grade_HRA");
            int Hra2=Integer.parseInt(Grade_HRA);
            
            String Grade_DA=rs.getString("Grade_DA");
            int Da2=Integer.parseInt(Grade_DA);
            
            String Grade_Medical=rs.getString("Grade_Medical");
            int Medical2=Integer.parseInt(Grade_Medical);
            
            String Grade_Bonus=rs.getString("Grade_Bonus");
            int Bonus2=Integer.parseInt(Grade_Bonus);
            
            String Bonus=rs.getString("Bonus");
            int Bonus1=Integer.parseInt(Bonus);
            
            String Da=rs.getString("Da");
            int Da1=Integer.parseInt(Da);
            
            String Hra=rs.getString("Hra");
            int Hra1=Integer.parseInt(Hra);
            
            String Gift=rs.getString("Gift");
            int Gift1=Integer.parseInt(Gift);
            
            String Medical=rs.getString("Medical");
            int Medical1=Integer.parseInt(Medical);
            
            String OverAmount=rs.getString("OverAmount");
            int OverAmount1=Integer.parseInt(OverAmount);
            
            String sql1="insert into Salary(EmpID,Basic_Salary,Grade_Hra,Grade_Da,Grade_Medical,Grade_Bonus,Allowance_Bonus,Allowance_HRA,Allowance_DA,Allowance_OverAmt,Allowance_Gift,Allowance_Medical) values ('"+id+"','"+salary+"','"+Hra2+"','"+Da2+"','"+Medical2+"','"+Bonus2+"','"+Bonus1+"','"+Hra1+"','"+Da1+"','"+OverAmount1+"','"+Gift1+"','"+Medical1+"')";
            pst=conn.prepareStatement(sql1);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Salary for all employee is calculated");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_txt_calActionPerformed

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
            java.util.logging.Logger.getLogger(Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JButton txt_cal;
    private javax.swing.JComboBox<String> txt_month;
    // End of variables declaration//GEN-END:variables

}
