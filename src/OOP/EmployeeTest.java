package OOP;

public class EmployeeTest {
    public static void main(String[] args) {
//배열 생성

        int [] hours0 =  {2,4,3,4,5,8,8};
        int [] hours1=  {7,3,4,3,3,4,4};

        
//객체 생성

        Employee e0 = new Employee("직원0", hours0);
        Employee e1 = new Employee("직원1", hours1);

//객체 배열 생성

        Employee [] emplyoees = {e0, e1};

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
