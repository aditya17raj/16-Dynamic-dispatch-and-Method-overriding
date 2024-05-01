class phone
  {
    void on(){
      System.out.println("starting phone");
    }
    void off(){
      System.out.println("switching off phone");
    }
    void recievecall(){
      System.out.println("call recieved");
    }
    void rejectcall(){
      System.out.println("call rejected");
    }
  }

class smartphone extends phone
  {
    @Override
    void on(){
      System.out.println("starting phone");
    }
    @Override
    void off(){
      System.out.println("switching off phone");
    }
    @Override
    void recievecall(){
      System.out.println("call recieved");
    }
    @Override
    void rejectcall(){
      System.out.println("call rejected");
    }

    void playmusic(){
      System.out.println("playing music");
    }
    void playingvideo(){
      System.out.println("playing video");
    }
    
  }

public class Main {
  public static void main(String[] args) {
    phone s1 = new smartphone();
    //this is dynamic method dispatch that allows us to store object     refrence of sub class into refernce variable of base class. Here     sub class->smartphone and base class->phone
    
    s1.on();
    s1.off();
    s1.recievecall();
    s1.rejectcall();

    smartphone sm = new smartphone();
    sm.on();
    sm.off();
    sm.recievecall();
    sm.rejectcall();
    sm.playmusic();
    sm.playingvideo();

  }

}