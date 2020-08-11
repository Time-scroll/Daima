package day.thirteen;

public class Employee {
        public static void main(String[] args) {
            Student s1=new Student("闪电侠","美国");
            Student s2=new Student("绿箭侠","美国");
            System.out.println(s1.equals(s2));
            System.out.println(s1);
            System.out.println(s1.toString());
        }
    }
    class Student{
        private String name;
        private String address;
        public Student(String name, String address) {
            super();
            this.name = name;
            this.address = address;
        }
        @Override
        public boolean equals(Object obj) {
            if(this == obj) {
                return true;
            }
            if (!(obj instanceof Student)) {
                return false;
            }
            Student s=(Student)obj;
            return  this.name.equals(s.name)&&this.address.equals(s.address);
        }
        @Override
        public String toString() {

            return "name:"+name;
        }
    }
