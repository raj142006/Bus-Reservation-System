package org.example;

import java.util.*;
public class Bus {
    int busno;
    boolean Ac;
    int capacity;
    Bus(int no,boolean ac,int cap){
        this.busno=no;
        this.Ac=ac;
        this.capacity=cap;

    }
    public int getbusno(){       // accessor
        return busno;
    }
    public boolean isAc(){
        return Ac;
    }
    public void setAc(boolean val){
        Ac=val;
    }
    public int getcapacity(){   //accessor
        return capacity;
    }
    public void setcapacity(int cap){
        capacity=cap;
    }
    public void displaybus(){
        System.out.println("BusNo :"+busno+" Ac/NonAc :"+Ac+" Capacity :"+capacity);
    }
}
