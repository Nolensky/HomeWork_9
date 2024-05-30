public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int [] payments = new int [5];
        payments[0] = 124;
        payments[1] = 127;
        payments[2] = 185;
        payments[3] = 165;
        payments[4] = 110;
        int sumPayments = 0;
        for (int elementPayments : payments) {
            sumPayments += elementPayments;
        }
        System.out.println("Сумма трат за месяц составила " + sumPayments +" рублей");
        System.out.println(" ");

        System.out.println("Задача 2");
        int minPayment = payments[0];
        int maxPayment = payments[0];
        for (final int currentElement : payments) {
            if (currentElement < minPayment) {
                minPayment = currentElement;
            }
            if (currentElement > maxPayment) {
                maxPayment = currentElement;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayment +" рублей." +
                " Максимальная сумма трат за неделю составила " + maxPayment +" рублей");
        System.out.println(" ");
        System.out.println("Задача 3");
            double sumPayments2 = 0;
        for (int elementPayments : payments) {
            sumPayments2 += elementPayments;
        }
        double averagePayment = sumPayments2 / payments.length;
        System.out.println("Средняя сумма трат за месяц составила " + averagePayment + " рублей");
        System.out.println(" ");
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}