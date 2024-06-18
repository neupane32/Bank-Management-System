/**
 * Write a description of class BankCardGUI here.
 *
 * @author (Aashish Neupane)
 * @collage Id (NP05CP4A220004)
 */

 import java.awt.*;
 import java.awt.Font;
 import java.awt.event.*;
 import javax.swing.*;
 import javax.swing.border.Border;
 import javax.swing.border.TitledBorder;
 import java.util.ArrayList;
 
 public class BankCardGUI { //creating a class BankCardGUI
 
     //creatingframe
     private JFrame BankGUI;
     
     //creating JPanel to hold the data of DebitCard and CreditCard
     private JPanel panelDebit, panelCredit,panelWithDraw,panelSetCredit,panelCancelCredit;
     
    //creating label for instance variable
     private JLabel label_Heading, label1, label2, label3, label4, label5, label6, label7_W,label7_c, label8, label9, label10, 
                    label11, label12, label13, label14, label15, label16, label17, label18,label18_SetC, label19,label20;
                    
    //creating Text field to enter data in variable                
    private JTextField field1, field2, field3, field4, field5, field6, field7_W,field7_c, field8, field10, field11, field12,
                       field13, field14, field15, field16, field18,field18_SetC, field19,field20;
                       
    //making combo box for dateOfWithdrawl and expirationDate
    private JComboBox box, box1, box2, box3, box4, box5;
    
    //creating button for each panel
    private JButton button1, button2, button3, buttonDisp, buttonDisp_C, buttonDisp_D, button_D, button4, 
                    button4_w, button5,button6, button7, button7_R, button8, button9;
    // for titleBorder and lineBorede of panel                
    private Border titledBorder_D, lineBorder_D,titled1Border_C,titled1Border_SetC,
                   titled1Border_CancelC,line1Border_C,line1Border_CancelC,line1Border_SetC;
                   
    // for titleFont of panel               
    private Font  titleFont_D,titleFont_C,titleFont_SetC,titleFont_CancelC;
    
    //initilizing variable with datatype integer as -1
    static final int INVALID = -1;
 
     //creating ArrayList
     private ArrayList<BankCard> list = new ArrayList<BankCard>();
     
    //Arrays of Withdrawal Date  for dateOfWithdraw
    private String[] year_Withdraw = { "Year", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999",
            "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012",
            "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023"};
            
    //Arrays for withdaraw Month for dateOfWithdtaw        
    private String[] month_Withdraw = {"Month", "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Agu", "Sep", "Nov", "Dec"};
    
    //Arrays for Withdraw day for dateOfWithdraw
    private String[] day_Withdraw = {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
            
    //Arrays of year for Expiration Date
    private String[] year_Expiration = { "Year", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999",
            "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012",
            "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023"};
            
    //Arrays of Months for Expiration Date        
    private String[] month_Expiration = {"Month", "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Agu", "Sep", "Nov", "Dec"};

    //Arrays of day for Expiration Date
    private String[] day_Expiration = {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
 
     //creating a constructor of respective class
      public BankCardGUI() {
         BankGUI = new JFrame();
         BankGUI.setTitle("BankCard GUI");
         BankGUI.setSize(1000, 1000);
         BankGUI.setLayout(null);
         BankGUI.setLocationRelativeTo(null);
         BankGUI.getContentPane().setBackground(Color.lightGray);
 
 
         //label for heading
         label_Heading = new JLabel("Bank Card");
         label_Heading.setFont(new Font("Arial", Font.BOLD, 28));
         label_Heading.setBounds(430, 1, 500, 50);
         label_Heading.setBackground(Color.red);
         BankGUI.add(label_Heading);
 
         //creating panel for DebitCard
         panelDebit = new JPanel();
         panelDebit.setSize(390, 325);
         panelDebit.setLocation(100, 50);
         panelDebit.setLayout(null);
         panelDebit.setBackground(Color.cyan);
         
         titleFont_D = new Font(Font.SERIF,Font.BOLD,15);
         lineBorder_D = BorderFactory.createLineBorder(Color.black);
         titledBorder_D = BorderFactory.createTitledBorder(lineBorder_D,"DebitCard Panel",TitledBorder.CENTER,TitledBorder.TOP,titleFont_D,Color.black);
         panelDebit.setBorder(titledBorder_D);
         BankGUI.add(panelDebit);
 
         //Adding label1 for debit card i.e. CardID
         label1 = new JLabel("CardID");
         label1.setBounds(20, 20, 50, 40);
         label1.setFont(new Font("Arial", Font.ITALIC, 16));
         panelDebit.add(label1);
 
         //adding feild1 for CardID
         field1 = new JTextField();
         field1.setBounds(150, 30, 200, 25);
         field1.setFont(new Font("Arial", Font.ITALIC, 15));
         panelDebit.add(field1);
 
         //adding label2 for debit card i.e.clientName
         label2 = new JLabel("ClientName");
         label2.setBounds(20, 60, 100, 40);
         label2.setFont(new Font("Arial", Font.ITALIC, 16));
         panelDebit.add(label2);
 
         //adding field2 for clientName
         field2 = new JTextField();
         field2.setBounds(150, 70, 200, 25);
         field2.setFont(new Font("Arial", Font.ITALIC, 15));
         panelDebit.add(field2);
 
         //adding label3 for debit card i.e. BankAccount
         label3 = new JLabel("bankAccount");
         label3.setBounds(20, 100, 100, 40);
         label3.setFont(new Font("Arial", Font.ITALIC, 16));
         panelDebit.add(label3);
 
         //adding field3 for bankAccount
         field3 = new JTextField();
         field3.setBounds(150, 110, 200, 25);
         field3.setFont(new Font("Arial", Font.ITALIC, 15));
         panelDebit.add(field3);
 
         //adding label4 for debit card i.e. balanceAmout
         label4 = new JLabel("balanceAmout");
         label4.setBounds(20, 140, 130, 40);
         label4.setFont(new Font("Arial", Font.ITALIC, 16));
         panelDebit.add(label4);
 
         //adding field4 for balanceAmout
         field4 = new JTextField();
         field4.setBounds(150, 150, 200, 25);
         field4.setFont(new Font("Arial", Font.ITALIC, 15));
         panelDebit.add(field4);
 
         //adding label5 for debit card i.e. issuerBank
         label5 = new JLabel("issuerBank");
         label5.setBounds(20, 180, 100, 40);
         label5.setFont(new Font("Arial", Font.ITALIC, 16));
         panelDebit.add(label5);
 
         //adding field5 for issuerBank
         field5 = new JTextField();
         field5.setBounds(150, 190, 200, 25);
         field5.setFont(new Font("Arial", Font.ITALIC, 15));
         panelDebit.add(field5);
 
         //adding label6 for debit card i.e. pinNumber
         label6 = new JLabel("pinNumber");
         label6.setBounds(20, 220, 100, 40);
         label6.setFont(new Font("Arial", Font.ITALIC, 16));
         panelDebit.add(label6);
 
         //adding filed6 for pinNumber
         field6 = new JTextField();
         field6.setBounds(150, 230, 200, 25);
         field6.setFont(new Font("Arial", Font.ITALIC, 15));
         panelDebit.add(field6);
 
         //button1 for AddDebit
         button1 = new JButton("Add Debit");
         button1.setBounds(15, 280, 120, 20);
         button1.setFont(new Font("Arial", Font.ITALIC, 17));
         panelDebit.add(button1);
 
         //AddDebit with ActionListner
         button1.addActionListener(
                 new ActionListener() {
                     public void actionPerformed(ActionEvent a) {
                         addDebit();
                     }
                 }
         );
 
         //button to display_D AddDebit details
         buttonDisp_D = new JButton("Display_D");
         buttonDisp_D.setBounds(145, 280, 120, 20);
         buttonDisp_D.setFont(new Font("Arial", Font.ITALIC, 17));
         panelDebit.add(buttonDisp_D);
 
 
         //action listener for button display_D
         buttonDisp_D.addActionListener(
                 new ActionListener() {
                     public void actionPerformed(ActionEvent b) {
                         boolean result = false;
                         for (BankCard obj_D : list){
                         if (obj_D instanceof DebitCard){
                         DebitCard dc = (DebitCard) obj_D;
                         dc.display();
                         result = true;
                        }
                     }
                     if(result){
                     JOptionPane.showMessageDialog(panelDebit,"DebitCard Successfully displayed. Please Checkout in terminal.","display",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
             }
           );
         //button to reset AddDebit details
         button2 = new JButton("Reset");
         button2.setBounds(275, 280, 100, 20);
         button2.setFont(new Font("Arial", Font.ITALIC, 17));
         panelDebit.add(button2);
 
         //Reseting using ActionListner
         button2.addActionListener(
                 new ActionListener() {
                     public void actionPerformed(ActionEvent b) {
                         if (b.getSource() == button2) {
                             field1.setText("");
                             field2.setText("");
                             field3.setText("");
                             field4.setText("");
                             field5.setText("");
                             field6.setText("");
                         }
                     }
                 }
         );
         
         //creating panel for WithDraw
         panelWithDraw= new JPanel();
         panelWithDraw.setSize(450, 325);
         panelWithDraw.setLocation(490, 50);
         panelWithDraw.setLayout(null);
         panelWithDraw.setBackground(Color.cyan);
 
         titleFont_D = new Font(Font.SERIF,Font.BOLD,15);
         lineBorder_D= BorderFactory.createLineBorder(Color.black);
         titledBorder_D = BorderFactory.createTitledBorder(lineBorder_D,"WithDraw Panel",TitledBorder.CENTER,TitledBorder.TOP,titleFont_D,Color.black);
         panelWithDraw.setBorder(titledBorder_D);
         BankGUI.add(panelWithDraw);
         
         //label7_c for cardId in withdraw panel
         label7_c = new JLabel("Card ID");
         label7_c.setBounds(80, 20, 100, 40);
         label7_c.setFont(new Font("Arial", Font.ITALIC, 16));
         panelWithDraw.add(label7_c);
 
         //adding filed7_c for card ID in withdraw panel
         field7_c = new JTextField();
         field7_c.setBounds(220, 30, 200, 25);
         field7_c.setFont(new Font("Arial", Font.ITALIC, 15));
         panelWithDraw.add(field7_c);
 
        //adding label7_W for debit card i.e. pinNumber
         label7_W = new JLabel("pinNumber");
         label7_W.setBounds(80, 60, 100, 40);
         label7_W.setFont(new Font("Arial", Font.ITALIC, 16));
         panelWithDraw.add(label7_W);
 
         //adding filed7_W for pinNumber
         field7_W = new JTextField();
         field7_W.setBounds(220, 70, 200, 25);
         field7_W.setFont(new Font("Arial", Font.ITALIC, 15));
         panelWithDraw.add(field7_W);
 
         //adding label8 for debit card i.e. WithdrawlAmout
         label8 = new JLabel("WithdrawlAmout");
         label8.setBounds(80, 100, 150, 40);
         label8.setFont(new Font("Arial", Font.ITALIC, 16));
         panelWithDraw.add(label8);
 
         //adding field8 for withdrawlAmout
         field8 = new JTextField();
         field8.setBounds(220, 110, 200, 25);
         field8.setFont(new Font("Arial", Font.ITALIC, 15));
         panelWithDraw.add(field8);
 
         //adding label9 for debit card i.e. dateOfWithdrawl
         label9 = new JLabel("dateOfWithdrawl");
         label9.setBounds(80, 140, 150, 40);
         label9.setFont(new Font("Arial", Font.ITALIC, 16));
         panelWithDraw.add(label9);
 
         //adding combo box for year
         box = new JComboBox<>(year_Withdraw);
         box.setBounds(220, 150, 80, 30);
         box.setFont(new Font("Arial", Font.ITALIC, 15));
         panelWithDraw.add(box);
 
         //making combobox of month
         box1 = new JComboBox<>(month_Withdraw);
         box1.setBounds(305, 150, 75, 30);
         box1.setFont(new Font("Arial", Font.ITALIC, 15));
         panelWithDraw.add(box1);
 
         //making combobox of day
         box2 = new JComboBox<>(day_Withdraw);
         box2.setBounds(385, 150, 60, 30);
         box2.setFont(new Font("Arial", Font.ITALIC, 15));
         panelWithDraw.add(box2);
         
         // adding button3 for withdraw
         button3 = new JButton("WithDraw");
         button3.setBounds(200, 200, 170, 20);
         button3.setFont(new Font("Arial", Font.ITALIC, 17));
         panelWithDraw.add(button3);
 
     //action listener for withdrawal button
         button3.addActionListener(
             new ActionListener() {
                 public void actionPerformed(ActionEvent W) {
                   debitWithdraw();
             }
         }
     );
        //button to reset Withdraw Method field
         button4_w = new JButton("Reset_WithDraw");
         button4_w.setBounds(200, 245, 170, 20);
         button4_w.setFont(new Font("Arial", Font.ITALIC, 17));
         panelWithDraw.add(button4_w);
 
         //Reseting using ActionListner
         button4_w.addActionListener(
                 new ActionListener() {
                     public void actionPerformed(ActionEvent W) {
                         if (W.getSource() == button4_w) {
                             field7_W.setText("");
                             field7_c.setText("");
                             field8.setText("");
 
                             box.setSelectedIndex(0);
                             box1.setSelectedIndex(0);
                             box2.setSelectedIndex(0);
                         }
                     }
                 }
         );
 
         //button to reset all the details of debitCard
         button4 = new JButton("Reset All_D");
         button4.setBounds(270, 290, 150, 20);
         button4.setFont(new Font("Arial", Font.ITALIC, 17));
         panelWithDraw.add(button4);
 
         //action listener of reset button for overall reset on Debit_Card_Panel
         button4.addActionListener(
                 new ActionListener() {
                     public void actionPerformed(ActionEvent d) {
                         //reseting the text field
                         field1.setText("");
                         field2.setText("");
                         field3.setText("");
                         field4.setText("");
                         field5.setText("");
                         field6.setText("");
                         field7_W.setText("");
                         field7_c.setText("");
                         field8.setText("");
 
                         //reseting the combobox
                         box.setSelectedIndex(0);
                         box1.setSelectedIndex(0);
                         box2.setSelectedIndex(0);
                     }
                 }
         );
         //adding display button for withdraw
         buttonDisp = new JButton("Display");
         buttonDisp.setBounds(40, 290, 150, 20);
         buttonDisp.setFont(new Font("Arial", Font.ITALIC, 17));
         panelWithDraw.add(buttonDisp);
 
         //action listener for display button
         buttonDisp.addActionListener(
             new ActionListener() {
                 public void actionPerformed(ActionEvent e) {
                     boolean result = false;
                     for (BankCard obj_W : list){
                     if(obj_W instanceof DebitCard){
                         DebitCard dc = (DebitCard) obj_W;
                         dc.display();
                         result = true;
                 }
             }
             if(result){
             JOptionPane.showMessageDialog(panelWithDraw,"Withdrawal Successfully displayed. Please Checkout in terminal.","display",JOptionPane.INFORMATION_MESSAGE);
 
            }
         }
      }
   );
   
         /*   End Of debitCard Panel!!!
          *   In debit card panel there is labe1 - label9 with field1 -  field8 and box,box1 and box2 to represent the date for Withdrawal.
          *   Similarly, there is button1, button2, button3 and button4 for AddCreditCard,ResetCreditCard,Withdraw and Reset all button respectively.
          */
 
         //Moving to second panel i.e. CreditCardPanel
         panelCredit = new JPanel();
         panelCredit.setSize(390, 380);
         panelCredit.setLocation(100, 400);
         panelCredit.setLayout(null);
         panelCredit.setBackground(Color.magenta);
 
         titleFont_C = new Font(Font.SERIF,Font.BOLD,15);
         line1Border_C = BorderFactory.createLineBorder(Color.black);
         titled1Border_C = BorderFactory.createTitledBorder(line1Border_C,"CreditCard Panel",TitledBorder.CENTER,TitledBorder.TOP,titleFont_C,Color.black);
         panelCredit.setBorder(titled1Border_C);
         BankGUI.add(panelCredit);
 
         //Adding label10 for debit card i.e. CardID
         label10 = new JLabel("CardID");
         label10.setBounds(20, 20, 50, 40);
         label10.setFont(new Font("Arial", Font.ITALIC, 16));
         panelCredit.add(label10);
 
         //adding field10 for CardID
         field10 = new JTextField();
         field10.setBounds(150, 30, 200, 25);
         field10.setFont(new Font("Arial", Font.ITALIC, 15));
         panelCredit.add(field10);
 
         //adding label11 for debit card i.e.clientName
         label11 = new JLabel("ClientName");
         label11.setBounds(20, 60, 100, 40);
         label11.setFont(new Font("Arial", Font.ITALIC, 16));
         panelCredit.add(label11);
 
         //adding field11 for clientName
         field11 = new JTextField();
         field11.setBounds(150, 70, 200, 25);
         field11.setFont(new Font("Arial", Font.ITALIC, 15));
         panelCredit.add(field11);
 
         //adding label12 for debit card i.e. BankAccount
         label12 = new JLabel("bankAccount");
         label12.setBounds(20, 100, 100, 40);
         label12.setFont(new Font("Arial", Font.ITALIC, 16));
         panelCredit.add(label12);
 
         //adding filed12  for bankAccount
         field12 = new JTextField();
         field12.setBounds(150, 110, 200, 25);
         field12.setFont(new Font("Arial", Font.ITALIC, 15));
         panelCredit.add(field12);
 
         //adding label13 for debit card i.e. balanceAmout
         label13 = new JLabel("balanceAmout");
         label13.setBounds(20, 140, 120, 40);
         label13.setFont(new Font("Arial", Font.ITALIC, 16));
         panelCredit.add(label13);
 
         //adding field13 for balanceAmout
         field13 = new JTextField();
         field13.setBounds(150, 150, 200, 25);
         field13.setFont(new Font("Arial", Font.ITALIC, 15));
         panelCredit.add(field13);
 
         //adding label14 for debit card i.e. issuerBank
         label14 = new JLabel("issuerBank");
         label14.setBounds(20, 180, 100, 40);
         label14.setFont(new Font("Arial", Font.ITALIC, 16));
         panelCredit.add(label14);
 
         //adding filed14 for issuerBank
         field14 = new JTextField();
         field14.setBounds(150, 190, 200, 25);
         field14.setFont(new Font("Arial", Font.ITALIC, 15));
         panelCredit.add(field14);
 
         //adding label15 for credit card i.e. CVCNumber
         label15 = new JLabel("CVCNumber");
         label15.setBounds(20, 220, 100, 40);
         label15.setFont(new Font("Arial", Font.ITALIC, 16));
         panelCredit.add(label15);
 
         //adding field15 for CVCNumber
         field15 = new JTextField();
         field15.setBounds(150, 230, 200, 25);
         field15.setFont(new Font("Arial", Font.ITALIC, 15));
         panelCredit.add(field15);
 
         //adding label16 for credit card i.e. intrestRate
         label16 = new JLabel("intrestRate");
         label16.setBounds(20, 260, 100, 40);
         label16.setFont(new Font("Arial", Font.ITALIC, 16));
         panelCredit.add(label16);
 
         //adding field16 for intrestRate
         field16 = new JTextField();
         field16.setBounds(150, 270, 200, 25);
         field16.setFont(new Font("Arial", Font.ITALIC, 15));
         panelCredit.add(field16);
 
         //adding label17 for expiration Date
         label17 = new JLabel("expirationDate");
         label17.setBounds(20, 300, 120, 40);
         label17.setFont(new Font("Arial", Font.ITALIC, 16));
         panelCredit.add(label17);
 
         //for Year of Expiration Date
         box3 = new JComboBox<>(year_Expiration);
         box3.setBounds(130, 310, 80, 30);
         box3.setFont(new Font("Arial", Font.ITALIC, 16));
         panelCredit.add(box3);
 
        //for month of Expiration date
         box4 = new JComboBox<>(month_Expiration);
         box4.setBounds(225, 310, 80, 30);
         box4.setFont(new Font("Arial", Font.ITALIC, 16));
         panelCredit.add(box4);
 
         //for day of Expiration date
         box5 = new JComboBox<>(day_Expiration);
         box5.setBounds(315, 310, 65, 30);
         box5.setFont(new Font("Arial", Font.ITALIC, 16));
         panelCredit.add(box5);
         
         //button5 to Add credit Card
         button5 = new JButton("Add Credit");
         button5.setBounds(10, 350, 120, 25);
         button5.setFont(new Font("Arial", Font.ITALIC, 15));
         panelCredit.add(button5);
 
         //buttonDisp_C to Add credit Card
         buttonDisp_C = new JButton("Display_c");
         buttonDisp_C.setBounds(150, 350, 110, 25);
         buttonDisp_C.setFont(new Font("Arial", Font.ITALIC, 15));
         panelCredit.add(buttonDisp_C);
         
         //action listener for add credit
         button5.addActionListener(
                 new ActionListener() {
                     public void actionPerformed(ActionEvent e) {
                         addCredit();
                     }
                 }
         );
 
         //Action Listener for Button of Display Credit
         buttonDisp_C.addActionListener(new ActionListener() {
 
         public void actionPerformed(ActionEvent e) {
             boolean result = false;
             for (BankCard obj : list){
                 if(obj instanceof CreditCard){
                     CreditCard c_obj = (CreditCard) obj;
                     c_obj.display();
                     result = true;
                 }
             }
             if(result){
             JOptionPane.showMessageDialog(panelCredit,"CreditCard successfully displayed.","display",JOptionPane.INFORMATION_MESSAGE);
           }
         }
     }   
 );
         //BUTTON TO Reset Add CreditCard values
         button6 = new JButton("Reset");
         button6.setBounds(280, 350, 100, 25);
         button6.setFont(new Font("Arial", Font.ITALIC, 15));
         panelCredit.add(button6);
 
         button6.addActionListener(
                 new ActionListener() {
                     public void actionPerformed(ActionEvent f) {
                         field10.setText("");
                         field11.setText("");
                         field12.setText("");
                         field13.setText("");
                         field14.setText("");
                         field15.setText("");
                         field16.setText("");
 
 
                         //reseting the combobox
                         box3.setSelectedIndex(0);
                         box4.setSelectedIndex(0);
                         box5.setSelectedIndex(0);
                     }
                 }
         );
         
         //making panel for Set Credit
         panelSetCredit = new JPanel();
         panelSetCredit.setSize(450, 190);
         panelSetCredit.setLocation(490, 400);
         panelSetCredit.setLayout(null);
         panelSetCredit.setBackground(Color.magenta);
 
         titleFont_SetC = new Font(Font.SERIF,Font.BOLD,15);
         line1Border_SetC = BorderFactory.createLineBorder(Color.black);
         titled1Border_SetC = BorderFactory.createTitledBorder(line1Border_SetC,"Set Credit Panel",TitledBorder.CENTER,TitledBorder.TOP,titleFont_SetC,Color.black);
         panelSetCredit.setBorder(titled1Border_SetC);
         BankGUI.add(panelSetCredit);
 
         //adding label18 for credit card i.e. Card ID
         label18_SetC = new JLabel("Card ID");
         label18_SetC.setBounds(50, 25, 120, 40);
         label18_SetC.setFont(new Font("Arial", Font.ITALIC, 16));
         panelSetCredit.add(label18_SetC);
         
         //adding field18 for Card ID
         field18_SetC = new JTextField();
         field18_SetC.setBounds(180, 35, 200, 25);
         field18_SetC.setFont(new Font("Arial", Font.ITALIC, 15));
         panelSetCredit.add(field18_SetC);
 
         //adding label18 for credit card i.e. gracePeriod
         label18 = new JLabel("gracePeriod");
         label18.setBounds(50, 60, 120, 40);
         label18.setFont(new Font("Arial", Font.ITALIC, 16));
         panelSetCredit.add(label18);
 
         //adding field18 for graceperiod
         field18 = new JTextField();
         field18.setBounds(180, 70, 200, 25);
         field18.setFont(new Font("Arial", Font.ITALIC, 15));
         panelSetCredit.add(field18);
 
         //adding label19 for credit card i.e. creditLimit
         label19 = new JLabel("CreditLimit");
         label19.setBounds(50, 100, 120, 40);
         label19.setFont(new Font("Arial", Font.ITALIC, 16));
         panelSetCredit.add(label19);
 
         //adding field19 for creditLimit
         field19 = new JTextField();
         field19.setBounds(180, 110, 200, 25);
         field19.setFont(new Font("Arial", Font.ITALIC, 16));
         panelSetCredit.add(field19);
         
         //button to reset credit Limit
         button7_R = new JButton("Reset Set_Credit");
         button7_R.setBounds(270, 150, 160, 25);
         button7_R.setFont(new Font("Arial", Font.ITALIC, 15));
         panelSetCredit.add(button7_R);
 
         //Reset the values of Set Credit using ActionListner
         button7_R.addActionListener(
                 new ActionListener() {
                     public void actionPerformed(ActionEvent R) {
                         field18.setText("");
                         field19.setText("");
                     }
                 }
         );
 
         //button to add setCreditLimit
         button8 = new JButton("Set Credit_Limit");
         button8.setBounds(20, 150, 180, 25);
         button8.setFont(new Font("Arial", Font.ITALIC, 16));
         panelSetCredit.add(button8);
 
         //action listener for set credit limit button
         button8.addActionListener(
                 new ActionListener() {
                     public void actionPerformed(ActionEvent g) {
                         Set_CreditLimit();
                     }
                 }
         );
         
         //making panel for Cancel Credit
         panelCancelCredit = new JPanel();
         panelCancelCredit.setSize(450, 190);
         panelCancelCredit.setLocation(490, 590);
         panelCancelCredit.setLayout(null);
         panelCancelCredit.setBackground(Color.magenta);
         
         titleFont_CancelC = new Font(Font.SERIF,Font.BOLD,15);
         line1Border_CancelC = BorderFactory.createLineBorder(Color.black);
         titled1Border_CancelC = BorderFactory.createTitledBorder(line1Border_CancelC,"Cancel Credit Panel",TitledBorder.CENTER,TitledBorder.TOP,titleFont_CancelC,Color.black);
         panelCancelCredit.setBorder(titled1Border_CancelC);
         BankGUI.add(panelCancelCredit);
 
          //adding label20 for credit card i.e. Card Id for Cancel Credit
          label20 = new JLabel("Card ID");
          label20.setBounds(50, 50, 120, 40);
          label20.setFont(new Font("Arial", Font.ITALIC, 17));
          panelCancelCredit.add(label20);
  
          //adding field20 for Card ID of Cancel Credit
          field20 = new JTextField();
          field20.setBounds(140, 60, 200, 25);
          field20.setFont(new Font("Arial", Font.ITALIC, 16));
          panelCancelCredit.add(field20);
 
         //button9 to cancel Credit_Limit
         button9 = new JButton("Cancel Credit_Limit");
         button9.setBounds(140, 120, 200, 25);
         button9.setFont(new Font("Arial", Font.ITALIC, 15));
         panelCancelCredit.add(button9);
         
         //action listener for cancel credit limit button
         button9.addActionListener(
             new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                Cancel_CreditLimit();
         }
     }
 );
      BankGUI.setVisible(true);
     /*End of CreditCard Panel!!!
       * In credit card panel there is label10 - label19 with field10 - field19 and box3 - box5 to represent Date of expiration.
         similarly, button5 - button9 to AddCredit, Reset Credit, Reset All Credit panel, set Credit_Limit and cancel Credit_Limit respectively.
       */
     
 }
 
     //making method CHECK_CARD_ID_UNIQUE for Debit Card
     public boolean checkDebitCardIdUnique(int cardid) {
         boolean result = true;
         for (BankCard obj : list) {
             //for debit card
             if(obj instanceof DebitCard) {
                 DebitCard dc = (DebitCard) obj;
                 if (dc.getCardID() == cardid) {
                     result = false;
                 }
             }
         }
         return result;
     }
    
     //making method CHECK_CARD_ID_UNIQUE For Credit Card
     public boolean checkCreditCardIdUnique(int cardid) {
         boolean result = true;
         for (BankCard obj : list) {
             //for debit card
             if(obj instanceof CreditCard) {
                 CreditCard cc = (CreditCard) obj;
                 if (cc.getCardID() == cardid) {
                     result = false;
                     
                 }
             }
         }
         return result;
     }
 
     
 /*
  * Getter Methods for panel 'panelDebit' that includes cardID,clientName
  * issuerBank,bankAccount and pinNumber respectively.
  */
     //getter method for CardID
     public int getCardID() {
         String ID = field1.getText().trim();
         int CardID = INVALID;
         try {
             CardID = Integer.parseInt(ID);
             if (CardID <= 0) {
                 CardID = INVALID;
             }
         } catch (NumberFormatException ref) {
             JOptionPane.showMessageDialog(
                     panelDebit,
                     "You inserted an invalid message into Card ID.",
                     "Error",
                     JOptionPane.ERROR_MESSAGE
             );
         }
         return CardID;
     }
 
     //getter method for Client Name
     public String getClientName() {
         return field2.getText().trim();
     }
 
     //getter method for BankAccount
     public String getBankAccount() {
         return field3.getText().trim();
     }
     //getter method for Balance Amount
     public int getBalanceAmout() {
         String balance = field4.getText().trim();
         int balanceAmout = INVALID;
         try {
             balanceAmout = Integer.parseInt(balance);
             if (balanceAmout < 0) {
                 balanceAmout = INVALID;
             }
         } catch (NumberFormatException ref1) {
             JOptionPane.showMessageDialog(
                     panelDebit,
                     "You inserted an invalid message into Balance Amount.",
                     "Wrong",
                     JOptionPane.ERROR_MESSAGE
             );
          }
         return balanceAmout;
     }
 
     //getter method for IssuerBank
     public String getIssuerBank() {
         return field5.getText().trim();
     }
 
     public int getPinNumber() {
         String pin = field6.getText().trim();
         int pinNumber = INVALID;
         try {
             pinNumber = Integer.parseInt(pin);
             if (pinNumber < 0) {
                 pinNumber = INVALID;
             }
         } catch (NumberFormatException ref3) {
             JOptionPane.showMessageDialog(
                     panelDebit,
                     "You inserted an invalid message into Pin Number.",
                     "Invalid",
                     JOptionPane.ERROR_MESSAGE
             );
         }
         return pinNumber;
     }
     
     // This is the method for Add Debit in panelDebit 
      public void addDebit() {
         //calling getter methods of clientName,bankAccount and issuerBank  
         String clientName = getClientName();
         String bankAccount = getBankAccount();
         String issuerBank = getIssuerBank();
         if (clientName.isEmpty() || bankAccount.isEmpty() || issuerBank.isEmpty()) {
             JOptionPane.showMessageDialog(
                     panelDebit,
                     "Please! Fill up each and every single field.",
                     "Error",
                     JOptionPane.ERROR_MESSAGE
             );
             return;
     }
          //calling Getter Method of cardID
         int cardid = getCardID();
         if (cardid == INVALID) {
             JOptionPane.showMessageDialog(
                     panelDebit,
                     "Card ID must be greater than or equal to 0 i.e. " + cardid,
                     "Wrong",
                     JOptionPane.ERROR_MESSAGE
             );
       return;
     }
         //calling Getter Method of balanceAmount
         int balanceAmout = getBalanceAmout();
         if (balanceAmout == INVALID) {
             JOptionPane.showMessageDialog(
                     panelDebit,
                     "Balance Amount must be greater than or equal to 0 i.e. " + balanceAmout,
                     "Wrong",
                     JOptionPane.ERROR_MESSAGE
             );
       return;
     }
         //calling Getter Method of pinNumber
         int pinNumber = getPinNumber();
         if (pinNumber == INVALID) {
             JOptionPane.showMessageDialog(
                     panelDebit,
                     "Pin Number must be greater than or equal to 0 i.e. " + pinNumber,
                     "Error",
                     JOptionPane.ERROR_MESSAGE
             );
         return;
     }

     //Method to call cardIdUnique
     boolean result = checkDebitCardIdUnique(cardid);
        if(result == true){
             DebitCard obj = new DebitCard(pinNumber,clientName, cardid, balanceAmout, issuerBank, bankAccount);
             list.add(obj);
             JOptionPane.showMessageDialog(panelDebit,"Introduced object to arraylist","store object",JOptionPane.INFORMATION_MESSAGE);
        }
        else {
             JOptionPane.showMessageDialog(panelDebit,"Card ID should be unique","not unique",JOptionPane.ERROR_MESSAGE);
             
        }
     }

     //GETTERS METHOD FOR WITHDRAW
 
     //getter method for Card ID of withdraw Panel
     public int getCardID_W() {
         String cardID_W = field7_c.getText().trim();
         int id_W = INVALID;
         try {
             id_W = Integer.parseInt(cardID_W);
             if (id_W <= 0) {
                 id_W = INVALID;
             }
         } catch (NumberFormatException ref4) {
             JOptionPane.showMessageDialog(
                     panelWithDraw,
                     "Please only inset the valid Pin only.",
                     "Error",
                     JOptionPane.ERROR_MESSAGE
             );
         }
         return id_W;
     }
 
     //getter method for Pin Number of Withdraw
     public int getPinNumber_W() {
         String pinNumber_W = field7_W.getText().trim();
         int number = INVALID;
         try {
             number = Integer.parseInt(pinNumber_W);
             if (number <= 0) {
                 number = INVALID;
             }
         } catch (NumberFormatException ref4) {
             JOptionPane.showMessageDialog(
                     panelWithDraw,
                     "Please only inset the valid Pin only.",
                     "Error",
                     JOptionPane.ERROR_MESSAGE
             );
         }
         return number;
     }
 
     //getter method for Withdrawal Amount
     public int getWithdrawlAmout() {
         String WithdrawlAmout_W = field8.getText().trim();
         int Amount = INVALID;
         try {
             Amount = Integer.parseInt(WithdrawlAmout_W);
             if (Amount <= 0) {
                 Amount = INVALID;
             }
         } catch (NumberFormatException ref5) {
             JOptionPane.showMessageDialog(
                     panelWithDraw,
                     "You inserted an invalid message in WithDrawal Amount.",
                     "Wrong",
                     JOptionPane.ERROR_MESSAGE
             );
         }
         return Amount;
     }
     
     //getter method for dateOfWithdrawal
     public String getDateOfWithdrawl() {
         String date = "";
         String object = box.getSelectedItem().toString();
         String object1 = box1.getSelectedItem().toString();
         String object2 = box2.getSelectedItem().toString();
         if(object.equals("year") || object1.equals("Month") || object2.equals("Day")){
             date = null;
 
         }
         else{
             date = object+"-"+object1+"-"+object2;
         }
         return date;
     }
     
     // Method for debitWithdraw in panelWithdraw
     public void debitWithdraw(){
         int cardID =  getCardID_W();
         if(cardID == INVALID){
             JOptionPane.showMessageDialog(panelWithDraw,"Card cannot be equal or less than 0","Invalid", JOptionPane.ERROR_MESSAGE);
             return;
         }
 
         int pin_W =  getPinNumber_W();
         if(pin_W==INVALID){
             JOptionPane.showMessageDialog(panelWithDraw,"Pin Number cannot be equal or less than 0","Invalid", JOptionPane.ERROR_MESSAGE);
             return;
         }
         int Amount_W = getWithdrawlAmout();
         if(Amount_W==INVALID){
             JOptionPane.showMessageDialog(panelWithDraw,"Withdrawal Amount must be equal or more than 0","Error", JOptionPane.ERROR_MESSAGE);
             return;
         }
 
         String date = getDateOfWithdrawl();
         if(date == null){
             JOptionPane.showMessageDialog(panelWithDraw,"Kindly Requested to selcet the WithDrawal Date, Thank You! ","Wrong", JOptionPane.ERROR_MESSAGE);
             return;
         }
         
         boolean isFound = false;
         for(BankCard obj : list)
         {
             if(obj instanceof DebitCard) {
                 DebitCard dc = (DebitCard) obj;
                 if (dc.getCardID() == cardID)
                 {
                     isFound = true;
                    dc.withDraw(Amount_W,date,pin_W);
                    break;
                 }
             }
         }
         if(isFound == false)
         {
             JOptionPane.showMessageDialog(panelWithDraw,"Kindly Requested to use same Card ID for Withdraw, Thank You! ","Wrong", JOptionPane.ERROR_MESSAGE);
         }
         else
         {
             JOptionPane.showMessageDialog(panelWithDraw,"Now,See your terminal for result, Thank You! ","Success", JOptionPane.INFORMATION_MESSAGE);   
         }   
     }
     
     //getter method for creditcard panel
 
     //getter method for CardID
     public int getCardID1() {
         String ID = field10.getText().trim();
         int CardID = INVALID;
         try {
             CardID = Integer.parseInt(ID);
             if (CardID <= 0) {
                 CardID = INVALID;
             }
         } catch (NumberFormatException ref) {
             JOptionPane.showMessageDialog(
                     panelCredit,
                     "Only Valid Card ID is Accepted, Thank You!",
                     "Error",
                     JOptionPane.ERROR_MESSAGE
             );
         }
         return CardID;
     }
 
     //getter method for Client Name
     public String getClientName1() {
         return field11.getText().trim();
     }
 
     //getter method for BankAccount
     public String getBankAccount1() {
         return field12.getText().trim();
     }
 
     //getter method for Balance Amount
     public int getBalanceAmout1() {
         String balance = field13.getText().trim();
         int balanceAmout = INVALID;
         try {
             balanceAmout = Integer.parseInt(balance);
             if (balanceAmout < 0) {
                 balanceAmout = INVALID;
             }
         } catch (NumberFormatException ref1) {
             JOptionPane.showMessageDialog(
                     panelCredit,
                     "You inserted an invalid message into Balance Amout.",
                     "Invalid",
                     JOptionPane.ERROR_MESSAGE
             );
         }
         return balanceAmout;
     }
 
     //getter method for IssuerBank
     public String getIssuerBank1() {
         return field14.getText().trim();
     }
 
     //getter method for CVC NUMBER of credit card
     public int getCVCNumber() {
         String cvc = field15.getText().trim();
         int CVC_Number = INVALID;
         try {
             CVC_Number = Integer.parseInt(cvc);
             if (CVC_Number < 0) {
                 CVC_Number = INVALID;
             }
         } catch (NumberFormatException ref6) {
             JOptionPane.showMessageDialog(
                     panelCredit,
                     "You inserted an invalid message into CVC Number.",
                     "Wrong",
                     JOptionPane.ERROR_MESSAGE
             );
         }
         return CVC_Number;
     }
 
     //getters method for INTEREST RATE of credit card panel
     public double getInterestRate() {
         String interest = field16.getText().trim();
         double rate = INVALID;
         try {
             rate = Double.parseDouble(interest);
             if (rate < 0) {
                 rate = INVALID;
             }
         } catch (NumberFormatException ref7) {
             JOptionPane.showMessageDialog(
                     panelCredit,
                     "You inserted an invalid message into Intrest Rate.",
                     "Error",
                     JOptionPane.ERROR_MESSAGE
             );
         }
         return rate;
     }
 
     //getter method for Expirations Date
     public String getExpirationDate()
     {
         String date_e = "";
         String list = box3.getSelectedItem().toString();
         String list1 = box4.getSelectedItem().toString();
         String list2 = box5.getSelectedItem().toString();
         if(list.equals("year") || list1.equals("Month") || list2.equals("Day")){
             date_e = null;
 
         }
         else{
             date_e = list+"-"+list1+"-"+list2;
         }
         return date_e;
     }
     
     public void addCredit(){
         //calling getter method for clientName,bankAccount and issuerBank
         String name = getClientName1();
         String bank = getBankAccount1();
         String issuer = getIssuerBank1();
 
         if (name.isEmpty() || issuer.isEmpty() || bank.isEmpty()) {
             JOptionPane.showMessageDialog(
                     panelCredit,
                     "We Requested to fill all the Field, Thank You!.",
                     "Empty",
                     JOptionPane.ERROR_MESSAGE
             );
             return;
 
         }
         //calling Getter method of cardID
         int id = getCardID1();
         if (id == INVALID) {
             JOptionPane.showMessageDialog(
                     panelCredit,
                     "Card ID cannot be less than or equal to 0 i.e. " + id,
                     "Error",
                     JOptionPane.ERROR_MESSAGE
             );
             return;
         }
         //calling Getter Method for balanceAmount
         int balance = getBalanceAmout1();
         if (balance == INVALID) {
             JOptionPane.showMessageDialog(
                     panelCredit,
                     "balanc eAmount cannot be less than or equal to 0 i.e. " + balance,
                     "invalid",
                     JOptionPane.ERROR_MESSAGE
             );
             return;
         }
         //Calling getter method for cvcNumber
         int num_c = getCVCNumber();
         if (num_c == INVALID) {
             JOptionPane.showMessageDialog(
                     panelCredit,
                     "CVC Nnumber cannot be less than  0 i.e. " + num_c,
                     "invalid",
                     JOptionPane.ERROR_MESSAGE
             );
             return;
         }
         //calling Getter Method for intrestRate
         double rate = getInterestRate();
         if (rate == INVALID) {
             JOptionPane.showMessageDialog(
                     panelCredit,
                     "Intrest Rate cannot be less than 0 i.e. " + rate,
                     "Invalid",
                     JOptionPane.ERROR_MESSAGE
             );
             return;
         }
         //calling Getter Method for ExpirationDate
         String date_e = getExpirationDate();
         if(date_e == null){
             JOptionPane.showMessageDialog(
                     panelCredit,
                     "Please select the EXPIRATION DATE" ,
                     "Error",
                     JOptionPane.ERROR_MESSAGE
             );
             return;
         }
 
         boolean result = checkCreditCardIdUnique(id);
         if(result == true){
             CreditCard obj = new CreditCard( name,id,  balance,  issuer,  bank, num_c,  rate, date_e);
             list.add(obj);
             JOptionPane.showMessageDialog(panelCredit,"Object is added into arraylist","store object",JOptionPane.INFORMATION_MESSAGE);
         }
         else {
             JOptionPane.showMessageDialog(panelCredit,"Card ID should be unique","not unique",JOptionPane.ERROR_MESSAGE);
             
         }
 
     }
      
     //Moving to Set_Credit Limit panel
     
     //getter method for CardID of Set credit card panel
     public int getCardID_SetCredit() {
         String ID = field18_SetC.getText().trim();
         int CardID = INVALID;
         try {
             CardID = Integer.parseInt(ID);
             if (CardID <= 0) {
                 CardID = INVALID;
             }
         } catch (NumberFormatException ref) {
             JOptionPane.showMessageDialog(
                     panelSetCredit,
                     "Only Valid Card ID is Accepted, Thank You!",
                     "Error",
                     JOptionPane.ERROR_MESSAGE
             );
         }
         return CardID;
     }
     
     //getters method for GRACE PERIOD
     public int getGracePeriod() {
         String grace = field18.getText().trim();
         int grace_Period = INVALID;
         try {
             grace_Period = Integer.parseInt(grace);
             if (grace_Period <= 0) {
                 grace_Period =INVALID;
             }
         }   catch (NumberFormatException ref8) {
             JOptionPane.showMessageDialog(
                     panelSetCredit,
                     "You have entered invalid or empty message into Grace Period",
                     "Error",
                     JOptionPane.ERROR_MESSAGE
             );
         }
         return grace_Period;
     }
     
     //getters method for CREDIT LIMIT
     public double getCreditLimit() {
         String C_limit = field19.getText().trim();
         double credit_limit = INVALID;
         try {
             credit_limit = Double.parseDouble(C_limit);
             if (credit_limit <= 0) {
                 credit_limit = INVALID;
             }
         } catch (NumberFormatException ref9) {
             JOptionPane.showMessageDialog(
                     panelSetCredit,
                     "You have entered invalid or empty message in Credit Limit",
                     "Invalid",
                     JOptionPane.ERROR_MESSAGE
             );
         }
         return credit_limit;
     }
     
     
     public void Set_CreditLimit(){
 
         int cardID =  getCardID_SetCredit();
         if(cardID == INVALID){
             JOptionPane.showMessageDialog(panelSetCredit,"Card cannot be equal or less than 0","Invalid", JOptionPane.ERROR_MESSAGE);
             return;
         }
         
         int period = getGracePeriod();
         if (period == INVALID) {
             JOptionPane.showMessageDialog(
                     panelSetCredit,
                     "Grace Period cannot be less than or equal  0 i.e. " + period,
                     "Error",
                     JOptionPane.ERROR_MESSAGE
             );
             return;
         }
         
         double limit = getCreditLimit();
         if (limit == INVALID) {
             JOptionPane.showMessageDialog(
                     panelSetCredit,
                     "Credit Limit cannot be less than  0 i.e. " + limit,
                     "Invalid",
                     JOptionPane.ERROR_MESSAGE
             );
             return;
         }
         
         boolean success = false;
         for(BankCard obj_1 : list)
         {
             if(obj_1 instanceof CreditCard) {
                 CreditCard cc = (CreditCard) obj_1;
                 if (cc.getCardID() == cardID)
                 {
                   success = true;
                   cc.setCreditLimit(limit,period);
                   break; 
                 }
             }
            }
            
         if(success == false)
         {
             JOptionPane.showMessageDialog(panelSetCredit,"Kindly Requested to use same Card ID for Set_Credit, Thank You! ","Wrong", JOptionPane.ERROR_MESSAGE);
         }
         else
         {
             JOptionPane.showMessageDialog(panelSetCredit,"Now,See your terminal for result, Thank You! ","Success", JOptionPane.INFORMATION_MESSAGE);   
         }   
     }
     
     //Moving to another Panel i.e. Cancel_CreditLimit
     
     //getter method for Cancel_Credit Limit
     public int getCardID_CancelCredit() {
         String Card = field20.getText().trim();
         int CardID = INVALID;
         try {
             CardID = Integer.parseInt(Card);
             if (CardID <= 0) {
                 CardID = INVALID;
             }
         } catch (NumberFormatException ref) {
             JOptionPane.showMessageDialog(
                     panelSetCredit,
                     "Only Valid Card ID is Accepted, Thank You!",
                     "Error",
                     JOptionPane.ERROR_MESSAGE
             );
         }
         return CardID;
     }
 
     
     public void Cancel_CreditLimit(){
 
         int cardID =  getCardID_CancelCredit();
         if(cardID == INVALID){
             JOptionPane.showMessageDialog(panelCancelCredit,"Card cannot be equal or less than 0","Invalid", JOptionPane.ERROR_MESSAGE);
             return;
         }
         boolean cancel = false;
         for(BankCard obj_1 : list)
         {
             if(obj_1 instanceof CreditCard) {
                 CreditCard cc = (CreditCard) obj_1;
                 if (cc.getCardID() == cardID)
                 {
                   cancel = true;
                   cc.cancelCreditCard();
                   break;
                 }
             }
        }
        if(cancel == false)
         {
             JOptionPane.showMessageDialog(panelCancelCredit,"Kindly Requested to use same Card ID for Cancel_Credit, Thank You! ","Wrong", JOptionPane.ERROR_MESSAGE);
         }
         else
         {
             JOptionPane.showMessageDialog(panelCancelCredit,"Now,See your terminal for result, Thank You! ","Success", JOptionPane.INFORMATION_MESSAGE);   
         }   
    }      
   
     //Main Method
     public static void main(String[] args) {
         BankCardGUI p = new BankCardGUI();
        }
 }
