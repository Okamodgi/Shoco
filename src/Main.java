public class Main {
    public static void main(String[] args) {
        int money = 15;  // Имеющиеся деньги
        int price = 1;   // Цена за шоколадку
        int wrap = 3;    // Количество обёрток, нужное, чтобы получить ещё одну шоколадку

        int chocolates = calculateChocolates(money, price, wrap);
        System.out.println("Максимальное количество шоколадок: " + chocolates);
    }

    public static int calculateChocolates(int money, int price, int wrap) {
        int chocolatesBought = money / price;  // Количество шоколадок, которое можно купить за имеющиеся деньги
        int wrappers = chocolatesBought;       // Начальное количество обёрток

        while (wrappers >= wrap) {
            int additionalChocolates = wrappers / wrap;  // Количество шоколадок, которое можно получить из обёрток
            chocolatesBought += additionalChocolates;    // Увеличиваем общее количество шоколадок
            wrappers = wrappers % wrap + additionalChocolates;  // Оставшиеся обёртки
        }
        return chocolatesBought;
    }
}
