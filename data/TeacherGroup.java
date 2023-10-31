package data;

import java.util.ArrayList;
import java.util.List;

class TeacherGroup {
    private String schoolName;
    private List<Teacher> teachers;

    public TeacherGroup(String groupName, List<Teacher> group) {
        this.schoolName = groupName;
        this.teachers = group;
    }

    public TeacherGroup(String groupName) {
        this.schoolName = groupName;
        this.teachers = new ArrayList<>();
    }

    public String addTeacher(Teacher teacher) {
        teachers.add(teacher);
        return "Учитель " + teacher.getFirstName() + " " + teacher.getLastName() + teacher.getSecondName()
                + " добавлен в группу" + this.schoolName;
    }

    public String removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
        return "Учитель " + teacher.getFirstName() + " " + teacher.getLastName() + teacher.getSecondName()
                + " удален из группы" + this.schoolName;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public Teacher getTeacher(String firstName, String secondName, String lastName) {
        for (Teacher teacherTemp : teachers) {
            if (teacherTemp.getFirstName().equalsIgnoreCase(firstName)
                    && teacherTemp.getLastName().equalsIgnoreCase(secondName)
                    && teacherTemp.getLastName().equalsIgnoreCase(lastName)) {
                return teacherTemp;
            }
        }
        return null;
    }

    public String getSchoolName() {
        return schoolName;
    }
}