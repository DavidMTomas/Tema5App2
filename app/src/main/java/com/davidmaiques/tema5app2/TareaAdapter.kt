package com.davidmaiques.tema5app2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.davidmaiques.tema5app2.databinding.IetmTareaBinding


class TareaAdapter (private var lista:List<Tarea>,private val listener: OnClickListener): RecyclerView.Adapter<TareaAdapter.ViewHolder>(){

    inner class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val binding = IetmTareaBinding.bind(view)


        fun render(tarea: Tarea) {
            setListener(tarea)
            binding.lblTitulo.text=tarea.getNombre()
            binding.lblSubtitulo.text=tarea.getHora()

        }

        fun setListener (tarea: Tarea){
            binding.root.setOnClickListener { listener.onClick(tarea) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.ietm_tarea,parent,false))
    }


    override fun getItemCount(): Int = lista.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        return holder.render(lista[position])

    }
}