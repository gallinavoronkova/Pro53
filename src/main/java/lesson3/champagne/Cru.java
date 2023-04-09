package lesson3.champagne;

// создать перчисление с тремя элементами
// с каждым элементом связать качество
public enum Cru {
    AUTRE(80),
    PREMIER(90),
    GRAND(100);

    private int quality;

    Cru(int quality) {
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }


    //AUTRE 80
    //PREMIER 90
    //GRAND 100

    //добавить поле Качаество
    //добавить геттер
    //добавить консртуктор
}
