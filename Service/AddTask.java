package Service;

import Model.Task;

import static App.App.tasks;

public class AddTask {
    public static void addTask(String task) {
        tasks.add(new Task(task));
        System.out.println("Задача " + task + " добавлена в список");
    }
}
