import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task4() {
        System.out.println("Задача 4"); // сколько месяцев нужно чтобы накопить 12_000_000 рублей, если к накоплению прибавляется ещё 7% в месяц
        int monthlyPayment = 15_000+15000*7/100;
        int total = 0;
        int month = 0;
        while (total < 12_000_000) {
            total = total + monthlyPayment + total*7/100;
            month++;
            System.out.println("В " + month + "-м месяце накопленно " + total + " рублей");
        }
        System.out.println("Васька крутой пацан, он собрал баблишко на мечту с сумме " + total + " рублей за " + month + " месяцев и теперь купит крутой мотик Honda RC213 V-S");
        System.out.println();
    }
    public static void task5() {
        System.out.println("Задача 5"); // Сделать вывод каждого 6-го месяца
        int monthlyPayment = 15_000+15000*7/100;
        int total = 0;
        int month = 0;
        while (total < 12_000_000) {
            total = total + monthlyPayment + total*7/100;
            month++;
            if (month % 6 == 0){
                System.out.println("В " + month + "-м месяце накопленно " + total + " рублей");
            }
        }
        System.out.println("Васька крутой пацан, он собрал баблишко на мечту с сумме " + total + " рублей за " + month + " месяцев и теперь купит крутой мотик Honda RC213 V-S");
        System.out.println();

    }
    public static void task6() {
        System.out.println("Задача 6"); //Какой будет сумма накоплений каждые полгода на протяжении 9 лет
        int monthlyPayment = 15_000 + 15000 * 7 / 100;
        int total = 0;
        int month = 0;
        var totalMonth = 0;
        while (month < 9 * 12) {
            month++;
            total = total + monthlyPayment + total * 7 / 100;
            totalMonth = month;
            if (totalMonth % 6 == 0) {
                System.out.println("В " + totalMonth + "-м месяце накопленно " + total + " рублей");
            }
        }
        System.out.println("Васька крутой пацан, он собирал баблишко на мечту целых " + totalMonth + " месяцев и накопил " + total + " рублей!");
        System.out.println();
    }
    public static void task7() {
        System.out.println("Задача 7"); //Программа считает дни месяца по датам, определяет, какой день пятница, и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
        var daysMonth = 31; // количество дней в месяце
        var firstFridayMonth = 1; // первая пятница в месяце
        var cuttingDays = daysMonth - (daysMonth-firstFridayMonth)%7; //получаем число кратное 7 без остатка

        for (int i = firstFridayMonth; i <= cuttingDays ; i=i+7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();
    }
    public static void task8() {
        System.out.println("Задача 8"); //Написать астрономическое приложение, которое считает, когда над Землей пролетает комета
        var currentYear = 2022; // текущий год
        var frequencyCometsPassage = 79; //комета появляется каждые столько лет
        var year = 0; //год начала отчета
        while (year<=currentYear+100){
            year = year+frequencyCometsPassage;
            if ((year>currentYear-200)&(year<=currentYear)){
                System.out.println("До " + currentYear + " года комета появлялась в " + year + " году");
            }
            if ((year>currentYear)&(year<=currentYear+100)){
                System.out.println("После " + currentYear + " года комета появится ещё в " + year + " году");
                }
            }
        }

    }

}