import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Admin a1 = new Admin();
        a1.setName("Tony");
        a1.role = "Project Manager";

        System.out.println("Admin Name : " + a1.getName());
        System.out.println("Role : " + a1.role);
        /*-----------------------Project side---------------------- */
        Project p1 = new Project();
        System.out.print("Enter Project Name : ");
        String projectName = sc.nextLine();
        System.out.print("Enter Required Skill : ");
        String requiredSkill = sc.nextLine();

        p1.setProjectName(projectName);
        p1.setRequiredSkill(requiredSkill);

        System.out.println("Successfully Created Project");
        System.out.println("ProjectName : " + p1.getProjectName());
        System.out.println("RequiredSkill : " + p1.getRequiredSkill());
        /*------------------------------------------------------------ */
        /*-------------------Student side------------------------ */

        Student s1 = new Student();

        System.out.print("Enter Student Name : ");
        String studentName = sc.nextLine();
        System.out.print("Enter Student Skill : ");
        String studentSkill = sc.nextLine();

        s1.setName(studentName);
        s1.setSkill(studentSkill);

        System.out.println("Student Detail");
        System.out.println("Student Name : " + s1.getName());
        System.out.println("Student Skill : " + s1.getSkill());
        /*------------------------------------------------------------ */
        /*------------------- Skills Matching------------------------ */

        if (s1.getSkill().equalsIgnoreCase(p1.getRequiredSkill())) {
            System.out.println("Student is Eligible for the project");
        } else {
            System.out.println("Skill doesn't match");
        }
        /*------------------------------------------------------------ */
        /*------------------- Application ------------------------ */
        Application app1 = new Application();

        app1.setStudent(s1);
        app1.setProject(p1);

        System.out.println("\nApplication Submitted");
        System.out.println(app1.getStudent().getName() + " is applied for " + app1.getProject().getProjectName());
        /*------------------------------------------------------------ */
        /*---------------------Team side------------------------ */
        Team team1 = new Team();
        team1.setTeamName("LowCortisol");
        team1.setMember(s1);

        System.out.println("Team Forced Successfully ");
        System.out.println("Team Name : " + team1.getTeamName());
        System.out.println("Member : " + team1.getMember().getName());
        sc.close();
    }
}