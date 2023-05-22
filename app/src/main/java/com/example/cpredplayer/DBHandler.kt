package com.example.cpredplayer

import android.content.Context
import android.content.ContentValues
import android.database.sqlite.SQLiteOpenHelper
import android.database.sqlite.SQLiteDatabase



class DBHandler(context: Context) : SQLiteOpenHelper(
    context, DATABASE_NAME, null, DATABASE_VERSION
) {
    private companion object{
        private const val DATABASE_NAME = "cpredplayer.db"
        private const val DATABASE_VERSION = 1
        private const val TABLE_PLAYER = "PlayersTable"
        //private const val TABLE_WEAPON = "WeaponsTable"
        //private const val TABLE_ARMOR = "ArmorsTable"
        //private const val TABLE_EQ = "EqTable"

        //TABLE_CHARACTERS
        private const val COLUMN_ID = "id"
        private const val COLUMN_NICKNAME = "nickname"
        private const val COLUMN_ROLE = "role"

        //TABLE_WEAPON
//        private const val COLUMN_ID_W = "id_w"
//        private const val COLUMN_WEAPON = "weapon"
//        private const val COLUMN_DMG = "dmg"
//        private const val COLUMN_AMMO = "ammo"

        //TABLE_ARMOR
//        private const val COLUMN_ID_A = "id_a"
//        private const val COLUMN_ARMOR = "armor"
//        private const val COLUMN_DEF = "def"
//        private const val COLUMN_PENALTY = "penalty"

        //TABLE_EQ
//        private const val COLUMN_ID_E = "id_e"
//        private const val COLUMN_EQ = "equipment"
//        private const val COLUMN_COMMENT = "comment"

    }

    override fun onCreate(db: SQLiteDatabase) {
        val CREATE_PLAYER_TABLE =
            "CREATE TABLE $TABLE_PLAYER(" +
                    "$COLUMN_ID INTEGER PRIMARY KEY," +
                    "$COLUMN_NICKNAME TEXT," +
                    "$COLUMN_ROLE TEXT)"
        db?.execSQL(CREATE_PLAYER_TABLE)

//        val CREATE_WEAPON_TABLE =
//            "CREATE TABLE $TABLE_WEAPON(" +
//                    "$COLUMN_ID_W INTEGER PRIMARY KEY," +
//                    "$COLUMN_WEAPON TEXT," +
//                    "$COLUMN_DMG TEXT," +
//                    "$COLUMN_AMMO TEXT)"
//        db?.execSQL(CREATE_WEAPON_TABLE)
//
//        val CREATE_ARMOR_TABLE =
//            "CREATE TABLE $TABLE_ARMOR(" +
//                    "$COLUMN_ID_A INTEGER PRIMARY KEY," +
//                    "$COLUMN_ARMOR TEXT," +
//                    "$COLUMN_DEF TEXT," +
//                    "$COLUMN_PENALTY TEXT)"
//        db?.execSQL(CREATE_ARMOR_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_PLAYER")
        onCreate(db)
    }

    fun addPlayer1()
    {
        //TO DO
    }

    fun addPlayer2(player: Player)
    {
        val db = this.writableDatabase

        val contentValues = ContentValues()
        contentValues.put(COLUMN_NICKNAME, player.nickname)
        contentValues.put(COLUMN_ROLE, player.role)

        db.insert(TABLE_PLAYER, null, contentValues)
        db.close()
    }

    fun deletePlayer(player: Player){
        val db = this.writableDatabase

        db.delete(TABLE_PLAYER, "$COLUMN_ID = ${player.id}", null)
        db.close()
    }

    fun updatePlayer(){

    }

    fun getPlayer(): MutableList<Player> {
        val players: MutableList<Player> = ArrayList()
        val db = this.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM $TABLE_PLAYER", null)

        if (cursor.moveToFirst()){
            do {
                players.add(Player(cursor.getInt(0), cursor.getString(1), cursor.getString(2)))
            } while(cursor.moveToNext())
        }

        db.close()
        cursor.close()
        return players
    }
}