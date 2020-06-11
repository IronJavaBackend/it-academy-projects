package rockets.phase2;

import java.util.ArrayList;
import java.util.List;

public class Coet {
  private String code;
  private int numThrusters;
  private List<Thruster> thrusters = new ArrayList<>();

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

  public List<Thruster> getThrusters() {
    return thrusters;
  }

  public void setThrusters(List<Thruster> thrusters) {
    this.thrusters = thrusters;
  }

  public void addThrusters( int[] values ){
    for (int i = 0; i < values.length; i++) {
      Thruster t = new Thruster();
      t.setMaxPower(values[i]);
      this.thrusters.add(t);
    }
  }

  @Override
  public String toString() {
    return code + ':' + thrusters.toString();
  }
}
