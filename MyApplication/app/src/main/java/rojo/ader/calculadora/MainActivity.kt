package rojo.ader.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button0 : Button = findViewById(R.id.button0)
        var button1 : Button = findViewById(R.id.button1)
        var button2 : Button = findViewById(R.id.button2)
        var button3 : Button = findViewById(R.id.button3)
        var button4 : Button = findViewById(R.id.button4)
        var button5 : Button = findViewById(R.id.button5)
        var button6 : Button = findViewById(R.id.button6)
        var button7 : Button = findViewById(R.id.button7)
        var button8 : Button = findViewById(R.id.button8)
        var button9 : Button = findViewById(R.id.button9)
        var buttonPlus : Button = findViewById(R.id.buttonPlus)
        var buttonMin : Button = findViewById(R.id.buttonMin)
        var buttonTimes : Button = findViewById(R.id.buttonTimes)
        var buttonSlash : Button = findViewById(R.id.buttonSlash)
        var result : Button = findViewById(R.id.result)
        var borrar : Button = findViewById(R.id.borrar)

        var resultado : TextView = findViewById(R.id.resultado)
        var resultadoPasado : TextView = findViewById(R.id.resultadoPasado)

    }
}