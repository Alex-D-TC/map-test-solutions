package com.company;

/**
 * Created by AlexandruD on 10/14/2016.
 */

public class NumarReal {

    private float real;
    private int id;

    public NumarReal(int id, float real) {
        this.id = id;
        this.real = real;
    }

    public void setReal(float nVal) {
        real = nVal;
    }

    public float getReal() {
        return real;
    }

    public int getId() {
        return id;
    }

    public double modul() {

        return real >= 0? real : real * -1;
    }

    public boolean equals(NumarReal other) {
        return real == other.real;
    }

}
