package lesson2.shape;

public class FigureTester {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Circle(15);
        figures[1] = new Rectangle(5, 10);
        figures[2] = new Triangle(5, 10, 15);

        System.out.println("Perimeter: " + allPerimeters(figures));
        System.out.println("Area: " + allAreas(figures));

    }
// В FigureTester дописать функции для вычисления суммарной площади и суммарного периметра всех фигур из массива figures.
    private static double allPerimeters(Figure[] figures) {
        double result = 0;
        for (int i = 0; i < figures.length; i++) {
            result = result + figures[i].perimeter();
        }
        return result;
    }

    private static double allAreas(Figure[] figures) {
        double result = 0;
        for (int i = 0; i < figures.length; i++) {
            result = result + figures[i].area();
        }
        return result;
    }

}
