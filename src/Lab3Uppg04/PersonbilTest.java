/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #3    Uppgift 4
 */

package Lab3Uppg04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JLabel;

public class PersonbilTest extends JFrame
{
    private JPanel contentPane;
    
    private static Personbil bil1;
    private static Personbil bil2;

    /**
     * Launch the application.
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                try {
                    PersonbilTest frame = new PersonbilTest();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public PersonbilTest()
    {
        Color backgroundColor = Color.CYAN;
        initialize();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        
        JSplitPane splitPane = new JSplitPane();
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        contentPane.add(splitPane, BorderLayout.CENTER);
        
        JSplitPane splitPane_1 = new JSplitPane();
        splitPane.setLeftComponent(splitPane_1);
        splitPane_1.setBackground(backgroundColor);
        
        JLabel lblData = new JLabel("Data1");
        splitPane_1.setLeftComponent(lblData);
        
        JSplitPane splitPane_2 = new JSplitPane();
        splitPane.setRightComponent(splitPane_2);
        
        JLabel lblData_1 = new JLabel("Data2");
        splitPane_2.setLeftComponent(lblData_1);
    }
    
    private static void initialize()
    {
        bil1 = new Personbil("Saab", 1990, "CCC222", Color.RED);
        bil2 = new Personbil("Volvo", 1999, "ABC988 ", Color.BLACK);
    }
    
    private static void showData(Personbil bil, JTextPane pane)
    {
        
    }
}
