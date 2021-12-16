public class Bike extends Vehicle {

  /**
  * The cadence of the bike.
  */
  private int cadence;

  /**
  * The constructor for the bike.
  */
  public Bike() {
    super();
  }

  /**
  * The accelerate method.
  *
  * @return speed.
  */
  public int accelerate() {
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
  * the ringBell method.
  *
  * @return Ding!
  */
  public String ringBell() {
    return "Ding!";
  }

  /**
  * The setCadence method.
  *
  * @param newCadence the new cadence
  */
  public void setCadence(final int newCadence) {
    cadence = newCadence;
  }

  /**
  * The getCadence method.
  *
  * @return cadence.
  */
  public int getCadence() {
    return cadence;
  }

  public int getWheels() {
    int result = super.getWheels();
    result = result / 2;
    return result;
  }
}
