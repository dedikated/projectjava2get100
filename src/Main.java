public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int balance = 200;
        int deposit = 900;
        int account = balance + deposit;
        int bonus = account / 100;
        System.out.println("Итоговый счет " + account);
        if (account > 1000) {
            System.out.println("Бонусы " + bonus);
        } else {
            System.out.println("Пополните счет от 1000 рублей, чтобы получить бонус");
        }

    }
}