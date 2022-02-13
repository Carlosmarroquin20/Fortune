package com.example.fortune

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var Button: Button
    lateinit var Text2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Button = findViewById(R.id.Button)
        Text2 = findViewById(R.id.Text2)
        Button.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        var Message: List<String> = listOf("Atraigo el éxito y la prosperidad con todas mis ideas.\n",
            "Estás en el lugar perfecto para llegar desde aquí.\n",
            "Tengo la mayor de todas riquezas: la de no desearla.\n",
            "Estar en la ruina es una situación temporal. Ser pobre es un estado mental.\n",
            "Debes bañarte.\n",
            "Me estoy volviendo mejor en lo que hago todos los días.\n",
            "A cada paso, una oportunidad aparece frente a mí.\n",
            "La salud no es sólo la ausencia de enfermedad, sino también la armonía con uno mismo y el entorno.\n",
            "Tienes que dormir más.\n",
            "DEBES TENER PACIENCIA.\n",
            "ES TU HORA DE SER FELIZ.\n",
            "CONFÍA EN TI.\n",
            "El momento es ahora.\n",
            "ERES UNA PERSONA SABIA.\n",
            "FUERZA PARA SALIR ADELANTE.\n",
            "La fortuna de ningún hombre puede ser un fin digno de su ser.\n",
            "No busques más riqueza, sino un placer más simple; no una fortuna superior, sino una felicidad más profunda.\n",
            "Cuando pierdas, no pierdas la lección.\n",
            "No busques los errores, busca un remedio.\n",
            "La vida es una aventura, atrévete.\n",
            "Tienes que hacer las cosas que crees que no puedes hacer.\n",
            "Si la oportunidad no llama, construye una puerta.\n",
            "No juegues Valorant.\n",
            "Piensa, sueña, cree y atrévete.\n",
            "Solo aquellos que se arriesgan a ir demasiado lejos pueden descubrir lo lejos que pueden llegar.\n")

        val Mix = Random.nextInt(until = 25)
        Text2.text = Message.get(Mix)
    }
}