package com.example.cpredplayer

data class Player(val nickname: String, val role: String) {
    var id:Int = 0

//    var WeaponName: MutableList<String> = mutableListOf()
//    var WeaponDmg: MutableList<String> = mutableListOf()
//    var WeaponAmmo: MutableList<String> = mutableListOf()
//
//    var ArmorHeadDef:String = ""
//    var ArmorHeadPenalty: String = ""
//    var ArmorBodyDef:String = ""
//    var ArmorBodyPenalty: String = ""
//    var ArmorShieldDef:String = ""
//    var ArmorShieldPenalty: String = ""
//
//    var EqEquipment: MutableList<String> = mutableListOf()
//    var EqComment: MutableList<String> = mutableListOf()

    fun <T> add(list: MutableList<T>, item: T) {
        list.add(item)
    }

    fun <T> removeFromList(list: MutableList<T>, item: T) {
        list.remove(item)
    }


//    constructor(id:  Int, nickname: String, role: String,
//        WeaponName: MutableList<String>, WeaponDmg: MutableList<String>, WeaponAmmo: MutableList<String>,
//        ArmorHeadDef: String, ArmorHeadPenalty: String,
//        ArmorBodyDef: String, ArmorBodyPenalty: String,
//        ArmorShieldDef: String, ArmorShieldPenalty: String,
//
//        EqEquipment: MutableList<String>, EqComment: MutableList<String>,) : this(nickname, role){
    constructor(id:  Int, nickname: String, role: String) : this(nickname, role){

        this.id = id
//        this.WeaponName = WeaponName
//        this.WeaponDmg  = WeaponDmg
//        this.WeaponAmmo = WeaponAmmo
//
//        this.ArmorHeadDef = ArmorHeadDef
//        this.ArmorHeadPenalty = ArmorHeadPenalty
//        this.ArmorBodyDef = ArmorBodyDef
//        this.ArmorBodyPenalty = ArmorBodyPenalty
//        this.ArmorShieldDef = ArmorShieldDef
//        this.ArmorShieldPenalty = ArmorShieldPenalty
//
//        this.EqEquipment = EqEquipment
//        this.EqComment = EqComment
        }
}