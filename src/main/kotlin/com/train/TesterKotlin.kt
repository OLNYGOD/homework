package com.train

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    var ticket = 0
    while (ticket != -1) {
        print("Please enter number of tickets or Press -1 if you want to stop : ")
        ticket = scanner.nextInt()
        if (ticket == -1){
            print("Stop the system")
            break
        }
        print("How many round-trip tickets: ")
        var round = scanner.nextInt()
        if (ticket < round){
            println("Round-trip tickets must smaller than tickets number.")
        }else{
        val total = TesterKotlin(ticket, round)
        total.print()
        }
    }
}
class TesterKotlin(var ticket : Int, var round : Int) {
    fun print(){
        println("Total tickets:" + ticket + "\t" + "Round-trip:" + round + "\t" + "Total:" + ((ticket - round) * 1000 + round * 2000 * 0.9))
    }
}