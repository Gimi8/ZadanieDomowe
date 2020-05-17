package Pokój;

public class Room  {

    double  wysokosc ;
    double szerokosc ;
    double długosc;

    public Room(double wysokosc, double szerokosc, double długosc) {
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
        this.długosc = długosc;
    }


    public  double polePowierchni(){

        return wysokosc * długosc;
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
}
