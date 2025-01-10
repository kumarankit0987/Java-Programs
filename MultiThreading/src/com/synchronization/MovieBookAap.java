package com.synchronization;

public class MovieBookAap extends Thread{
    static BookTheaterSeat b;
    int seats;
    @Override
    public void run() {
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
         b = new BookTheaterSeat();
        MovieBookAap obj1= new MovieBookAap();
        obj1.seats = 50;
        obj1.start();

        MovieBookAap obj2 = new MovieBookAap();
        obj2.seats = 119;
        obj2.start();

    }
}
