package PartOne;

public class Student {
    private String name;
    private String major;
    private double gpa;

    public Student() {
        this.name = "Mary Ann";
        this.major = "CE";
        this.gpa = 3.3;
    }

    public Student(String name, String major) {
        this.name = name;
        this.major = major;
        this.gpa = 0;
    }

    public Student(String name, String major, double gpa) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public boolean equals(Student student2) {
        boolean status;

        if (name == student2.name && major == student2.major && gpa == student2.gpa)
            status = true;
        else
            status = false;

        return status;
    }
}
