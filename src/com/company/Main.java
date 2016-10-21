package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here

        doStuff();
    }

    private static void doStuff() {
        MyArrayList list = new MyArrayList(
            Stream.of(
                    new Student(10, "Alex"),
                    new Student(10, "Bubu"),
                    new Student(10, "zzz"),
                    new StudentBursier(100,10,"Zeze"),
                    new StudentBursier(100,9,"Gaga"),
                    new StudentBursier(90, 8, "Bobo"),
                    new Student(10, "aa"),
                    new StudentBursier(200, 9, "bb")
            ).collect(Collectors.toList()));

        System.out.println("\nBEFORE SORT--");
        printList(list);

        list.sortByName();
        System.out.println("\nAFTER SORT--");
        printList(list);

        ArrayList<Student> studs = new ArrayList<>(
		
				// Deschidem stream
				list.stream() 
		
				// Pastram doar studentii care nu sunt bursieri
                .filter((stud) ->(!(stud instanceof StudentBursier)))
				
				// Transformam stream-ul intr-o lista
                .collect(Collectors.toList()));

        ArrayList<StudentBursier> studsBursa = new ArrayList<>(
		
				// Deschidem stream
				list.stream() 
				
				// Pastram doar studentii bursieri
                .filter((stud) ->(stud instanceof StudentBursier))
				
				// 'Castam' Studentii in StudentBursieri
                .map((stud) -> ((StudentBursier) stud))
				
				// Transformam stream-ul intr-o lista de StudentBursier
                .collect(Collectors.toList()));

        System.out.println("\nSTUDENTS---");
        printList(studs);

        System.out.println("\nBURSIERI---");
        printList(studsBursa);
    }

    private static void printList(List<? extends Student> list) {
        Iterator<? extends Student> it = list.iterator();
        while((it.hasNext())) {
            System.out.println(it.next());
        }

    }

}
