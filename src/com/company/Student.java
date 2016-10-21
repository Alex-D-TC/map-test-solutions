package com.company;

/**
 * Created by AlexandruD on 10/21/2016.
 */
public class Student {

    private double medie;
    private String nume;

    public Student(double medie, String nume) {
        this.medie = medie;
        this.nume = nume;
    }

    public double getMedie() {
        return medie;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Student))
            return false;

        Student stud = (Student) obj;

        return nume.equals(stud.nume);
    }

    @Override
    public String toString() {
        return medie + " " + nume;
    }

}
