package armsystem.br.com.exemplokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

    class MainActivity: AppCompatActivity(), View.OnClickListener{
       override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_main)

        bt_verificar.setOnClickListener(this)//chama o click do botão
    }//fim do oncreate

    // função do click
    override fun onClick(view: View?) {
        tv_resposta.text = et_palindromo.text.toString().ehPalindromo()
    } //fim do onclick

      //função para verificar
        fun String.ehPalindromo(): String{
            return if(this.toLowerCase() == this.toLowerCase().reversed())
                "${this.toLowerCase()} é um palíndromo"
            else
                "${this.toLowerCase()} NÃO é um palíndromo"
        }







    }//fim da classe
