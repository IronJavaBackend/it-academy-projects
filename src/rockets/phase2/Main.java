package rockets.phase2;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Coet c1 = new Coet("32WESSDS", 3);
    int[] numTrustCoet1 = {10, 30, 80};
    c1.addThrusters(numTrustCoet1);

    Coet c2 = new Coet("LDSFJA32", 6);
    int[] numTrustCoet2 = {30,40,50,50,30,10};
    c2.addThrusters(numTrustCoet2);

    System.out.println(c1.toString() + "\n" + c2.toString());
  }
}
