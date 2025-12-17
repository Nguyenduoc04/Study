package lession6;

public class Main {
    public static void main(String[] args) {
//        Teacher t1 = new Teacher();
//        t1.setName("Wanbi");
//        t1.setPhone("0349876595");
//        t1.setSubject("Java Programming");
//        System.out.println("Name: " + t1.getName());
//        System.out.println("Phone: " + t1.getPhone());
//        System.out.println("Subject: " + t1.getSubject());
//
//        System.out.println(t1);
//        Person p1 = new Person();
//        p1.setName("Minh Tuan");
//        p1.setPhone("0939308885");
//        System.out.println(p1);

//        Person obj = new Teacher();
//        System.out.println(obj);
//        Teacher teacherObhj = (Teacher) obj;
//        teacherObhj.setSubject("Math");
//        System.out.println(teacherObhj);
//

        Teacher t = new Teacher();
        t.setName("Wanbi");
        t.setSubject("Java Programming");
        displayInfo(t);
        t.sayHello();
    }
    public static void displayInfo(Person p){
        if(p instanceof Teacher){
            System.out.println(p.getName() + " is a teacher of " + ((Teacher) p).getSubject());
        } else if (p instanceof Student) {
            System.out.println(p);
        }
    }
}
