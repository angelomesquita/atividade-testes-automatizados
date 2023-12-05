public class Director implements BusinessPosition{
        private Double salary;


    public Director(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    @Override
    public Double calculateBonus() {
        return salary * 6.5;
    }

    @Override
    public Double calculateSalary() {
        return salary -= salary * 0.275;
    }
}
