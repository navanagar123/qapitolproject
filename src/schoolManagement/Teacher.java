package schoolManagement;

public class Teacher extends Person {
    String subject;
    double salary;

    public String getSubject() {
        return subject;
    }


    public double getSalary() {
        return salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    @Override
    public void displayDetails() {
        System.out.println("Teacher detials are"+"id"+getId() +" "+"name"+getName()+" "+"age"+getAge()+" "+"subject"+subject+" "+"salary"+salary);

    }
}
