package armsystem.br.com.exemplokotlin.Domain

 class Palindromo constructor(var _conteudo: String) {
   val conteudo:String = _conteudo  //variavel val não pode ser trocada ela é imutavel o sinal? pode ser null ou não
     get(){
         return field.toLowerCase() // field campo de apoio serve para custmozizar o get e set so é usado na variavel do tipo val
     }
  //criando uma função no kotlin
    fun hePalindromo():Boolean{
        return conteudo == conteudo.reversed()
    }


}