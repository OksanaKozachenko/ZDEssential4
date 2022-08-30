package task5;

import java.util.Scanner;

import static task5.ConverterTemperature.convert;

public class Main {
    public static void main(String[] args) {

        System.out.println("ВВедіть градуси в кельвінах: ");
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        convert(K);


    }
}
