package Vehicles;

public class Vehicle {
    private String make;
    private String model;
    private String topSpeed;
    private int year;
    private int numberOfWheels;
    

    public Vehicle(String make, String model, String topSpeed, int year, int numberOfWheels) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.topSpeed = top speed;
        this.numberOfWheels = number of wheels;
    }

    public void drive() {
        System.out.println("Driving the vehicle.");
    }

    public void stop() {
        System.out.println("Stopping the vehicle.");
    }
    public void acelerate() {
        system.out.println("acelerating... top speed 250km/h")
    }
    public void acelerate stop (){
        system.out.println("stopping... 0km/h")
    }
}
public class Car extends Vehicle {
    private String model;
    private String make;
    private String numberOfWheels;
    private String topSpeed;
    private String AC;
    private String handBrake;
    private String sound;
    private String engine;
    private boolean isSdean;


    public Cars(String model, String make, String numberOfWheels, String topSpeed, String AC, String handBrake, String sound, String engine) {
        this.model = model;
        this.make = make;
        this.numberOfWheels = numberOfWheels;
        this.topSpeed = topSpeed;
        this.AC = AC;
        this.handBrake = handBrake;
        this.sound = sound;
        this.engine = engine;
        this.isSdean = isSdean;
      }
      public void accelerate(){
        this.speed += 10;
      }
      public void handBrakeOn() {
        System.out.println("handbracke ON")
        this.speed = 0;
      }
      public void deAccelerate() {
        this.speed -= 10;
         
      }


}
    
public class bike extends vehicle {
    private String model;
    private String make;
    private String numberOfWheels;
    private String topSpeed;
    private String engine;
    private String accelerate();
    private String breack();
}

public bike(String model, String make, String numberOfWheels, String topSpeed, String engine) {
    this.model = model;
    this.make = make;
    this.numberOfWheels = numberOfWheels;
    this.topSpeed = topSpeed;
    this.brake() = brake();
    this.acelerate() = acelerate();
    this.engine = engine;
  }

    public void acelerate() {
        System.out.println("acelerating...")
    }

    public void breack() {
        System.out.println("breack activate...")
    }







public class cycle extends Vehicle {
    private String model;
    private String make;
    private String numberOfWheels;

    public cycle(String model, String make, String numberOfWheels){
        this.model;
        this.make;
        this.numberOfWheels;
    }
}
public class Train extends Vehicle {
    private int numCars;

    public Train(String make, String model, int year, int numCars) {
        super(make, model, year);
        this.numCars = numCars;
    }

    public void attachCar() {
        System.out.println("Attaching a train car.");
    }
}


