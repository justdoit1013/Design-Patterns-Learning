package com02.Test.Human;
import com02.Test.Car.Car1;
public class Lisi implements com02.Test.Human.HumanWithCar {

    protected Car1 car;
    public Lisi(Car1 car) {
        this.car = car;
    }
    public void CarGoHome(){
        car.Start();
        car.Stop();
    }
}
