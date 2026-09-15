public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Arasan";
        s1.skills = "Java";

        Admin a1 = new Admin();
        a1.name = "Tony";
        a1.role = "Project Manager";

        System.out.println("Student Name : " + s1.name);
        System.out.println("Student Skill : " + s1.skills);

        System.out.println("Admin Name : " + a1.name);
        System.out.println("Role : " + a1.role);

    }
}