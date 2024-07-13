package com.example.notesapp.Database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.notesapp.Dao.NotesDao

abstract class NotesDatabse: RoomDatabase() {
    abstract fun myNotesDao():NotesDao

    companion object{
        var INSTANCE:NotesDatabse?=null

        fun getDatabaseInstance(context:Context): NotesDatabse{
            var tempInstance= INSTANCE
            if (tempInstance!=null){
                return tempInstance
            }
            synchronized(this){
                var roomDatabaseInstance= Room.databaseBuilder(context,NotesDatabse::class.java,"Notes").build()
                INSTANCE=roomDatabaseInstance
                return roomDatabaseInstance
            }
        }



    }


}