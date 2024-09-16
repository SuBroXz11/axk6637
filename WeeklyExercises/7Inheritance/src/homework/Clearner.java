package homework;

class Cleaner extends Employee {
    String department;

    public Cleaner(String name, int empId, String department) {
        super(name, empId);
        this.department = department;
    }

    public void provideService() {
        System.out.println("Cleaner " + name + " Emp#" + empId + " of " + department + " is sweeping");
    }
}
