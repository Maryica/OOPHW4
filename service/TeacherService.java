package service;

import java.util.ArrayList;
import java.util.List;

import data.Teacher;

public class TeacherService {
    private List<Teacher> teachers = new ArrayList<>();

    public boolean validateDateStr(String stringDate) {
        return stringDate != null && !stringDate.isEmpty();
    }

    public void changeTeacher(int index, String newFirstName, String newSecondName, String newLastName) {
        if (index >= 0 && index < teachers.size()) {
            Teacher teacher = teachers.get(index);
            teacher.setFirstName(newFirstName);
            teacher.setSecondName(newSecondName);
            teacher.setLastName(newLastName);
        }
    }

    public void createTeacher(String firstName, String secondName, String lastName) {
        Teacher newTeacher = new Teacher(firstName, secondName, lastName);
        teachers.add(newTeacher);
    }

    public boolean validateTeacherInGroup(List<Teacher> teacherGroup, String firstName, String secondName,
            String lastName) {
        for (Teacher teacherTemp : teacherGroup) {
            if (teacherTemp.getFirstName().equalsIgnoreCase(firstName)
                    && teacherTemp.getSecondName().equalsIgnoreCase(secondName)
                    && teacherTemp.getLastName().equalsIgnoreCase(lastName)) {
                return true;
            }
        }
        return false;
    }

    public List<Teacher> getListTeachers() {
        return teachers;
    }
}