package rockets.phase3;

public class Thruster {

  private int maxPower;
  private int actualPower;

  // constructor
  public Thruster(int maxPower) {
    this.maxPower = maxPower;
    this.actualPower = 10;
  }

  public int getMaxPower() {
    return maxPower;
  }

  public void setMaxPower(int maxPower) {
    this.maxPower = maxPower;
  }

  public int getActualPower() {
    return actualPower;
  }

  public void setActualPower(int actualPower) {
    this.actualPower = actualPower;
  }

  public void accelerate(int newPower, int actualPower) {
    if (canSpeedUp(newPower)) {
      System.out.println("Speeding up ...");
      for (int i = this.actualPower; i < newPower; i++) {
        this.actualPower++;
        System.out.print(this.actualPower + ", ");

        // hago que el hilo descanse 2 segundos
        try {
          Thread.sleep(2000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      System.out.println("\n");
    } else {
      System.out.println("Is at maximum power");
    }
  }

  public void brake(int newPower, int actualPower) {
    if (canSpeedDown(newPower)) {
      System.out.println("<--- Slowing down ...");
      for (int i = this.actualPower; i > newPower; i--) {
        this.actualPower--;
        System.out.println(this.actualPower + ", ");

        // hago que el hilo descanse 2 segundos
        try {
          Thread.sleep(2000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      System.out.println("\n");
    } else {
      System.out.println("Is at minimum power");
    }


  }

  public boolean canSpeedUp(int newPower) {
    if ((this.actualPower + newPower) <= this.maxPower) {
      return true;
    } else {
      return false;
    }
  }

  public boolean canSpeedDown(int newPower) {
    if ((this.actualPower - newPower) >= 0) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String toString() {
    return "Thruster{" + "maxPower=" + maxPower + ", actualPower=" + actualPower + '}';
  }
}
