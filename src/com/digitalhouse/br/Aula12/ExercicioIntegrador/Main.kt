package com.digitalhouse.br.Aula12.ExercicioIntegrador

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    do {
        println("\nOlá! Digite a opção desejada:")
        println("(1) Cadastrar livro")
        println("(2) Cadastrar coleção")
        println("(3) Consultar livro")
        println("(4) Efetuar venda")
        println("(0) Sair")

        val input = scanner.nextInt()

        when (input) {
            1 -> {
                println("\nDigite o código do livro:")
                val codigo = scanner.nextInt()

                println("Digite o título do livro:")
                val titulo = readLine()!!

                println("Digite o autor do livro:")
                val autor = readLine()!!

                println("Digite o ano do livro:")
                val ano = scanner.nextInt()

                println("Digite o preco do livro:")
                val preco = scanner.nextDouble()

                val livro = Livro(codigo, titulo, autor, ano, 10, preco.toDouble())
                livro.cadastrarLivro(livro)
            }
            2 -> {
                println("\nDigite o código da coleção:")
                val codigoColecao = scanner.nextInt()

                println("\nDigite o preço da coleção:")
                val preco = scanner.nextDouble()

                println("\nDigite a descrição da coleção:")
                val descricao = readLine()!!

                println("\nDigite o código do livro a ser adicionado na coleção:")
                val codigoLivro = scanner.nextInt()

                
            }
            3 -> {
                println("Digite o código do livro que deseja procurar:")

            }
            4 -> {

            }
        }


    } while (input != 0)
}