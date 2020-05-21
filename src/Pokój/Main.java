package Pokój;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        ArrayList<Room> listaPokoji = new ArrayList<Room>();

        Room pokoj1 = new Room("Mój pokój", 2.50, 0.30, 6.40, 4.35);
        Room pokoj2 = new Room("Kuchnia", 2.50, 0.30, 5.70, 4.95);
        Room pokoj3 = new Room("Sypialnia", 2.40, 0.35, 5.55, 5.15);
        Room pokoj4 = new Room("Łazienka", 2.45, 0.35, 3.80, 2.90);

        //Metody obliczajace Pow i Obj
        pokoj1.wyswietleniePow();
        pokoj1.wyswietlenieObj();
        pokoj1.farba();
        System.out.println();

        listaPokoji.add(pokoj1);
        listaPokoji.add(pokoj2);
        listaPokoji.add(pokoj3);
        listaPokoji.add(pokoj4);


        for (Room pokoje : listaPokoji) {


            System.out.println();
            System.out.printf("%s\nWysokość pokoju : %.2f m\nSzerokość ściany : %.2f m\nDługość ściany : %.2f m\nDruga długość ściany : %.2f m", pokoje.nazwa,
                    pokoje.wysokosc, pokoje.szerokosc, pokoje.długosc, pokoje.długosć2);
            System.out.println();

        }


    }
}
