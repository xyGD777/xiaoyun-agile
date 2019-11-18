package studentinfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

class CourseSession {
    private String department;
    private String number;
//    private int numberOfStudents = 0;//成员变量在构造函数执行之前被初始化
    private ArrayList<Student> students = new ArrayList<Student>();
    private Date startDate;

    CourseSession(String department, String number){
        this.department = department;
        this.number = number;
    }

    CourseSession(String department, String number, Date startDate){
        this.department = department;
        this.number = number;
        this.startDate = startDate;
    }

    String getDepartment(){
        return department;
    }
    String getNumber(){
        return number;
    }

    int getNumberOfStudents(){//学生数s
//        return numberOfStudents;
        return students.size();//获得arraylist对象中的学生人数
    }

    void enroll(Student student){
//        numberOfStudents = numberOfStudents + 1;
        students.add(student); //把student添加到这个列表
//        System.out.println(numberOfStudents);
    }

//    ArrayList<Student> getAllStudents(){
//        return students;//返回这个列表
//    }

    //让coursesesssion以指定索引的方式来返回student对象
    Student get(int index){
        return students.get(index);
    }

    Date getEndDate(){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);//存储开始日期的对象
        int numberOfDays = 16 * 7 - 3;// weeks*days per week -3 days
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);//把计算出来的数字加到“一年中的第几天”
        Date endDate = calendar.getTime();
        return endDate;
    }

    Date getStartDate(){
        return startDate;
    }
}
