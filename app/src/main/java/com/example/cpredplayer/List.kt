package com.example.cpredplayer

import android.app.Dialog
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cpredplayer.databinding.ListBinding
import com.example.cpredplayer.databinding.DialogAddBinding
import com.example.cpredplayer.databinding.DialogAddCharacterBinding

class List : Fragment() {

    private lateinit var dbHandler: DBHandler
    private val binding by lazy { ListBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val context = this.context
        if (context != null) {
            dbHandler = DBHandler(context)
        }

        binding.dataBaseRecyclerView.apply {
            layoutManager = LinearLayoutManager(this.context)
            adapter = CharacterAdapter(dbHandler, this.context)
        }


        binding.addButton.setOnClickListener {
            addCharacterDialog()
        }

        binding.map.setOnClickListener {
            val url = "https://www.nightcity.io/"

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }



        return  binding.root
    }

    private fun addCharacterDialog()
    {
        val context = this.context
        if (context != null)
        {
            val dialog = Dialog(context, android.R.style.Theme_Black_NoTitleBar_Fullscreen)
            dialog.setContentView(R.layout.activity_main)
            val dialogBinding = DialogAddCharacterBinding.inflate(LayoutInflater.from(context))

            dialog.apply {
                setCancelable(false)
                setContentView(dialogBinding.root)
            }

            dialogBinding.apply {

                buttonAddCharacter.setOnClickListener {
                    val nickname = dialogBinding.addTextNickname.text.toString()
                    val role = dialogBinding.addTextRole.text.toString()

                    if(nickname.isNotEmpty() && role.isNotEmpty()) {
                        dbHandler.addCharacter(Character(nickname, role))
                        refreshList()
                    }

                    dialog.dismiss()
                }

                buttonCancelCharacter.setOnClickListener {
                    dialog.dismiss()
                }
            }
            dialog.show()
        }
    }

    private fun refreshList() {
        binding.dataBaseRecyclerView.adapter?.notifyDataSetChanged()
    }

    override fun onDestroy() {
        dbHandler.close()
        super.onDestroy()
    }
}