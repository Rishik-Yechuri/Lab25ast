public class Truck extends Car {
    private int towingCapacity;
    private boolean dieselEngine;

    public Truck() {
        super(5000, "Javatruck");
        TruckEngine newEngine = new TruckEngine(false);
        int engineSize = newEngine.getEngineSize();
        System.out.println("Engine size:" + engineSize);
        System.out.println("horsepower set:" + this.horsePower);
        System.out.println("model set:" + this.model);
        towingCapacity = 420;
        System.out.println("towingCapacity set:" + this.model);
        dieselEngine = false;
    }

    public Truck(int towingCapacity, boolean dieselEngine) {
        super(5000, "Javatruck");
        this.towingCapacity = towingCapacity;
        System.out.println("towingCapacity set:" + towingCapacity);
        this.dieselEngine = dieselEngine;
        System.out.println("dieselEngine  set:" + dieselEngine);
    }

    public class TruckEngine {
        public int engineSize;

        public TruckEngine(boolean dieselEngine) {
            if (dieselEngine) {
                engineSize = 200;
            } else {
                engineSize = 130;
            }
        }
        public int getEngineSize(){
            return engineSize;
        }
    }
}
