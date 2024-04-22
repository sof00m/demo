package gr.accenture.demo;

public class Student {
    private Integer id;
    private String name;
    private String lestName;

    public Student(Integer id, String name, String lestName) {
        this.id = id;
        this.name = name;
        this.lestName = lestName;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLestName() {
        return lestName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLestName(String lestName) {
        this.lestName = lestName;
    }
}