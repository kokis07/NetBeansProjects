/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author luis_
 */
public class Customer {
    private int arrivalTime, departureTime;
    
    public Customer(int arrives){
        arrivalTime= arrives;
        departureTime=0;
    }
    public int getArrivalTime(){
        return arrivalTime;
    }
    public void setDepartureTime(int departs){
        departureTime= departs;
    }
    public int getDepartureTime(){
        return departureTime;
    }
    public int totalTime(){
        return departureTime - arrivalTime;
    }
}
