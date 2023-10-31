
import controler.TeacherControler;
import data.Teacher;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherControler teacherControler = new TeacherControler();

        Teacher teacher1 = teacherControler.create("Владимир", "Владимирович", "Власов");
        Teacher teacher2 = teacherControler.create("Майя", "Викторовна", "Одинцова");
        Teacher teacher3 = teacherControler.create("Алексей", "Юрьевич", "Андреев");

        teacherControler.changeTeacher(0, "Николай", "Федорович", "Зубко");

        List<Teacher> teacherList = teacherControler.getListTeachers();
        teacherControler.displayTeachers(teacherList);

    }
}