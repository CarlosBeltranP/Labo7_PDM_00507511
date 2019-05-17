package com.example.laboratorio7pdm.database.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.laboratorio7pdm.database.RoomDB
import com.example.laboratorio7pdm.database.entities.GithubRepo
import com.example.laboratorio7pdm.database.repositories.GithubRepoRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class GithubRepoViewModel(app:Application):AndroidViewModel(app){

    private val repository:GithubRepoRepository

    init{
        val repoDao=RoomDB.getInstance(app).repoDAO()
        repository= GithubRepoRepository(repoDao)
    }

    fun getAll():LiveData<List<GithubRepo>> = repository.getAll()

    fun insert(repo:GithubRepo)=viewModelScope.launch(Dispatchers.IO){
        repository.insert(repo) //corrutina
    }
}