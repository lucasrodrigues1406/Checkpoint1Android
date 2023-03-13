package br.com.fiap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoAndroid:Button = findViewById(R.id.buttonAndroid)
        val botaoIos:Button = findViewById(R.id.buttonIos)
        val resposta:TextView = findViewById(R.id.textViewResposta)

        botaoAndroid.setOnClickListener{
            resposta.text = "Prefiro: ANDROID"
        }
        botaoIos.setOnClickListener{
            resposta.text = "Prefiro: IOS"
        }
    }
}