package com.digitalhouse.br.Aula12.ExercicioIntegrador

<<<<<<< HEAD
class Livro(val codigo: Int, val titulo: String, val autor: String , val anoLancamento: Int, val qtdEstoque: Int, val preco: Double) {

=======
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
>>>>>>> 753fc7d9342448381d02aee058fcabb7a72a5e92
}