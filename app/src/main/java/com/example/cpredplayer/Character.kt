package com.example.cpredplayer

data class Character(val nickname: String, val role:String) {
    var id:Int = 0

    var int_s: String = ""
    var ref: String = ""
    var zw: String = ""
    var tech: String = ""
    var cha: String = ""
    var sw: String = ""
    var sz: String = ""
    var ruch: String = ""
    var bc: String = ""
    var emp: String = ""

    var weaponName1:String = ""
    var weaponDmg1: String = ""
    var weaponAmmo1: String = ""

    var weaponName2:String = ""
    var weaponDmg2: String = ""
    var weaponAmmo2: String = ""

    var weaponName3:String = ""
    var weaponDmg3: String = ""
    var weaponAmmo3: String = ""

    var weaponName4:String = ""
    var weaponDmg4: String = ""
    var weaponAmmo4: String = ""


    var armorHeadDef:String = ""
    var armorHeadPenalty: String = ""
    var armorBodyDef:String = ""
    var armorBodyPenalty: String = ""
    var armorShieldDef:String = ""
    var armorShieldPenalty: String = ""

    var EqEquipment1:String = ""
    var EqComment1:String = ""
    var EqEquipment2:String = ""
    var EqComment2:String = ""
    var EqEquipment3:String = ""
    var EqComment3:String = ""
    var EqEquipment4:String = ""
    var EqComment4:String = ""
    var EqEquipment5:String = ""
    var EqComment5:String = ""
    var EqEquipment6:String = ""
    var EqComment6:String = ""
    var EqEquipment7:String = ""
    var EqComment7:String = ""
    var EqEquipment8:String = ""
    var EqComment8:String = ""
    var EqEquipment9:String = ""
    var EqComment9:String = ""
    var EqEquipment10:String = ""
    var EqComment10:String = ""

    var cyborgizacja1:String = ""
    var dane1:String = ""
    var cyborgizacja2:String = ""
    var dane2:String = ""
    var cyborgizacja3:String = ""
    var dane3:String = ""
    var cyborgizacja4:String = ""
    var dane4:String = ""
    var cyborgizacja5:String = ""
    var dane5:String = ""
    var cyborgizacja6:String = ""
    var dane6:String = ""
    var cyborgizacja7:String = ""
    var dane7:String = ""
    var cyborgizacja8:String = ""
    var dane8:String = ""
    var cyborgizacja9:String = ""
    var dane9:String = ""
    var cyborgizacja10:String = ""
    var dane10:String = ""


    constructor(id: Int, nickname: String, role: String,

                int_s: String, ref: String, zw:String, tech:String, cha:String,
                sw:String, sz:String, ruch:String, bc:String, emp:String,

                weaponName1: String, weaponDmg1: String, weaponAmmo1: String,
                weaponName2: String, weaponDmg2: String, weaponAmmo2: String,
                weaponName3: String, weaponDmg3: String, weaponAmmo3: String,
                weaponName4: String, weaponDmg4: String, weaponAmmo4: String,

                armorHeadDef: String, armorHeadPenalty: String,
                armorBodyDef: String, armorBodyPenalty: String,
                armorShieldDef: String, armorShieldPenalty: String,

                eqEqipment1: String, eqComment1: String,
                eqEqipment2: String, eqComment2: String,
                eqEqipment3: String, eqComment3: String,
                eqEqipment4: String, eqComment4: String,
                eqEqipment5: String, eqComment5: String,
                eqEqipment6: String, eqComment6: String,
                eqEqipment7: String, eqComment7: String,
                eqEqipment8: String, eqComment8: String,
                eqEqipment9: String, eqComment9: String,
                eqEqipment10: String, eqComment10: String,

                cyborgizacja1: String, dane1:String,
                cyborgizacja2: String, dane2:String,
                cyborgizacja3: String, dane3:String,
                cyborgizacja4: String, dane4:String,
                cyborgizacja5: String, dane5:String,
                cyborgizacja6: String, dane6:String,
                cyborgizacja7: String, dane7:String,
                cyborgizacja8: String, dane8:String,
                cyborgizacja9: String, dane9:String,
                cyborgizacja10: String, dane10:String) : this(nickname, role){

        this.id = id

        this.int_s = int_s
        this.ref = ref
        this.zw = zw
        this.tech = tech
        this.cha = cha
        this.sw = sw
        this.sz = sz
        this.ruch = ruch
        this.bc = bc
        this.emp = emp

        this.weaponName1 = weaponName1
        this.weaponDmg1 = weaponDmg1
        this.weaponAmmo1 = weaponAmmo1
        this.weaponName2 = weaponName2
        this.weaponDmg2 = weaponDmg2
        this.weaponAmmo2 = weaponAmmo2
        this.weaponName3 = weaponName3
        this.weaponDmg3 = weaponDmg3
        this.weaponAmmo3 = weaponAmmo3
        this.weaponName4 = weaponName4
        this.weaponDmg4 = weaponDmg4
        this.weaponAmmo4 = weaponAmmo4

        this.armorHeadDef = armorHeadDef
        this.armorHeadPenalty = armorHeadPenalty
        this.armorBodyDef = armorBodyDef
        this.armorBodyPenalty = armorBodyPenalty
        this.armorShieldDef = armorShieldDef
        this.armorShieldPenalty = armorShieldPenalty

        this.EqEquipment1 = eqEqipment1
        this.EqComment1 = eqComment1
        this.EqEquipment2 = eqEqipment2
        this.EqComment2 = eqComment2
        this.EqEquipment3 = eqEqipment3
        this.EqComment3 = eqComment3
        this.EqEquipment4 = eqEqipment4
        this.EqComment4 = eqComment4
        this.EqEquipment5 = eqEqipment5
        this.EqComment5 = eqComment5
        this.EqEquipment6 = eqEqipment6
        this.EqComment6 = eqComment6
        this.EqEquipment7 = eqEqipment7
        this.EqComment7 = eqComment7
        this.EqEquipment8 = eqEqipment8
        this.EqComment8 = eqComment8
        this.EqEquipment9 = eqEqipment9
        this.EqComment9 = eqComment9
        this.EqEquipment10 = eqEqipment10
        this.EqComment10 = eqComment10

        this.cyborgizacja1 = cyborgizacja1
        this.dane1 = dane1
        this.cyborgizacja2 = cyborgizacja2
        this.dane2 = dane2
        this.cyborgizacja3 = cyborgizacja3
        this.dane3 = dane3
        this.cyborgizacja4 = cyborgizacja4
        this.dane4 = dane4
        this.cyborgizacja5 = cyborgizacja5
        this.dane5 = dane5
        this.cyborgizacja6 = cyborgizacja6
        this.dane6 = dane6
        this.cyborgizacja7 = cyborgizacja7
        this.dane7 = dane7
        this.cyborgizacja8 = cyborgizacja8
        this.dane8 = dane8
        this.cyborgizacja9 = cyborgizacja9
        this.dane9 = dane9
        this.cyborgizacja10 = cyborgizacja10
        this.dane10 = dane10
    }
}