package intermediate_generics;

import basic_generics.DataEntry;

public class IntermediateDriver {

    public static void main(String[] args) {
        Holder<String> holder = new Holder<>("Hello");
        DataEntry<Integer,String> dataEntry = new DataEntry<>(123,"sds");
        holder.compare(dataEntry);


    }
}
