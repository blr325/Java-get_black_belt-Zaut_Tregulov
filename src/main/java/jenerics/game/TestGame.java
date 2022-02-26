package jenerics.game;

public class TestGame {
    public static void main(String[] args) {
        Team <Employee> teamEmployee1 = new Team<>("Работники завода");
        teamEmployee1.addNewMember(new Employee("Андрей", 34));
        teamEmployee1.addNewMember(new Employee("Максим", 44));
        teamEmployee1.addNewMember(new Employee("Дмитрий", 37));

        Team <Employee> teamEmployee2 = new Team<>("Работники автобусного парка");
        teamEmployee2.addNewMember(new Employee("Алексей", 42));
        teamEmployee2.addNewMember(new Employee("Михаил", 41));
        teamEmployee2.addNewMember(new Employee("Дмитрий", 27));

        Team <Schoolboy>teamSchoolboys1 = new Team<>("Школа №11");
        teamSchoolboys1.addNewMember(new Schoolboy("Саша",14));
        teamSchoolboys1.addNewMember(new Schoolboy("Дима",16));
        teamSchoolboys1.addNewMember(new Schoolboy("Кипилл",15));

        Team<Schoolboy> teamSchoolboys2 = new Team<>("Школа №4");
        teamSchoolboys2.addNewMember(new Schoolboy("Максим",15));
        teamSchoolboys2.addNewMember(new Schoolboy("Андрей",15));
        teamSchoolboys2.addNewMember(new Schoolboy("Женя",16));

        Team <Student>teamStudents1 = new Team<>("БГУ");
        teamStudents1.addNewMember(new Student("Кирилл",21));
        teamStudents1.addNewMember(new Student("Артем",23));
        teamStudents1.addNewMember(new Student("Юрий",22));


        Team <Student>teamStudents2 = new Team<Student>("ГрГу");
        teamStudents2.addNewMember(new Student("Алексей",24));
        teamStudents2.addNewMember(new Student("Иван",23));
        teamStudents2.addNewMember(new Student("Максим",22));

        teamStudents1.playWithTeam(teamStudents2);
        teamEmployee1.playWithTeam(teamEmployee2);
        teamSchoolboys1.playWithTeam(teamSchoolboys2);

    }
}
