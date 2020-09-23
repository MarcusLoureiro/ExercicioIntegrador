package com.digitalhouse.br.Aula12.ExercicioIntegrador

class Livro(val codigo: String, val titulo: String, val autor: String , val ano: String, val quantidade: Int, val preco: Double) {
        val lista = mutableListOf<Livro>()
    fun cadastrarLivro(livro: Livro){
        lista.add(livro)
    }
    fun consultarLivro(codigo: String){
        if (lista.contains(codigo)){
            println(lista.toString())
        }else{
            println("Livro não encontrado")
        }
    }

}