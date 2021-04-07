package com.train;

public class Ticket {
    int Total_tickets;
    int Round_trip;

    public Ticket(int Total_ticket, int Round_trip){
        this.Total_tickets = Total_ticket;
        this.Round_trip = Round_trip;
    }
    public void Print(){
        System.out.println("Total ticket:" + Total_tickets + "\t" + "Round-trip:" + Round_trip + "\t" +"Total:" + ((Total_tickets -Round_trip) * 1000 + Round_trip * 2000 * 0.9));
        }
    }