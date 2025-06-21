class Manager extends Employee {
    double bonus;
    Manager(double baseSalary, double bonus) {
        super(baseSalary);
        this.bonus = bonus;
    }
    double calculateSalary() { return baseSalary + bonus; }
}
