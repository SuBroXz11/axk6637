package homework;

class Doctor extends Employee {
    String specialism;

    public Doctor(String name, int empId, String specialism) {
        super(name, empId);
        this.specialism = specialism;
    }

    public void provideService() {
        System.out.println("Doctor " + name + " Emp#" + empId + " specializes in " + specialism);
    }
}
