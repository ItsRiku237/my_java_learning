class Student {
    String Name;
    static String School;// It is same for all object.

    public static void changeSchool() {
        School = "JNV Sonepur";
    }
}

public class J_07_Static_Keyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Name = "RIku";
        s1.School = "JNV";
        System.out.println(s1.School);
    }

}
