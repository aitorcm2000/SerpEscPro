/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serpientes.y.escaleras;
   import javax.swing.*;
    import java.awt.*;
import java.awt.event.ActionListener;
/**
 *
 * @author dam127
 */
import java.util.Scanner;

public class SerpientesYEscaleras {



    private JButton rollDiceButton;
    private JLabel statusLabel;
    private GamePanel gamePanel;
    private GameController controller;

    public SerpientesYEscaleras() {
        setTitle("Serpientes y Escaleras");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        gamePanel = new GamePanel();
        add(gamePanel, BorderLayout.CENTER);

        rollDiceButton = new JButton("Lanzar dado");
        statusLabel = new JLabel("Listo para jugar");

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bottomPanel.add(rollDiceButton);
        bottomPanel.add(statusLabel);
        add(bottomPanel, BorderLayout.SOUTH);

        controller = new GameController(gamePanel, statusLabel);
        rollDiceButton.addActionListener((ActionListener) controller);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            SerpientesYEscaleras frame = new SerpientesYEscaleras();
            frame.setVisible(true);
        });
    }

    private void setTitle(String serpientes_y_Escaleras) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setLayout(BorderLayout borderLayout) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void add(GamePanel gamePanel, String CENTER) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



