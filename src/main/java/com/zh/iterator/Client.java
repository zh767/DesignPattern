package com.zh.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author zh
 * @since 2020/4/30
 */
public class Client {
    /*public static void main(String[] args) {
        //没有outputImpl的使用
        ComputerCollege computerCollege = new ComputerCollege();
        Iterator<Department> comIter = computerCollege.createIterator();
        while (comIter.hasNext()){
            System.out.println(comIter.next());
        }

        System.out.println("=====================");
        InfoCollege infoCollege = new InfoCollege();
        Iterator<Department> infoIter = infoCollege.createIterator();
        while (infoIter.hasNext()) {
            System.out.println(infoIter.next());
        }
    }*/
    public static void main(String[] args) {
        List<College> colleges = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        colleges.add(computerCollege);
        colleges.add(infoCollege);
        OutPutImpl outPut = new OutPutImpl(colleges);
        outPut.printCollege();
        System.out.println("=========");

       // outPut.printDepartment(computerCollege.createIterator());
    }
}
