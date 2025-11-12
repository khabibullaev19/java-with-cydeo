package package16oop.inheritance;

public class Developer extends Employee{

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    private String programmingLanguage;

    public Developer(String name, int age, String jobTitle, double salary, String programmingLanguage) {
        super(name, age, jobTitle, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+ " " + getName() + " is coding");
    }

}
