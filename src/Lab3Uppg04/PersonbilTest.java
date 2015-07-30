package Lab3Uppg04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;

public class PersonbilTest extends JFrame
{
    private JPanel contentPane;
    private JTextPane textPane1;
    private JTextPane textPane2;
    
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
        initialize();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        
        textPane2 = new JTextPane();
        textPane2.setEditable(false);
        textPane2.setText("Bil #2");
        contentPane.add(textPane2, BorderLayout.EAST);
        
        textPane1 = new JTextPane();
        contentPane.add(textPane1, BorderLayout.WEST);
        textPane1.setEditable(false);
        textPane1.setText("Bil #1");
        
        showData(bil1, textPane1);
    }
    
    private static void initialize()
    {
        bil1 = new Personbil("Saab", 1990, "CCC222", Color.RED);
        bil2 = new Personbil("Volvo", 1999, "ABC988 ", Color.BLACK);
    }
    
    private static void showData(Personbil bil, JTextPane pane)
    {
        pane.setText("Modell: " + bil.getModel() 
                   + "\nTillverkningsår: " + bil.getYearManufactured()
                   + "\nRegistreringsnummer: " + bil.getRegistrationNumber()
                   + "\nFärg:                " + bil.getColor().toString());
        
    }
}
