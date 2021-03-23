/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CatsAreAwesome;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Admin-PC
 */
public class Remind {
//    User u = new User();
    Timer timer;
    
    protected String username;
    protected double HUNGER;
    protected double HAPPINESS;
    protected double EXP;
    protected int LEVEL=1;
    protected long TTL;
    protected int MUNNY;
    protected String[] data = new String[12];
    protected int[] dota = new int[12];
    
    
    
    
    public void startTimer() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new RemindTask(), 10000, 10000);
        timer.scheduleAtFixedRate(new HAPPINESSTask(), 20000, 20000);
        timer.scheduleAtFixedRate(new EXPTask(), 1000, (long) (1000-(HAPPINESS*50)));
    }

    public void setHUNGER(int HUNGER) {
        this.HUNGER = HUNGER;
        
    }

    public void setHAPPINESS(int HAPPINESS) {
        this.HAPPINESS = HAPPINESS;
    }

    public void setEXP(int EXP) {
        this.EXP = EXP;
    }

    public void setLEVEL(int LEVEL) {
        this.LEVEL = LEVEL;
    }

    public void setTTL(int TTL) {
        this.TTL = TTL;
    }

    public void setMUNNY(int MUNNY) {
        this.MUNNY = MUNNY;
    }

    public double getHUNGER() {
        return HUNGER;
    }

    public double getHAPPINESS() {
        return HAPPINESS;
    }

    public double getEXP() {
        return EXP;
    }

    public int getLEVEL() {
        return LEVEL;
    }

    public long getTTL() {
        return TTL;
    }

    public int getMUNNY() {
        
        return MUNNY;
       
    }
    
//    public void FEED() {
//        if (HUNGER==10)
//        {
////            System.out.println("I am full!");
//        }
//        else 
//        {
//            if (HUNGER>10)
//                HUNGER=10;
////            System.out.println("Need food");
//        }
//    }
    
    class RemindTask extends TimerTask {

        @Override
        public void run() {
            
            if(HUNGER==100)
            {
                
            }
            else
            {
            HUNGER++;
//            System.out.println("Hunger is reduced to "+ HUNGER);
            }
            
            //timer.cancel(); //Not necessary because we call System.exit
            //System.exit(0); //Stops the AWT thread (and everything else)
        }
    }
    
    
    
    class HAPPINESSTask extends TimerTask {

        @Override
        public void run() {
            if(HAPPINESS==0)
            {
                //System.out.println("Cat ");
            }
            else
            {
            HAPPINESS--;
            System.out.println("Happiness is reduced to " + HAPPINESS);
            }
            //timer.cancel(); //Not necessary because we call System.exit
            //System.exit(0); //Stops the AWT thread (and everything else)
        }
    }
    
    class EXPTask extends TimerTask {

        @Override
        public void run() {
            int b=1;
            
            if(LEVEL!=10)
            {
                EXP++;
//                System.out.println("Your EXP is increased to " + EXP);
            }
                
            if(EXP==100*b)
            {
                LEVEL++;
                System.out.println("Level " + LEVEL);
                b++;
                EXP=0;
            }
            
            
            
            //timer.cancel(); //Not necessary because we call System.exit
            //System.exit(0); //Stops the AWT thread (and everything else)
        }
    }
    
    
    

//    public double HUNGRY (double HUNG)
//    {
//        HUNG--;
//        return HUNGER;
//    }
    
    public void cancel()
    {
        timer.cancel();
    }
    
    public void setName(String name){
        username = name;
    }
    
    public static void save(String name,String[] data){
        //@overwrite
    
        try{PrintWriter q=new PrintWriter(new FileOutputStream(name));
             q.println(data[0]);
             q.println(data[1]);
             q.println(data[2]);
             q.println(data[3]);
             q.println(data[4]);
             q.println(data[5]);
             q.println(data[6]);
             q.println(data[7]);
             
             q.close();
           }catch(IOException r){
               System.out.println("There is a problem with the file you saved.");
           }                  
   
    }
    
    public static String[] readFile(String name){
       
        Scanner sw=new Scanner(System.in);
        String[] data=new String[12];
        try{Scanner s=new Scanner(new FileInputStream(name));
        int x=0;
        
            while(sw.hasNextLine())
            {
                 data[x]=sw.nextLine();
                 x++;
            }
            sw.close();
            return data;
            
        }catch(FileNotFoundException e)
        {
            System.out.println("There is a problem with your file.");
            
         }   
        return null;
    
    
    }
}


    

