package Lab3Uppg04;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class PersonbilGUI extends JFrame
{

    Color backgroundColor = Color.RED;
    Font  stdFont         = new Font("monospaced", 0, 12);
    Font  stdFontBold     = new Font("monospaced", 1, 12);

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
                    PersonbilGUI frame = new PersonbilGUI();
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
    public PersonbilGUI()
    {
        initialize();
        createFrame();
    }

    private static void initialize()
    {
        bil1 = new Personbil("Saab", 1990, "CCC222", Color.RED);
        bil2 = new Personbil("Volvo", 1999, "ABC988 ", Color.BLACK);
    }

    private void createFrame()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[] { 0, 0, 0 };
        gbl_contentPane.rowHeights = new int[] { 0, 0, 0 };
        gbl_contentPane.columnWeights = new double[] { 1.0, 1.0,
                Double.MIN_VALUE };
        gbl_contentPane.rowWeights = new double[] { 1.0, 1.0,
                Double.MIN_VALUE };
        contentPane.setLayout(gbl_contentPane);

        /* Bil #1 "Data" textfält */
        JPanel panelBil1Data = new JPanel();
        GridBagConstraints gbc_panelBil1Data = new GridBagConstraints();
        gbc_panelBil1Data.insets = new Insets(0, 0, 5, 5);
        gbc_panelBil1Data.fill = GridBagConstraints.BOTH;
        gbc_panelBil1Data.gridx = 0;
        gbc_panelBil1Data.gridy = 0;
        contentPane.add(panelBil1Data, gbc_panelBil1Data);

        JTextArea textBil1 = new JTextArea();
        textBil1.setText("Bil #1 Data");
        textBil1.setText(textBil1.getText() + "\nBilmodell:           "
                + bil1.getModel() + "\nÅrsmodell:           "
                + bil1.getYearManufactured() + "\nRegistreringsnummer: "
                + bil1.getRegistrationNumber() + "\nFärg: ");

        addCarData(bil1, textBil1);

        panelBil1Data.add(textBil1);

        JPanel panelBil1Color = new JPanel();
        panelBil1Color.setBackground(Color.GREEN);
        GridBagConstraints gbc_panelBil1Color = new GridBagConstraints();
        gbc_panelBil1Color.insets = new Insets(0, 0, 5, 0);
        gbc_panelBil1Color.fill = GridBagConstraints.BOTH;
        gbc_panelBil1Color.gridx = 1;
        gbc_panelBil1Color.gridy = 0;
        contentPane.add(panelBil1Color, gbc_panelBil1Color);

        JPanel panelBil2Data = new JPanel();
        GridBagConstraints gbc_panelBil2Data = new GridBagConstraints();
        gbc_panelBil2Data.insets = new Insets(0, 0, 0, 5);
        gbc_panelBil2Data.fill = GridBagConstraints.BOTH;
        gbc_panelBil2Data.gridx = 0;
        gbc_panelBil2Data.gridy = 1;
        contentPane.add(panelBil2Data, gbc_panelBil2Data);

        JTextArea textBil2 = new JTextArea();
        textBil2.setFont(stdFont);
        textBil2.setText("Bil #2 Data");
        textBil2.setText(textBil2.getText() + "\nBilmodell:           "
                + "\nÅrsmodell:           " + "\nRegistreringsnummer: "
                + "\nFärg: ");

        panelBil2Data.add(textBil2);

        JTextArea txtrTextbilfields = new JTextArea();
        txtrTextbilfields.setText(
                "\n" + bil2.getModel() + "\n" + bil2.getYearManufactured()
                        + "\n" + bil2.getRegistrationNumber());
        panelBil2Data.add(txtrTextbilfields);

        JPanel panelBil2Color = new JPanel();
        panelBil2Color.setBackground(Color.BLACK);
        GridBagConstraints gbc_panelBil2Color = new GridBagConstraints();
        gbc_panelBil2Color.fill = GridBagConstraints.BOTH;
        gbc_panelBil2Color.gridx = 1;
        gbc_panelBil2Color.gridy = 1;
        contentPane.add(panelBil2Color, gbc_panelBil2Color);
    }

    JTextArea addCarData(Personbil bil, JTextArea area)
    {
        JTextArea textArea = new JTextArea();
        textArea.setText(textArea.getText() + "\n Bilmodell:           "
                + bil.getModel() + "\n Årsmodell:           "
                + bil.getYearManufactured() + "\n Registreringsnummer: "
                + bil.getRegistrationNumber() + "\n Färg: ");

        return textArea;
    }
    //    private JLabel createInfoLabel(Personbil bil)
    //    {
    //        JLabel label = new JLabel("Bilmodell:           " + bil.getModel()
    //                             + "\n Årsmodell:           " + bil.getYearManufactured()
    //                             + "\n Registreringsnummer: " + bil.getRegistrationNumber()
    //                             + "\n Färg: ");
    //        
    //        return label;
    //    }
}
