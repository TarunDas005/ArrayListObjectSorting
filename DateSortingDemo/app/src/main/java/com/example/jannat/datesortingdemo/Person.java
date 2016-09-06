package com.example.jannat.datesortingdemo;

import java.text.SimpleDateFormat;

/**
 * Created by Jannat on 9/6/2016.
 */
public class Person {
    private String name;
    private String date;
    private double amount;
    private String dateFormat;

    public Person(String name, String date, double amount) {
        this.name = name;
        this.date = date;
        this.amount = amount;
        setDateFormate(date);
    }

    private void setDateFormate(String date){
       String s1="";
        int index=0;
        for(int i=3;i<date.length();i++){
            char c=date.charAt(i);
            if((c>='A' && c<='Z') || (c>='a' && c<='z')){
                s1+=c;
            }
            else if(c==' '){
                index=i;
                break;
            }
        }

        String s2="";
        s2+=date.charAt(0);
        s2+=date.charAt(1);
        String s3="";
        s3+=date.charAt(index+1);
        s3+=date.charAt(index+2);
        s3+=date.charAt(index+3);
        s3+=date.charAt(index+4);
        //String formatDate=s2+GetMonthNumber.getMonthNumber(s1)+s3;
        String formatDate=s3+GetMonthNumber.getMonthNumber(s1)+s2;
        this.dateFormat=formatDate;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
