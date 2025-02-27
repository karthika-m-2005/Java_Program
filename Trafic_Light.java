enum Light
  {
    RED,BLUE,GREEN
  }
class Trafic_Light
  {
    public static void main(String[] args)
    {
      Light l = Light.RED;
      if(l == Light.RED)
      {
        System.out.println("STOP");
      }
      else if(l == Light.BLUE)
      {
        System.out.println("GET READY");
      }
      else
      {
        System.out.println("GO");
      }
    
    }
  }
