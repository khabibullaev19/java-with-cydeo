package package20enumsgenericsfunctionalinterfaceslambdaexpressions;

public class Course {

    private String season;
    private String courName;
    private int averageScore;
    private int numberOfStudents;

    public Course(String season, String courName, int averageScore, int numberOfStudents) {
        this.season = season;
        this.courName = courName;
        this.averageScore = averageScore;
        this.numberOfStudents = numberOfStudents;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getCourName() {
        return courName;
    }

    public void setCourName(String courName) {
        this.courName = courName;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public String toString(){
        return  season +  " | " + courName + " | " + averageScore + " | " +numberOfStudents;
    }

}
