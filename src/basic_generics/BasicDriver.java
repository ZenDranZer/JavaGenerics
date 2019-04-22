package basic_generics;

import java.util.ArrayList;
import java.util.List;

public class BasicDriver {
    public static void main(String[] args) {

        /*----------------------- Basic lvl 1-----------------------*/
        System.out.println("/*----------------------- Basic lvl 1-----------------------*/");
        Vessel<Integer> integerVessel = new Vessel<>();
        integerVessel.setValue(1);
        System.out.println(integerVessel);
        Vessel<Integer> integerVessel1 = new Vessel<>();
        integerVessel1.setValue(2);
        Vessel<Integer> integerVessel2 = new Vessel<>();
        integerVessel2.setValue(3);
        Vessel<Integer> integerVessel3 = new Vessel<>();
        integerVessel3.setValue(4);
        Vessel<Integer> integerVessel4 = new Vessel<>();
        integerVessel4.setValue(5);
        Vessel<Integer> integerVessel5 = new Vessel<>();
        integerVessel5.setValue(6);


        /*----------------------- Basic lvl 2 -----------------------*/
        System.out.println("/*----------------------- Basic lvl 2-----------------------*/");
        List<Vessel<Integer>> integerVesselList = new ArrayList<>();
        integerVesselList.add(integerVessel);
        integerVesselList.add(integerVessel1);
        integerVesselList.add(integerVessel2);
        integerVesselList.add(integerVessel3);
        integerVesselList.add(integerVessel4);
        integerVesselList.add(integerVessel5);
        System.out.println(integerVesselList);

        /*----------------------- Basic lvl 3 -----------------------*/
        System.out.println("/*----------------------- Basic lvl 3-----------------------*/");
        DataEntryInterface<Integer, String> dataEntry = new DataEntry<>(1,"First value.");
        System.out.println(dataEntry);








    }
}
