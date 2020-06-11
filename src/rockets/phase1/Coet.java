package rockets.phase1;

public class Coet {
  private String code;
  private int numThrusters;

  public Coet(String code, int numThrusters) {
    this.code = code;
    this.numThrusters = numThrusters;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public int getNumThrusters() {
    return numThrusters;
  }

  public void setNumThrusters(int numThrusters) {
    this.numThrusters = numThrusters;
  }

  @Override
  public String toString() {
    return "Coet{" + "code='" + code + '\'' + ", numThrusters=" + numThrusters + '}';
  }
}
