import java.util.*;
 
public class ComparableDemo{
 
    public static void main(String[] args) {
 
        List ts1 = new ArrayList();
        ts1.add(new Employee ("Tom",40000.00));
        ts1.add(new Employee ("Harry",20000.00));
        ts1.add(new Employee ("Maggie",50000.00));
        ts1.add(new Employee ("Chris",70000.00));
        Collections.sort(ts1);
        Iterator itr = ts1.iterator();
 
        while(itr.hasNext()){
            Object element = itr.next();
            System.out.println(element + "\n");
             
        }
 
    }
}
/*
EmpID 1
Ename Harry
Sal20000.0
 
EmpID 0
Ename Tom
Sal40000.0
 
EmpID 2
Ename Maggie
Sal50000.0
 
EmpID 3
Ename Chris
Sal70000.0

*/
