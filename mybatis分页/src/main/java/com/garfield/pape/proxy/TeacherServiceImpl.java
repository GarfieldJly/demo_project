package com.garfield.pape.proxy;

/**
 * @author jingliyuan
 * @date 2020/11/27
 */
public class TeacherServiceImpl implements UserService {
    private UserService userService;

    public TeacherServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String getName() {
        System.out.println("TeacherServiceImpl 方法开始");
        String name = userService.getName();
        System.out.println("name is:" + name);
        System.out.println("TeacherServiceImpl 方法结束");
        return "garfield";
    }

    public static void main(String[] args) {
        UserService userService = new StudentServiceImpl();
        TeacherServiceImpl teacherService = new TeacherServiceImpl(userService);
        teacherService.getName();
    }
}
