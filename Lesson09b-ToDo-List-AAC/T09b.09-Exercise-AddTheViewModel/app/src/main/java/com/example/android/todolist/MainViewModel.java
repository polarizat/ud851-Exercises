package com.example.android.todolist;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

import java.util.List;

// TODO (1) make this class extend AndroidViewModel and implement its default constructor
public class MainViewModel extends AndroidViewModel {
    // TODO (2) Add a tasks member variable for a list of TaskEntry objects wrapped in a LiveData
    private LiveData<List<TaskEntry>> tasks;


    public MainViewModel(@NonNull Application application) {
        super(application);
        AppDatabase database = AppDatabase.getInstance(this.getApplication());
        tasks = database.taskDao().loadAllTasks();
    }

    // TODO (4) In the constructor use the loadAllTasks of the taskDao to initialize the tasks variable

    // TODO (3) Create a getter for the tasks variable

    public LiveData<List<TaskEntry>> getTasks() {
        return tasks;
    }
}
