package com.example.jannat.datesortingdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by Jannat on 9/6/2016.
 */
public class DateDescending implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o2.getDateFormat().compareTo(o1.getDateFormat());
    }
}
