package pe.edu.cibertec.apprecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import pe.edu.cibertec.apprecyclerview.databinding.ItemPersonajeBinding
import pe.edu.cibertec.apprecyclerview.model.Personaje

class PersonajeAdapter(private var listaPersonaje: List<Personaje>)
        : RecyclerView.Adapter<PersonajeAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: ItemPersonajeBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PersonajeAdapter.ViewHolder {
        val binding = ItemPersonajeBinding.inflate(
            LayoutInflater.from(parent.context), parent,
            false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonajeAdapter.ViewHolder, position: Int) {
        with(holder){
            with(listaPersonaje[position]){
                binding.tvnombre.text = nombre
                binding.tvhora.text = hora
                binding.tvmensaje.text = mensaje
                Glide.with(itemView.context)
                    .load(urlImagen)//https://cibertec.edu.pe/images/inteligencia-art.png
                    .into(binding.ivfoto)
            }
        }
        /*holder.binding.tvnombre.text = listaPersonaje[position].nombre
        holder.binding.tvhora.text = listaPersonaje[position].hora
        holder.binding.tvmensaje.text = listaPersonaje[position].mensaje*/
    }

    override fun getItemCount() = listaPersonaje.size


}