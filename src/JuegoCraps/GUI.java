package JuegoCraps;

import javax.swing.*;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class GUI {

    private static final String MENSAJE_INICIO="";

    private Headers headersProjects;
    private JLabel dado1,dado2;
    private JButton lanzar;
    private JPanel panelDados,panelResultados;
    private ImageIcon imageDado;
    private JTextArea resultados;


    public GUI(){
        initGUI();

        this.setTitle("Juego Craps");
        this.setSize(200,100);
        this.pack();

        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

    private void initGUI() {

        headersProjects=new Headers("Mesa Juego Craps", Color.BLACK);

        this.add(headersProjects,BorderLayout.NORTH);

    }

}

