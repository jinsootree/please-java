package OOP;

public class EmployeeTest {
    public static void main(String[] args) {
//배열 생성

        int [] hours0 =  {2,4,3,4,5,8,8};
        int [] hours1 =  {7,3,4,3,3,4,4};
        int [] hours2 =  {3,3,4,3,3,2,2};
        int [] hours3 =  {6,3,4,2,3,1,4};
        int [] hours4 =  {5,3,2,3,3,2,1};
        int [] hours5 =  {8,3,6,3,5,4,1};
        int [] hours6 =  {7,3,2,3,2,3,3};
        int [] hours7 =  {6,1,2,4,2,1,2};

        
//객체 생성

        Employee e0 = new Employee("직원1", hours0);
        Employee e1 = new Employee("직원2", hours1);
        Employee e2 = new Employee("직원3", hours2);
        Employee e3 = new Employee("직원4", hours3);
        Employee e4 = new Employee("직원5", hours4);
        Employee e5 = new Employee("직원6", hours5);
        Employee e6 = new Employee("직원7", hours6);
        Employee e7 = new Employee("직원8", hours7);

//객체 배열 생성

        Employee [] emplyoees = {e0, e1, e2, e3, e4, e5, e6, e7};

// 출력
        
        for (int i = 0; i < emplyoees.length; i++) {
            emplyoees[i].printToealhours();
        }

    }
}

class Employee {

    String name;
    int [] hours;

    Employee (String str, int [] arr ) {

        name = str;
        hours = arr;
    }

    void printToealhours() {
        System.out.printf("%s -> %d 시간\n", name, totalHours());
    }

    int totalHours() {
        int sum = 0;
        for (int i = 0; i < hours.length; i++) {
            sum += hours[i];
        }
        return sum;
    }
}
