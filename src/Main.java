public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int balance = 300;
        int deposit = 900;
        int account = balance + deposit;
        int bonus = account / 100;
        int overall = account + bonus;
        if (account > 1000) {
            System.out.println("Итоговый счет с бонусами: " + overall);
        } else {
            System.out.println("Баланс " + account + ". Пополните баланс от 1000 рублей, чтобы получить бонус");
        }
        ;

    }
}