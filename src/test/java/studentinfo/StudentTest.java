package studentinfo;

/**
* StudentTest Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮһ�� 15, 2019</pre> 
* @version 1.0 
*/


public class StudentTest extends junit.framework.TestCase {
    public void testCreate(){//测试方法
        final String studentName = "xy";
        Student student = new Student(studentName);//创建Student类的对象 实例化对象
     //   String studentName = student.getName();
        assertEquals(studentName, student.getName());

        final String studentName2 = "gd";
        Student student2 = new Student(studentName2);
     //   String studentName2 = student2.getName();
        assertEquals(studentName2,student2.getName());


        assertEquals(studentName,student.getName());

    }

}

