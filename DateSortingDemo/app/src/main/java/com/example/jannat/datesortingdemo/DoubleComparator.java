package com.example.jannat.datesortingdemo;

import java.util.Comparator;

/**
 * Created by Jannat on 9/6/2016.
 */
public class DoubleComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Double.compare(o1.getAmount(), o2.getAmount());
        //for DESC sorting return o2.getAge() - o1.getAge();
    }

}
