package model.entities;

import model.services.Printer;

public class ConcretePrinter extends Device implements Printer {
    public ConcretePrinter(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Printer " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println(doc);
    }
}
