class Student{
    String name;
    int rollno;
    int marks;
}
public class ArrayofObjects {
    public static void main(String a[]){
        Student s1 = new Student();
        s1.name = "Akendra";
        s1.rollno = 04;
        s1.marks = 100;

        Student s2 = new Student();
        s2.name = "Pavan";
        s2.rollno = 02;
        s2.marks = 99;

        Student s3 = new Student();
        s3.name = "Pradeep";
        s3.rollno = 31;
        s3.marks = 98;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        System.out.println(s1.rollno + "Rollno " + ":" + s1.name + ":" + s1.marks);
        System.out.println(s2.rollno + "Rollno " + ":" + s2.name + ":" + s2.marks);
        System.out.println(s3.rollno + "Rollno " + ":" + s3.name + ":" + s3.marks);

        for (int i = 0; i<students.length;i++){
            System.out.println(students[i]);  // It prints the address.
        }

        System.out.println(s1); // It prints the address.
        System.out.println(s2); // It prints the address.
        System.out.println(s3); // It prints the address.

        //code for not printing address is :

        for (int i = 0 ;i<students.length;i++){
            System.out.println("Rollno:" + students[i].rollno + " ;" + " Name:" + students[i].name + " ;" +  " Marks:" + students[i].marks);
        }
    }
}
