package randomPackage.youtube;

public class Test{
  public int num;
  public static int n = 3;
}

class hello extends Test{
  public void helloMethod(){
    super.num = 3;

  }

  public static void main(String[] args) {
    hello h = new hello();
    h.num = 5;
    Test.n = 5;

  }
}