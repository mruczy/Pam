package com.example.cpredplayer

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.cpredplayer.databinding.AddPlayer2Binding

class PlayerAdd2 : Fragment() {

    private lateinit var dbHandler: DBHandler
    private val binding by lazy { AddPlayer2Binding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val context = this.context
        if (context != null) {
            dbHandler  = DBHandler(context)
        }


        binding.add2.setOnClickListener {
            val nickname = binding.addTextNickname.text.toString()
            val role = binding.addTextRole.text.toString()

            if (nickname.isNotEmpty() && role.isNotEmpty()) {
                dbHandler.addPlayer(Player(nickname, role))
            }

            Navigation.findNavController(binding.root).navigate(R.id.action_add_2_to_list2)
        }

        binding.back.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_add_2_to_list2)
        }

        return binding.root
    }
}