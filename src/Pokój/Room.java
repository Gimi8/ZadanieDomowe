package Pokój;

public class Room  extends Main {

    double wysokosc;
    double szerokosc;
    double długosc;
    double długosć2;


    public Room(double wysokosc, double szerokosc, double długosc, double długosć2) {
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
        this.długosc = długosc;
        this.długosć2 = długosć2;
    }

    public double polePowierchni() {

        return (getDługosc() * getDługosć2());
    }
    public double objetosc(){

        return (getDługosc() * getDługosć2() * getWysokosc());
    }
    public void wyswietleniePow(){
        System.out.printf("Pole powierzchni pokoju wynosi = %.2f m2\n",polePowierchni());
    }
    public void wyswietlenieObj(){

        System.out.printf("Objętość pokoju wyonosi = %.2f m3\n",objetosc());
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


}








