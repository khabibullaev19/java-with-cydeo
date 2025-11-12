package package15classAndObjectsPart2;

public class ConstructorsDemo {

    public static void main(String[] args) {

        Student student = new Student("Ali", 23, "Bachelors");
        System.out.println(student);

    }

    public static class Student{
        public String name;
        public int age;
        public String gradeLevel;

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gradeLevel='" + gradeLevel + '\'' +
                    '}';
        }

        public Student(String name, int age, String gradeLevel) {
            this.name = name;
            this.age = age;
            this.gradeLevel = gradeLevel;
        }

    }

}
