public class Employee {

    private String Firstname;
    private String Lastname;
    private int salary;
    private static int id = 1;
    int employeeid;


    Employee( String Firstname, String Lastname, int salary, int id, int employeeid){
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.salary = salary;
        this.id = id;
        this.employeeid = employeeid;

    }
    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getAnnualsalary(){
        salary = getSalary()*12;
        return salary;
    }
    public int raisesalary(int percent){
        salary = salary * percent/100 + salary;
        return salary;
    }

    public String toString(){
        return "Employee[id: "+ employeeid + ", name: "+ getFirstname()+ getLastname()+ ", salary: "+ salary+ " ]";
    }


}
