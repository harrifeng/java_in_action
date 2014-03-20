package tmp.jcip;

/**
 * Created by hfeng on 14-1-15.
 */
public class UnsafeStates {

  private String[] states = new String[]{"AA", "BB"};

  public static void main(String[] args) {
    UnsafeStates us = new UnsafeStates();
    System.out.println(us.getStates()[0]);
    us.getStates()[0] = new String("ZZ");
    System.out.println(us.getStates()[0]);
  }

  public String[] getStates() {
    return states;
  }

}
