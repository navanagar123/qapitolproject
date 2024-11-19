package schoolManagement;

public class Student extends Person{
    int marks;
    String Cources;
    public String getCources() {
        return Cources;
    }

    public int getMarks() {
        return marks;
    }



    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setCources(String cources) {
        Cources = cources;
    }



    public void CalculateGrade(){

        if(marks>70){
         System.out.println("Grade is A");
        }
        else if(marks >=50){
         System.out.println("Grade is B");
        }
        else{
       System.out.println("Grade is C");
        }

    }

    @Override
    public void displayDetails() {
      System.out.println("student detials are"+getId() +" "+getName()+" "+getAge()+" "+Cources+" "+marks);


    }
}
