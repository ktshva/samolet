public class Main {
    public static void main(String[] args) {
        int ticket = 14236; // стоимость билета
        int miles = 20; // количество рублей для одной бонусной мили

        int bonus = ticket / miles;
        System.out.println(bonus);
    }
}