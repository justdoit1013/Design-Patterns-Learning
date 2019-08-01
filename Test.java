package com02.Test;
import com02.Test.Car.Audi;
import com02.Test.Car.Buick;
import com02.Test.Car.Car1;
import com02.Test.Human.HumanWithCar;
import com02.Test.Human.Lisi;
import com02.Test.Human.ZhangSan;

public class Test {
    public static void main(String[] args){
        //车厂先造车
        Car1 audi = new Audi();
        Car1 buick = new Buick();
        //有车族创建有车的人
        HumanWithCar zs = new ZhangSan(audi);
        HumanWithCar ls = new Lisi(buick);
        zs.CarGoHome();
        ls.CarGoHome();
    }
}
