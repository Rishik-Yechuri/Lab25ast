public class Car {
    public int horsePower;
    public String model;
    public Car(){
        horsePower = 69;
        System.out.println("horsepower set:" + horsePower);
        model = "Javacar";
        System.out.println("model set:" + model);
    }
    public Car(int horsePower,String model){
        this.horsePower = horsePower;
        System.out.println("horsepower set:" + horsePower);
        this.model = model;
        System.out.println("model set:" + model);
    }
}
