package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Project {

    private String name;
    private LocalDate dateInit;
    private LocalDate dateEnd;
    private Group group;
    private List<Iteration> iterations;
    private LocalDate today;
    public Project(String name, LocalDate dateInit, LocalDate dateEnd, Group group) {
        this.name = name;
        this.dateInit = dateInit;
        this.dateEnd = dateEnd;
        this.group = group;
        this.iterations = new ArrayList<>();

        group.addProject(this);
    }

    public void addIteration(Iteration iteration) {
        this.iterations.add(iteration);
    }

    public void setDateInit(LocalDate dateInit) {
        this.dateInit = dateInit;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    /**
     * Evaluate if a project is active.
     *
     * @return false if the project has open activities or the dateEnd is before than the system date.
     */
    public boolean isActive() {
        int counter =0;

       // if (dateEnd.isBefore(true)){

       // }

        for (Iteration i: iterations) {
            counter = +i.countOpenActivities();
            if (counter != 0) {
                return true;
            }
        }
        return false;
    }


}
