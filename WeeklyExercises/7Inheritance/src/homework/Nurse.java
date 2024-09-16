package homework;

class Nurse extends Employee {
    int patients;

    public Nurse(String name, int empId, int patients) {
        super(name, empId);
        this.patients = patients;
    }

    public void provideService() {
        System.out.println("Nurse " + name + " Emp#" + empId + " has " + patients + " patients");
    }
}
