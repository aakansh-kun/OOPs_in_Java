class Worker {
    protected String name;
    protected double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public double computePay(int hours) {
        return 0; // Default implementation
    }
}

class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        int daysWorked = hours / 8; // Convert hours to days
        return daysWorked * salaryRate;
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        return 40 * salaryRate; // Fixed 40-hour week pay
    }
}

public class WorkerTest {
    public static void main(String[] args) {
        Worker dailyWorker = new DailyWorker("John", 100);
        Worker salariedWorker = new SalariedWorker("Alice", 50);

        System.out.println(dailyWorker.name + "'s weekly pay: " + dailyWorker.computePay(40));
        System.out.println(salariedWorker.name + "'s weekly pay: " + salariedWorker.computePay(40));
    }
}
