public class Main {
    public static void main(String[] args) {
        int balance = 100; // начальная сумма на счете клиента
        int depositmoney = 300; // сумма пополнения счета

        if (depositmoney < 1000) {
            System.out.println("Количество начисленных бонусов: 0");
            System.out.println("Итоговая сумма на счете:");
            System.out.println(balance + depositmoney);
        } else {
            System.out.println("Количество начисленных бонусов:");
            System.out.println(depositmoney / 100);
            System.out.println("Итоговая сумма на счете:");
            System.out.println(depositmoney / 100 + balance + depositmoney);
        }
    }
}