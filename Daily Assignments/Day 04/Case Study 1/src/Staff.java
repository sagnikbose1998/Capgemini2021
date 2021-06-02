public class Staff extends Person{
    private String school;
    private double pay;

//    Getters
    public String getSchool() { return school; }
    public double getPay() { return pay; }

//    Setters
    public void setSchool(String school) { this.school = school; }
    public void setPay(double pay) { this.pay = pay; }

//    toString
    public String toString() {
        Person p = new Person();
        p.setName(this.name);
        p.setAddress(this.address);
        return  "Staff," + p.toString() + " school= " + getSchool() + ", pay= " + getPay();
    }
}
