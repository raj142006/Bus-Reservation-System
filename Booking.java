package org.example;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
public class Booking {
    String passangerName;
    int busno;
    Date date;

    Booking() throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name of Passenger");
        passangerName=sc.next();
        System.out.println("Enter the Bus No");
        busno=sc.nextInt();
        System.out.println("Enter Date dd/mm/yyyy");
        String datinput=sc.next();
        SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy");
        try {
            date = dateformat.parse(datinput);
        }
        catch(ParseException e){
            e.printStackTrace();
        }

    }
    public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus>buses){
        int capacity=0;
        for(Bus b:buses){
            if(b.getbusno()==busno){
                capacity=b.getcapacity();
            }
        }
        int booked=0;
        for(Booking boo:bookings){
            if(boo.busno==busno && boo.date.equals(date) ){
                booked++;


            }
        }
        return booked<capacity?true:false;
    }
}
