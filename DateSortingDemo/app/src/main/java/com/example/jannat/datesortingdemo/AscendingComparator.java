package com.example.jannat.datesortingdemo;

import java.util.Comparator;

/**
 * Created by Jannat on 9/6/2016.
 */
public class AscendingComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getDateFormat().compareTo(o2.getDateFormat());
    }
}
