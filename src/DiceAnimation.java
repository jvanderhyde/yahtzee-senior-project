/*import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

public class TestAnimation extends JFrame
{
    private static int DELAY = 90;
    Insets insets;

    //import pictures of the dice
    Image dieOne = Toolkit.getDefaultToolkit().getImage("die1.png");
    Image dieTwo = Toolkit.getDefaultToolkit().getImage("die2.png");
    Image dieThree = Toolkit.getDefaultToolkit().getImage("die2.png");
    Image dieFour = Toolkit.getDefaultToolkit().getImage("die4.png");
    Image dieFive = Toolkit.getDefaultToolkit().getImage("die5.png");
    Image dieSix = Toolkit.getDefaultToolkit().getImage("die6.png");

    //add dice pictures into an array of images
    Image diceFace[] = {dieOne, dieTwo, dieThree, dieFour, dieFive, dieSix};

    public void paint(Graphics graphics)
    {
        super.paint(graphics);
        if (insets == null) {
        insets = getInsets();
    }
    
    int steps=diceFace.length;
    int x = insets.left;
    int y = insets.top;
    int width = getWidth() - insets.left - insets.right;
    int height = getHeight() - insets.top - insets.bottom;

    synchronized (diceFace) {
      for (int i = 0; i < steps; i++) {
        graphics.drawImage(diceFace[i],0,0,this);
        //graphics.fillRect(x, y, width, height);
      }
    }
  }
  public void go() {
    TimerTask timerTask = new TimerTask() {
      public void run() {
        Image image = diceFace[0];
        synchronized (diceFace) {
          System.arraycopy(diceFace, 1, diceFace, 0, diceFace.length - 1);
          diceFace[diceFace.length - 1] = image;
        }
        repaint();
      }
    };
    Timer timer = new Timer();
    timer.schedule(timerTask, 0, DELAY);
  }
   public static void main(String args[]) 
   {



    TestAnimation animation = new TestAnimation();
    animation.setSize(250, 200);
    animation.show();
    animation.go();
  }
}*/

import java.awt.*;
import javax.swing.*;

public final class DiceAnimation
{
    Thread th;
    JFrame frame;
    JLabel lbl;
    JLabel lbl2;
    JLabel lbl3;
    JLabel lbl4;
    JLabel lbl5;
    

public static void main(String[] args)
{
    DiceAnimation sa = new DiceAnimation();
}

public DiceAnimation()
{
    frame = new JFrame("Animation Frame");
    th = new Thread();
    lbl = new JLabel();
    lbl2 = new JLabel();
    lbl3 = new JLabel();
    lbl4 = new JLabel();
    lbl5 = new JLabel();

    Panel panel = new Panel();
    panel.add(lbl);
    panel.add(lbl2);
    panel.add(lbl3);
    panel.add(lbl4);
    panel.add(lbl5);

    frame.add(panel, BorderLayout.CENTER);
    frame.setSize(1100, 250);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    for(int j = 1; j <= 2; j++)
    {
        SwingAnimator();
        if (j == 2)
        j = 0;
    }
}

public void SwingAnimator()
{
    //import pictures of the dice
    ImageIcon dieOne = new ImageIcon("die1.png");
    ImageIcon dieTwo = new ImageIcon("die2.png");
    ImageIcon dieThree = new ImageIcon("die2.png");
    ImageIcon dieFour = new ImageIcon("die4.png");
    ImageIcon dieFive = new ImageIcon("die5.png");
    ImageIcon dieSix = new ImageIcon("die6.png");


    //add dice pictures into an array of images
    ImageIcon diceFace[] = {dieTwo, dieOne, dieThree, dieFive, dieFour,  dieSix};
    ImageIcon diceFace2[] = {dieThree, dieSix, dieTwo, dieFour, dieOne, dieFive};
    ImageIcon diceFace3[] = {dieFour, dieThree, dieFive, dieTwo, dieSix, dieOne};
    ImageIcon diceFace4[] = {dieFive, dieTwo, dieSix,  dieFour, dieOne, dieThree};
    ImageIcon diceFace5[] = {dieSix, dieFour,   dieOne, dieFive,dieTwo, dieThree};

    try
    {
        int n = 0;

        //for(int i=0; i < diceFace.length; i++)
        //{
            int i=0;
            while (i < diceFace.length && n < 10)
            {
                ImageIcon images = diceFace[i];
                lbl.setIcon(images);

                ImageIcon images2 = diceFace2[i];
                lbl2.setIcon(images2);

                ImageIcon images3 = diceFace3[i];
                lbl3.setIcon(images3);

                ImageIcon images4 = diceFace4[i];
                lbl4.setIcon(images4);

                ImageIcon images5 = diceFace5[i];
                lbl5.setIcon(images5);

                th.sleep(200);

                i++;
                n++;
            //}
        }

    }

    catch(InterruptedException e){}
    }
}