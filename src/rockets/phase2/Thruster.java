package rockets.phase2;

public class Thruster {

  private Integer maxPower;

  public Thruster() { }

  public Thruster(int maxPower) {
    this.maxPower = maxPower;
  }

  public int getMaxPower() {
    return maxPower;
  }

  public void setMaxPower(int maxPower) {
    this.maxPower = maxPower;
  }

  @Override
  public String toString() {
    return maxPower + "";
  }
}
