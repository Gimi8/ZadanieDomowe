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

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(double szerokosc) {
        this.szerokosc = szerokosc;
    }

    public double getDługosc() {
        return długosc;
    }

    public void setDługosc(double długosc) {
        this.długosc = długosc;
    }

    public double getDługosć2() {
        return długosć2;
    }

    public void setDługosć2(double długosć2) {
        this.długosć2 = długosć2;
    }
}








