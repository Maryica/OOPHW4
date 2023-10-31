package controler;

import java.util.List;

import data.Teacher;
import service.TeacherService;
import view.TeacherView;

public class TeacherControler implements UserControler<Teacher> {

    public TeacherService teacherService = new TeacherService();
    TeacherView teacherView = new TeacherView();

    @Override
    public Teacher create(String firstName, String secondName, String lastName) {
        Teacher newTeacher = new Teacher(firstName, secondName, lastName);
        teacherService.createTeacher(firstName, secondName, lastName);
        return newTeacher;
    }

    public void changeTeacher(int teacherIndex, String newFirstName, String newSecondName, String newLastName) {
        teacherService.changeTeacher(teacherIndex, newFirstName, newSecondName, newLastName);
    }

    public List<Teacher> getListTeachers() {
        return teacherService.getListTeachers();
    }

    public void print() {
    }

    public void displayTeachers(List<Teacher> teacherList) {
        teacherView.sendOnconsole(teacherList);
    }

}