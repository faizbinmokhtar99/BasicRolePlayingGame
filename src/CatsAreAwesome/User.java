package CatsAreAwesome;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.Writer;
import java.util.Date;
import java.util.Scanner;

public class User {
    
    protected String username;
    
    protected String[] data=new String[8];
    
    Remind r = new Remind();
    
    
    
    
    public User() {
        username  = "";
    }
    
    public User (String usernameq) {
        username = usernameq;
    }
    
    public static String[] UsernameCheck(String name , String cat) {
        Scanner s = new Scanner(System.in);
        try {
            Scanner ss = new Scanner(new FileInputStream(name));
            int p = 0;
            String[] data = new String[8];
            while(ss.hasNextLine()){
                data[p] = ss.nextLine();
                p++;
            }
            ss.close();
            return data;
            
        } catch(FileNotFoundException e) {
            try{
                PrintWriter q = new PrintWriter(new FileOutputStream(name));
                q.println(name);
                //System.out.println("Welcome new Player " + name);
                //System.out.println("Please enter name of cat ");
                
                //String cat = s.next();
                q.println(cat); 
                q.println(500); //ttl
                q.println(15); //hunger
                q.println(10); //happiness
                q.println(1000); //munny
                q.println(1); //level
                q.println(1); //xp
                q.println(cat); //cat name
                q.close();
                
                Scanner ss = new Scanner (new FileInputStream(name));
                int p = 0;
                String[] data = new String [8];
                while(ss.hasNextLine()){
                    data[p] = ss.nextLine();
                    p++;
                }
                ss.close();
                return data;
                
            }catch(IOException c) {
                System.out.println("Problem");
                String[] data = {"Problem"};
                return data;
            }
        }
    }
    
    public static String[] FileCreation(String name,int hour, int minutes, int seconds, Date date) { 
        try{
            PrintWriter q = new PrintWriter(new FileOutputStream(name));
            q.println(name);           //name d 0
            q.println(500);            //ttl d 1
            q.println(15);             //hunger d 2
            q.println(10);             //happiness d 3
            q.println(1000);           //munny d 4
            q.println(1);              //level d 5
            q.println(1);              //xp d 6
            q.println(hour);           // d 7
            q.println(minutes);        // d 8
            q.println(seconds);        // d 9 
            q.println(date);           // d 10
            
            

            q.close();
            
            Scanner ss = new Scanner(new FileInputStream(name)); // To read each line in file and return in array : String 
            int p = 0;
            String[] data = new String[12];
            while(ss.hasNextLine()){
                data[p] = ss.nextLine();
                p++;
            }
            ss.close();
            return data;
        
        }catch(IOException c){
            System.out.println("Problem");
            String[] data = {"Problem"};
            return data;
        }       
            
    
    }
    
     public static int [] IntChange(String data[]) {
         int[] dataInt = new int[12];
         
        for(int i=1;i<7;i++){
            dataInt[i] = Integer.parseInt(data[i]);
        }
        return dataInt;
     }
    
     public static int FileExisting(String name) {
         
         Scanner s = new Scanner(System.in);
         try{
             Scanner ss = new Scanner(new FileInputStream(name));
             int p = 0;
             String[] data=new String[12];
             while(ss.hasNextLine()){
                 data[p] = ss.nextLine();
                 p++;
                 
             }
             ss.close();
             return 1;
         }
         catch(FileNotFoundException e){
             return 0;
         }
     }
     
      public static String[] FileRead(String name) {
          
        Scanner s=new Scanner(System.in);
        String[] data=new String[12];
        try{
            Scanner ss = new Scanner(new FileInputStream(name));
            int p = 0;
            while(ss.hasNextLine())
            {
                 data[p]=ss.nextLine();
                 p++;
            }
            ss.close();
            return data;
            
        }catch(FileNotFoundException e)
        {
            System.out.println("Problem with file");
        }   
        return null;
        }
          
    public String getName(){
        return username;
    }
    
    public void setName(String name){
        this.username = name;
    }
    
    
//    public static void update(int benda[]){
//        
//    }  
//        
      public void forsave(String name, int TTL, int HUNGER, int HAPPINESS, int MUNNY, int LEVEL, int EXP){
        //@overwrite
    
        try{PrintWriter t = new PrintWriter(new FileOutputStream(name));
             
             data[0] = username;
             data[1] = Long.toString(r.getTTL());
             data[2] = Double.toString(r.getHUNGER());
             data[3] = Double.toString(r.getHAPPINESS());
             data[4] = Integer.toString(r.getMUNNY());
             data[5] = Integer.toString(r.getLEVEL());
             data[6] = Double.toString(r.getEXP());
             r.save(username, data);
             
             
           
        }catch(IOException Remind){
               System.out.println("Problem with file");
           }                  

    
               
}
   
    
}      

