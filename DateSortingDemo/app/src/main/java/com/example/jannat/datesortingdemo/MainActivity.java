package com.example.jannat.datesortingdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person person1=new Person("Tarun","05 September 2016",10.0);
        Person person2=new Person("POKKOS","06 September 2016",5.0);
        Person person3=new Person("BORUN","07 August 2016",20.0);
        Person person4=new Person("ABC","05 July 2015",30.25);
        Person person5=new Person("AWSD","02 August 2016",40.12);
        Person person6=new Person("Abc","02 January 2016",50.41);
        Person person7=new Person("Abc","02 December 2015",50.1);
        Person person8=new Person("MNS","05 September 2016",10.14);
        ArrayList<Person>persons=new ArrayList<Person>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);
        /*Collections.sort(persons,new DateDescending());

        int x=persons.size();

        Collections.sort(persons,new AscendingComparator());
        x=persons.size();*/

        Collections.sort(persons,new DoubleComparator());

        int x=persons.size();

    }
}
