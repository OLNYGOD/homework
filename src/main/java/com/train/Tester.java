package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Please enter number of tickets :");
        Scanner scanner = new Scanner(System.in);
        int Total_tickets = scanner.nextInt();
        System.out.println("How many round-trip tickets :");
        int Round_trip = scanner.nextInt();
        Ticket ticket = new Ticket(Total_tickets, Round_trip);
        ticket.Print();
    }
}
