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
public class Patient {

    String name;
    int age;
    double wt;
    double ht;

    public void printPatientDetails() {
        /**
         * "void" method means we expect that methods only to run not to return
         * any value
         */
        System.out.println("Patient Details");
        System.out.println("Name is " + name + ".");
        System.out.println("Age is " + age + ".");
        /**
         * Instead of System.out.println("Name is "+name+"."); &
         * System.out.println("Age is "+age+"."); itz better 2 write
         * System.out.println("Name is "+this.name+"."); System.out.println("Age
         * is "+age+"."); "this" means same object It will run without "this"
         * but sometimes can cause errors *
         */
    }

    public double getBmi() {
        return (wt) / (ht * ht);
//though we write anything beyond "return" in this method it will not be executed 
    }

    public void printBmi() {
        double bmi;
        bmi = getBmi();
        System.out.println("BMI IS " + bmi);
        /**
         * here we can't get any return value we only need this method to run
         * not to return any thing
         */

    }
}
