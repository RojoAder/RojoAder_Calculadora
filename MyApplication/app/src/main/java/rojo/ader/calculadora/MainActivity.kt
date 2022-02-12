package rojo.ader.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var numero: Double = 0.0
    var oper:Int = 0
    var numero1:Double = 0.0
    lateinit var resultado:TextView
    lateinit var resultadoPasado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultado = findViewById(R.id.resultado)
        resultadoPasado = findViewById(R.id.resultadoPasado)

        val btnBorrar :Button = findViewById(R.id.buttonC)
        val btnIgual:Button = findViewById(R.id.result)

        btnIgual.setOnClickListener {
            var numero2:Double = resultado.text.toString().toDouble()
            var resp: Double = 0.0

            when(oper){
                1 -> resp = numero1 + numero2
                2 -> resp = numero1 - numero2
                3 -> resp = numero1 / numero2
                4 -> resp = numero1 * numero2
            }

            resultado.setText(resp.toString())
            resultadoPasado.setText("")
        }

        btnBorrar.setOnClickListener {
            resultadoPasado.setText("")
            resultado.setText("")
            numero1=0.0
            oper=0
        }

    }

    fun presionarDigito(view: View){
        //val resultado : TextView = findViewById(R.id.resultado)
        var num2:String = resultado.text.toString()

        when(view.id){
            R.id.button0 -> resultado.setText(num2 + "0")
            R.id.button1 -> resultado.setText(num2 + "1")
            R.id.button2 -> resultado.setText(num2 + "2")
            R.id.button3 -> resultado.setText(num2 + "3")
            R.id.button4 -> resultado.setText(num2 + "4")
            R.id.button5 -> resultado.setText(num2 + "5")
            R.id.button6 -> resultado.setText(num2 + "6")
            R.id.button7 -> resultado.setText(num2 + "7")
            R.id.button8 -> resultado.setText(num2 + "8")
            R.id.button9 -> resultado.setText(num2 + "9")
            R.id.buttonPunto -> resultado.setText(num2 + ".")
        }
    }

    fun clicOperacion(view:View){
        numero1 = resultado.text.toString().toDouble()
        var nunmero2_text:String = resultado.text.toString()
        resultado.setText("")
        when(view.id){
            R.id.buttonPlus ->{
                resultadoPasado.setText(nunmero2_text + "+")
                oper = 1
            }
            R.id.buttonMin ->{
                resultadoPasado.setText(nunmero2_text + "-")
                oper = 2
            }
            R.id.buttonSlash ->{
                resultadoPasado.setText(nunmero2_text + "/")
                oper = 3
            }
            R.id.buttonTimes ->{
                resultadoPasado.setText(nunmero2_text + "*")
                oper = 4
            }
        }
    }
}