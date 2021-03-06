package entities;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private String name;
    private List<Project> projects;

    public Group(String name) {
        this.name = name;
        this.projects = new ArrayList<>();
    }

    public void addProject(Project plan) {
        this.projects.add(plan);
    }

    public int countActiveProjects() {
        int result = 0;
        for(Project p : projects) {
            if (p.isActive()){
                result++;
            }
        }
        return result;
    }
}
