class Student {
    int id = 101;
    String name = "Kezia";

    public String toString() {
        return id + " " + name;
    }
}

class MethodOverriding {
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println(s);
    }
}
