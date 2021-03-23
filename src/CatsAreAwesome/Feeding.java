package CatsAreAwesome;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;



public class Feeding extends javax.swing.JFrame {
    
    private String username;
    User u = new User(); //added
    Remind r = new Remind();
    
    public Feeding() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
     public Feeding(String name) {
        initComponents();
        username = name;
        
        
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        WhiskasButton = new javax.swing.JButton();
        PurinaButton = new javax.swing.JButton();
        HillButton = new javax.swing.JButton();
        BBButton = new javax.swing.JButton();
        RCButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        fedCatText = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        HappyBar = new javax.swing.JProgressBar();
        HungBar = new javax.swing.JProgressBar();
        expBar = new javax.swing.JProgressBar();
        ttLBar = new javax.swing.JProgressBar();
        HappyNum = new javax.swing.JLabel();
        HungNum = new javax.swing.JLabel();
        expNum = new javax.swing.JLabel();
        ttLNum = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        LevelNum = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        MunnyNum = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Feeding");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(204, 153, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cat Food:");

        WhiskasButton.setBackground(new java.awt.Color(255, 255, 153));
        WhiskasButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        WhiskasButton.setText("Whiskas: Free");
        WhiskasButton.setToolTipText("Hunger -5");
        WhiskasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        WhiskasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WhiskasButtonMouseClicked(evt);
            }
        });
        WhiskasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WhiskasButtonActionPerformed(evt);
            }
        });

        PurinaButton.setBackground(new java.awt.Color(255, 255, 153));
        PurinaButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PurinaButton.setText("Purina: CM 5");
        PurinaButton.setToolTipText("Happiness +5, Hunger -5");
        PurinaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PurinaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PurinaButtonMouseClicked(evt);
            }
        });

        HillButton.setBackground(new java.awt.Color(255, 255, 153));
        HillButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        HillButton.setText("Hill's: CM 10");
        HillButton.setToolTipText("Happiness +10, Hunger -10, TTL +30");
        HillButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HillButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HillButtonMouseClicked(evt);
            }
        });

        BBButton.setBackground(new java.awt.Color(255, 255, 153));
        BBButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BBButton.setText("Buttons and Bows: CM 50");
        BBButton.setToolTipText("Happiness +15, Hunger -15, TTL +60");
        BBButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BBButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BBButtonMouseClicked(evt);
            }
        });

        RCButton.setBackground(new java.awt.Color(255, 255, 153));
        RCButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RCButton.setText("Royal Canin: CM 100");
        RCButton.setToolTipText("Happiness +20, Hunger -20, TTL +90");
        RCButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RCButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RCButtonMouseClicked(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 153));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        fedCatText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fedCatText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fedCatText.setText("It's Feeding Time!");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fedCatText, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fedCatText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginandregister/cat2.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BBButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(WhiskasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PurinaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HillButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(WhiskasButton)
                        .addGap(18, 18, 18)
                        .addComponent(PurinaButton)
                        .addGap(18, 18, 18)
                        .addComponent(HillButton)
                        .addGap(18, 18, 18)
                        .addComponent(BBButton)
                        .addGap(18, 18, 18)
                        .addComponent(RCButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 153, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Stats");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Happiness:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hunger:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("EXP:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("TTL:");

        HappyBar.setForeground(new java.awt.Color(255, 255, 153));

        HungBar.setForeground(new java.awt.Color(255, 255, 153));
        HungBar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                HungBarPropertyChange(evt);
            }
        });

        expBar.setForeground(new java.awt.Color(255, 255, 153));

        ttLBar.setForeground(new java.awt.Color(255, 255, 153));
        ttLBar.setMaximum(3600);
        ttLBar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ttLBarPropertyChange(evt);
            }
        });

        HappyNum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HappyNum.setForeground(new java.awt.Color(255, 255, 153));
        HappyNum.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        HappyNum.setText("0%");

        HungNum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HungNum.setForeground(new java.awt.Color(255, 255, 153));
        HungNum.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        HungNum.setText("0%");

        expNum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        expNum.setForeground(new java.awt.Color(255, 255, 153));
        expNum.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        expNum.setText("0");

        ttLNum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ttLNum.setForeground(new java.awt.Color(255, 255, 153));
        ttLNum.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ttLNum.setText("0 secs");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(expBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(expNum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ttLBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ttLNum, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(HappyNum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(HappyBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(HungNum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(HungBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(HappyNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HappyBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HungNum)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HungBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(expNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expBar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ttLNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ttLBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Level:");

        LevelNum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LevelNum.setText("1");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Munny:");
        jLabel15.setToolTipText("");

        MunnyNum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MunnyNum.setText("CM 0");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LevelNum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MunnyNum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(back)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(LevelNum)
                            .addComponent(jLabel15)
                            .addComponent(MunnyNum))
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WhiskasButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WhiskasButtonMouseClicked
//        int a = Integer.valueOf(u.data[4]); 
        
        //how to call?
        if (r.HUNGER > 0) {
            r.HUNGER -= 5;
//            HungBar.setValue((Integer.valueOf(u.data[0])));
            HungBar.setValue((int) r.HUNGER);
            HungNum.setText(Double.toString(r.HUNGER) + "%");
            fedCatText.setText("Yummy!");
        }
    }//GEN-LAST:event_WhiskasButtonMouseClicked

    private void PurinaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PurinaButtonMouseClicked
        if (r.MUNNY >= 5 && r.HUNGER > 0 && r.HAPPINESS < 100) {
            r.EXP+=5;
            r.HAPPINESS += 5;
            r.HUNGER -= 5;
            r.MUNNY -= 5;
            expBar.setValue((int) r.EXP);
            expNum.setText(Integer.toString((int) r.EXP));
            HappyBar.setValue((int) r.HAPPINESS);
            HappyNum.setText(Double.toString(r.HAPPINESS) + "%");
            HungBar.setValue((int) r.HUNGER);
            HungNum.setText(Double.toString(r.HUNGER) + "%");
            MunnyNum.setText("CM" + Double.toString(r.MUNNY));
            fedCatText.setText("Delicious!");
        }
    }//GEN-LAST:event_PurinaButtonMouseClicked

    private void HillButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HillButtonMouseClicked
        if (r.MUNNY >= 10 && r.HUNGER > 0 && r.HAPPINESS < 100 & r.TTL < 3600) {
            r.EXP+=5;
            r.HAPPINESS += 10;
            r.HUNGER -= 10;
            r.TTL += 30;
            r.MUNNY -= 10;
            expBar.setValue((int) r.EXP);
            expNum.setText(Integer.toString((int) r.EXP));
            HappyBar.setValue((int) r.HAPPINESS);
            HappyNum.setText(Double.toString(r.HAPPINESS) + "%");
            HungBar.setValue((int) r.HUNGER);
            HungNum.setText(Double.toString(r.HUNGER) + "%");
            ttLBar.setValue((int) r.TTL);
            ttLNum.setText(Long.toString(r.TTL) + " secs");
            MunnyNum.setText("CM" + Double.toString(r.MUNNY));
            fedCatText.setText("Mmmmm!");
        }
    }//GEN-LAST:event_HillButtonMouseClicked

    private void BBButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BBButtonMouseClicked
        if (r.MUNNY >= 50 && r.HUNGER > 0 && r.HAPPINESS < 100 & r.TTL < 3600) {
            r.EXP+=5;
            r.HAPPINESS += 15;
            r.HUNGER -= 15;
            r.TTL += 60;
            r.MUNNY -= 50;
            expBar.setValue((int) r.EXP);
            expNum.setText(Integer.toString((int) r.EXP));
            HappyBar.setValue((int) r.HAPPINESS);
            HappyNum.setText(Double.toString(r.HAPPINESS) + "%");
            HungBar.setValue((int) r.HUNGER);
            HungNum.setText(Double.toString(r.HUNGER) + "%");
            ttLBar.setValue((int) r.TTL);
            ttLNum.setText(Long.toString(r.TTL) + " secs");
            MunnyNum.setText("CM" + Double.toString(r.MUNNY));
            fedCatText.setText("Wowowowowow!");
        }
    }//GEN-LAST:event_BBButtonMouseClicked

    private void RCButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RCButtonMouseClicked
        if (r.MUNNY >= 100 && r.HUNGER > 0 && r.HAPPINESS < 100 & r.TTL < 3600) {
            r.EXP+=5;
            r.HAPPINESS += 20;
            r.HUNGER -= 20;
            r.TTL += 90;
            r.MUNNY -= 100;
            expBar.setValue((int) r.EXP);
            expNum.setText(Integer.toString((int) r.EXP));
            HappyBar.setValue((int) r.HAPPINESS);
            HappyNum.setText(Double.toString(r.HAPPINESS) + "%");
            HungBar.setValue((int) r.HUNGER);
            HungNum.setText(Double.toString(r.HUNGER) + "%");
            ttLBar.setValue((int) r.TTL);
            ttLNum.setText(Long.toString(r.TTL) + " secs");
            MunnyNum.setText("CM" + Double.toString(r.MUNNY));
            fedCatText.setText("Dapbiiii!");
        }
    }//GEN-LAST:event_RCButtonMouseClicked

    private void ttLBarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ttLBarPropertyChange
        if (r.HAPPINESS < 20 || r.HUNGER > 80) {
            Timer realtime = new Timer(5000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    r.HAPPINESS--;
                    expBar.setValue((int) r.EXP);
                    expNum.setText(Integer.toString((int) r.EXP));
                    HappyBar.setValue((int) r.HAPPINESS);
                    HappyNum.setText(Double.toString(r.HAPPINESS) + "%");
                    r.HUNGER++;
                    HungBar.setValue((int) r.HUNGER);
                    HungNum.setText(Double.toString(r.HUNGER) + "%");
                    r.TTL--;
                    ttLBar.setValue((int) r.TTL);
                    ttLNum.setText(Long.toString(r.TTL) + " secs");

                    if (r.TTL == 0) {
                        fedCatText.setText("Your cat died. Congratz! :D");
                    }
                }
            });
            realtime.start();
        } else if (r.HAPPINESS < 50 || r.HUNGER > 50) {
            Timer realtime = new Timer(7500, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    expBar.setValue((int) r.EXP);
                    expNum.setText(Integer.toString((int) r.EXP));
                    r.HAPPINESS--;
                    HappyBar.setValue((int) r.HAPPINESS);
                    HappyNum.setText(Double.toString(r.HAPPINESS) + "%");
                    r.HUNGER++;
                    HungBar.setValue((int) r.HUNGER);
                    HungNum.setText(Double.toString(r.HUNGER) + "%");
                    r.TTL--;
                    ttLBar.setValue((int) r.TTL);
                    ttLNum.setText(Long.toString(r.TTL) + " secs");
                }
            });
            realtime.start();
        } else {
            Timer realtime = new Timer(10000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    r.HAPPINESS--;
                    HappyBar.setValue((int) r.HAPPINESS);
                    HappyNum.setText(Double.toString(r.HAPPINESS) + "%");
                    r.HUNGER++;
                    HungBar.setValue((int) r.HUNGER);
                    HungNum.setText(Double.toString(r.HUNGER) + "%");
                    r.TTL--;
                    ttLBar.setValue((int) r.TTL);
                    ttLNum.setText(Long.toString(r.TTL) + " secs");
                }
            });
            realtime.start();
        }
    }//GEN-LAST:event_ttLBarPropertyChange

    private void HungBarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_HungBarPropertyChange

    }//GEN-LAST:event_HungBarPropertyChange

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
//        u.forsave(username, r.TTL, r.HUNGER, r.HAPPINESS, r.MUNNY, r.LEVEL, r.EXP);
        dispose();
        Main m = new Main();
        m.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void WhiskasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WhiskasButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_WhiskasButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Feeding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feeding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feeding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feeding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feeding().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BBButton;
    public javax.swing.JProgressBar HappyBar;
    private javax.swing.JLabel HappyNum;
    public javax.swing.JButton HillButton;
    public javax.swing.JProgressBar HungBar;
    private javax.swing.JLabel HungNum;
    private javax.swing.JLabel LevelNum;
    public javax.swing.JLabel MunnyNum;
    public javax.swing.JButton PurinaButton;
    public javax.swing.JButton RCButton;
    public javax.swing.JButton WhiskasButton;
    private javax.swing.JButton back;
    public javax.swing.JProgressBar expBar;
    private javax.swing.JLabel expNum;
    public javax.swing.JLabel fedCatText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JProgressBar ttLBar;
    private javax.swing.JLabel ttLNum;
    // End of variables declaration//GEN-END:variables
}
