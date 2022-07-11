package highwayChange;

import highwayChange.driver.Beginner;
import highwayChange.driver.Driver;

public class Car {
    private Driver driverType;

    public Car() {
        driverType = new Beginner();
    }

    public void setDriver(Driver input_driver) {
        driverType = input_driver;
        System.out.println("드라이버가 교체 되었습니다 : " + driverType.getClass().getName());
    }
    public Driver getDriver() {
        return driverType;
    }
}
