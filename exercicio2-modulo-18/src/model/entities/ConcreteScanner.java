package model.entities;

import model.services.Scanner;

public class ConcreteScanner extends Device implements Scanner {
    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner " + doc);
    }

    @Override
    public String scan() {
        return "doc scanned";
    }
}
