class MonetaryCoin extends Coin
{
  private int value;

  //Constructor
  public MonetaryCoin(int value)
  {
    this.value = value;
  }//end value Constructor

  //getters and setters
  public int getValue()
  {
    return value;
  }//end value getter

  public void setValue(int value)
  {
    this.value = value;
  }//end value setter

  //toString
  public String toString()
  {
    String output =  super.toString();
    output += "\nValue = " + value;
    return output;
  }//end toString
}//end class MonetaryCoin