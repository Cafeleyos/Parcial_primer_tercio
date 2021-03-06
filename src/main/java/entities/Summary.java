package entities;


import java.time.LocalDate;

public class Summary {

    private int activeProjects;
    private LocalDate date;

    public Summary(LocalDate currentDate, int proyects) {
        this.date = currentDate;
        this.activeProjects = proyects;
    }

    public int getActiveProjects() {
        return activeProjects;
    }

    public LocalDate getDate() {
        return date;
    }
}
