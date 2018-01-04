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
public class JavaMethods {

    public static void main(String[] args) {
        Patient p1 = new Patient();
        p1.name = "Ashoranga";
        p1.age = 29;
        p1.wt = 60;
        p1.ht = 1.58;
        p1.printPatientDetails();
        System.out.println("BMI is " + p1.getBmi());
        p1.printBmi();

    }

}
