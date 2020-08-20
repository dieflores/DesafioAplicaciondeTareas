package cl.desafiolatam.desafiodos.model

import androidx.lifecycle.LiveData
import cl.desafiolatam.desafiodos.dataRoom.DaoTaskData


class RepositoryTheTask(private val mDaoTaskData: DaoTaskData ) {  // clase y constructor

      val mAllTasks :LiveData<List<TheTask>> = mDaoTaskData.getAllTask() // value para contener desde base de datos


    suspend fun inserTask(task: TheTask) {

        mDaoTaskData.insertTask(task)
        mDaoTaskData.insertTask(task)
    }
}