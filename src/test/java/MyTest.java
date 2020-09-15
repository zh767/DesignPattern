import com.zh.principle.ocp.Student;
import org.junit.Test;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.*;

/**
 * <p>
 * SpringMVC的adapter 默认 <mvc:annotation-driven /> 会帮我们注入
 * RequestMappingHandlerAdapter 、
 * HttpRequestHandlerAdapter 和
 * SimpleControllerHandlerAdapter 这三个配置器
 * <p>
 * detectAllHandlerAdapter为true表示如果期望检测所有HandlerAdapters 就会使用上面三个适配
 * 还是只期望加载id =“handlerAdapter” bean 这个是我们自己拓展的adapter
 * 如果都么有 就使用默认的SimpleControllerHandlerAdapter
 * 所以适配器模式 如果我们有新的handler 就需要加一个adapter就可以进行拓展
 * 而不用修改原来的spring的代码 没有违背ocp原则
 * </p>
 *
 * @author zh
 * @since 2020/4/28
 */
public class MyTest {
    @Test
    public void testString() {
        String s = "abc";
        String s2 = "abc";
        String intern = s2.intern();
        System.out.println(s == intern);
        System.out.println(s.intern() == s2.intern());
    }

    @Test
    public void testIterator() {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("1 " + iterator.hasNext());
            System.out.println("2 " + iterator.hasNext());
            System.out.println("3 " + iterator.next());
            System.out.println();
        }
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }

    @Test
    public void testBit() {
        int i = 10;
        System.out.println(i >>> 1);
        System.out.println(i << 1);
    }

    @Test
    public void testArrayCopy() {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        int[] newArr = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(newArr));
    }

    @Test
    public void testArrayList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100 ; i++) {
            list.add(i);
        }
        System.out.println(list);
        //DispatcherServlet
    }
}
