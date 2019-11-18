package studentinfo;

import junit.framework.TestCase;
//import java.util.ArrayList;
//import java.util.Date;
import java.util.*;

public class CourseSessionTest extends TestCase {
    private CourseSession session;
    private Date startDate;

    //JUnit将在执行每个测试方法之前先执行setUp方法中的代码
    public void setUp(){
//        int year = 103;
//        int month = 0;
//        int date = 6;
//        startDate = new Date(year, month, date);

        startDate = createDate(2003, 1, 6);
        System.out.println(startDate);

        session = new CourseSession("math", "7", startDate);//不要声明为局部变量！！会导致空指针异常
    }

    public void testCreate(){
//        CourseSession session = new CourseSession("math", "7");
        assertEquals("math", session.getDepartment());
        assertEquals("7", session.getNumber());
        assertEquals(0, session.getNumberOfStudents());

        assertEquals(startDate, session.getStartDate());
        System.out.println(startDate);

    }


    public void testEnrollStudents(){
//        CourseSession session = new CourseSession("math", "7");

        Student student1 = new Student("xy");
        session.enroll(student1);
        assertEquals(1, session.getNumberOfStudents());

        //增加 get方法，删除 getAAllStudents方法
        assertEquals(student1, session.get(0));

        //声明参数化类型的一个好处是：限制java.util.ArrayList只能包含Student对象
        //从未避免不小心把其他类型的对象添加到这个列表
//        ArrayList<Student> allStudents = session.getAllStudents();//<>参数化类型
//        assertEquals(1, allStudents.size());
//        System.out.println("student1-size:"+allStudents.size());
//        assertEquals(student1, allStudents.get(0));
//        System.out.println("student1:"+allStudents.get(0).getName());

        Student student2 = new Student("gd");
        session.enroll(student2);
        assertEquals(2, session.getNumberOfStudents());
        assertEquals(student1, session.get(0));
        assertEquals(student2, session.get(1));

//        assertEquals(2, allStudents.size());
//        System.out.println("student2-size:"+allStudents.size());
//        assertEquals(student1, allStudents.get(0));
//        System.out.println("student1-1:"+allStudents.get(0).getName());
//        assertEquals(student2, allStudents.get(1));
//        System.out.println("student2-2:"+allStudents.get(1).getName());

    }

    public void testCourseDates(){
//        int year = 103;
//        int month = 3;
//        int date = 25;
//        Date sixteenWeeksOut = new Date(year, month, date);

        Date sixteenWeeksOut = createDate(2003, 4, 25);
        assertEquals(sixteenWeeksOut, session.getEndDate());
    }

    Date createDate(int year, int month, int date){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DAY_OF_MONTH, date);
        return calendar.getTime();
//        return new Date(year-1900, month-1, date);
    }
}
