
package CatsAreAwesome;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;



public class NewGame extends JFrame implements KeyListener{
    Remind r = new Remind();
    User u = new User();
    protected String username;
    private final JButton pet, user, cashA, cashB, cashC, EasterEgg;
    private int row,column,collectA,collectB,collectC,collectD,munny=0;
    private double hap=0,exp=0;
    private final JLabel skor = new JLabel();
    private final JLabel hapStat= new JLabel();
    private final JLabel secret=new JLabel();
    public void NewGame() {}//penting ni
    
    public NewGame(){                  //ADDING ASSETS
        
        this.setTitle("Walk the Cat");
        this.addKeyListener(this);
        JLabel gamePanel = new JLabel(new ImageIcon("farm2.png"));
     //   gamePanel.setSize(10,10);
        this.add(gamePanel);
       // gamePanel.setLayout(null);
        this.setContentPane(gamePanel);
     //   this.getContentPane().setBackground(Color.blue);
        this.getContentPane().setPreferredSize(new Dimension(799,578));
        hapStat.setText("Happiness:"+hapStat);
        hapStat.setSize(200,20);
        hapStat.setLocation(60,60);
        hapStat.setForeground(Color.white);
        this.add(hapStat);
        skor.setText("Munny: "+munny);
        skor.setSize(200,20);
        skor.setLocation(80,90);
        skor.setForeground(Color.white);
        this.add(skor);
        this.user = new JButton("");
        user.setSize(27,36);
        user.setLocation(615,357);
        //user.setBackground(color.BLACK);
        user.setOpaque(false);
        user.setContentAreaFilled(false);
        user.setBorderPainted(false);
        user.setIcon(new ImageIcon("jotarowalk.jpg"));
        this.getContentPane().add(user);
        this.pet = new JButton("");        
        pet.setSize(20,20);
        pet.setLocation(644,357);
       // pet.setBackground(Color.WHITE);
        pet.setOpaque(false);
        pet.setContentAreaFilled(false);
        pet.setBorderPainted(false);
        pet.setIcon(new ImageIcon("garyresize2.png"));
        this.getContentPane().add(pet);
        this.cashA = new JButton("");
        cashA.setSize(20,20);
        cashA.setLocation(468,69);
        cashA.setOpaque(false);
        cashA.setContentAreaFilled(false);
        cashA.setBorderPainted(false);
        cashA.setIcon(new ImageIcon("duitresize.png"));
        this.getContentPane().add(cashA);
        this.cashB = new JButton("");
        cashB.setSize(20,20);
        cashB.setLocation(36,549);
        cashB.setOpaque(false);
        cashB.setContentAreaFilled(false);
        cashB.setBorderPainted(false);
        cashB.setIcon(new ImageIcon("duitresize.png"));
        this.getContentPane().add(cashB);
        this.cashC = new JButton("");
        cashC.setSize(20,20);
        cashC.setLocation(244,293);
        cashC.setOpaque(false);
        cashC.setContentAreaFilled(false);
        cashC.setBorderPainted(false);
        cashC.setIcon(new ImageIcon("duitresize.png"));
        this.getContentPane().add(cashC);
        this.EasterEgg = new JButton("");
        EasterEgg.setSize(20,20);
        EasterEgg.setLocation(724,101);
        EasterEgg.setOpaque(false);
        EasterEgg.setContentAreaFilled(false);
        EasterEgg.setBorderPainted(false);
        EasterEgg.setIcon(new ImageIcon("eastereggresize.JPG"));
        EasterEgg.setVisible(false);
        this.getContentPane().add(EasterEgg);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    
    public int world(int row, int column){
        int[][] world={
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,0,0},
            {0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
            {0,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
            {0,0,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
            {0,0,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,0,0,0,8,0,0,0,0},
            {0,1,1,1,0,0,0,1,0,0,0,1,1,1,1,1,1,1,0,0,1,0,0,0,0},
            {0,1,1,1,0,0,0,1,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0},
            {0,0,1,1,1,1,1,1,1,1,1,0,0,1,1,1,0,1,1,0,1,0,0,0,0},
            {0,0,0,1,1,1,1,1,0,0,1,1,0,0,0,0,0,0,0,0,1,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,0,1,0,0,0,0,0,0,0,1,1,1,1,1,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
            {0,0,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,0,1,1,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        };
        int number=world[column/32][row/32];
        if(number==8){
            end();
        }
        return number;
    }                           //ADDING MOVEMENT
    @Override
    public void keyPressed(KeyEvent e) 
    {
        if(e.getKeyCode()==KeyEvent.VK_D)
        {
            this.moveRight();
        }
        if(e.getKeyCode()==KeyEvent.VK_A)
        {
            this.moveLeft();
        }
        if(e.getKeyCode()==KeyEvent.VK_W)
        {
            this.moveUp();
        }
        if(e.getKeyCode()==KeyEvent.VK_S)
        {
            this.moveDown();
        }
    }
    
    private void moveRight() {
        this.row=pet.getX()+16;
        this.column=pet.getY();
        int baru=world(row,column);
        if(baru==1){
            update();
        }
    }
    private void moveLeft() {
        this.row=pet.getX()-16;
        this.column=pet.getY();
        int baru = world(row,column);
        if(baru==1){
            update();
        }
    }
    private void moveUp() {
        this.row=pet.getX();
        this.column=pet.getY()-16;
        int baru=world(row,column);
        if(baru==1){
            update();
        }
    }
    private void moveDown() {
        this.row=pet.getX();
        this.column=pet.getY()+16;
        int baru = world(row,column);
        if(baru==1){
            update();
        }
    }               //GAME EVENTS
    private void update(){
        user.setLocation(pet.getX(),pet.getY());
        pet.setLocation(row,column);
        kumpul(row,column);
    }
    public void kumpul(int row,int column){    
        hap=hap+0.1;
    
     hapStat.setText("Happiness: "+hap);
     if(row==468&&column==69){
         if(collectA==0){
             munny=munny+10;
             collectA=1;
             cashA.setVisible(false);
             skor.setText("Munny: "+munny);
         }
     }
     if(row==36&&column==549){
         if(collectB==0){
             munny=munny+10;
             collectB=1;
             cashB.setVisible(false);
             skor.setText("Munny: "+munny);
         }
     }
     if(row==244&&column==293){
         if(collectC==0){
             munny=munny+10;
             collectC=1;
             cashC.setVisible(false);
             skor.setText("Munny: "+munny);
         }
     }
     
     if(row==724&&column==101){
         if(collectD==0){
             munny=munny+25;
             collectD=1;
              secret.setText("Secret found!");
            secret.setSize(200,20);
            secret.setVisible(true);
            secret.setLocation(300,10);
            secret.setForeground(Color.RED);
            secret.setFont(new Font("Calibri",Font.BOLD,15));
            this.add(secret);
             skor.setText("Munny: "+munny);
            }
        }
    }
   
//        secret.setText("Secret found!");
//        secret.setSize(200,20);
//        secret.setVisible(true);
//        secret.setLocation(300,10);
//        secret.setForeground(Color.RED);
//        secret.setFont(new Font("Calibri",Font.BOLD,15));
//        this.add(secret);
//    
     public double rHappy(){
         double hap=this.hap;
         r.HAPPINESS+=hap;
         return r.HAPPINESS;
     }
     public int rMunny(){
         int munny=this.munny;
         r.MUNNY+=munny;
         return r.MUNNY;
     }                      
    public double rEXP() {
        double exp = this.exp;
        r.EXP += exp;
        return r.EXP;
    }  //ENDING THE GAME
     private void end() {
     JFrame tamat= new JFrame();
     JLabel text=new JLabel("<html>Munny collected: "+ munny+ "<br/>Happiness level: "+hap+"<br/> </html>",SwingConstants.CENTER);
     text.setFont(new Font("Candara",Font.BOLD,15));
     JButton tutup=new JButton("EXIT");
     tamat.setTitle("Game Finished");
     tamat.setSize(300,150);
     tamat.getContentPane().setLayout(new FlowLayout());
     tutup.setSize(90,40);
     tutup.setLocation(70, 40);
     tamat.getContentPane().add(text);
     tamat.getContentPane().add(tutup);
     text.setVisible(true);
     pack();
     tamat.setVisible(true);
     tamat.setLocationRelativeTo(null);
     tutup.addActionListener(e->{
//        u.forsave(username, r.TTL, r.HUNGER, r.HAPPINESS, r.MUNNY, r.LEVEL, r.EXP);
        tamat.dispose();
        this.dispose();
     });
    } 
    
    
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

}
