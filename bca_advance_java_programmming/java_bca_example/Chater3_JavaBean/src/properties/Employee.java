package properties;

public class Employee {
    private String name;
    private int age;
    private boolean fullTime;



    private String [] qualification =new String [5]; //SEE, +2, Bachelor, master, PHD

    private double salary;

    public void setSalary(float salary){
        this.salary= salary;
    }

    public Employee() {
    }

    public Employee(String name, int age, boolean fullTime) {
        this.name = name;
        this.age = age;
        this.fullTime = fullTime;
    }

    public String[] getQualification() {
        return qualification;
    }
    public String getQualification(int index){
        return this.qualification[index];
    }
    public void setQualification(String[] qualification) {
        this.qualification = qualification;
    }
    public void SetQualification(int index, String qualification){
        this.qualification[index]=qualification;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }
}
