package com.example.rockpaperscissors

fun main(){
    var computerchoice = ""
    var playerchoice = ""
    //Esse while funciona pois não preciso validar como True a escolha do jogador(playerchoice), por isso o uso de !=(Diferente)
    //--------------------------------------------------------------------------------------------------------------------------
    //Não poderia usar o operador lógico || no lugar do && pois, o || precisa que uma condição seja verdadeira para retornar True
    //e o && precisa que todas as condições sejam verdadeiras, se uma for falsa vai retornar False
    while (playerchoice != "rock" && playerchoice != "paper" && playerchoice != "scissors") {
        println("rock, paper or scissors? Enter your choice:")
        print("Player:")
        playerchoice = readln().lowercase()
        if (playerchoice != "rock" && playerchoice != "paper" && playerchoice != "scissors"){
            println("Invalid choice, please enter again.\n")
        }
    }
    val randomnumber = (1..3).random()
    when (randomnumber){
        1 -> {
            computerchoice = "rock"
        }
        2 -> {
            computerchoice = "paper"
        }
        3 -> {
            computerchoice = "scissors"
        }
    }
    println("Computer: $computerchoice")
    println("==RESULT==")
    if (playerchoice == computerchoice){
        println("Draw")
    }else if(playerchoice == "rock" && computerchoice == "scissors"){
        println("Player Won!!!")
    }else if(playerchoice == "paper" && computerchoice == "rock"){
        println("Player Won!!!")
    }else if(playerchoice == "scissors" && computerchoice == "paper"){
        println("Player Won!!!")
    }else{
        computerchoice = playerchoice
        playerchoice = computerchoice
        print("Computer Won")
    }
}