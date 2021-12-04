package corejava.basics.confusing;



public class CalTimeZonesImpl {



    private static class TzServer
  {
    private static String tzserverUri;

    
    private TzServer() {
        System.out.println("ok");
    }
  }

  public static void main(String[] args) {
      TzServer tzServer= new TzServer();
  }
}