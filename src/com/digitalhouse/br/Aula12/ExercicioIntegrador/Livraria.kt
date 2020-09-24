package com.digitalhouse.br.Aula12.ExercicioIntegrador

 class Livraria(){

  var listaLivro = mutableListOf<Livro>()
  var listaColecao = mutableListOf<Colecao>()

  fun cadastrarLivro(livro: Livro) {
   listaLivro.add(livro)
  }

  fun cadastrarColecao(colecao: Colecao){
   listaColecao.add(colecao)
  }

  fun venda(codigo: String){}

  fun consultarLivro(codigo: Int) {
   var estaNaLista = false
   for (livro in listaLivro){
    if (livro.codigo == codigo){
     println("Código: ${livro.codigo}")
     println("Título: ${livro.titulo}")
     println("Autor: ${livro.autor}")
     println("Ano de lançamento: ${livro.anoLancamento}")
     println("Quantidade em estoque: ${livro.qtdEstoque}")
     println("Preço: ${livro.preco}")
     estaNaLista = true
    }
   }
   if (!estaNaLista){
    println("Livro não encontrado")
   }
  }

  fun consultarColecao(codigo: Int){

  }

}