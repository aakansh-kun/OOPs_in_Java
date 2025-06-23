class Car_Manufacturing_System {
    class Engine {
        
        public void start() {
            System.out.println("Engine started");
        }

        public void stop() {
            System.out.println("Engine stopped");
        }
    }

    public void drive() {
        Engine engine = new Engine();
        engine.start();
        System.out.println("Car is moving...");
        engine.stop();
        System.out.println("Applying Breaks");
    }

    public static void main(String[] args) {
        Car_Manufacturing_System myCar = new Car_Manufacturing_System();
        System.out.println("Gaddi Lamborginni Peele Rang Di");
        myCar.drive();
    }
}
