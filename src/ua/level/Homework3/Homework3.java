package ua.level.Homework3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        /*	Для введённого пользователем с клавиатуры натурального числа посчитайте
        сумму всех его цифр (заранее не известно сколько цифр будет в числе). */

        int numberInt;

        do {

            System.out.println("Input positive integer number: ");
            Scanner in = new Scanner(System.in);             // ввод числа с клавиатуры
            numberInt = in.nextInt();                        // присваиваем переменной значение, введенное с клавиатуры
        }

        while (numberInt < 0);

        System.out.println("Your number is: " + numberInt);

        int sum = 0;                                // делаем сумму всех цифр ранее введенного числа
        do {
            sum = sum + numberInt % (10);          // путем складывания остатков от деления числа на 10
            numberInt = numberInt / 10;
        }
        while (numberInt > 0);                     // пока остаток от деления не будет равен нулю

        System.out.println(" Sum of all digits of your number is :  " + sum);



        /*●	Выведите на экран первые 11 членов последовательности Фибоначчи.
        Напоминаем, что первый и второй члены последовательности равны единицам,
        а каждый следующий — сумме двух предыдущих.
         */

        int[] fibonachiArray = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};  // первый способ
        System.out.print("Fibonachi syquence: ");
        for (int i = 0; i < fibonachiArray.length; i++) {
            System.out.print(fibonachiArray[i] + " ");
        }
        System.out.println();

        int fibonachi1 = 1;                        // второй способ
        int fibonachi2 = 1;
        System.out.println(fibonachi1);
        System.out.println(fibonachi2);
        int fibonachi;
        for (int j = 0; j < 9; j++) {
            fibonachi = fibonachi1 + fibonachi2;
            System.out.println(fibonachi);
            fibonachi1 = fibonachi2;
            fibonachi2 = fibonachi;

        }

/*●	В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую неделю
трамвайное депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999.
 «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних
 трёх цифр, как, например, в билетах с номерами 003102 или 567576. Трамвайное депо решило
 подарить сувенир обладателю каждого счастливого билета и теперь раздумывает, как много сувениров
  потребуется. С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?
 */

        int[] biletNumber = new int[6];
        int count = 0;

        for (int a = 0; a <= 9; a++) {
            biletNumber[0] = a;
            for (int b = 0; b <= 9; b++) {
                biletNumber[1] = b;
                for (int c = 0; c <= 9; c++) {
                    biletNumber[2] = c;
                    for (int d = 0; d <= 9; d++) {
                        biletNumber[3] = d;
                        for (int e = 0; e <= 9; e++) {
                            biletNumber[4] = e;
                            for (int f = 0; f <= 9; f++) {
                                biletNumber[5] = f;
                                if ((biletNumber[0] + biletNumber[1] + biletNumber[2]) == (biletNumber[3] + biletNumber[4] + biletNumber[5]))
                                    count++;
                            }

                        }
                    }
                }
            }
        }


        System.out.println("Number of happy tikets is: " + count);
        System.out.println();


    /* ●	Электронные часы показывают время в формате от 00:00 до 23:59.
    Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается
    симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).
     */
    int combination = 0;
    int[] clock = new int[4];
    int n;

        for (int i = 0; i <= 2;i++)     {
        clock[0] = i;
        if (i != 2)
             n = 9;
            else n = 4;
            for (int j = 0; j <= n; j++) {
                clock[1] = j;
                for (int g = 0; g <= 5; g++) {
                    clock[2] = g;
                    for (int d = 0; d <= 9; d++) {
                        clock[3] = d;
                        if ((clock[0] == clock[3]) && (clock[1] == clock[2])) {
                                  combination++;
                              }
                        //for (int a = 0; a < 4; a++) {              //вывод на экран всех комбинаций
                          //  System.out.print(clock[a]);
                       // }
                        //System.out.println();
                    }
                }
            }

    }
        System.out.println("Number of Clock combinations : "+combination);
        System.out.println();

/*
●	Создать двумерный массив из 8 строк по 5 столбцов в каждой
 из случайных целых чисел из отрезка [10;99]. Вывести массив на экран
 */

    int[][] arrayNew = new int[8][5];
    int a = 10;
    int b = 99;

        for(
    int i = 0;
    i< 8;i++)

    {
        System.out.print("String of random array " + (i + 1) + ": ");
        for (int j = 0; j < 5; j++) {
            arrayNew[i][j] = (int) (Math.random() * (b - a + 1) + a);
            System.out.print(arrayNew[i][j] + " ");
        }
        System.out.println();
    }


}


}
