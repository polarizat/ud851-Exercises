package com.example.android.todolist;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.android.todolist.database.AppDatabase;

// TODO (1) Make this class extend ViewModel ViewModelProvider.NewInstanceFactory
public class AddTaskViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    // TODO (2) Add two member variables. One for the database and one for the taskId
    private final AppDatabase mDb;
    private final int mTaskId;

    // TODO (3) Initialize the member variables in the constructor with the parameters received

    public AddTaskViewModelFactory(AppDatabase db, int taskId) {
        mDb = db;
        mTaskId = taskId;
    }


    // TODO (4) Uncomment the following method

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new AddTaskViewModel(mDb, mTaskId);
    }

    // Note: This can be reused with minor modifications
    /*@Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        //noinspection unchecked
        return (T) new AddTaskViewModel(mDb, mTaskId);
    }*/
}
