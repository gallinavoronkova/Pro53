package lesson3.pizza;

//именование классов
//крокодил данди
// CrocodileDandy

//свойство или функция
//сalculateSalary

//константы
//PI

public class Pizza {
    //private String size;
    private PizzaSize size;
    private int ham;
    private int cheese;
    private int peperoni;
    private int pineaple;

    public Pizza(PizzaSize size, int ham, int cheese, int peperoni, int pineaple) {
        this.size = size;
        this.ham = ham;
        this.cheese = cheese;
        this.peperoni = peperoni;
        this.pineaple = pineaple;
    }

    public int calculatePrice()
    {
        int price = 0;
        // SMALL 10
        // MIDDLE 12
        // LARGE 14
        switch (size)
        {
            case SMALL:
                price += 10;
                break;
            case MIDDLE:
                price += 12;
                break;
            case LARGE:
                price += 14;
                break;
        }
        // за каждый дополнительный топпинг по 2
        price += (ham + cheese + peperoni + pineaple) * 2;
        return price;
    }
    public static void main(String[] args) {
        Pizza p1 = new Pizza(PizzaSize.SMALL, 1, 0, 1, 3);
        // Pizza p1 = new Pizza("SMALL", 1, 0, 1, 3);
        System.out.println(p1.calculatePrice());
    }
}
