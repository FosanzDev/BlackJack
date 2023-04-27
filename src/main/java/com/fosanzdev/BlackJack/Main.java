package com.fosanzdev.BlackJack;

import com.fosanzdev.BlackJack.Game.GameFlow;
import com.fosanzdev.BlackJack.Players.JugadorHumano;
import com.fosanzdev.jresources.JMenuGenerator;

import java.util.Scanner;

/**
 * Clase Main
 * Contiene el método main del programa
 * Implementa la interfaz JMenuGenerator para generar los menús.
 * JMenuGenerator es un generador de menus propia de la librería JResources de @FosanzDev
 * @see com.fosanzdev.jresources.JMenuGenerator
 */
public class Main {

    private static final JugadorHumano defaultPlayer = new JugadorHumano("Jugador", 1000);

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        GameFlow game = new GameFlow(defaultPlayer);
        JMenuGenerator menu = new JMenuGenerator();

        String mainMenu = menu.generateMenu("BlackJack", "Nueva partida", "Mostrar estadísticas", "Configuración", "Salir");
        String configMenu = menu.generateMenu("Configuración", "Cambiar número de jugadores",
                "Cambiar la apuesta base", "Cambiar el saldo inicial de los jugadores",
                "Cambiar el saldo inicial de la banca", "Volver al menú principal");
        System.out.println(mainMenu);
        System.out.print("Elige una opción: ");
        int option = lector.nextInt();
        lector.nextLine();
    }
}
