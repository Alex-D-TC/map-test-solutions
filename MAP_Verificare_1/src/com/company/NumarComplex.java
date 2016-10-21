package com.company;

/**
 * Created by AlexandruD on 10/14/2016.
 */
public class NumarComplex extends NumarReal {

    private float imaginar;

    public NumarComplex(int id, float real, float imaginar) {
        super(id, real);
        this.imaginar = imaginar;
    }

    public NumarComplex aduna(NumarComplex oth) {
        return new NumarComplex(
                Integer.max(getId(), oth.getId()) + 1,
                getReal() + oth.getReal(),
                imaginar + oth.imaginar);
    }

    public float getImaginar() {
        return imaginar;
    }

    @Override
    public double modul() {
        float real = getReal();
        return Math.sqrt((real * real) + (imaginar * imaginar));
    }

    @Override
    public boolean equals(Object oth) {

        if(!(oth instanceof NumarComplex)) {
            return false;
        }

        NumarComplex other = (NumarComplex) oth;

        return getReal() == other.getReal() && imaginar == other.getImaginar();
    }

    @Override
    public int hashCode() {
        return new Double(getReal()).hashCode() + new Double(getImaginar()).hashCode() ;
    }



}
