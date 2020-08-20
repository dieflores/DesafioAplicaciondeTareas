package cl.desafiolatam.desafiodos.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Task_Table")
data class TheTask(@PrimaryKey(autoGenerate = true)@NonNull val idTask: Int,

                   val task: String,
                   val creationDate: String,
                   val finishDate: String )
