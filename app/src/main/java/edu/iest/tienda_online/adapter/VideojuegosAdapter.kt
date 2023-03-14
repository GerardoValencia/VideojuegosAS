package edu.iest.tienda_online.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import edu.iest.tienda_online.R
import edu.iest.tienda_online.models.Videojuego

class VideojuegosAdapter (videojuegos: ArrayList<Videojuego>, context: Context) :
    RecyclerView.Adapter<VideojuegosAdapter.ContenedorDeVista>(){

    var inner_videojuegos: ArrayList<Videojuego> = videojuegos
    var inner_context: Context = context

    inner class ContenedorDeVista(view: View) : RecyclerView.ViewHolder(view){
        init {
            // Define click listener for the ViewHolder's View.
            tvNombre = view.findViewById(R.id.tvNombreJuego)
            tvPrecio = view.findViewById(R.id.tvPrecio)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContenedorDeVista {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.videojuegos_layout,
            viewGroup, false)

        return ContenedorDeVista(view)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ContenedorDeVista, position: Int) {
        TODO("Not yet implemented")
    }
}