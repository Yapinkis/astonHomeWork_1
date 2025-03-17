package Service;

import Model.Task;

import java.util.InputMismatchException;
import java.util.Scanner;

import static App.App.tasks;

public class CompleteTask {
    public static void completeTask() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите номер соответствующей команды: " +
                    "\n 1 - Завершить один таск." +
                    "\n 2 - Завершить все таски.");
            int number = scanner.nextInt();
            scanner.nextLine();
            if (number == 1) {
                System.out.println("Введите наименование таска:");
                String task = scanner.nextLine();
                tasks.stream()
                        .filter(lTask -> lTask.getDescription().equals(task))
                        .forEach(Task::makeCompleted);
                System.out.println("Таск " + task + " завершён.");
            } else if (number == 2) {
                tasks.forEach(Task::makeCompleted);
                System.out.println("Завершённое количество тасков: " + tasks.size());
            } else {
                throw new InputMismatchException("Ошибка ввода: введите 1 или 2.");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
