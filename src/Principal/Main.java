package Principal;

import Classes.Lexico;
import Classes.Sintaxico;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) throws IOException {
        menuPrincipal();
    }

    public static void menuPrincipal() throws IOException {
        int opcao = 0;

        try {
            opcao = Integer.valueOf(JOptionPane.showInputDialog(null, "|----------------------- Menu Principal ---------------------------|\n"
                    + "|  1 - Lexico\n"
                    + "|  2 - Sintaxico\n"
                    + "|  3 - Semantico\n"
                    + "|  4 - CodigoFinal\n"
                    + "|  5 - Sair\n"
                    + "|--------------------------------------------------------------|\n\n"
                    + "Digite a opção requerida:"));
        } catch (NumberFormatException e) {
            if (e.getMessage().equals("null")) {
                System.exit(0);
            }
            JOptionPane.showMessageDialog(null, "Digite uma opção valida !! " + e.getMessage());
            menuPrincipal();
        }

        switch (opcao) {
            case 1:
                //fazer dps pro usuario colocar a URL no menu

                String URL = "C:\\Users\\igor_\\OneDrive\\Documentos\\NetBeansProjects\\Compilador8086\\src\\Util\\Gramatica.txt";
                Lexico arquivo = new Lexico();
                arquivo.iniciarLista(URL);
                arquivo.imprimirTabelaTokens();
                menuPrincipal();

            case 2:
                Sintaxico teste = new Sintaxico();
                teste.imprimirTeste();
                menuPrincipal();
                break;
                
            case 3:
                break;

            case 4:

                break;

            case 5:
                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(null, "\n Opção invalida tente novamente!!");
                menuPrincipal();
                break;
        }
    }
}