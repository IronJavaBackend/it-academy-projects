package rockets.phase3;

import java.util.ArrayList;
import java.util.List;

public class Coet {

  private String code;
  private int numThrusters;
  private List<Thruster> listThrusters = new ArrayList<>();

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

  public List<Thruster> getListThrusters() {
    return listThrusters;
  }

  public void setListThrusters(List<Thruster> listThrusters) {
    this.listThrusters = listThrusters;
  }

  public void addThrusters(int[] values) {
    for (int i = 0; i < values.length; i++) {
      Thruster thruster = new Thruster(values[i]);
      this.listThrusters.add(thruster);
    }
  }

  public void acceleraThruster(int position, int newPower) {
    ThreadAccelerate threadAccelerate = new ThreadAccelerate("Thread accelera", listThrusters.get(position), newPower);
    System.out.println("INITIAL ACCELERATE ===>>> " + threadAccelerate.getName() + listThrusters.get(position));
    threadAccelerate.start();
  }

  public void brakeThruster(int position, int newPower) {
    ThreadBrake threadBrake = new ThreadBrake("Thread brake", listThrusters.get(position), newPower);
    System.out.println("INITIAL BRAKE ===>>> " + threadBrake.getName() + listThrusters.get(position));
    threadBrake.start();
  }

  @Override
  public String toString() {
    return code + ':' + listThrusters.toString();
  }
}
