package com.lucasfrota.telegramwebservice.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lucasfrota.telegramwebservice.Holders.ChatHolder
import com.lucasfrota.telegramwebservice.Model.ChatItem
import com.lucasfrota.telegramwebservice.R

class ChatAdapter(private val itens: List<ChatItem>): RecyclerView.Adapter<ChatHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.chat_item, parent, false)
        return ChatHolder(view)
    }

    override fun getItemCount(): Int {
        return itens.size
    }

    override fun onBindViewHolder(holder: ChatHolder, position: Int) {
        val item = itens[position]
        holder.setUpItem(item)
    }

}