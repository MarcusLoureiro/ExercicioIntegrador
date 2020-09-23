package com.digitalhouse.br.Aula12.ExercicioIntegrador

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    do {
        println("Olá! Digite a opção desejada:")
        println("(1) Cadastrar livro")
        println("(2) Cadastrar coleção")
        println("(3) Consultar livro")
        println("(4) Efetuar venda")
        println("(0) Sair")

        val input = scanner.nextInt()

        when (input) {
            1 -> {
                println("Digite o código do livro:")
                val codigo = scanner.nextInt()

                println("Digite o título do livro:")
                val titulo = readLine()!!

                println("Digite o autor do livro:")
                val autor = readLine()!!
            }
            2 -> {

            }
            3 -> {
                println("Digite o código do livro que deseja procurar:")

            }
            4 -> {

            }
        }


    } while (input != 0)
}