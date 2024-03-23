package aplication;

import model.entities.ComboDevice;
import model.services.Printer;
import model.services.Scanner;

public class Main {
    public static void main(String[] args) {
        ComboDevice cd = new ComboDevice("12323");

        cd.processDoc("my letter");
        cd.print("my letter");

        System.out.println(cd.scan());
    }
}