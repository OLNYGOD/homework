package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int Total_tickets = 0;
        while (Total_tickets != -1){
            System.out.println("Please enter number of tickets or Press -1 if you want to stop :");
            Scanner scanner = new Scanner(System.in);
            Total_tickets = scanner.nextInt();
            if (Total_tickets == -1){
                System.out.print("Stop the system");
                break;
            }
            System.out.println("How many round-trip tickets :");
            int Round_trip = scanner.nextInt();
            if (Round_trip > Total_tickets){
                System.out.println("Round-trip tickets must smaller than tickets number.");
            }else {
                Ticket ticket = new Ticket(Total_tickets, Round_trip);
                ticket.Print();
            }
        }
    }
}
