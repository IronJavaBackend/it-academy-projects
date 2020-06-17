package rockets.phase3;

public class ThreadAccelerate extends Thread {
  private String name;
  private int newPower;
  Thruster thruster;

  // constructor
  public ThreadAccelerate(String name, Thruster thruster, int newPower) {
    super(name);
    this.thruster = thruster;
    this.newPower = newPower;
  }

  public void run() {
    thruster.accelerate(newPower, thruster.getActualPower());
    System.out.println(" ********* End of : " + getName() + " ********* ");
  }
}
