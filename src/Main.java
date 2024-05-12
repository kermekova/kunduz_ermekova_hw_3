public class Main {
    public static void main(String[] args) {
        double [] num = {1.0, 2.0, -23.2, 4.3, -4.3,5.1, 5.6, -3.6, -2.7, -1.8,-5.4, 3.3, 6.6, 6.5,4.3 };
        double sum = 0;
        int count = 0;
        boolean negativeFound = false;
        for (double number : num) {
           if (number < 0) {
               negativeFound = true;
           }
           if (number > 0 && negativeFound) {
               sum += number;
               count += 1;
           }
        }
        if (negativeFound == false)
            System.out.println("Отрицательных чисел нет");
        else {
         System.out.println("Количество положительных чисел " + count);
         System.out.println("Сумма чисел: " + sum);
         System.out.println("Средняя арифметическая " + (sum/count));
        }
    }
}
