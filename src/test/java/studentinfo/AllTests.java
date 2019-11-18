package studentinfo;
import junit.framework.TestSuite;

//测试套件
/**
 * 执行这个测试类的部分方法
 *
 * 方法头必须是这样的 public static junit.framework.Test suite()  ???
 * 即，静态（static） 的
 *
 * @return
 */
public class AllTests {
    public static TestSuite suite(){//为了让junit能够识别，必须把suite方法定义为static类型？？？
        TestSuite suite = new TestSuite();
        suite.addTestSuite(StudentTest.class); //参数是一个类字面常量
        suite.addTestSuite(CourseSessionTest.class);//由类名加上.class组成
        return suite;
    }
}
