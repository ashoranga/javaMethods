/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamethods;

/**
 *
 * @author MERC-LAB-01
 */
public class Bill {

    String name;
    int no;
    int qty;
    double rate;
    double value;

    private double calValue() {
        return qty * rate;
        // "privite" means this method only available at this(Bill) class vs "public"
        // "calValue" method z not available at main method
    }

    public void printBillDetails() {
        System.out.println(no + " " + name + " " + qty + " " + rate + " " + calValue());

    }

}
