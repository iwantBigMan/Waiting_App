package com.example.waiting_app.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.waiting_app.databinding.ActivityContactAdapterBinding
import com.example.waiting_app.model.Database

class ContactAdapter : RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    var contacts = listOf<ContactAdapter>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ActivityContactAdapterBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contacts[position]
        holder.bind(contact)
    }

    override fun getItemCount() = contacts.size

    class ViewHolder(private val binding: ActivityContactAdapterBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(contact: ContactAdapter) {
            binding.contact = contact
            binding.executePendingBindings()
        }
    }
}
