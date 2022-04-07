package car;

public class Car {

    public static void main(String[] args) {
        Car car = new Car();
        Car.build();
        car.buy();
    }

    int carSpeeg = 0;
    public static void build() {
        System.out.println("You must build a new car");
    }
    public void buy(){
        System.out.println("I will buy this car");
    }
}
