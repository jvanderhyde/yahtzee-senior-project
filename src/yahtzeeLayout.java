
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jordan Ancar
 */
public class yahtzeeLayout 
{
    JFrame frame;
    //scoreSheet ss;

    public yahtzeeLayout()
    {
       frame = new JFrame();
       frame.setSize(700,700);
       frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
       
        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        JLabel jl = new JLabel("Yahtzee");
        jl.setHorizontalAlignment(JLabel.CENTER);
        jp.add(jl,BorderLayout.NORTH);

        // add the score sheet to the west side of the boarder layout
        JPanel jp2 = new JPanel();
      


        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(1,6));
        JButton jb2= new JButton("Player 2");
        JButton jb3= new JButton("Player 3");
        JButton jb4= new JButton("Player 4");
        JButton jb5= new JButton("Player 5");
        JButton jb6= new JButton("Player 6");
        jp1.add(jb2);
        jp1.add(jb3);
        jp1.add(jb4);
        jp1.add(jb5);
        jp1.add(jb6);
        jp.add(jp1, BorderLayout.SOUTH);

        frame.add(jp);
        frame.setVisible(true);
        
        
    }


}
