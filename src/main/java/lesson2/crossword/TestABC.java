package lesson2.crossword;

public class TestABC {
    public static void main(String[] args) {
        C c = new C();
        c.hello();

        B b = new B();
        //b.world();  //если будет private, то не можем это вызвать, поскольку нет доступа к приватным функциям
    }
}
