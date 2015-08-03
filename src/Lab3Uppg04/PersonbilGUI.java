/**
 * DV017A :: Grundläggande programmering i Java
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 *
 * Labb #3    Uppgift 4
 */

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
import java.awt.FlowLayout;

/** 
 * Vidareutvecklat test av klassen 'Personbil'
 */
public class PersonbilGUI extends JFrame
{
    /* Används av "serialization runtime" .. */
    private static final long serialVersionUID = 1L;

    /* Variabler relaterat till utseende */
    static final Color backgroundColor = Color.RED;
    static final Font  stdFont         = new Font("monospaced", 0, 12);
    static final Font  stdFontBold     = new Font("monospaced", 1, 12);

    /* Bakomliggande "ritytan" */
    private JPanel contentPane;

    private static Personbil bil1;
    private static Personbil bil2;

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
     * Anropar metoder för att initiera och rita GUI:t 
     */
    public PersonbilGUI()
    {
        initialize();
        createFrame();

        /* Bil #1 "Data" textfält */
        createCar1Text();

        /* Bil #1 Färgat område */
        createCar1ColoredArea();

        /* Bil #2 "Data" textfält */
        createCar2Text();

        /* Bil #2 Färgat område */
        createCar2ColoredArea();
    }

    /**
     * Skapar objekt och konfigurera JFrame 
     */
    private void initialize()
    {
        bil1 = new Personbil("Saab", 1990, "CCC222", Color.RED);
        bil2 = new Personbil("Volvo", 1999, "ABC988 ", Color.BLACK);
        //        bil1 = new Personbil("Cadillac", 1903, "ABC123", Color.MAGENTA);
        //        bil2 = new Personbil("Austin", 1906, "DEF456", Color.GREEN);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Skapar en "frame" som delar upp ritytan i en "grid"-layout 
     */
    private void createFrame()
    {
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(Color.WHITE);
        setContentPane(contentPane);

        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[] { 0 };
        gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0 };
        gbl_contentPane.columnWeights = new double[] { 1.0 };
        gbl_contentPane.rowWeights = new double[] { 1.0, 0.0, 1.0, 0.0,
                Double.MIN_VALUE };
        contentPane.setLayout(gbl_contentPane);
    }

    /**
     * Ritar färgband som representerar färgen hos Bil #1 
     */
    private void createCar1ColoredArea()
    {
        JPanel panelBil1Color = new JPanel();
        FlowLayout flowLayout = (FlowLayout) panelBil1Color.getLayout();
        flowLayout.setHgap(0);
        flowLayout.setVgap(15);
        panelBil1Color.setBackground(bil1.getColor());

        GridBagConstraints gbc_panelBil1Color = new GridBagConstraints();
        gbc_panelBil1Color.insets = new Insets(0, 0, 5, 5);
        gbc_panelBil1Color.fill = GridBagConstraints.BOTH;
        gbc_panelBil1Color.gridx = 0;
        gbc_panelBil1Color.gridy = 1;

        contentPane.add(panelBil1Color, gbc_panelBil1Color);
    }

    /** 
     * Ritar färgband som representerar färgen hos Bil #2
     */
    private void createCar2ColoredArea()
    {
        JPanel panelBil2Color = new JPanel();
        FlowLayout flowLayout = (FlowLayout) panelBil2Color.getLayout();
        flowLayout.setHgap(0);
        flowLayout.setVgap(15);
        panelBil2Color.setBackground(bil2.getColor());

        GridBagConstraints gbc_panelBil2Color = new GridBagConstraints();
        gbc_panelBil2Color.insets = new Insets(0, 0, 0, 5);
        gbc_panelBil2Color.fill = GridBagConstraints.BOTH;
        gbc_panelBil2Color.gridx = 0;
        gbc_panelBil2Color.gridy = 3;

        contentPane.add(panelBil2Color, gbc_panelBil2Color);
    }

    /**
     * Ritar text med data för Bil #1 
     */
    private void createCar1Text()
    {
        JPanel panelBil1Data = new JPanel();
        panelBil1Data.setBackground(Color.WHITE);

        GridBagConstraints gbc_panelBil1Data = new GridBagConstraints();
        gbc_panelBil1Data.anchor = GridBagConstraints.BASELINE;
        gbc_panelBil1Data.insets = new Insets(0, 0, 5, 5);
        gbc_panelBil1Data.fill = GridBagConstraints.HORIZONTAL;
        gbc_panelBil1Data.gridx = 0;
        gbc_panelBil1Data.gridy = 0;
        contentPane.add(panelBil1Data, gbc_panelBil1Data);

        JTextArea textBil1 = new JTextArea();
        textBil1.setFont(stdFont);
        textBil1.setText("Bil #1 Data");
        addLine(textBil1, "Bilmodell", bil1.getModel());
        addLine(textBil1, "Årsmodell",
                String.valueOf(bil1.getYearManufactured()));
        addLine(textBil1, "Registreringsnummer",
                String.valueOf(bil1.getRegistrationNumber()));
        addLine(textBil1, "Färg", bil1.getColor().toString());

        panelBil1Data.add(textBil1);
    }

    /** 
     * Ritar text med data för Bil #2 
     */
    private void createCar2Text()
    {
        JPanel panelBil2Data = new JPanel();
        panelBil2Data.setBackground(Color.WHITE);

        GridBagConstraints gbc_panelBil2Data = new GridBagConstraints();
        gbc_panelBil2Data.anchor = GridBagConstraints.BASELINE;
        gbc_panelBil2Data.insets = new Insets(0, 0, 5, 5);
        gbc_panelBil2Data.fill = GridBagConstraints.HORIZONTAL;
        gbc_panelBil2Data.gridx = 0;
        gbc_panelBil2Data.gridy = 2;
        contentPane.add(panelBil2Data, gbc_panelBil2Data);

        JTextArea textBil2 = new JTextArea();
        textBil2.setFont(stdFont);
        textBil2.setText("Bil #2 Data");
        addLine(textBil2, "Bilmodell", bil2.getModel());
        addLine(textBil2, "Årsmodell",
                String.valueOf(bil2.getYearManufactured()));
        addLine(textBil2, "Registreringsnummer",
                String.valueOf(bil2.getRegistrationNumber()));
        addLine(textBil2, "Färg", bil2.getColor().toString());

        panelBil2Data.add(textBil2);
    }

    /**
     * Lägger till en rad text med två fält, str1 och str2, i JTextArea
     * textArea.
     * @param textArea      text läggs till här
     * @param str1          textfält 1
     * @param str2          textfält 2
     */
    private static void addLine(JTextArea textArea, String str1, String str2)
    {
        final String format = "%1$-20s : %2$-15s";

        String line = String.format(format, str1, str2);
        textArea.append("\n" + line);
    }

}
