/**
*
* Helf a Dozen Tasks (Lab06 in Unit1, fcps.karel)
*
* @author Shaurya Prakash
* @version 12/11/2014
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab06 {

          public static void task_01(Athlete arg) 
         {
            while (arg.nextToABeeper()) 
           {
               arg.move();
           }
         }
            
          public static void task_02(Athlete arg) 
         {
            while (!arg.nextToABeeper()) 
           {
               arg.move();
           }
         }
           
           public static void task_03(Athlete arg) 
         {
            while (arg.frontIsClear()) 
           {
               arg.move();
           }
         }
           
           public static void task_04(Athlete arg) 
         {
            while (arg.frontIsClear()) 
           {
               if (arg.nextToABeeper()) 
              {
               arg.pickBeeper();
              }
               arg.move();
           }
         }
          
          public static void task_05(Athlete arg) 
         {
            while (arg.frontIsClear())
              {
               arg.move();
              
            while (arg.nextToABeeper()) 
           {  
               arg.pickBeeper();
           }
              }
         }
           
          public static void task_06(Athlete arg) 
         {
            while (arg.nextToABeeper()) 
           {
               arg.move();
           }
            arg.move();
            while (arg.nextToABeeper()) 
           {
               arg.move();
           }
         } 
           
          public static void main(String[] args) 
         {
          
          String filename = JOptionPane.showInputDialog("What robot map?");  	
          Display.openWorld("maps/" + filename + ".map");
          Display.setSize(10, 10);
          Display.setSpeed(1);
          
          Athlete a = new Athlete(1, 1, Display.EAST, Display.INFINITY);
          Athlete b = new Athlete(1, 2, Display.EAST, Display.INFINITY);
          Athlete c = new Athlete(1, 3, Display.EAST, Display.INFINITY);
          Athlete d = new Athlete(1, 4, Display.EAST, Display.INFINITY);
          Athlete e = new Athlete(1, 5, Display.EAST, Display.INFINITY);
          Athlete f = new Athlete(1, 6, Display.EAST, Display.INFINITY); 
          
          task_01(a);
          task_02(b);
          task_03(c);
          task_04(d);
          task_05(e);
          task_06(f);
          
         }
         
}


