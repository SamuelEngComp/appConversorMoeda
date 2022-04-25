package br.com.appconversormoeda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
                if (valorDigitado.toString().isNotEmpty()){
                    val valorQueUsuarioDigitou = valorDigitado.toString().toFloat()
                    val valorEuro = 0.19 * valorQueUsuarioDigitou
                    val valorDolar = 0.21 * valorQueUsuarioDigitou
                        imprimeValor(valorQueUsuarioDigitou, valorEuro.toFloat(), valorDolar.toFloat())
                }

            }
    }

    private fun imprimeValor(valorDigitado: Float, valorEmEuro: Float, valorEmDolar: Float){
       // binding.editText.text.clear()

        binding.valorDigitado.text = "R$ " + valorDigitado.toString() + " Reais"
        binding.valorEmEuro.text = "E " + valorEmEuro.toString() + " Euros"
        binding.valorEmDolar.text = "$ " + valorEmDolar.toString() + " Dolares"

    }
}