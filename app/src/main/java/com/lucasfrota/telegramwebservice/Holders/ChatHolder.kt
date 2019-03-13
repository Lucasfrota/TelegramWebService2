package com.lucasfrota.telegramwebservice.Holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.lucasfrota.telegramwebservice.Model.ChatItem
import kotlinx.android.synthetic.main.chat_item.view.*

class ChatHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun setUpItem(chatItem: ChatItem){
        itemView.chatSubject.text = chatItem.chatSubject
        itemView.chatLastMessageSent.text = chatItem.chatLastMessage
        itemView.chatTimeStamp.text = chatItem.chatTimeStamp
    }

}