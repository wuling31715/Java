
import java.awt.*;            
public class app17_1
{
   static Frame frm=new Frame("my first AWT program");
   static Label lab=new Label("Hello Java!!");

   public static void main(String args[])
   {
      frm.setSize(220,150);   
      frm.setBackground(Color.yellow);
      frm.setLocation(250,250);       
      frm.add(lab);                   
      frm.setVisible(true);           
   }
}
