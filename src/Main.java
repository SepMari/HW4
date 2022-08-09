public class Main {
    public static void main(String[] args) {
        //Задание 1
        int i = 0;

        while (i < 10) {
            ++i;
            System.out.print(i + " ");
        }
        System.out.println();

        for (; i > 0; i--) {
        System.out.print(i + " ");
        }
        System.out.println();

        //Задание 2
        int oneFriday = 5;

        for (int day = oneFriday; day<=31; day += 7) {
                System.out.println("Сегодня пятница," + day + "-е число. Необходимо подготовить отчет.");
            }

        //Задание 3
        int year = 2022;
        int start = year - 200;
        int end = year + 100;

        for (int l = start; l <= end; l++) {
            if ( l % 79 == 0) {
                System.out.println(l);
            }
        }

    }
}