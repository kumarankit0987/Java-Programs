package com.synchronization;

public class BookTheaterSeat {
    int totalSeat = 50;
   
    public void bookSeat(int seats) {

        if(totalSeat>=seats) {
            System.out.println("Congratulation your seat is booked ");

        }
        else {
            System.out.println("Seat is not available");
            totalSeat = totalSeat - seats;
            System.out.println("Left seat : " + totalSeat);
        }
    }

}
