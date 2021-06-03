/*******************
/*******************
Name: Matas Backevicius

Date: May 5, 2021

Notes: This program shows the push button event, and how it can be created and used.
*******************/

import javax.swing.*;         /* must import all these filters to create GUI */
import java.awt.*;
import java.awt.event.*;


class Actions extends JFrame implements ActionListener
   {
            /* to create an event acitonlistener must be implemented
             into JFrame to build all the components for the interface */
   
   private  JButton a1, a2, a3, a4, a5, a6, a7, a8,
    a9, a10, a11, a12, a13, a14, a15, q1, 
    q2, q3, q4, b1, b2, b3, b4, c1, c2, c3, c4, c5,
    p1, d1, d2, d3, d4, d5, d6, e1, e2, e3, e4, e5,
    f1, f2, f3, f4, g1, g2, g3, g4, h1, h2, h3, h4,
     h5, z1, m1, m2, m3, m4, v1, v2;
            
            
            
   Object [] options= {"Good","Not so Good","Don't ask!"};
   
   Object [] options1= {"Yes","No","other!"};
   
   int n = JOptionPane.showOptionDialog(rootPane,
    "Welcome and Let's begin! \n"
    + "How are you today?\n",
    "Welcome Message",
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,
    options,
    options[2]);
   
   
   
   /* identiy all JButtons and assign them */

   public Actions()
   
   {
      setTitle("Welcome! This is the Window Nr.1");
      setLayout(new FlowLayout());
      setAction();
      setSize(1400, 450);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  
      /* in public actions(0 set all the variables the welcome title,
      set new layout
      action folowed by the addition of action listener
      set the size for the JFrame
      and make sure it's visible so it's true that it's visible */
   }
   
   {
   
      Container contentArea = getContentPane();
      contentArea.setBackground(Color.pink);
      
      /* set up the content area for the content: 
      set up the background color for JFrame */
      
      
      JLabel textLabel = new JLabel("Enter your first ");
    contentArea.add(textLabel);
    JTextField text = new JTextField("name: ", 11);
    contentArea.add(text);
    
    /* add a text label above the button with a string label
    add content area for the input of text */
  
    JLabel textLabel1 = new JLabel("Enter your last ");
    contentArea.add(textLabel1);
    JTextField text1 = new JTextField("name: ", 13);
    contentArea.add(text1);
    
    /* add another tet label and content area */
    
    setContentPane(contentArea);
    
    
    
     JPanel pane = new JPanel(new GridBagLayout());
     
   pane.setLayout(new GridBagLayout());
GridBagConstraints c = new GridBagConstraints(); 
            
      /* for JPanel set up a layout
       so that the buttons are in a grid type format */
      
      
      a1 = new JButton(" Button Nr.1 ");
      a2 = new JButton (" Button Nr.2 ");
      a3 = new JButton (" Button Nr.3 ");
      a4 = new JButton(" Button Nr.4 ");
      a5 = new JButton (" Button Nr.5 ");
      a6 = new JButton (" Button Nr.6 ");
      a7 = new JButton(" Button Nr.7 ");
      a8 = new JButton (" Button Nr.8 ");
      a9 = new JButton (" Button Nr.9 ");
      a10 = new JButton (" Button Nr.10 ");
      
      
      a11= new JButton (" Button Nr.11");
      a12= new JButton (" You clicked on Button Nr. 11 Cick here on this Button to answer one question");
      
      
      a13= new JButton ("Matas has 12 marbles more than Dhriti. Dhriti has 6 marbles more than Kristina."
       +  "Matas has twice as many marbles as Kristina has. How many marbles does Dhriti have?"
       + "   *click here on this question button for ANSWER* ");
      a14= new JButton ("Click here on this button for ANSWER");
      
      a15= new JButton ("Dhritis has 24 marbles. Kristina has 18 marbles.. Matas has 36 marbles."
      +"    *click here on this answer button for EXPLANATION* ");
      
      
      q1= new JButton (" You clicked on Button Nr.2    *Cick here on this Button to answer one question* ");
      q2= new JButton ("Which country produces the most coffee in the world?    *click here on this question button for ANSWER* ");
      q3= new JButton ("Click here on this button for ANSWER");
      q4= new JButton ("BRAZIL produces most coffee.    *click BRASIL produces most coffee*");
      
      
      b1= new JButton (" Welcome to Button Nr.3  There is something here in Button Nr.3!   *click here on this button*");
      b2= new JButton ("What is the largest bone in the human body?    *click here on this question button for ANSWER* ");
      b3= new JButton ("Click here on this button for ANSWER");
      b4= new JButton ("The Femur.   *click The Femur* ");

     
      c1= new JButton ("Hi, this is Button Nr.4, you clicked on me!  I would like to ask you a question  *click here on this button* ");
      c2= new JButton ("Look at this series: 36, 34, 30, 28, 24, … What number should come next?"
      +"    *click here on this question button for ANSWER* ");
      c3= new JButton ("Click here on this button for ANSWER");
      c4= new JButton (" 22     *click here on Nr. 22 for explanation* ");
      c5= new JButton (" Explanation:   Answer: 22,  because 36 - 34 = 2, 34 - 30 = 4, 30 - 28 = 4, and 28 - 24 = 4."
      +"  So we have One 2, and three 4. The next number will be 24 - 2 = 22. And that's our ANSWER: 22."
      +"     *click on this explanation Button to go next* ");
      
      
      p1= new JButton ("You clicked Button Nr.5    *click HERE on this button* ");
      
      
      d1= new JButton ("You clicked on Button Nr.6.  *click here on this button* ");
      d2= new JButton ("On average, how long does it take food to pass through the human body?"
      +"      *click here on this question button for HINT* ");
      d3= new JButton (" Hint:  It's A) 6 hours, B) 28 hours, or C) 53 hours."
      +"     *when you ready click here on this HINT button for ANSWER* ");
      d4= new JButton ("Click here on this button for ANSWER");
      d5= new JButton (" C) 53 hours.      *click here on this button for EXPLANATION* ");
      d6= new JButton (" Explanation:   It takes around 53 hours for food to make its way through⁠"
      +"—and out of⁠—the body. Food moves through men faster than it passes through women."
      +"     *click on this explanation Button to go next* ");
      
      
      e1= new JButton ("Hi there, this is Button Nr.7  Let me ask you one question  >>> *click here on this button* ");      
      e2= new JButton (" What is the number when 9 - 3 / 1/3 + 1 =      *click here on this question button for ANSWER* ");
      e3= new JButton (" Click here on this button for ANSWER ");
      e4= new JButton (" Answer:  1    >>>  *click here on this button for EXPLANATION* ");
      e5= new JButton (" EXPLANATION: It's answer 1 because first you need to flip the fraction"
      +" and switch from division to multiplication, thus getting 3 x 3 = 9.     Now you have 9 – 9 + 1."
      +"  And you get 1.      *click here on this button for EXPLANATION* ");


      f1= new JButton ("Welcome to Button Nr.8.  Can you please answer 1 question it's here  >>> *click here on this button* ");      
      f2= new JButton (" Where in the body is blood produced?      *click here on this question button for ANSWER* ");
      f3= new JButton (" Click here on this button for ANSWER ");
      f4= new JButton (" Answer:  In the bones.  Did you know that!    >>>  *click here on this button to CONTINUE* ");
      
      
      g1= new JButton ("Hello! This is Button Nr.9. I have one question for you!   >>> *click here on this button* ");      
      g2= new JButton (" What is hummus made from?      *click here on this question button for ANSWER* ");
      g3= new JButton (" Click here on this button for ANSWER ");
      g4= new JButton (" Answer:  Chickpeas.    >>>  *click here on this button to CONTINUE* ");

      
      h1= new JButton (" I'm Button Nr.9. I would like to ask you another question.   >>> *click here on this button for QUESTION* ");      
      h2= new JButton (" What’s The Only Food That Never Expires?  >>>    *click here on this question button for ANSWER* ");
      h3= new JButton (" Click here on this button for ANSWER ");
      h5= new JButton (" EXPLANATION:  If the honey is natural and properly sealed, it won’t expire."
      +" That’s due to its high sugar content, low pH, and the bees’ nearly-magical honey-making process."
      +"   >>>  *click here on this button to continue* ");
      h4= new JButton (" Answer:  Honey.    >>>  *click here on this button for EXPLANATION* ");


      z1= new JButton (" following equations used:    Matas = Dhritis + 12      Dhritis = Kristina + 6"
      +"      Matas = 2 × Kristina     >>> *click here on this button for a FINAL MESSAGE");



      m1= new JButton ("MOTHERBOARD INFECTED RESTART YOU COMPUTER. ");
      m2= new JButton ("CLOSE YOUR BROWSER IMMEDIATELY. PERSONAL INFORMATION EXPOSURE!!!! "); 
      m3= new JButton ("CALL THIS NUMBER NOW>>> 951-478-2498 ");
      m4= new JButton( "This was the last Button Nr, Thank you for all you hard work! That is all today. GoodBye!" );



      v1= new JButton ("You cliked on Button Nr.1!");
      v2 = new JButton ("<<< WARNING NO INFORMATION FOUND!!! >>>  *click 'OK' and go to Button Nr.2* ");
      
      
      
      
  /* assign a variable to each JButton
  each variable has a name of a button as a display */
  
  
  c.fill = GridBagConstraints.HORIZONTAL;
c.gridx = 0;
c.gridy = 1;
pane.add(a1,c);

/* fill the grid with contraints calling upon the variable of a button
in this case JButton 'a1'
and 'c' for a contraint
so that the grid of that button is somewhat horizontal. */


c.fill = GridBagConstraints.HORIZONTAL;
c.weightx = 0.5;
c.gridx = 1;
c.gridy = 2;
pane.add(a2,c);

/* assign grid contraint for each JButton like for 'a2' and son on */

c.fill = GridBagConstraints.HORIZONTAL;
c.weightx = 0.5;
c.gridx = 2;
c.gridy = 3;
pane.add(a3,c);

c.fill = GridBagConstraints.HORIZONTAL;
c.weightx = 0.5;
c.gridx = 3;
c.gridy = 4;
pane.add(a4,c);

c.fill = GridBagConstraints.HORIZONTAL;
c.weightx = 0.5;
c.gridx = 4;
c.gridy = 5;
pane.add(a5,c);

c.fill = GridBagConstraints.HORIZONTAL;
c.weightx = 0.5;
c.gridx = 5;
c.gridy = 6;
pane.add(a6,c);

c.fill = GridBagConstraints.HORIZONTAL;
c.weightx = 0.5;
c.gridx = 6;
c.gridy = 7;
pane.add(a7,c);

c.fill = GridBagConstraints.HORIZONTAL;
c.weightx = 0.5;
c.gridx = 7;
c.gridy = 8;
pane.add(a8,c);

c.fill = GridBagConstraints.HORIZONTAL;
c.weightx = 0.5;
c.gridx = 8;
c.gridy = 9;
pane.add(a9,c);

c.fill = GridBagConstraints.HORIZONTAL;
c.weightx = 0.5;
c.gridx = 9;
c.gridy = 10;
pane.add(a10,c);
      
      
c.fill = GridBagConstraints.HORIZONTAL;
c.weightx = 0.5;
c.gridx = 10;
c.gridy = 11;
pane.add(a11,c);



      
/* assign a color by setForeground,
and call upon a COLOr followed by the name of a color */       
      
      

      a1.setForeground(Color.BLUE);
      a2.setForeground(Color.orange);
      a3.setForeground(Color.RED);
      a4.setForeground(Color.MAGENTA);
      a5.setForeground(Color.RED);
      a6.setForeground(Color.RED);
      a7.setForeground(Color.GREEN);
      a8.setForeground(Color.BLACK);
      a9.setForeground(Color.BLUE);
      a10.setForeground(Color.MAGENTA);
            
            
            
      a11.setForeground(Color.BLUE);
      a12.setForeground(Color.BLUE);
      a13.setForeground(Color.RED);
      a14.setForeground(Color.BLUE);
      a15.setForeground(Color.RED);
      z1.setForeground(Color.BLUE);
    
      q1.setForeground(Color.BLUE);
      q2.setForeground(Color.BLUE);
      q3.setForeground(Color.BLUE);
      q4.setForeground(Color.RED);
      
      b1.setForeground(Color.BLUE);
      b2.setForeground(Color.BLUE);
      b3.setForeground(Color.BLUE);
      b4.setForeground(Color.RED);
      
            
            
      c1.setForeground(Color.RED);
      c2.setForeground(Color.RED); 
      c3.setForeground(Color.RED); 
      c4.setForeground(Color.RED);  
      c5.setForeground(Color.BLUE); 
      
      
      p1.setForeground(Color.BLUE); 
      
      
      d1.setForeground(Color.BLUE);
      d2.setForeground(Color.RED); 
      d3.setForeground(Color.BLUE); 
      d4.setForeground(Color.RED);  
      d5.setForeground(Color.BLUE); 
      d6.setForeground(Color.RED);
      
      
      e1.setForeground(Color.BLUE);
      e2.setForeground(Color.BLUE); 
      e3.setForeground(Color.BLUE); 
      e4.setForeground(Color.BLUE);  
      e5.setForeground(Color.BLACK);
      
      
      f1.setForeground(Color.BLACK);
      f2.setForeground(Color.RED); 
      f3.setForeground(Color.BLACK); 
      f4.setForeground(Color.orange); 
      
      
      g1.setForeground(Color.MAGENTA);
      g2.setForeground(Color.MAGENTA); 
      g3.setForeground(Color.MAGENTA); 
      g4.setForeground(Color.RED);  
      
      
      h1.setForeground(Color.RED);
      h2.setForeground(Color.RED); 
      h3.setForeground(Color.RED); 
      h4.setForeground(Color.RED);
      h5.setForeground(Color.BLUE);  
      
            
            
      m1.setForeground(Color.RED);
      m2.setForeground(Color.RED);
      m3.setForeground(Color.RED);
      m4.setForeground(Color.BLUE);
      
      
      v1.setForeground(Color.BLUE);
      v2.setForeground(Color.RED);
            
     /* ensure the gridlayout 
     and contraint formating is visible by setting it as 'true' */
     
      setVisible(true);
      add(pane);
      
 /* and add an actual pane representing the layout of all contraints */
            
            
      
     }

   private void setAction()

     {
     
     
     /* for each JButton add ActionListener with 'this' */
     
         a1.addActionListener(this);
         a2.addActionListener(this);
         a3.addActionListener(this);
         a4.addActionListener(this);
         a5.addActionListener(this);
         a6.addActionListener(this);
         a7.addActionListener(this);
         a8.addActionListener(this);
         a9.addActionListener(this);
         a10.addActionListener(this);
         
         
         a11.addActionListener(this);
         a12.addActionListener(this);
         
         a13.addActionListener(this);
         a14.addActionListener(this);
         a15.addActionListener(this);
         
         q1.addActionListener(this);
         q2.addActionListener(this);
         q3.addActionListener(this);
         q4.addActionListener(this);
         
         
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
         
   
   
           c1.addActionListener(this);
           c2.addActionListener(this);
           c3.addActionListener(this);
           c4.addActionListener(this);
           c5.addActionListener(this);
           
           
           p1.addActionListener(this);
           
           
           d1.addActionListener(this);
           d2.addActionListener(this);
           d3.addActionListener(this);
           d4.addActionListener(this);
           d5.addActionListener(this);
           d6.addActionListener(this);
           
           
           e1.addActionListener(this);
           e2.addActionListener(this);
           e3.addActionListener(this);
           e4.addActionListener(this);
           e5.addActionListener(this);
           
           
           f1.addActionListener(this);
           f2.addActionListener(this);
           f3.addActionListener(this);
           f4.addActionListener(this);
           
           
           g1.addActionListener(this);
           g2.addActionListener(this);
           g3.addActionListener(this);
           g4.addActionListener(this);
           
           
           h1.addActionListener(this);
           h2.addActionListener(this);
           h3.addActionListener(this);
           h4.addActionListener(this);
           h5.addActionListener(this);
   
            
           z1.addActionListener(this);
           
           
           m1.addActionListener(this);
           m2.addActionListener(this);
           m3.addActionListener(this);
           m4.addActionListener(this);
           
           
           v1.addActionListener(this);
           v2.addActionListener(this);
   
      }

   public void actionPerformed(ActionEvent event)
   {
   
       /* set up action event for each JButton
        with an if-else- JOptionPane loop */

      if (event.getSource() == a1)
          JOptionPane.showMessageDialog(rootPane, v1);
  
   /* use getSource to called upon an event,
     which the source is the variable of every JButton */
    
           
      else if (event.getSource() == a2)
          JOptionPane.showMessageDialog (rootPane, q1);
          
      else if (event.getSource() == q1)
          JOptionPane.showMessageDialog (rootPane, q2);
          
      else if (event.getSource() == q2)
          JOptionPane.showMessageDialog (rootPane, q3);
          
      else if (event.getSource() == q3)
          JOptionPane.showMessageDialog (rootPane, q4);
          
          
      else if (event.getSource() == q4)
          JOptionPane.showMessageDialog (rootPane, "Good Job!"
          +"     *close this message window and click on Button Nr.3*     Thank you. Bye!");
          
          else if (event.getSource() == q1)
          JOptionPane.showMessageDialog (rootPane, q2);
          
          else if (event.getSource() == q2)
          JOptionPane.showMessageDialog (rootPane, q3);
          
      else if (event.getSource() == a3)
          JOptionPane.showMessageDialog (rootPane, b1 );
          
      else if (event.getSource() == b1)
          JOptionPane.showMessageDialog (rootPane, b2 );
          
      else if (event.getSource() == b2)
          JOptionPane.showMessageDialog (rootPane, b3 );
          
      else if (event.getSource() == b3)
          JOptionPane.showMessageDialog (rootPane, b4 );
          
          
      else if (event.getSource() == b4)
          JOptionPane.showMessageDialog (rootPane, " Close"
          +" this message window and choose another Button Nr. from the main list."
          +"  *Try Button Nr.4*   Goddbye!" );
          
      else if (event.getSource() == a4)
          JOptionPane.showMessageDialog (rootPane, c1);
      else if (event.getSource() == c1)
          JOptionPane.showMessageDialog (rootPane, c2);
      else if (event.getSource() == c2)
          JOptionPane.showMessageDialog (rootPane, c3);
          
      else if (event.getSource() == c3)
          JOptionPane.showMessageDialog (rootPane, c4);
          
      else if (event.getSource() == c4)
          JOptionPane.showMessageDialog (rootPane, c5);
          
      else if (event.getSource() == c5)
          JOptionPane.showMessageDialog (rootPane, "Thanks for trying!"
          +" Go and click on Button Nr.5   GoodBye!");
          
           
      else if (event.getSource() == a5)
          JOptionPane.showMessageDialog (rootPane, p1); 
              
      else if(event.getSource() == p1)
         JOptionPane.showMessageDialog (rootPane, ">>> NO MESSAGE FOUND >>>    *try Button. Nr.6* ");
         
   /*  every JButton will showMessageDialog,
   and print a message >>> represented by a string
   only if the JButton is (==) the event when getSource is used */   
      
      else if (event.getSource() == a6)
          JOptionPane.showMessageDialog (rootPane, d1);
      else if (event.getSource() == d1)
          JOptionPane.showMessageDialog (rootPane, d2); 
      else if (event.getSource() == d2)
          JOptionPane.showMessageDialog (rootPane, d3);
      else if (event.getSource() == d3)
          JOptionPane.showMessageDialog (rootPane, d4);
      else if (event.getSource() == d4)
          JOptionPane.showMessageDialog (rootPane, d5);
      else if (event.getSource() == d5)
          JOptionPane.showMessageDialog (rootPane, d6);
      else if (event.getSource() == d6)
          JOptionPane.showMessageDialog (rootPane, "Good Guess!"
          +"     *close this message window and click on Button Nr.7*  GoodBye!");  
        
      else if (event.getSource() == a7)
          JOptionPane.showMessageDialog (rootPane, e1);
      else if (event.getSource() == e1)
          JOptionPane.showMessageDialog (rootPane, e2); 
      else if (event.getSource() == e2)
          JOptionPane.showMessageDialog (rootPane, e3);
      else if (event.getSource() == e3)
          JOptionPane.showMessageDialog (rootPane, e4);
      else if (event.getSource() == e4)
          JOptionPane.showMessageDialog (rootPane, e5);
      else if (event.getSource() == e5)
          JOptionPane.showMessageDialog (rootPane, "Great!"
          +"  >>>   *now you can close all the window messages by clicking"
          +" 'OK'. Go to the next Button Nr.8* ");
      
      else if (event.getSource() == a8)
          JOptionPane.showMessageDialog (rootPane, f1);
      else if (event.getSource() == f1)
          JOptionPane.showMessageDialog (rootPane, f2);
      else if (event.getSource() == f2)
          JOptionPane.showMessageDialog (rootPane, f3);
      else if (event.getSource() == f3)
          JOptionPane.showMessageDialog (rootPane, f4);
      else if (event.getSource() == f4)
          JOptionPane.showMessageDialog (rootPane, "That was good!  >>>"
          +"   *please click 'OK' and close all the window messages."
          +" Go to the next Button Nr.9.  Thank you!* ");
          
      else if (event.getSource() == a9)
          JOptionPane.showMessageDialog (rootPane, g1);
      else if (event.getSource() == g1)
          JOptionPane.showMessageDialog (rootPane, g2);
      else if (event.getSource() == g2)
          JOptionPane.showMessageDialog (rootPane, g3);
      else if (event.getSource() == g3)
          JOptionPane.showMessageDialog (rootPane, g4);
      else if (event.getSource() == g4)
          JOptionPane.showMessageDialog (rootPane, "Nice try.  >>>"
          +"   *please close all message windows by clicking 'OK' and go to Button Nr.10 "); 
          
      else if (event.getSource() == a10)
          JOptionPane.showMessageDialog (rootPane, h1);
      else if (event.getSource() == h1)
          JOptionPane.showMessageDialog (rootPane, h2);
      else if (event.getSource() == h2)
          JOptionPane.showMessageDialog (rootPane, h3);
      else if (event.getSource() == h3)
          JOptionPane.showMessageDialog (rootPane, h4);
      else if (event.getSource() == h4)
          JOptionPane.showMessageDialog (rootPane, h5);
      else if (event.getSource() == h5)
          JOptionPane.showMessageDialog (rootPane, "Well done!.  >>>"
          +"   * click 'OK' and close all messages. Please go to Button Nr.11 ");

      else if (event.getSource() ==a11)
         JOptionPane.showMessageDialog (rootPane,a12);
         
      else if (event.getSource() == a12)
         JOptionPane.showMessageDialog (rootPane,a13, "Question", JOptionPane.PLAIN_MESSAGE);
 
         
      else if (event.getSource() ==a13)
         JOptionPane.showMessageDialog (rootPane, a14, "Continue", JOptionPane.PLAIN_MESSAGE);
         
      else if (event.getSource() ==a14)
         JOptionPane.showMessageDialog (rootPane, a15, "Answer", JOptionPane.PLAIN_MESSAGE);
         
      else if (event.getSource() ==a15)
         JOptionPane.showMessageDialog (rootPane, z1, "Explanation", JOptionPane.PLAIN_MESSAGE);
         
      else if (event.getSource() ==z1)
         JOptionPane.showMessageDialog (rootPane, m4, "FINAL MESSAGE", JOptionPane.PLAIN_MESSAGE);
         
         
         
         
         
      else if (event.getSource() == m4)
         JOptionPane.showMessageDialog (rootPane, m1,
    "ERROR 405", JOptionPane.ERROR_MESSAGE);
    
    else if (event.getSource() == m4)
         JOptionPane.showMessageDialog (rootPane, m2,
    "Alert", JOptionPane.ERROR_MESSAGE);
    
    
         
      if (event.getSource() == m4)
         JOptionPane.showMessageDialog (rootPane, m2,
    "ALERT", JOptionPane.ERROR_MESSAGE);
    
    
    else if (event.getSource() == m4)
         JOptionPane.showMessageDialog (rootPane, m3,
    "ERROR 405", JOptionPane.ERROR_MESSAGE);
    
    
     if (event.getSource() == m4)
         JOptionPane.showMessageDialog (rootPane, m3,
    "ACTION", JOptionPane.ERROR_MESSAGE);

         
     
    else if (event.getSource() == m3)
         JOptionPane.showMessageDialog (rootPane, m1,
    "ERROR 405", JOptionPane.ERROR_MESSAGE);
    
    
     
    if (event.getSource()== m4)
      JOptionPane.showMessageDialog (rootPane, m2,
    "Alert", JOptionPane.ERROR_MESSAGE);


   if (event.getSource()== m4)
      JOptionPane.showMessageDialog (rootPane, m1,
    "ERROR 405", JOptionPane.ERROR_MESSAGE);


   if (event.getSource()== m4)
      JOptionPane.showMessageDialog (rootPane, m1,
    "ERROR 405", JOptionPane.ERROR_MESSAGE);
    
    
    if (event.getSource()== m4)
      JOptionPane.showMessageDialog (rootPane, m2,
    "Alert", JOptionPane.ERROR_MESSAGE);
    
    
    if (event.getSource() == m4)
         JOptionPane.showMessageDialog (rootPane, m3,
    "ACTION", JOptionPane.ERROR_MESSAGE);
    
    if (event.getSource()== m4)
      JOptionPane.showMessageDialog (rootPane, m1,
    "COMPUTER INFECTED", JOptionPane.ERROR_MESSAGE);
    
    if (event.getSource() == m4)
         JOptionPane.showMessageDialog (rootPane, m3,
    "INTENSIVE ACTION", JOptionPane.ERROR_MESSAGE);
    
    if (event.getSource()== m4)
      JOptionPane.showMessageDialog (rootPane, m2,
    "VIRUS DETECTED!!!", JOptionPane.ERROR_MESSAGE);
    
    
    if (event.getSource()== m4)
      JOptionPane.showMessageDialog (rootPane, m2,
    "VIRUS DETECTED!!!", JOptionPane.ERROR_MESSAGE);

   
   
   
   
   else if (event.getSource() == m4)
         JOptionPane.showMessageDialog (rootPane, m1,
    "ERROR 405", JOptionPane.ERROR_MESSAGE);
    
    else if (event.getSource() == m4)
         JOptionPane.showMessageDialog (rootPane, m2,
    "Alert", JOptionPane.ERROR_MESSAGE);
    
    
         
      if (event.getSource() == m4)
         JOptionPane.showMessageDialog (rootPane, m2,
    "ALERT", JOptionPane.ERROR_MESSAGE);
    
    
    else if (event.getSource() == m4)
         JOptionPane.showMessageDialog (rootPane, m3,
    "ERROR 405", JOptionPane.ERROR_MESSAGE);
    
    
     if (event.getSource() == m4)
         JOptionPane.showMessageDialog (rootPane, m3,
    "ACTION", JOptionPane.ERROR_MESSAGE);

         
     
    else if (event.getSource() == m3)
         JOptionPane.showMessageDialog (rootPane, m1,
    "ERROR 405", JOptionPane.ERROR_MESSAGE);
    
    
     
    if (event.getSource()== m4)
      JOptionPane.showMessageDialog (rootPane, m2,
    "Alert", JOptionPane.ERROR_MESSAGE);


   if (event.getSource()== m4)
      JOptionPane.showMessageDialog (rootPane, m1,
    "ERROR 405", JOptionPane.ERROR_MESSAGE);


   if (event.getSource()== m4)
      JOptionPane.showMessageDialog (rootPane, m1,
    "ERROR 405", JOptionPane.ERROR_MESSAGE);
    
    
    if (event.getSource()== m4)
      JOptionPane.showMessageDialog (rootPane, m2,
    "Alert", JOptionPane.ERROR_MESSAGE);
    
    
    if (event.getSource() == m4)
         JOptionPane.showMessageDialog (rootPane, m3,
    "ACTION", JOptionPane.ERROR_MESSAGE);
    
    if (event.getSource()== m4)
      JOptionPane.showMessageDialog (rootPane, m1,
    "COMPUTER INFECTED", JOptionPane.ERROR_MESSAGE);
    
    if (event.getSource() == m4)
         JOptionPane.showMessageDialog (rootPane, m3,
    "INTENSIVE ACTION", JOptionPane.ERROR_MESSAGE);
    
    if (event.getSource()== m4)
      JOptionPane.showMessageDialog (rootPane, m2,
    "VIRUS DETECTED!!!", JOptionPane.ERROR_MESSAGE);
    
    
    if (event.getSource()== m4)
      JOptionPane.showMessageDialog (rootPane, m2,
    "VIRUS DETECTED!!!", JOptionPane.ERROR_MESSAGE);




   
  if (event.getSource()== a1)
      JOptionPane.showMessageDialog (rootPane, v2,
    "WARNING", JOptionPane.WARNING_MESSAGE); 
   
   
   
   
   
 if (event.getSource()== a1) 
   JOptionPane.showOptionDialog(rootPane,
    "Would you like to still continue ? ",
    "Quick Question",
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,
    options1,
    options[2]);
    
    
 
 
 
 
    

  
   
   
   
   
 
   
   
   
   

   }
   
      
}     

public class Try {

/* will end it with a set up of our public static void main class as our class Actions() = new Action() */

public static void main (String[] args)
{ Actions eg = new Actions(); }
}