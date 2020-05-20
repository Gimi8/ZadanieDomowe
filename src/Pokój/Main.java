package Pokój;

import java.util.ArrayList;

public class Main  {

    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        ArrayList<Room> listaPokoji = new ArrayList<Room>();

        Room pokojgłowy = new Room(2.50, 0.30, 6.40 , 4.35);
        Room pokoj2 = new Room(2.50, 0.30, 5.70 , 3.95);
        Room pokoj3 = new Room(2.40, 0.35, 3.55 , 5.15);
        Room pokoj4 = new Room(2.45, 0.35, 4.80 , 2.90);

        //Metody obliczajace Pow i Obj
     pokojgłowy.wyswietleniePow();
     pokojgłowy.wyswietlenieObj();

     listaPokoji.add(pokojgłowy);
     listaPokoji.add(pokoj2);
     listaPokoji.add(pokoj3);
     listaPokoji.add(pokoj4);

     for (Room pokoje : listaPokoji){


         System.out.println();
         System.out.printf("Wysokość pokoju : %.2f m\nSzerokość ściany : %.2f m\nDługość ściany : %.2f m\nDruga długość ściany : %.2f m",
                 pokoje.wysokosc,pokoje.szerokosc,pokoje.długosc,pokoje.długosć2);
         System.out.println();

     }



    }
}
