package com.fosanzdev.BlackJack;

import com.fosanzdev.BlackJack.Game.GameFlow;
import com.fosanzdev.jresources.JMenuGenerator;

public class Main {

    public static void main(String[] args) {
        GameFlow game = new GameFlow();
        JMenuGenerator menu = new JMenuGenerator();
        String mainMenu = menu.generateMenu("BlackJack", "Nueva partida", "Mostrar estadísticas", "Configuración", "Salir");
        String configMenu = menu.generateMenu("Configuración", "Cambiar número de jugadores",
                "Cambiar la apuesta base", "Cambiar el saldo inicial de los jugadores",
                "Cambiar el saldo inicial de la banca", "Volver al menú principal");
        System.out.println(mainMenu);
    }
}
