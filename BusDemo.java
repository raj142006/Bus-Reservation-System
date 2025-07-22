package org.example;

import java.text.ParseException;
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {
    public static void main(String args[]) throws ParseException {
        ArrayList<Bus> buses=new ArrayList<>();
        ArrayList<Booking> bookings=new ArrayList<>();
        buses.add(new Bus(22,true,02));
        buses.add(new Bus(23,false,01));
        buses.add(new Bus(72,true,03));
        Scanner sc=new Scanner(System.in);
        for(Bus b:buses){
            b.displaybus();
        }
        int useroption=1;
        while(useroption==1){
            System.out.print("Enter 1 to book and 2 to exit");
            useroption=sc.nextInt();
            if(useroption==1){
                System.out.print("Booking...");
                Booking booking=new Booking();
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Your Booking is conformed");
                }
                else{
                    System.out.println("Sorry,The bus is full.please try another bus");
                }
            }
        }
    }
}
