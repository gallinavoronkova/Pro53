package lesson4.reference;

public class ReferenceTester {
    public static void main(String[] args) {
        //int, double, char, float, boolean, byte, long, short - поскольку они с маленькой написаны, то это примитивные типы данных
        //String, Integer, Double, [] - ссылочные типы данных

        int a[] = new int[1]; //сздали новый обьект в памяти heap, а int a[] - это ссылка на него
        a[0] = 10;
        changeArray(a);
        System.out.println(a[0]);
    }

    private static void changeArray(int[] array) {
        array[0] = 1000;
    }

}
