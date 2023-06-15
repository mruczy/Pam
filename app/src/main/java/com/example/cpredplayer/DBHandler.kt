package com.example.cpredplayer

import android.content.Context
import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import kotlin.contracts.contract

class DBHandler(context: Context) : SQLiteOpenHelper(
    context, DATABASE_NAME, null, DATABASE_VERSION
) {
    private companion object{
        private const val DATABASE_NAME = "charactersDBKotlin.db"
        private const val DATABASE_VERSION = 1
        private const val TABLE_CHARACTERS = "CharactersTable"

        private const val COLUMN_ID = "_id"
        private const val COLUMN_NICKNAME = "nickname"
        private const val COLUMN_ROLE = "role"

        private const val COLUMN_INT = "int"
        private const val COLUMN_REF = "ref"
        private const val COLUMN_ZW = "zw"
        private const val COLUMN_TECH = "tech"
        private const val COLUMN_CHA = "cha"
        private const val COLUMN_SW = "sw"
        private const val COLUMN_SZ = "sz"
        private const val COLUMN_RUCH = "ruch"
        private const val COLUMN_BC = "bc"
        private const val COLUMN_EMP = "emp"

        private const val COLUMN_WEAPON_NAME_1 = "weapon1"
        private const val COLUMN_WEAPON_DMG_1 = "dmg1"
        private const val COLUMN_WEAPON_AMMO_1 = "ammo1"
        private const val COLUMN_WEAPON_COMMENT_1 = "weapon_comment1"
        private const val COLUMN_WEAPON_NAME_2 = "weapon2"
        private const val COLUMN_WEAPON_DMG_2 = "dmg2"
        private const val COLUMN_WEAPON_AMMO_2 = "ammo2"
        private const val COLUMN_WEAPON_COMMENT_2 = "weapon_comment2"
        private const val COLUMN_WEAPON_NAME_3 = "weapon3"
        private const val COLUMN_WEAPON_DMG_3 = "dmg3"
        private const val COLUMN_WEAPON_AMMO_3 = "ammo3"
        private const val COLUMN_WEAPON_COMMENT_3 = "weapon_comment3"
        private const val COLUMN_WEAPON_NAME_4 = "weapon4"
        private const val COLUMN_WEAPON_DMG_4 = "dmg4"
        private const val COLUMN_WEAPON_AMMO_4 = "ammo4"
        private const val COLUMN_WEAPON_COMMENT_4 = "weapon_comment4"

        private const val COLUMN_ARMOR_HEAD_DEF = "def_head"
        private const val COLUMN_ARMOR_HEAD_PENALTY = "penalty_head"
        private const val COLUMN_ARMOR_BODY_DEF = "def_body"
        private const val COLUMN_ARMOR_BODY_PENALTY = "penalty_body"
        private const val COLUMN_ARMOR_SHIELD_DEF = "def_shield"
        private const val COLUMN_ARMOR_SHIELD_PENALTY = "penalty_shield"

        private const val COLUMN_EQ_EQUIPMENT_1 = "equipment1"
        private const val COLUMN_EQ_COMMENT_1 = "comment1"
        private const val COLUMN_EQ_EQUIPMENT_2 = "equipment2"
        private const val COLUMN_EQ_COMMENT_2 = "comment2"
        private const val COLUMN_EQ_EQUIPMENT_3 = "equipment3"
        private const val COLUMN_EQ_COMMENT_3 = "comment3"
        private const val COLUMN_EQ_EQUIPMENT_4 = "equipment4"
        private const val COLUMN_EQ_COMMENT_4 = "comment4"
        private const val COLUMN_EQ_EQUIPMENT_5 = "equipment5"
        private const val COLUMN_EQ_COMMENT_5 = "comment5"
        private const val COLUMN_EQ_EQUIPMENT_6 = "equipment6"
        private const val COLUMN_EQ_COMMENT_6 = "comment6"
        private const val COLUMN_EQ_EQUIPMENT_7 = "equipment7"
        private const val COLUMN_EQ_COMMENT_7 = "comment7"
        private const val COLUMN_EQ_EQUIPMENT_8 = "equipment8"
        private const val COLUMN_EQ_COMMENT_8 = "comment8"
        private const val COLUMN_EQ_EQUIPMENT_9 = "equipment9"
        private const val COLUMN_EQ_COMMENT_9 = "comment9"
        private const val COLUMN_EQ_EQUIPMENT_10 = "equipment10"
        private const val COLUMN_EQ_COMMENT_10 = "comment10"

        private const val COLUMN_CYB_1 = "cyb1"
        private const val COLUMN_DANE_1 = "dane1"
        private const val COLUMN_CYB_2 = "cyb2"
        private const val COLUMN_DANE_2 = "dane2"
        private const val COLUMN_CYB_3 = "cyb3"
        private const val COLUMN_DANE_3 = "dane3"
        private const val COLUMN_CYB_4 = "cyb4"
        private const val COLUMN_DANE_4 = "dane4"
        private const val COLUMN_CYB_5 = "cyb5"
        private const val COLUMN_DANE_5 = "dane5"
        private const val COLUMN_CYB_6 = "cyb6"
        private const val COLUMN_DANE_6 = "dane6"
        private const val COLUMN_CYB_7 = "cyb7"
        private const val COLUMN_DANE_7 = "dane7"
        private const val COLUMN_CYB_8 = "cyb8"
        private const val COLUMN_DANE_8 = "dane8"
        private const val COLUMN_CYB_9 = "cyb9"
        private const val COLUMN_DANE_9 = "dane9"
        private const val COLUMN_CYB_10 = "cyb10"
        private const val COLUMN_DANE_10 = "dane10"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_CHARACTER_TABLE =
            "CREATE TABLE $TABLE_CHARACTERS(" +
                    "$COLUMN_ID INTEGER PRIMARY KEY," +
                    "$COLUMN_NICKNAME TEXT," +
                    "$COLUMN_ROLE TEXT," +

                    "$COLUMN_INT TEXT," +
                    "$COLUMN_REF TEXT," +
                    "$COLUMN_ZW TEXT," +
                    "$COLUMN_TECH TEXT," +
                    "$COLUMN_CHA TEXT," +
                    "$COLUMN_SW TEXT," +
                    "$COLUMN_SZ TEXT," +
                    "$COLUMN_RUCH TEXT," +
                    "$COLUMN_BC TEXT," +
                    "$COLUMN_EMP TEXT," +

                    "$COLUMN_WEAPON_NAME_1 TEXT," +
                    "$COLUMN_WEAPON_DMG_1 TEXT," +
                    "$COLUMN_WEAPON_AMMO_1 TEXT," +
                    "$COLUMN_WEAPON_COMMENT_1 TEXT," +
                    "$COLUMN_WEAPON_NAME_2 TEXT," +
                    "$COLUMN_WEAPON_DMG_2 TEXT," +
                    "$COLUMN_WEAPON_AMMO_2 TEXT," +
                    "$COLUMN_WEAPON_COMMENT_2 TEXT," +
                    "$COLUMN_WEAPON_NAME_3 TEXT," +
                    "$COLUMN_WEAPON_DMG_3 TEXT," +
                    "$COLUMN_WEAPON_AMMO_3 TEXT," +
                    "$COLUMN_WEAPON_COMMENT_3 TEXT," +
                    "$COLUMN_WEAPON_NAME_4 TEXT," +
                    "$COLUMN_WEAPON_DMG_4 TEXT," +
                    "$COLUMN_WEAPON_AMMO_4 TEXT," +
                    "$COLUMN_WEAPON_COMMENT_4 TEXT," +

                    "$COLUMN_ARMOR_HEAD_DEF TEXT," +
                    "$COLUMN_ARMOR_HEAD_PENALTY TEXT," +
                    "$COLUMN_ARMOR_BODY_DEF TEXT," +
                    "$COLUMN_ARMOR_BODY_PENALTY TEXT," +
                    "$COLUMN_ARMOR_SHIELD_DEF TEXT," +
                    "$COLUMN_ARMOR_SHIELD_PENALTY TEXT," +

                    "$COLUMN_EQ_EQUIPMENT_1 TEXT," +
                    "$COLUMN_EQ_COMMENT_1 TEXT," +
                    "$COLUMN_EQ_EQUIPMENT_2 TEXT," +
                    "$COLUMN_EQ_COMMENT_2 TEXT," +
                    "$COLUMN_EQ_EQUIPMENT_3 TEXT," +
                    "$COLUMN_EQ_COMMENT_3 TEXT," +
                    "$COLUMN_EQ_EQUIPMENT_4 TEXT," +
                    "$COLUMN_EQ_COMMENT_4 TEXT," +
                    "$COLUMN_EQ_EQUIPMENT_5 TEXT," +
                    "$COLUMN_EQ_COMMENT_5 TEXT," +
                    "$COLUMN_EQ_EQUIPMENT_6 TEXT," +
                    "$COLUMN_EQ_COMMENT_6 TEXT," +
                    "$COLUMN_EQ_EQUIPMENT_7 TEXT," +
                    "$COLUMN_EQ_COMMENT_7 TEXT," +
                    "$COLUMN_EQ_EQUIPMENT_8 TEXT," +
                    "$COLUMN_EQ_COMMENT_8 TEXT," +
                    "$COLUMN_EQ_EQUIPMENT_9 TEXT," +
                    "$COLUMN_EQ_COMMENT_9 TEXT," +
                    "$COLUMN_EQ_EQUIPMENT_10 TEXT," +
                    "$COLUMN_EQ_COMMENT_10 TEXT," +

                    "$COLUMN_CYB_1 TEXT," +
                    "$COLUMN_DANE_1 TEXT," +
                    "$COLUMN_CYB_2 TEXT," +
                    "$COLUMN_DANE_2 TEXT," +
                    "$COLUMN_CYB_3 TEXT," +
                    "$COLUMN_DANE_3 TEXT," +
                    "$COLUMN_CYB_4 TEXT," +
                    "$COLUMN_DANE_4 TEXT," +
                    "$COLUMN_CYB_5 TEXT," +
                    "$COLUMN_DANE_5 TEXT," +
                    "$COLUMN_CYB_6 TEXT," +
                    "$COLUMN_DANE_6 TEXT," +
                    "$COLUMN_CYB_7 TEXT," +
                    "$COLUMN_DANE_7 TEXT," +
                    "$COLUMN_CYB_8 TEXT," +
                    "$COLUMN_DANE_8 TEXT," +
                    "$COLUMN_CYB_9 TEXT," +
                    "$COLUMN_DANE_9 TEXT," +
                    "$COLUMN_CYB_10 TEXT," +
                    "$COLUMN_DANE_10 TEXT)"

        db?.execSQL(CREATE_CHARACTER_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_CHARACTERS")
        onCreate(db)
    }

    fun addCharacter(character: Character){
        val db = this.writableDatabase

        val contentValues = ContentValues()
        contentValues.put(COLUMN_NICKNAME, character.nickname)
        contentValues.put(COLUMN_ROLE, character.role)

        contentValues.put(COLUMN_INT, character.int_s)
        contentValues.put(COLUMN_REF, character.ref)
        contentValues.put(COLUMN_ZW, character.zw)
        contentValues.put(COLUMN_TECH, character.tech)
        contentValues.put(COLUMN_CHA, character.cha)
        contentValues.put(COLUMN_SW, character.sw)
        contentValues.put(COLUMN_SZ, character.sz)
        contentValues.put(COLUMN_RUCH, character.ruch)
        contentValues.put(COLUMN_BC, character.bc)
        contentValues.put(COLUMN_EMP, character.emp)

        contentValues.put(COLUMN_WEAPON_NAME_1, character.weaponName1)
        contentValues.put(COLUMN_WEAPON_DMG_1, character.weaponDmg1)
        contentValues.put(COLUMN_WEAPON_AMMO_1, character.weaponAmmo1)
        contentValues.put(COLUMN_WEAPON_NAME_2, character.weaponName2)
        contentValues.put(COLUMN_WEAPON_DMG_2, character.weaponDmg2)
        contentValues.put(COLUMN_WEAPON_AMMO_2, character.weaponAmmo2)
        contentValues.put(COLUMN_WEAPON_NAME_3, character.weaponName3)
        contentValues.put(COLUMN_WEAPON_DMG_3, character.weaponDmg3)
        contentValues.put(COLUMN_WEAPON_AMMO_3, character.weaponAmmo3)
        contentValues.put(COLUMN_WEAPON_NAME_4, character.weaponName4)
        contentValues.put(COLUMN_WEAPON_DMG_4, character.weaponDmg4)
        contentValues.put(COLUMN_WEAPON_AMMO_4, character.weaponAmmo4)

        contentValues.put(COLUMN_ARMOR_HEAD_DEF, character.armorHeadDef)
        contentValues.put(COLUMN_ARMOR_HEAD_PENALTY, character.armorHeadPenalty)
        contentValues.put(COLUMN_ARMOR_BODY_DEF, character.armorBodyDef)
        contentValues.put(COLUMN_ARMOR_BODY_PENALTY, character.armorBodyPenalty)
        contentValues.put(COLUMN_ARMOR_SHIELD_DEF, character.armorShieldDef)
        contentValues.put(COLUMN_ARMOR_SHIELD_PENALTY, character.armorShieldPenalty)

        contentValues.put(COLUMN_EQ_EQUIPMENT_1, character.EqEquipment1)
        contentValues.put(COLUMN_EQ_COMMENT_1, character.EqComment1)
        contentValues.put(COLUMN_EQ_EQUIPMENT_2, character.EqEquipment2)
        contentValues.put(COLUMN_EQ_COMMENT_2, character.EqComment2)
        contentValues.put(COLUMN_EQ_EQUIPMENT_3, character.EqEquipment3)
        contentValues.put(COLUMN_EQ_COMMENT_3, character.EqComment3)
        contentValues.put(COLUMN_EQ_EQUIPMENT_4, character.EqEquipment4)
        contentValues.put(COLUMN_EQ_COMMENT_4, character.EqComment4)
        contentValues.put(COLUMN_EQ_EQUIPMENT_5, character.EqEquipment5)
        contentValues.put(COLUMN_EQ_COMMENT_5, character.EqComment5)
        contentValues.put(COLUMN_EQ_EQUIPMENT_6, character.EqEquipment6)
        contentValues.put(COLUMN_EQ_COMMENT_6, character.EqComment6)
        contentValues.put(COLUMN_EQ_EQUIPMENT_7, character.EqEquipment7)
        contentValues.put(COLUMN_EQ_COMMENT_7, character.EqComment7)
        contentValues.put(COLUMN_EQ_EQUIPMENT_8, character.EqEquipment8)
        contentValues.put(COLUMN_EQ_COMMENT_8, character.EqComment8)
        contentValues.put(COLUMN_EQ_EQUIPMENT_9, character.EqEquipment9)
        contentValues.put(COLUMN_EQ_COMMENT_9, character.EqComment9)
        contentValues.put(COLUMN_EQ_EQUIPMENT_10, character.EqEquipment10)
        contentValues.put(COLUMN_EQ_COMMENT_10, character.EqComment10)

        contentValues.put(COLUMN_CYB_1, character.cyborgizacja1)
        contentValues.put(COLUMN_DANE_1, character.dane1)
        contentValues.put(COLUMN_CYB_2, character.cyborgizacja2)
        contentValues.put(COLUMN_DANE_2, character.dane2)
        contentValues.put(COLUMN_CYB_3, character.cyborgizacja3)
        contentValues.put(COLUMN_DANE_3, character.dane3)
        contentValues.put(COLUMN_CYB_4, character.cyborgizacja4)
        contentValues.put(COLUMN_DANE_4, character.dane4)
        contentValues.put(COLUMN_CYB_5, character.cyborgizacja5)
        contentValues.put(COLUMN_DANE_5, character.dane5)
        contentValues.put(COLUMN_CYB_6, character.cyborgizacja6)
        contentValues.put(COLUMN_DANE_6, character.dane6)
        contentValues.put(COLUMN_CYB_7, character.cyborgizacja7)
        contentValues.put(COLUMN_DANE_7, character.dane7)
        contentValues.put(COLUMN_CYB_8, character.cyborgizacja8)
        contentValues.put(COLUMN_DANE_8, character.dane8)
        contentValues.put(COLUMN_CYB_9, character.cyborgizacja9)
        contentValues.put(COLUMN_DANE_9, character.dane9)
        contentValues.put(COLUMN_CYB_10, character.cyborgizacja10)
        contentValues.put(COLUMN_DANE_10, character.dane10)


        db.insert(TABLE_CHARACTERS, null, contentValues)
        db.close()
    }

    fun deleteCharacter(character: Character){
        val db = this.writableDatabase

        db.delete(TABLE_CHARACTERS, "$COLUMN_ID = ${character.id}", null)
        db.close()
    }

    fun updateCharacter(
        id: Int,
        nickname: String,
        role: String,

        int: String,
        ref: String,
        zw: String,
        tech: String,
        cha: String,
        sw: String,
        sz: String,
        ruch: String,
        bc: String,
        emp: String,

        weaponName1: String,
        weaponDmg1: String,
        weaponAmmo1: String,
        weaponName2: String,
        weaponDmg2: String,
        weaponAmmo2: String,
        weaponName3: String,
        weaponDmg3: String,
        weaponAmmo3: String,
        weaponName4: String,
        weaponDmg4: String,
        weaponAmmo4: String,

        armorHeadDef: String,
        armorHeadPenalty: String,
        armorBodyDef: String,
        armorBodyPenalty: String,
        armorShieldDef: String,
        armorShieldPenalty: String,

        EqEquipment1: String,
        EqComment1:String,
        EqEquipment2: String,
        EqComment2:String,
        EqEquipment3: String,
        EqComment3:String,
        EqEquipment4: String,
        EqComment4:String,
        EqEquipment5: String,
        EqComment5:String,
        EqEquipment6: String,
        EqComment6:String,
        EqEquipment7: String,
        EqComment7:String,
        EqEquipment8: String,
        EqComment8:String,
        EqEquipment9: String,
        EqComment9:String,
        EqEquipment10: String,
        EqComment10:String,

        cyborgizacja1: String,
        dane1: String,
        cyborgizacja2: String,
        dane2: String,
        cyborgizacja3: String,
        dane3: String,
        cyborgizacja4: String,
        dane4: String,
        cyborgizacja5: String,
        dane5: String,
        cyborgizacja6: String,
        dane6: String,
        cyborgizacja7: String,
        dane7: String,
        cyborgizacja8: String,
        dane8: String,
        cyborgizacja9: String,
        dane9: String,
        cyborgizacja10: String,
        dane10: String,
    ){
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(COLUMN_NICKNAME, nickname)
        contentValues.put(COLUMN_ROLE, role)

        contentValues.put(COLUMN_INT, int)
        contentValues.put(COLUMN_REF, ref)
        contentValues.put(COLUMN_ZW, zw)
        contentValues.put(COLUMN_TECH,tech)
        contentValues.put(COLUMN_CHA, cha)
        contentValues.put(COLUMN_SW, sw)
        contentValues.put(COLUMN_SZ, sz)
        contentValues.put(COLUMN_RUCH, ruch)
        contentValues.put(COLUMN_BC, bc)
        contentValues.put(COLUMN_EMP, emp)

        contentValues.put(COLUMN_WEAPON_NAME_1, weaponName1)
        contentValues.put(COLUMN_WEAPON_DMG_1, weaponDmg1)
        contentValues.put(COLUMN_WEAPON_AMMO_1, weaponAmmo1)
        contentValues.put(COLUMN_WEAPON_NAME_2, weaponName2)
        contentValues.put(COLUMN_WEAPON_DMG_2, weaponDmg2)
        contentValues.put(COLUMN_WEAPON_AMMO_2, weaponAmmo2)
        contentValues.put(COLUMN_WEAPON_NAME_3, weaponName3)
        contentValues.put(COLUMN_WEAPON_DMG_3, weaponDmg3)
        contentValues.put(COLUMN_WEAPON_AMMO_3, weaponAmmo3)
        contentValues.put(COLUMN_WEAPON_NAME_4, weaponName4)
        contentValues.put(COLUMN_WEAPON_DMG_4, weaponDmg4)
        contentValues.put(COLUMN_WEAPON_AMMO_4, weaponAmmo4)

        contentValues.put(COLUMN_ARMOR_HEAD_DEF, armorHeadDef)
        contentValues.put(COLUMN_ARMOR_HEAD_PENALTY, armorHeadPenalty)
        contentValues.put(COLUMN_ARMOR_BODY_DEF, armorBodyDef)
        contentValues.put(COLUMN_ARMOR_BODY_PENALTY, armorBodyPenalty)
        contentValues.put(COLUMN_ARMOR_SHIELD_DEF, armorShieldDef)
        contentValues.put(COLUMN_ARMOR_SHIELD_PENALTY, armorShieldPenalty)

        contentValues.put(COLUMN_EQ_EQUIPMENT_1, EqEquipment1)
        contentValues.put(COLUMN_EQ_COMMENT_1, EqComment1)
        contentValues.put(COLUMN_EQ_EQUIPMENT_2, EqEquipment2)
        contentValues.put(COLUMN_EQ_COMMENT_2, EqComment2)
        contentValues.put(COLUMN_EQ_EQUIPMENT_3, EqEquipment3)
        contentValues.put(COLUMN_EQ_COMMENT_3, EqComment3)
        contentValues.put(COLUMN_EQ_EQUIPMENT_4, EqEquipment4)
        contentValues.put(COLUMN_EQ_COMMENT_4, EqComment4)
        contentValues.put(COLUMN_EQ_EQUIPMENT_5, EqEquipment5)
        contentValues.put(COLUMN_EQ_COMMENT_5, EqComment5)
        contentValues.put(COLUMN_EQ_EQUIPMENT_6, EqEquipment6)
        contentValues.put(COLUMN_EQ_COMMENT_6, EqComment6)
        contentValues.put(COLUMN_EQ_EQUIPMENT_7, EqEquipment7)
        contentValues.put(COLUMN_EQ_COMMENT_7, EqComment7)
        contentValues.put(COLUMN_EQ_EQUIPMENT_8, EqEquipment8)
        contentValues.put(COLUMN_EQ_COMMENT_8, EqComment8)
        contentValues.put(COLUMN_EQ_EQUIPMENT_9, EqEquipment9)
        contentValues.put(COLUMN_EQ_COMMENT_9, EqComment9)
        contentValues.put(COLUMN_EQ_EQUIPMENT_10, EqEquipment10)
        contentValues.put(COLUMN_EQ_COMMENT_10, EqComment10)

        contentValues.put(COLUMN_CYB_1, cyborgizacja1)
        contentValues.put(COLUMN_DANE_1, dane1)
        contentValues.put(COLUMN_CYB_2, cyborgizacja2)
        contentValues.put(COLUMN_DANE_2, dane2)
        contentValues.put(COLUMN_CYB_3, cyborgizacja3)
        contentValues.put(COLUMN_DANE_3, dane3)
        contentValues.put(COLUMN_CYB_4, cyborgizacja4)
        contentValues.put(COLUMN_DANE_4, dane4)
        contentValues.put(COLUMN_CYB_5, cyborgizacja5)
        contentValues.put(COLUMN_DANE_5, dane5)
        contentValues.put(COLUMN_CYB_6, cyborgizacja6)
        contentValues.put(COLUMN_DANE_6, dane6)
        contentValues.put(COLUMN_CYB_7, cyborgizacja7)
        contentValues.put(COLUMN_DANE_7, dane7)
        contentValues.put(COLUMN_CYB_8, cyborgizacja8)
        contentValues.put(COLUMN_DANE_8, dane8)
        contentValues.put(COLUMN_CYB_9, cyborgizacja9)
        contentValues.put(COLUMN_DANE_9, dane9)
        contentValues.put(COLUMN_CYB_10, cyborgizacja10)
        contentValues.put(COLUMN_DANE_10, dane10)

        db.update(TABLE_CHARACTERS, contentValues, "$COLUMN_ID=$id", null)
        db.close()
    }

    fun getCharacter() : MutableList<Character> {
        val characters: MutableList<Character> = ArrayList()
        val db = this.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM $TABLE_CHARACTERS", null)

        if (cursor.moveToFirst()) {
            var cursorIndex = 0
            do {
                cursorIndex++
                val player = Character(
                    cursor.getInt(0),
                    cursor.getString(1) ?: "",
                    cursor.getString(2) ?: "",
                    cursor.getString(3) ?: "",
                    cursor.getString(4) ?: "",
                    cursor.getString(5) ?: "",
                    cursor.getString(6) ?: "",
                    cursor.getString(7) ?: "",
                    cursor.getString(8) ?: "",
                    cursor.getString(9) ?: "",
                    cursor.getString(10) ?: "",
                    cursor.getString(11) ?: "",
                    cursor.getString(12) ?: "",
                    cursor.getString(13) ?: "",
                    cursor.getString(14) ?: "",
                    cursor.getString(15) ?: "",
                    cursor.getString(16) ?: "",
                    cursor.getString(17) ?: "",
                    cursor.getString(18) ?: "",
                    cursor.getString(19) ?: "",
                    cursor.getString(20) ?: "",
                    cursor.getString(21) ?: "",
                    cursor.getString(22) ?: "",
                    cursor.getString(23) ?: "",
                    cursor.getString(24) ?: "",
                    cursor.getString(25) ?: "",
                    cursor.getString(26) ?: "",
                    cursor.getString(27) ?: "",
                    cursor.getString(28) ?: "",
                    cursor.getString(29) ?: "",
                    cursor.getString(30) ?: "",
                    cursor.getString(31) ?: "",
                    cursor.getString(32) ?: "",
                    cursor.getString(33) ?: "",
                    cursor.getString(34) ?: "",
                    cursor.getString(35) ?: "",
                    cursor.getString(36) ?: "",
                    cursor.getString(37) ?: "",
                    cursor.getString(38) ?: "",
                    cursor.getString(39) ?: "",
                    cursor.getString(40) ?: "",
                    cursor.getString(41) ?: "",
                    cursor.getString(42) ?: "",
                    cursor.getString(43) ?: "",
                    cursor.getString(44) ?: "",
                    cursor.getString(45) ?: "",
                    cursor.getString(46) ?: "",
                    cursor.getString(47) ?: "",
                    cursor.getString(48) ?: "",
                    cursor.getString(49) ?: "",
                    cursor.getString(50) ?: "",
                    cursor.getString(51) ?: "",
                    cursor.getString(52) ?: "",
                    cursor.getString(53) ?: "",
                    cursor.getString(54) ?: "",
                    cursor.getString(55) ?: "",
                    cursor.getString(56) ?: "",
                    cursor.getString(57) ?: "",
                    cursor.getString(58) ?: "",
                    cursor.getString(59) ?: "",
                    cursor.getString(60) ?: "",
                    cursor.getString(61) ?: "",
                    cursor.getString(62) ?: "",
                    cursor.getString(63) ?: "",
                    cursor.getString(64) ?: "",
                    cursor.getString(65) ?: "",
                    cursor.getString(66) ?: "",
                    cursor.getString(67) ?: "",
                    cursor.getString(68) ?: "",
                    cursor.getString(69) ?: "",
                    cursor.getString(70) ?: "")

                characters.add(player)
            } while (cursor.moveToNext())
        }


        db.close()
        cursor.close()
        return characters
    }
}