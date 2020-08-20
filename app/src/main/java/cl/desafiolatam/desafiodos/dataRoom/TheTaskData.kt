package cl.desafiolatam.desafiodos.dataRoom

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import cl.desafiolatam.desafiodos.model.TheTask


@Database(entities = [TheTask::class], version = 1, exportSchema = false)
abstract class TheTaskData : RoomDatabase() {

    abstract fun getDaoTaskData(): DaoTaskData


    companion object {
        @Volatile
        private var INSTANCE: TheTaskData? = null

        fun getDataBase(context: Context): TheTaskData {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    TheTaskData::class.java,
                    "task_dataBase"
                ).build()
                INSTANCE = instance
                return instance

            }
        }
    }
}

