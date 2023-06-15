package com.example.cpredplayer

import android.app.Dialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.cpredplayer.databinding.DetailBinding
import com.example.cpredplayer.databinding.DialogDiceBinding

class Detail : Fragment() {

    private lateinit var itemId: String
    private lateinit var dbHandler: DBHandler
    private lateinit var item: Character

    val binding by lazy { DetailBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let { itemId = it.getString("itemId").toString() }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val context = this.context
        if (context != null) {
            dbHandler = DBHandler(context)

            item = dbHandler.getCharacter().find { item -> item.id.toString() == itemId }!!
            binding.textViewDetailNickname.text = Editable.Factory.getInstance().newEditable(item.nickname)
            binding.textViewDetailRole.text = Editable.Factory.getInstance().newEditable(item.role)

            binding.textViewInt.text = Editable.Factory.getInstance().newEditable(item.int_s)
            binding.textViewRef.text = Editable.Factory.getInstance().newEditable(item.ref)
            binding.textViewZw.text = Editable.Factory.getInstance().newEditable(item.zw)
            binding.textViewTech.text = Editable.Factory.getInstance().newEditable(item.tech)
            binding.textViewCha.text = Editable.Factory.getInstance().newEditable(item.cha)
            binding.textViewSw.text = Editable.Factory.getInstance().newEditable(item.sw)
            binding.textViewSz.text = Editable.Factory.getInstance().newEditable(item.sz)
            binding.textViewRuch.text = Editable.Factory.getInstance().newEditable(item.ruch)
            binding.textViewBc.text = Editable.Factory.getInstance().newEditable(item.bc)
            binding.textViewEmp.text = Editable.Factory.getInstance().newEditable(item.emp)

            binding.textViewWeaponName1.text = Editable.Factory.getInstance().newEditable(item.weaponName1)
            binding.textViewWeaponDmg1.text = Editable.Factory.getInstance().newEditable(item.weaponDmg1)
            binding.textViewWeaponAmmo1.text = Editable.Factory.getInstance().newEditable(item.weaponAmmo1)
            binding.textViewWeaponName2.text = Editable.Factory.getInstance().newEditable(item.weaponName2)
            binding.textViewWeaponDmg2.text = Editable.Factory.getInstance().newEditable(item.weaponDmg2)
            binding.textViewWeaponAmmo2.text = Editable.Factory.getInstance().newEditable(item.weaponAmmo2)
            binding.textViewWeaponName3.text = Editable.Factory.getInstance().newEditable(item.weaponName3)
            binding.textViewWeaponDmg3.text = Editable.Factory.getInstance().newEditable(item.weaponDmg3)
            binding.textViewWeaponAmmo3.text = Editable.Factory.getInstance().newEditable(item.weaponAmmo3)
            binding.textViewWeaponName4.text = Editable.Factory.getInstance().newEditable(item.weaponName4)
            binding.textViewWeaponDmg4.text = Editable.Factory.getInstance().newEditable(item.weaponDmg4)
            binding.textViewWeaponAmmo4.text = Editable.Factory.getInstance().newEditable(item.weaponAmmo4)

            binding.textViewArmorHeadDefense.text = Editable.Factory.getInstance().newEditable(item.armorHeadDef)
            binding.textViewArmorHeadPenalty.text = Editable.Factory.getInstance().newEditable(item.armorHeadPenalty)
            binding.textViewArmorBodyDefense.text = Editable.Factory.getInstance().newEditable(item.armorBodyDef)
            binding.textViewArmorBodyPenalty.text = Editable.Factory.getInstance().newEditable(item.armorBodyPenalty)
            binding.textViewArmorShieldDefense.text = Editable.Factory.getInstance().newEditable(item.armorShieldDef)
            binding.textViewArmorShieldPenalty.text = Editable.Factory.getInstance().newEditable(item.armorShieldPenalty)

            binding.textViewQeEquipment1.text = Editable.Factory.getInstance().newEditable(item.EqEquipment1)
            binding.textViewQeComment1.text = Editable.Factory.getInstance().newEditable(item.EqComment1)
            binding.textViewQeEquipment2.text = Editable.Factory.getInstance().newEditable(item.EqEquipment2)
            binding.textViewQeComment2.text = Editable.Factory.getInstance().newEditable(item.EqComment2)
            binding.textViewQeEquipment3.text = Editable.Factory.getInstance().newEditable(item.EqEquipment3)
            binding.textViewQeComment3.text = Editable.Factory.getInstance().newEditable(item.EqComment3)
            binding.textViewQeEquipment4.text = Editable.Factory.getInstance().newEditable(item.EqEquipment4)
            binding.textViewQeComment4.text = Editable.Factory.getInstance().newEditable(item.EqComment4)
            binding.textViewQeEquipment5.text = Editable.Factory.getInstance().newEditable(item.EqEquipment5)
            binding.textViewQeComment5.text = Editable.Factory.getInstance().newEditable(item.EqComment5)
            binding.textViewQeEquipment6.text = Editable.Factory.getInstance().newEditable(item.EqEquipment6)
            binding.textViewQeComment6.text = Editable.Factory.getInstance().newEditable(item.EqComment6)
            binding.textViewQeEquipment7.text = Editable.Factory.getInstance().newEditable(item.EqEquipment7)
            binding.textViewQeComment7.text = Editable.Factory.getInstance().newEditable(item.EqComment7)
            binding.textViewQeEquipment8.text = Editable.Factory.getInstance().newEditable(item.EqEquipment8)
            binding.textViewQeComment8.text = Editable.Factory.getInstance().newEditable(item.EqComment8)
            binding.textViewQeEquipment9.text = Editable.Factory.getInstance().newEditable(item.EqEquipment9)
            binding.textViewQeComment9.text = Editable.Factory.getInstance().newEditable(item.EqComment9)
            binding.textViewQeEquipment10.text = Editable.Factory.getInstance().newEditable(item.EqEquipment10)
            binding.textViewQeComment10.text = Editable.Factory.getInstance().newEditable(item.EqComment10)

            binding.textViewCyb1.text = Editable.Factory.getInstance().newEditable(item.cyborgizacja1)
            binding.textViewDane1.text = Editable.Factory.getInstance().newEditable(item.dane1)
            binding.textViewCyb2.text = Editable.Factory.getInstance().newEditable(item.cyborgizacja2)
            binding.textViewDane2.text = Editable.Factory.getInstance().newEditable(item.dane2)
            binding.textViewCyb3.text = Editable.Factory.getInstance().newEditable(item.cyborgizacja3)
            binding.textViewDane3.text = Editable.Factory.getInstance().newEditable(item.dane3)
            binding.textViewCyb4.text = Editable.Factory.getInstance().newEditable(item.cyborgizacja4)
            binding.textViewDane4.text = Editable.Factory.getInstance().newEditable(item.dane4)
            binding.textViewCyb5.text = Editable.Factory.getInstance().newEditable(item.cyborgizacja5)
            binding.textViewDane5.text = Editable.Factory.getInstance().newEditable(item.dane5)
            binding.textViewCyb6.text = Editable.Factory.getInstance().newEditable(item.cyborgizacja6)
            binding.textViewDane6.text = Editable.Factory.getInstance().newEditable(item.dane6)
            binding.textViewCyb7.text = Editable.Factory.getInstance().newEditable(item.cyborgizacja7)
            binding.textViewDane7.text = Editable.Factory.getInstance().newEditable(item.dane7)
            binding.textViewCyb8.text = Editable.Factory.getInstance().newEditable(item.cyborgizacja8)
            binding.textViewDane8.text = Editable.Factory.getInstance().newEditable(item.dane8)
            binding.textViewCyb9.text = Editable.Factory.getInstance().newEditable(item.cyborgizacja9)
            binding.textViewDane9.text = Editable.Factory.getInstance().newEditable(item.dane9)
            binding.textViewCyb10.text = Editable.Factory.getInstance().newEditable(item.cyborgizacja10)
            binding.textViewDane10.text = Editable.Factory.getInstance().newEditable(item.dane10)



            binding.save.setOnClickListener {
                val updatenickname = binding.textViewDetailNickname.text.toString()
                val updaterole = binding.textViewDetailRole.text.toString()

                val updateint = binding.textViewInt.text.toString()
                val updateref = binding.textViewRef.text.toString()
                val updatezw = binding.textViewZw.text.toString()
                val updatetech = binding.textViewTech.text.toString()
                val updatecha = binding.textViewCha.text.toString()
                val updatesw = binding.textViewSw.text.toString()
                val updatesz = binding.textViewSz.text.toString()
                val updateruch = binding.textViewRuch.text.toString()
                val updatebc = binding.textViewBc.text.toString()
                val updateemp = binding.textViewEmp.text.toString()

                val updateweaponName1 = binding.textViewWeaponName1.text.toString()
                val updateweaponDmg1 = binding.textViewWeaponDmg1.text.toString()
                val updateweaponAmmo1 = binding.textViewWeaponAmmo1.text.toString()
                val updateweaponName2 = binding.textViewWeaponName2.text.toString()
                val updateweaponDmg2 = binding.textViewWeaponDmg2.text.toString()
                val updateweaponAmmo2 = binding.textViewWeaponAmmo2.text.toString()
                val updateweaponName3 = binding.textViewWeaponName3.text.toString()
                val updateweaponDmg3 = binding.textViewWeaponDmg3.text.toString()
                val updateweaponAmmo3 = binding.textViewWeaponAmmo3.text.toString()
                val updateweaponName4 = binding.textViewWeaponName4.text.toString()
                val updateweaponDmg4 = binding.textViewWeaponDmg4.text.toString()
                val updateweaponAmmo4 = binding.textViewWeaponAmmo4.text.toString()

                val updatearmorHeadDef = binding.textViewArmorHeadDefense.text.toString()
                val updatearmorHeadPenalty = binding.textViewArmorHeadPenalty.text.toString()
                val updatearmorBodyDef = binding.textViewArmorBodyDefense.text.toString()
                val updatearmorBodyPenalty = binding.textViewArmorBodyPenalty.text.toString()
                val updatearmorShieldDef = binding.textViewArmorShieldDefense.text.toString()
                val updatearmorShieldPenalty = binding.textViewArmorShieldPenalty.text.toString()

                val updateEqEquipment1 = binding.textViewQeEquipment1.text.toString()
                val updateEqComment1 = binding.textViewQeComment1.text.toString()
                val updateEqEquipment2 = binding.textViewQeEquipment2.text.toString()
                val updateEqComment2 = binding.textViewQeComment2.text.toString()
                val updateEqEquipment3 = binding.textViewQeEquipment3.text.toString()
                val updateEqComment3 = binding.textViewQeComment3.text.toString()
                val updateEqEquipment4 = binding.textViewQeEquipment4.text.toString()
                val updateEqComment4 = binding.textViewQeComment4.text.toString()
                val updateEqEquipment5 = binding.textViewQeEquipment5.text.toString()
                val updateEqComment5 = binding.textViewQeComment5.text.toString()
                val updateEqEquipment6 = binding.textViewQeEquipment6.text.toString()
                val updateEqComment6 = binding.textViewQeComment6.text.toString()
                val updateEqEquipment7 = binding.textViewQeEquipment7.text.toString()
                val updateEqComment7 = binding.textViewQeComment7.text.toString()
                val updateEqEquipment8 = binding.textViewQeEquipment8.text.toString()
                val updateEqComment8 = binding.textViewQeComment8.text.toString()
                val updateEqEquipment9 = binding.textViewQeEquipment9.text.toString()
                val updateEqComment9 = binding.textViewQeComment9.text.toString()
                val updateEqEquipment10 = binding.textViewQeEquipment10.text.toString()
                val updateEqComment10 = binding.textViewQeComment10.text.toString()

                val updateCyb1 = binding.textViewCyb1.text.toString()
                val updatedane1 = binding.textViewDane1.text.toString()
                val updateCyb2 = binding.textViewCyb2.text.toString()
                val updatedane2 = binding.textViewDane2.text.toString()
                val updateCyb3 = binding.textViewCyb3.text.toString()
                val updatedane3 = binding.textViewDane3.text.toString()
                val updateCyb4 = binding.textViewCyb4.text.toString()
                val updatedane4 = binding.textViewDane4.text.toString()
                val updateCyb5 = binding.textViewCyb5.text.toString()
                val updatedane5 = binding.textViewDane5.text.toString()
                val updateCyb6 = binding.textViewCyb6.text.toString()
                val updatedane6 = binding.textViewDane6.text.toString()
                val updateCyb7 = binding.textViewCyb7.text.toString()
                val updatedane7 = binding.textViewDane7.text.toString()
                val updateCyb8 = binding.textViewCyb8.text.toString()
                val updatedane8 = binding.textViewDane8.text.toString()
                val updateCyb9 = binding.textViewCyb9.text.toString()
                val updatedane9 = binding.textViewDane9.text.toString()
                val updateCyb10 = binding.textViewCyb10.text.toString()
                val updatedane10 = binding.textViewDane10.text.toString()

                dbHandler.updateCharacter(
                    item.id,
                    updatenickname,
                    updaterole,

                    updateint,
                    updateref,
                    updatezw,
                    updatetech,
                    updatecha,
                    updatesw,
                    updatesz,
                    updateruch,
                    updatebc,
                    updateemp,

                    updateweaponName1,
                    updateweaponDmg1,
                    updateweaponAmmo1,
                    updateweaponName2,
                    updateweaponDmg2,
                    updateweaponAmmo2,
                    updateweaponName3,
                    updateweaponDmg3,
                    updateweaponAmmo3,
                    updateweaponName4,
                    updateweaponDmg4,
                    updateweaponAmmo4,
                    updatearmorHeadDef,
                    updatearmorHeadPenalty,
                    updatearmorBodyDef,
                    updatearmorBodyPenalty,
                    updatearmorShieldDef,
                    updatearmorShieldPenalty,
                    updateEqEquipment1,
                    updateEqComment1,
                    updateEqEquipment2,
                    updateEqComment2,
                    updateEqEquipment3,
                    updateEqComment3,
                    updateEqEquipment4,
                    updateEqComment4,
                    updateEqEquipment5,
                    updateEqComment5,
                    updateEqEquipment6,
                    updateEqComment6,
                    updateEqEquipment7,
                    updateEqComment7,
                    updateEqEquipment8,
                    updateEqComment8,
                    updateEqEquipment9,
                    updateEqComment9,
                    updateEqEquipment10,
                    updateEqComment10,

                    updateCyb1,
                    updatedane1,
                    updateCyb2,
                    updatedane2,
                    updateCyb3,
                    updatedane3,
                    updateCyb4,
                    updatedane4,
                    updateCyb5,
                    updatedane5,
                    updateCyb6,
                    updatedane6,
                    updateCyb7,
                    updatedane7,
                    updateCyb8,
                    updatedane8,
                    updateCyb9,
                    updatedane9,
                    updateCyb10,
                    updatedane10)
            }

            binding.back.setOnClickListener {
                Navigation.findNavController(binding.root).navigate(R.id.action_detail_to_list)
            }

            binding.map.setOnClickListener {
                val url = "https://www.nightcity.io/"

                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }

            binding.dice.setOnClickListener {
                rolldialog()
            }
        }
        return binding.root
    }

    private fun rolldialog()
    {
        val context = this.context
        if (context != null)
        {
            val dialog = Dialog(context, android.R.style.Theme_Black_NoTitleBar_Fullscreen)
            dialog.setContentView(R.layout.activity_main)
            val dialogBinding = DialogDiceBinding.inflate(LayoutInflater.from(context))

            dialog.apply {
                setCancelable(false)
                setContentView(dialogBinding.root)
            }

            dialogBinding.apply {
                buttonRoll.setOnClickListener {
                    val x = dialogBinding.textK1.text.toString().toInt()
                    val y = dialogBinding.textK2.text.toString().toInt()

                    var sum = 0

                    for (i in 0 until x)
                    {
                        val random = (0..y).random()
                        sum += random
                    }

                    dialogBinding.textDice.setText(sum.toString())
                }

                buttonCancel.setOnClickListener {
                    dialog.dismiss()
                }
            }
            dialog.show()
        }
    }
}