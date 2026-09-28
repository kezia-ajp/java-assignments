class Student
{
    String name;
    int marks;

    public static void main(String args[])
    {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "kezia";
        s1.marks = 85;

        s2.name = "Annie";
        s2.marks = 90;

        System.out.println("Student 1: " + s1.name + " " + s1.marks);
        System.out.println("Student 2: " + s2.name + " " + s2.marks);
    }
}
