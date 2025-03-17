package Service;

import Model.Task;

import static App.App.tasks;

public class DeleteTask {
    public static void deleteTask(String task) {
        if (tasks.stream().noneMatch(lTask -> lTask.getDescription().equals(task))) {
            System.out.println("Задача не обнаружена в списке");
        } else {
            tasks.removeIf(lTask -> lTask.getDescription().equals(task));
            System.out.println("Задача " + task + " удалена.");
            System.out.println("Список оставшихся задач: " + tasks.size());
        }
    }
}
