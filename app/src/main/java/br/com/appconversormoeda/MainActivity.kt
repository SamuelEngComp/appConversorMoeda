package br.com.appconversormoeda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import br.com.appconversormoeda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // utilizando isso, ao inves de findViewById
    //
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // utilizando isso, ao inves de findViewById
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val valorDigitado = binding.editText.text

            binding.botaoConverter.setOnClickListener {
                if (valorDigitado.toString().isNotEmpty())
                    imprimeValor(valorDigitado.toString().toInt())
            }
    }

    private fun imprimeValor(valor: Int = 0){
       // binding.editText.text.clear()

        binding.textoHello.text = valor.toString()
    }
}