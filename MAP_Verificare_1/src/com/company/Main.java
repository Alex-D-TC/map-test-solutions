package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        printTests();
    }


    public static void printTests() {
        NumarComplex comp1 = new NumarComplex(0, 13, 14),
                comp2 = new NumarComplex(1, 13, 13),
                comp3 = new NumarComplex(2, 13, 12);

        NumarReal rel1 = new NumarReal(0, 10),
                rel2 = new NumarReal(0, -10),
                rel3 = new NumarReal(0, 13);

        System.out.println(comp1.modul());
        System.out.println(comp2.modul());
        System.out.println(comp3.modul());
        System.out.println(comp2.aduna(comp3));
        System.out.println(rel1.modul());
        System.out.println(rel2.modul());

        List<NumarComplex> complexe = new ArrayList<>();
        complexe.add(comp2);
        complexe.add(new NumarComplex(0, 13, 13));
        complexe.add(new NumarComplex(0, 13, 13));
        complexe.add(new NumarComplex(0, 13, 12));
        complexe.add(comp1);
        complexe.add(comp3);

        System.out.println("EVAL--");
        System.out.println(comp2.equals(new NumarComplex(0, 13, 13)));

        List<NumarComplex> dubluri = new ArrayList<>();

        System.out.println("COMPLEXE --");

        complexe.forEach((complex) -> {
            System.out.print(complex.getReal() + " " + complex.getImaginar() + "\n");
        });

        System.out.println("");

        dubluri.forEach((complex) -> {
            System.out.print((complex.getReal() + " " + complex.getImaginar() + "\n"));
        });

        Set<NumarComplex> temp = new HashSet<>();

        complexe.stream().forEach((complex) -> {
            if(!temp.add(complex)) {
                dubluri.add(complex);
            }
        });

        complexe = new ArrayList<>(temp);

        System.out.println("COMPLEXE---");
        complexe.forEach((complex) -> {
            System.out.print(complex.getReal() + " " + complex.getImaginar() + "\n");
        });

        System.out.println("");
        System.out.println("DUBLURI--");
        dubluri.forEach((complex) -> {
            System.out.print((complex.getReal() + " " + complex.getImaginar() + "\n"));
        });
    }
}
