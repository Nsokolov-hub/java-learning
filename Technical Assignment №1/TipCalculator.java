public class TipCalculator {
    public static void main(String[] args) {
        // Входные данные
        double billAmount = 1000;        // Сумма счёта
        double tipPercentage = 10;       // Процент чаевых
        int numberOfPeople = 4;          // Количество людей, участвующих в оплате
        
        // Расчёты
        // Рассчитываем сумму чаевых
        double tipAmount = billAmount * tipPercentage / 100;
        
        // Рассчитываем общую сумму к оплате
        double totalAmount = billAmount + tipAmount;
        
        // Рассчитываем сумму на одного человека
        double perPersonAmount = totalAmount / numberOfPeople;
        
        // Вывод результатов с форматированием
        System.out.printf("Сумма счёта: %.2f%n", billAmount);
        System.out.printf("Процент чаевых: %.2f%n", tipPercentage);
        System.out.printf("Сколько человек участвовало в обеде: %d%n", numberOfPeople);
        System.out.printf("Общий счёт: %.2f%n", totalAmount);
        System.out.printf("Процент чаевых: %.1f%%%n", tipPercentage);
        System.out.printf("С каждого: %.2f%n", perPersonAmount);
    }
}
