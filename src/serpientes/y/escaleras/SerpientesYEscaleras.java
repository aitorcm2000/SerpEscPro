/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serpientes.y.escaleras;

/**
 *
 * @author dam127
 */
import java.util.Scanner;

public class SerpientesYEscaleras {
    private Jugador player;
    private Jugador player2;
    private tablero board;
    private Dado dice;

    public SerpientesYEscaleras(String playerName,String playerName2) {
        player = new Jugador(playerName);
        player2 = new Jugador(playerName2);
        board = new tablero(100);
        dice = new Dado();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al juego de Serpientes y Escaleras!");
        Jugador currentPlayer = player;

        while (true) {
            System.out.println(currentPlayer.getName() + ", presiona enter para lanzar el dado");
            scanner.nextLine();

            int diceResult = dice.roll();
            int newPosition = currentPlayer.getPosition() + diceResult;
            if (newPosition > 100) newPosition = currentPlayer.getPosition();

            newPosition = board.checkSnakeOrLadder(newPosition);

            currentPlayer.setPosition(newPosition);
            System.out.println(currentPlayer.getName() + " ha lanzado un " + diceResult + " y se ha movido a la posición " + currentPlayer.getPosition());

            if (currentPlayer.getPosition() == 100) {
                System.out.println("Felicidades " + currentPlayer.getName() + ", has ganado!");
                break;
            }

            // Cambiar turno al otro jugador
            currentPlayer = (currentPlayer == player) ? player2 : player;
        }

        scanner.close();
    }

    public static void main(String[] args) {
        SerpientesYEscaleras game = new SerpientesYEscaleras("Jugador", "Bot");
        game.start();
    }
}

