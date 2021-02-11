import java.util.Random;
public class Coin
{
  private final int HEADS = 0;
  private final int TAILS = 0;
  private int face;
  //Constructor
  public Coin()
  {
    flip();
  }

  //brain methods
  public void flip()
  {
    face = (int) (Math.random()*2);
  }//end brain method flip

  public boolean isHeads()
  {
    return (face == HEADS);
  }//end isHeads method

  //toString
  public String toString()
  {
    String faceName;
     if(face == HEADS)
     {
       faceName = "Heads";
     }
     else
     {
       faceName = "Tails";
     }
    return faceName;
  }//end toString
}//endCoin Class