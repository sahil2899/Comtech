/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comtech.payroll.system;


import javax.swing.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Employee_Salary extends javax.swing.JFrame {

    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;    
    public Employee_Salary() {
        initComponents();
        conn=db.java_db();
        Update_table();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    private void Update_table()
    {
        try
        {
            String sql="select * from Salary_cal";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
           table_salary.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        salary_date = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_salary = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 102, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Generate Salary For All Employees", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel1.setText("Salary Cal_month");

        jButton1.setText("Calculate ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        salary_date.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        salary_date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salary_date, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 864, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(salary_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Salary Table", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        table_salary.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table_salary);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1311, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1361, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try
        {
            String sal_date=(String)salary_date.getSelectedItem();
            String sql="SELECT SI.id as SI_id,"
            + "SI.Salary as SI_Salary,"

            + "Grade.HRA as Grade_HRA,"
            + "Grade.DA as Grade_DA,"
            + "Grade.Bonus as Grade_Bonus,"
            + "Grade.Medical as Grade_Medical,"

            + "SUM(Allowance.AdditionalHRA) as Allowance_AdditionalHRA,"
            + "SUM(Allowance.AdditionalDA) as Allowance_AdditionalDA,"
            + "SUM(Allowance.AdditionalBonus) as Allowance_AdditionalBonus,"
            + "SUM(Allowance.AdditionalMedical) as Allowance_AdditionalMedical,"
            + "SUM(Allowance.OverTimeAmount) as Allowance_OverTimeAmount,"
            + "SUM(Allowance.Others) as Allowance_Others,"
            + "Allowance.Allowance_Month as Allowance_Allowance_Month,"
            + "Deduction.Total_leave as Deduction_Total_leave,"
            + "Deduction.Deduction_Amount as Deduction_Amount "
            

            + "from Staff_informations SI "
            + "Left outer join  Grade on (SI.GradeID=Grade.GradeDescription) "
            + "Left outer join Allowance on (SI.id=Allowance.Emp_id) "
            + "Left outer join Deduction on (SI.id=Deduction.Emp_id) "
            + "Where EXTRACT(MONTH FROM Allowance.Allowance_Month)='"+sal_date+"'"
                    
            + "Group by id";

            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next())
            {
//                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//                String date=sdf.format(salary_date.getDate());
                
                
                // Get the id and salary from staff_inforamtions table.
                String SI_id=rs.getString("SI_id");
                int id=Integer.parseInt(SI_id);

                String SI_Salary=rs.getString("SI_Salary");
                int salary_cal=Integer.parseInt(SI_Salary);
                int salary_month=salary_cal/12;

                //Get the gradedescriptions according to the id.

                String Grade_da=rs.getString("Grade_DA");
                int DA_cal=Integer.parseInt(Grade_da);

                String Grade_hra=rs.getString("Grade_HRA");
                int HRA_cal=Integer.parseInt(Grade_hra);

                String Grade_bonus=rs.getString("Grade_Bonus");
                int Bonus_cal=Integer.parseInt(Grade_bonus);

                String Grade_medical=rs.getString("Grade_Medical");
                int Medical_cal=Integer.parseInt(Grade_medical);

                //Get the additional allowance details from allowance table.

                String Allowance_additionalmedical=rs.getString("Allowance_AdditionalMedical");
                int Amedical_cal=Integer.parseInt(Allowance_additionalmedical);

                String Allowance_additionalbonus=rs.getString("Allowance_AdditionalBonus");
                int Abonus_cal=Integer.parseInt(Allowance_additionalbonus);

                String Allowance_additionalhra=rs.getString("Allowance_AdditionalHRA");
                int Ahra_cal=Integer.parseInt(Allowance_additionalhra);

                String Allowance_additionaldA=rs.getString("Allowance_AdditionalDA");
                int Ada_cal=Integer.parseInt(Allowance_additionaldA);

                String Allowance_others=rs.getString("Allowance_Others");
                int Aothers_cal=Integer.parseInt(Allowance_others);

                String Allowance_overTimeAmount=rs.getString("Allowance_OverTimeAmount");
                int time_cal=Integer.parseInt(Allowance_overTimeAmount);

                String Deduction_Amount=rs.getString("Deduction_Amount");
                int deduction=Integer.parseInt(Deduction_Amount);

                String Deduction_Total_leave=rs.getString("Deduction_Total_leave");
                int total_leave=Integer.parseInt(Deduction_Total_leave);

                int total_allowance=DA_cal+HRA_cal+
                Bonus_cal+Medical_cal+Amedical_cal+Abonus_cal+Ahra_cal+Ada_cal+Aothers_cal+time_cal;
                int gross_salary=total_allowance+salary_month-deduction;
                int tax=10;
                int tax_amount=gross_salary*tax/100;
                int net_salary=gross_salary-tax_amount;

                String sql1="insert into Salary_cal(Emp_id,Salary_Date,Salary,Hra,Da,Bonus,Medical,A_Medical,A_Bonus,A_DA,A_HRA,Others,O_Amount,Total_Allowance,all_leave,Total_Deduction,Gross_salary,Tax,Tax_Amount,Net_Salary)"
                + " values ('"+id+"','"+sal_date+"','"+salary_month+"','"+HRA_cal+"','"+DA_cal+"','"+Bonus_cal+"','"+Medical_cal+"','"+Amedical_cal+"','"+Abonus_cal+"','"+Ada_cal+"','"+Ahra_cal+"','"+Aothers_cal+"'"
                + ",'"+time_cal+"','"+total_allowance+"','"+total_leave+"','"+deduction+"','"+gross_salary+"','"+tax+"','"+tax_amount+"','"+net_salary+"')";

                pst=conn.prepareStatement(sql1);
                pst.execute();
            }
            JOptionPane.showMessageDialog(null,"Salary for all employee is calculated");
            this.dispose();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Employee_Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_Salary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JComboBox<String> salary_date;
    private javax.swing.JTable table_salary;
    // End of variables declaration//GEN-END:variables
}
