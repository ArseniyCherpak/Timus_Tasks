package task_2100;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        String inputFileName = "src/task_2100/input.txt";   // адрес до папки с файлом

        boolean oj = System.getProperty("ONLINE_JUDGE") != null;    // (для тестирования) переменная возвращает:
                                                                    // true, если программа запущена на сервере
                                                                    // false, если программа запущена локально

        int marshalAndLilly = 2;

        try // Механизм исключений. Если внутри фигурных скобок что-то пойдёт не так, то отработает код из catch
        {

            BufferedReader bufferedReader =
                    oj ? /* тернанрый оператор */ new BufferedReader(new InputStreamReader(System.in)) : //если oj - true выполнится это
                            new BufferedReader(new FileReader(inputFileName));  //если oj - false выполнится это

            String readLine;

            int numberOfFriends = 0;
            int numberOfPairs = 0;

            while ((readLine = bufferedReader.readLine()) != null) //в переменную readLine будут записываться стоки из файла, пока значение строки не будет пустым
            {
                if (numberOfFriends == 0)
                {
                    numberOfFriends = Integer.parseInt(readLine); // преобразуем строковое значение к числу
                    continue; //считав первую строку переходим к следующей
                }
                if (readLine.contains("+")) // contains - метод класса String
                {
                    numberOfPairs++;
                }
            }

            int result;

            int guests = (marshalAndLilly + numberOfFriends + numberOfPairs);

            if (guests == 13)
            {
                result = (guests + 1) * 100;
            }
            else
            {
                result = guests * 100;
            }



            System.out.println(result);

        } catch (IOException exception) {
            exception.printStackTrace();

        }


    }

}