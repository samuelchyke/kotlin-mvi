package com.example.kotlin_mvi_architecture.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.kotlin_mvi_architecture.ui.main.state.MainStateEvent
import com.example.kotlin_mvi_architecture.ui.main.state.MainViewState
import com.example.kotlin_mvi_architecture.util.AbsentLiveData

class MainViewModel : ViewModel() {

    private val _stateEvent: MutableLiveData<MainStateEvent> = MutableLiveData()
    private val _viewState: MutableLiveData<MainViewState> = MutableLiveData()

    val viewState: LiveData<MainViewState>
        get() = _viewState

    val dataState:LiveData<MainViewState> = Transformations
        .switchMap(_stateEvent){ stateEvent ->

            stateEvent?.let {
                handleStateEvent(it)
            }

        }

    private fun handleStateEvent(stateEvent: MainStateEvent):LiveData<MainViewState>{

        return when (stateEvent){

            is MainStateEvent.GetBlogPostsEvent ->{
                AbsentLiveData.create()

            }
            is MainStateEvent.GetUserEvent ->{
                AbsentLiveData.create()
            }
            is MainStateEvent.None ->{
                AbsentLiveData.create()
            }
            
        }
    }
}