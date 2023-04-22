package com.asifrezan.uitest.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.asifrezan.uitest.R
import com.asifrezan.uitest.data.CategoryData

class CategoryAdapter(private val items : List<CategoryData>,  private val listener: OnItemClickListener): RecyclerView.Adapter<CategoryAdapter.ItemViewHolder>() {


    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.product_category, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]
        holder.nameTextView.text = item.title
        holder.descriptionTextView.text = item.description
        holder.imageView.setImageResource(item.img_res)

        holder.itemView.setOnClickListener {
            listener.onItemClick(position)
        }


    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.title_textView)
        val descriptionTextView: TextView = itemView.findViewById(R.id.description_textview)
        val imageView: ImageView = itemView.findViewById(R.id.imageView)


    }
}
