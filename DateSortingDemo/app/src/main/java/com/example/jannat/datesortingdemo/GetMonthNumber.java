package com.example.jannat.datesortingdemo;

/**
 * Created by Jannat on 9/6/2016.
 */
public class GetMonthNumber {
    public static String getMonthNumber(String month){
        if(month.equalsIgnoreCase("january")){
            return "01";
        }else if(month.equalsIgnoreCase("february")){
            return "02";
        }else if(month.equalsIgnoreCase("march")){
            return "03";
        }else if(month.equalsIgnoreCase("april")){
            return "04";
        }else if(month.equalsIgnoreCase("may")){
            return "05";
        }else if(month.equalsIgnoreCase("june")){
            return "06";
        }else if(month.equalsIgnoreCase("july")){
            return "07";
        }else if(month.equalsIgnoreCase("august")){
            return "08";
        }else if(month.equalsIgnoreCase("september")){
            return "09";
        }else if(month.equalsIgnoreCase("october")){
            return "10";
        }else if(month.equalsIgnoreCase("november")){
            return "11";
        }else if(month.equalsIgnoreCase("december")){
            return "12";
        }
        return "";
    }
}
