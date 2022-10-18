import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][8];
        int [][] array2 = new int[5][2];
        Scanner tam = new Scanner(System.in);
        System.out.println("Запишите элементы массивы");

        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array.length; j++) {
                int number = tam.nextInt();
                array[i][j] = number;
            }
        }
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int max = 0;
        int min = 0;
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array.length; j++) {
                if (max <= array[i][j]) {
                    max = array[i][j];
                }
                if (min>=array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        System.out.println(max + " " + min);

    }
    }
