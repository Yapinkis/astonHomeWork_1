package Model;

import java.time.LocalDateTime;

public class Task {
    private String description;
    private boolean completed;
    private LocalDateTime addTime;

    public Task(String description) {
        this.description = description;
        this.completed = false;
        this.addTime = LocalDateTime.now();
    }

    public void makeCompleted() {
        this.completed = true;
    }

    public String getDescription() {
        return description;
    }

    public boolean getCompleted() {
        return completed;
    }

    public LocalDateTime getAddTime() {
        return addTime;
    }

    @Override
    public String toString() {
        return ("Наименование задачи: " + description + "\n" +
                "Дата создания: " + addTime +
                "\nЗадача завершена: " + completed + "\n");
    }
}
