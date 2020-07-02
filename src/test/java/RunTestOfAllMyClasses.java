
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages(value = {"Tests"})
@IncludeTags(value = "Divide & Exception")
//@SelectClasses(value = {Homework20DivideClassTest.class,
//        Homework20MultiplyClassTest.class,
//        Homework20SubtractClassTest.class,
//        DemoTest.class})
public class RunTestOfAllMyClasses {

}
