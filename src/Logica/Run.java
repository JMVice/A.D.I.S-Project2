package Logica;

import Objetos.Fecha;
import UI.Cliente.MMetodoPago;
import UI.MLogin;
import javax.swing.JOptionPane;

//Esta clase contiene metodos generalizados para concretas funciones del programa
//que no ameritan la creación de su propia clase.
public class Run {

    //Metodo de inicializacion del programa. Se coloca en el Main.
    public static void start_program() {
        //Abre el menu de log in.
        MLogin mLogin = new MLogin();
    }

    //Metodo que genera numeros aleatorios segun se especifique como un maximo
    //minimo y la cantidad de digitos deseado.
    public static int random_x_between_y(int minimum, int maximum, int digits_number) {
        int result = 1;
        int random_multiplier = 10;
        switch (digits_number) {
            case 2:
                random_multiplier = 100;
                break;
            case 3:
                random_multiplier = 1000;
                break;
            case 4:
                random_multiplier = 10000;
                break;
            case 5:
                random_multiplier = 100000;
                break;
            case 6:
                random_multiplier = 1000000;
                break;
            case 7:
                random_multiplier = 10000000;
                break;
            case 8:
                random_multiplier = 100000000;
                break;
            case 9:
                random_multiplier = 1000000000;
                break;
            default:
                random_multiplier = 10;
                System.out.println("Not case found. Settled to 1 digit.");
        }
        while (true) {
            result = (int) (Math.random() * random_multiplier);
            if (result >= minimum && result <= maximum) {
                break;
            }
        }
        return result;
    }

    //Metodo que regresa una letra aleatoria del alfabeto.
    public static String randomLetter() {
        String[] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "O", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "Z", "X", "Y"};
        String result = "";
        int randomLetterIndex = 0;
        while (true) {
            randomLetterIndex = ((int) (Math.random() * 100));
            if (randomLetterIndex <= 25) {
                break;
            }
        }
        result = alfabeto[randomLetterIndex];
        return result;
    }

    /**
     * 0=Error 1=Message 2=Alert 3=What
     *
     * @param type
     * @param message
     * @param title Este metodo es para mostrar JoptionPane en forma de mensaje
     * en pantalla.
     */
    public static void message(String message, String title, int type) {
        switch (type) {
            case 0:/*Error*/
                JOptionPane.showMessageDialog(null, message, title, 0);
                break;
            case 1:/*Message*/
                JOptionPane.showMessageDialog(null, message, title, 1);
                break;
            case 2:/*Alert*/
                JOptionPane.showMessageDialog(null, message, title, 2);
                break;
            case 3:/*What*/
                JOptionPane.showMessageDialog(null, message, title, 3);
                break;

            default:
                throw new AssertionError();
        }
    }

    /**
     * options: 0: Yes, no. Yes=0. No=1. X=-1. 1: Yes, no, cancel. Yes=0. No=1.
     * Cancel:2. X=-1. 2: Accept, cancel. Accept=0. Cancel:2. X=-1.
     *
     * simbol: 0: Error 1: Info 2: Alert 3: Ask
     */
    public static int askMessage(String message, String title, int option, int simbol) {
        return JOptionPane.showConfirmDialog(null, message, title, option, simbol);
    }

}
