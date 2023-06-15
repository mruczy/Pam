package com.example.cpredplayer

import androidx.recyclerview.widget.RecyclerView
import android.content.Context
import com.example.cpredplayer.databinding.PlayerListItemBinding
import com.example.cpredplayer.databinding.PlayerListBinding


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation


class PlayerAdapter(private val dbHandler: DBHandler, private val context: Context) :
    RecyclerView.Adapter<PlayerAdapter.ViewHolder>() {

    inner class ViewHolder(private val playerListItemBinding: PlayerListItemBinding) :
        RecyclerView.ViewHolder(playerListItemBinding.root) {

        fun bind(item: Player) {
            playerListItemBinding.textViewId.text = item.id.toString()
            playerListItemBinding.textViewNickname.text = item.nickname
            playerListItemBinding.textViewRole.text = item.role

            playerListItemBinding.itemView.setOnClickListener {
                val action = PlayerListDirections.actionListToDetail(itemId = item.id.toString())
                Navigation.findNavController(itemView).navigate(action)
            }

            playerListItemBinding.imageViewDelete.setOnClickListener {
                //dbHandler.deleteCharacter(item.id)
                notifyDataSetChanged()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemBinding = PlayerListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dbHandler.getPlayer()[position]
        holder.bind(item)
    }

    override fun getItemCount() = dbHandler.getPlayer().size

}