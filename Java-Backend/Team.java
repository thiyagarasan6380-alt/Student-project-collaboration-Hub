public class Team {
    private String teamName;
    private Student member;

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setMember(Student member) {
        this.member = member;
    }

    public Student getMember() {
        return member;
    }
}