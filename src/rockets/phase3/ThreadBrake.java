package rockets.phase3;

public class ThreadBrake extends Thread {
  private String name;
  private int newPower;
  Thruster thruster;

  // constructor
  public ThreadBrake(String name, Thruster thruster, int newPower) {
    super(name);
    this.thruster = thruster;
    this.newPower = newPower;
  }

  public void run() {
    thruster.brake(newPower, thruster.getActualPower());
    System.out.println(" ********* End of :  " + getName() + " *********");
  }
}