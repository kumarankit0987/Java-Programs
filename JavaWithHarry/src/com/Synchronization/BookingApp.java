package com.Synchronization;
class SeatBooking {
    int totalSeats =10;
    int leftSeat;
    synchronized void bookSeats(int seats) { // using Synchronized keyword to create Synchronized method
        if(totalSeats>=seats) {
            System.out.println(seats + " " + "Yeah congrats! ... Your seats id booked successfully");
          leftSeat = totalSeats - seats;
        }
        else {
            System.out.println("ops something wrong ..... you can't book seat");
            System.out.println("Available seats :" + leftSeat);
        }
    }
}
public class BookingApp extends Thread {
    static SeatBooking b;
    int seats;
   public  void run() {
        b.bookSeats(seats);
    }

    public static void main(String[] args) {
        b = new SeatBooking();
        BookingApp user1 = new BookingApp();
        user1.seats = 7;
        user1.start();
        BookingApp user2 = new BookingApp();
        user2.seats = 6;
        user2.start();
    }
}
