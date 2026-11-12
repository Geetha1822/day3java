abstract class employee {
    private String name;
    private int empid;
    private double salary;

    employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    public String getname() {
        return name;
    }

    public int getempid() {
        return empid;
    }

    public double getsalary() {
        return salary;
    }

    protected double getbasesalary() {
        return salary;
    }

    abstract double calculatesalary();

    void display() {
        System.out.println("name:" + name + ",id:" + empid);
    }
}


class fulltimeemployee extends employee {
    double bonus;

    fulltimeemployee(String name, int empid, double salary, double bonus) {
        super(name, empid, salary);
        this.bonus = bonus;
    }

    double calculatesalary() {
        return getbasesalary() + bonus;
    }
}

// Part time employee
class parttimeemployee extends employee {
    int hours;
    double rateperhour;

    parttimeemployee(String name, int empid, int hours, double rateperhour) {
        super(name, empid, 0);
        this.hours = hours;
        this.rateperhour = rateperhour;
    }

    double calculatesalary() {
        return hours * rateperhour;
    }
}

class Main {
    public static void main(String[] args) {
        fulltimeemployee e1 =
            new fulltimeemployee("geetha", 101, 50000, 5000);

        parttimeemployee e2 =
            new parttimeemployee("shreya", 102, 80, 500);

        System.out.println("---full time employee---");
        e1.display();
        System.out.println("total salary:" + e1.calculatesalary());

        System.out.println("---part time employee---");
        e2.display();
        System.out.println("total salary:" + e2.calculatesalary());
    }
}
