package comtech.payroll.system;


public class ComtechPayrollSystem {
       
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Opening_screen splash=new Opening_screen();
        login page=new login();
        splash.setVisible(true);
        try{
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(50);
                splash.percentage_label.setText(Integer.toString(i)+"%");
//                splash.progress_bar.setValue(i);
                if(i==100)
                {
                   page.setVisible(true);
                   splash.dispose();
                }
            }
            
        }catch(Exception e)
        {
            
        }
    }
    
}
