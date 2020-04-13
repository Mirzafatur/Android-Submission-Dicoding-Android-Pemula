package com.example.mirzasubmissiondicoding

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class ListMufcAdapter(
    private val context: Context,
    private val image: List<Mufc>,
    val listener: (Mufc) -> Unit) : RecyclerView.Adapter<ListMufcAdapter.ImageViewHolder>() {

    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view){

        val imageSrc = view.findViewById<ImageView>(R.id.foto_pemain)
        val title = view.findViewById<TextView>(R.id.nama_pemain)
        val desc = view.findViewById<TextView>(R.id.detail_pemain)
        val btnDetail: Button = itemView.findViewById(R.id.btn_detail)

        fun bindView(image: Mufc, listener: (Mufc) -> Unit){

            imageSrc.setImageResource(image.imgSrc)
            title.text = image.imgName
            desc.text = image.imgDetail

            itemView.setOnClickListener{
                Toast.makeText(btnDetail.context,"Dia adalah pemain Manchester United",Toast.LENGTH_SHORT ).show()
            }
            btnDetail.setOnClickListener{
                listener(image) }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): ListMufcAdapter.ImageViewHolder =
        ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.list_player, parent, false))


    override fun getItemCount(): Int = image.size

    override fun onBindViewHolder(holder: ListMufcAdapter.ImageViewHolder, position: Int) {
        holder.bindView(image[position],listener)
    }

}