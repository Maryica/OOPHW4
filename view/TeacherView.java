package view;

import java.util.List;

import data.Teacher;

public class TeacherView implements UserView<Teacher> {

    public void teacherViewAll(List<Teacher> teacherList) {
        System.out.println(teacherList);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void sendOnconsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher.getFirstName() + " " + teacher.getSecondName() + " " + teacher.getLastName());
        }
    }
}
