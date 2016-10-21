package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by AlexandruD on 10/21/2016.
 */
public class MyArrayList extends ArrayList<Student> {

    private Comparator<Student> myComp = ((a, b) -> (a.getNume().compareTo(b.getNume())));

    public MyArrayList(List<Student> list) {
        super(list);
    }

    public void sortByName() {
        Collections.sort(this, myComp);
    }

}
