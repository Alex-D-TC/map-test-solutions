package com.company;

/**
 * Created by AlexandruD on 10/21/2016.
 */
public class StudentBursier extends Student {

    private double valBursa;

    public StudentBursier(double valBursa, double medie, String nume) {
        super(medie, nume);
        this.valBursa = valBursa;
    }

    public double getValBursa() {
        return valBursa;
    }

    @Override
    public String toString() {
        return super.toString() + " " + valBursa;
    }

}
