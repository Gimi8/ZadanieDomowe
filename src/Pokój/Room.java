package Pokój;

public class Room {

    double wysokosc;
    double szerokosc;
    double długosc;
    double długosć2;
    String nazwa;


    public Room(String nazwa, double wysokosc, double szerokosc, double długosc, double długosć2) {
        this.nazwa = nazwa;
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
        this.długosc = długosc;
        this.długosć2 = długosć2;
    }

    public double polePowierchni() {

        return (getDługosc() * getDługosć2());
    }

    public double objetosc() {

        return (getDługosc() * getDługosć2() * getWysokosc());
    }

    public void wyswietleniePow() {
        System.out.printf("Pole powierzchni pokoju wynosi = %.2f m2\n", polePowierchni());
    }

    public void wyswietlenieObj() {

        System.out.printf("Objętość pokoju wyonosi = %.2f m3\n", objetosc());
    }

    public double malowanie() {
        return ((((getDługosć2() + getDługosc()) * 2) * getWysokosc()) / 10);
    }

    public void farba() {
        System.out.printf("Aby pomalować ściany potrzeba %.2f  litrów farby", malowanie());
    }


    public double getWysokosc() {
        return wysokosc;
    }


    public double getSzerokosc() {
        return szerokosc;
    }


    public double getDługosc() {
        return długosc;
    }


    public double getDługosć2() {
        return długosć2;
    }

    public String getNazwa() {
        return nazwa;
    }
}








