public class Truck extends Vehicle {

  /**
  * The plate number string.
  */
  private String plateNumber;

  /**
  * The truck color.
  */
  private String truckColor = "green";

  /**
  * The truck constructor.
  */
  public Truck() {
    super();
  }

  /**
  * The accelerate method.
  *
  * @return speed.
  */
  public int accelerate() {
    super.accelerate();
    return super.accelerate();
  }

  /**
  * The brake method.
  *
  * @return speed.
  */
  public int brake() {
    return super.brake();
  }

  /**
  * The provideAir method.
  *
  * @return Honk Honk!
  */
  public String provideAir() {
    return "Honk Honk!";
  }

  /**
  * The plateInfo method.
  *
  * @param plateNum the new plate number.
  */
  public void plateInfo(final String plateNum) {
    plateNumber = plateNum;
  }

  /**
  * The getPlate method.
  *
  * @return plateNumber.
  */
  public String getInfo() {
    final String info = plateNumber + " and is " + truckColor;
    return info;
  }

  /**
  * The setColor method.
  *
  * @param newColor the new truck color.
  */
  public void setColor(final String newColor) {
    truckColor = "";
    truckColor = newColor;
  }

  public int getWheels() {
    int result = super.getWheels();
    return result;
  }
}
