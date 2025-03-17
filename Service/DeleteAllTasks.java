package Service;

import Model.Task;

import java.util.ArrayList;

import static App.App.tasks;

public class DeleteAllTasks {
    public static void deleteAllTasks() {
        tasks.clear();
        ((ArrayList<Task>) tasks).trimToSize();
        System.out.println("Список задач равен:" + tasks.size());
    }
}
