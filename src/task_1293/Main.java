package task_1293;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // класс сканер, для считывания данных с консоли
        PrintWriter out = new PrintWriter(System.out); // класс, чтобы выводить в консоль текст

        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();

        //int x = in.nextInt(); // считываем значение из консоли (тест)
        int result = (N * (A*B))*2;

        //out.println("x = "+ x); // вывод в консоль (тест)

        out.println(result);
        out.flush(); // закрываем соединение вывода в консоль
    }

}
