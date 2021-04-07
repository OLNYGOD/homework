package com.train

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var ticket = scanner.nextInt()
    print("How many round-trip tickets: ")
    var round = scanner.nextInt()
    val total = TesterKotlin(ticket, round)
    total.print()

}
class TesterKotlin(var ticket : Int, var round : Int) {
    fun print(){
        print("Total tickets:" + ticket + "\t" + "Round-trip:" + round + "\t" + "Total:" + ((ticket - round) * 1000 + round * 2000 * 0.9))
    }
}