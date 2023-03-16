import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> ganadasj1 =new ArrayList<>();
        ArrayList<Integer> ganadasj2 =new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        int victoriasj1=0;
        int victoriasj2=0;
        int empates = 0;

        int arj1=0;
        int arj2=0;



        while (!salir){
            System.out.println("1. Jugar ");
            System.out.println("2  Ver Jugadas acumuladas jugador 1 ");
            System.out.println("3. Terminar Juego");


            System.out.println("Introduce una opcion por favor");


            Juego jue = new Juego();

            Random ale = new Random();
            //genero numero random
            int j1= 1+ ale.nextInt(3);
            int j2= 1+ ale.nextInt(3);

            int jganador = jue.juego(j1,j2);
            opcion= teclado.nextInt();
            switch (opcion){
                case 1:

                            if (jganador == 1) {
                                victoriasj1++;
                                ganadasj1.add(victoriasj1);
                                System.out.println("ganadas por jugador 1 :->>>");
                                System.out.println("ARRAY"+ganadasj1.size() );

                                System.out.println("El jugador  1 a ganado " + victoriasj1 + " duelos ");


                            } else if (jganador == 2) {
                                System.out.println("Jugador 2 ha Ganado");
                                victoriasj2++;

                                ganadasj2.add(victoriasj2);
                                System.out.println("El jugador  2 a ganado " + victoriasj2+ " duelos ");

                            } else if (jganador == 3) {
                                System.out.println("Empate");
                                empates++;
                                System.out.println("se han acunmulado un total de " + empates + " empates ");
                            }
                            break;


                case 2:
                    System.out.println("no hay nada");
                    break;


                case 3:
                    System.out.println("Exito gracias por jugar");
                    salir = true;
                    break;

                default:
                    System.out.println("Opcion Invalida intente nuevamente");
            }


        }


    }
}