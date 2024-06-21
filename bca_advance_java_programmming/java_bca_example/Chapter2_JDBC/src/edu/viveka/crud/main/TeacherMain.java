package edu.viveka.crud.main;

import edu.viveka.crud.controller.TeacherController;
import edu.viveka.crud.service.TeacherService;
import edu.viveka.crud.view.TeacherView;

public class TeacherMain {

    public static void main(String[] args) {
        TeacherView view = new TeacherView();
        TeacherService service = new TeacherService();
        TeacherController controller = new TeacherController(view, service);
        view.setVisible(true);
    }
}
