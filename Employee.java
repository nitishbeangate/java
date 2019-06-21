/*
List of objects that implement this interface can be sorted automatically by sort method of the list interface. 
This interface has compareTo() method that is used by the sort() method of the list.
In this code Employee class is implementing Comparable interface and have method compareTO(). 
ComparableDemo.java is showing the use of this interface. This class first makes a list of objects of type Employee and 
call sort method of java.util.Collections, 
which internally uses compareTo() method of Employee class and sort the list accordingly.

*/



public class Employee implements Comparable {
 
    int EmpID;
    String Ename;
    double Sal;
    static int i;
 
    public Employee() {
        EmpID = i++;
        Ename = "dont know";
        Sal = 0.0;
    }
 
    public Employee(String ename, double sal) {
        EmpID = i++;
        Ename = ename;
        Sal = sal;
    }
 
    public String toString() {
        return "EmpID " + EmpID + "\n" + "Ename " + Ename + "\n" + "Sal" + Sal;
    }
 
    public int compareTo(Object o1) {
        if (this.Sal == ((Employee) o1).Sal)
            return 0;
        else if ((this.Sal) > ((Employee) o1).Sal)
            return 1;
        else
            return -1;
    }
}
