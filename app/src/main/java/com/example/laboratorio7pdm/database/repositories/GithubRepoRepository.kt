package com.example.laboratorio7pdm.database.repositories

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.laboratorio7pdm.database.daos.GithubRepoDAO
import com.example.laboratorio7pdm.database.entities.GithubRepo

class GithubRepoRepository(private  val repoDAO: GithubRepoDAO){

    fun getAll():LiveData<List<GithubRepo>> = repoDAO.getAll()

    fun nuke()=repoDAO.nukeTable()

    @WorkerThread
    suspend fun insert(repo:GithubRepo) = repoDAO.insert(repo)

}