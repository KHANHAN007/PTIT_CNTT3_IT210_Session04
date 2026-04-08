package demo.hello.demo.model;

import java.util.Date;

public class Project {
    private String id, name, description, manager;
    private Date startDate, endDate;
    private int totalMembers;

    public Project(String id, String name, String description, String manager, Date startDate, Date endDate, int totalMembers) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.manager = manager;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalMembers = totalMembers;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getManager() { return manager; }
    public Date getStartDate() { return startDate; }
    public Date getEndDate() { return endDate; }
    public int getTotalMembers() { return totalMembers; }
}
