package comtech.payroll.system;


public class ComtechPayrollSystem {
       
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Splash_Screen splash=new Splash_Screen();
        login page=new login();
        splash.setVisible(true);
        try{
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(20);
                splash.percentage_label.setText(Integer.toString(i)+"%");
                splash.progress_bar.setValue(i);
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
