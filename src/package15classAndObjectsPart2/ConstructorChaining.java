package package15classAndObjectsPart2;

public class ConstructorChaining {

    public static void main(String[] args) {

        Student student1 = new Student("Ali");
        System.out.println(student1);

        Student student2 = new Student("Daniel", 23);
        System.out.println(student2);

        Student student3 = new Student("Daniel", 23);
        System.out.println(student3);

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

        public Student(String name) {
            this.name = name;
        }

        public Student(String name, int age) {
            this(name);
            this.age = age;
        }

    }

}
