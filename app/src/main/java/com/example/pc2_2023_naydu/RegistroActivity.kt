package com.example.pc2_2023_naydu

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.firestore.FirebaseFirestore

class RegistroActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val txtNombredelequipo = findViewById<EditText>(R.id.txtequipo)
        val txtAño=findViewById<EditText>(R.id.txtaño)
        val txtNumerotitulos=findViewById<EditText>(R.id.txttitulos)
        val txtUrlequipo=findViewById<EditText>(R.id.txttitulos)
        val btnGuardar = findViewById<Button>(R.id.btnGuardar)
        val btnNuevoRegistro = findViewById<Button>(R.id.btnnuevo)
        val db = FirebaseFirestore.getInstance()
        val collectionRef = db.collection("equipos")


        btnNuevoRegistro.setOnClickListener {
            val nombredelequipo = txtNombredelequipo.text.toString()
            val Año = txtAño.text.toString()
            val Numerotitulos = txtNumerotitulos.text.toString()
            val Urlequipo = txtUrlequipo.text.toString()

            collectionRef.add(btnNuevoRegistro)
                .addOnSuccessListener { documentReference ->
                }.addOnFailureListener{error ->
                    Snackbar
                        .make(
                            findViewById(android.R.id.content),
                            "Error al guardar: $error",
                            Snackbar.LENGTH_LONG
                        ).show()
                }
            Snackbar
                .make(
                    findViewById(android.R.id.content),
                    "gurdado exitoso",
                    Snackbar.LENGTH_LONG
                ).show()
            startActivity(Intent(this,RegistroActivity::class.java))
        }

        btnGuardar.setOnClickListener {
            val nombredelequipo = txtNombredelequipo.text.toString()
            val Año = txtAño.text.toString()
            val Numerotitulos = txtNumerotitulos.text.toString()
            val Urlequipo = txtUrlequipo.text.toString()

            collectionRef.add(btnGuardar)
                .addOnSuccessListener { documentReference ->
                }.addOnFailureListener{error ->
                    Snackbar
                        .make(
                            findViewById(android.R.id.content),
                            "Error al guardar: $error",
                            Snackbar.LENGTH_LONG
                        ).show()
                }
            Snackbar
                .make(
                    findViewById(android.R.id.content),
                    "gurdado exitoso",
                    Snackbar.LENGTH_LONG
                ).show()
            startActivity(Intent(this,RegistroActivity::class.java))
        }
    }
}