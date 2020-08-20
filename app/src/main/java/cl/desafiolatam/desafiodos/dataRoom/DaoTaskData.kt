package cl.desafiolatam.desafiodos.dataRoom

import androidx.lifecycle.LiveData
import androidx.room.*
import cl.desafiolatam.desafiodos.model.TheTask


@Dao
interface DaoTaskData {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(theTask: TheTask)  // suspend para co rutinas //

    @Insert
    fun insertMultipleTask(list: List<TheTask>)

    @Update
    fun upDateTask(theTask: TheTask)

    @Delete
    fun deleteOneTask(theTask: TheTask)

    @Query("SELECT * FROM task_table")
    fun  getAllTask():LiveData<List<TheTask>>


}