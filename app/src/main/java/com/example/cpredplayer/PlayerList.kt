package com.example.cpredplayer

import android.app.Dialog
import android.util.Log
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cpredplayer.databinding.PlayerListBinding
import com.example.cpredplayer.databinding.DialogAddPlayerBinding


class PlayerList : Fragment() {

    private lateinit var dbHandler: DBHandler
    private val binding by lazy { PlayerListBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val context = this.context
        if (context != null) {
            dbHandler  = DBHandler(context)
        }

        binding.dataBaseRecyclerView.apply {
            layoutManager = LinearLayoutManager(this.context)
            adapter = PlayerAdapter(dbHandler, this.context)
        }

        binding.addButton.setOnClickListener {
            addCharacterDialog()
        }

        binding.mapButton.setOnClickListener {
            Log.d("button", "to do")
        }

        return binding.root
    }

    private fun addCharacterDialog()
    {
        val context = this.context
        if (context != null)
        {
            //val dialog = Dialog(context)
            val dialog = Dialog(context, android.R.style.Theme_Black_NoTitleBar_Fullscreen)
            dialog.setContentView(R.layout.activity_main)
            val dialogBinding = DialogAddPlayerBinding.inflate(LayoutInflater.from(context))

            dialog.apply {
                setCancelable(false)
                setContentView(dialogBinding.root)
            }

            dialogBinding.apply {

                buttonAddCharacter1.setOnClickListener {
                    Log.d("button add 1", "to do")
                    dialog.dismiss()
                }

                buttonAddCharacter2.setOnClickListener {
                    Log.d("button add 2", "to do")
                    Navigation.findNavController(binding.root).navigate(R.id.action_list_to_add_2)
                    dialog.dismiss()
                }

                buttonCancelCharacter.setOnClickListener {
                    dialog.dismiss()
                }
            }
            dialog.show()
        }
    }


    override fun onDestroy() {
        dbHandler.close()
        super.onDestroy()
    }
}