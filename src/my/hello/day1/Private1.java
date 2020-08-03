package my.hello.day1;

public class Private1 {
    static class Student{

        private String name;
        private int age;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Student in = new Student();
        in.setAge(12);
        in.setName("Fate");
        String name = in.getName();
        int age = in.getAge();
        System.out.println(name+age);
    }
}
