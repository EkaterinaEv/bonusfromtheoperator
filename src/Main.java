public class Main {
    public static void main(String[] args) {
        int balance = 100; // начальная сумма на счете клиента
        int depositMoney = 300; // сумма пополнения счета

        if (depositMoney < 1000) {
            System.out.println("Количество начисленных бонусов: 0");
            System.out.println("Итоговая сумма на счете:");
            System.out.println(balance + depositMoney);
        } else {
            System.out.println("Количество начисленных бонусов:");
            System.out.println(depositMoney / 100);
            System.out.println("Итоговая сумма на счете:");
            System.out.println(depositMoney / 100 + balance + depositMoney);
        }
    }
}