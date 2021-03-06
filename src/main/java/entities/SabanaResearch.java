package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SabanaResearch {

    private List<Group> groups;
    private List<Summary> summaries;
    public static final  LocalDate today = LocalDate.now();

    public SabanaResearch(List<Group> groups) {
        this.groups = groups;
        this.summaries = new ArrayList<>();
    }

    public int countOfGroups() {
        return this.groups.size();
    }

    public int countOfSummaries() {
        return this.summaries.size();
    }

    /**
     * Create a summary entry in the current date.
     * - Calculate the count of active projects.
     *
     *
     * @return The new Summary entry.
     */
    public Summary createSummaryEntry() {
        int ap = 0;
        for(Group g : groups) {
            ap += g.countActiveProjects();
        }
        Summary newSummary = new Summary(today, ap);
        addSummary(newSummary);
        return newSummary;
    }

    public void addSummary(Summary s) {
        this.summaries.add(s);
    }
}
