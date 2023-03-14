package edu.iest.tienda_online

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.iest.tienda_online.adapter.VideojuegosAdapter

class ListaJuegosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_juegos)
        val juegos = FakerVideojuego().getVideogames()
        val recycler = findViewById<RecyclerView>(R.id.recyclerJuegos)

        val CANTIDAD_COLUMNAS = 2
        val administradorDeLayouts = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)
        //LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        //GridLayoutManager(this, CANTIDAD_COLUMNAS)
        recycler.layoutManager = administradorDeLayouts
        recycler.adapter = VideojuegosAdapter(juegos, this)
    }
}