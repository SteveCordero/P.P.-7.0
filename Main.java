class Main 
{
  public static void main(String[] args)
  {
    System.out.println("Steve Cordero P.P. 7.0");
    int totalValue = 0;

    MonetaryCoin quarter = new MonetaryCoin(25);
    MonetaryCoin dime = new MonetaryCoin(10);
    MonetaryCoin nickel = new MonetaryCoin(5);
    MonetaryCoin penny = new MonetaryCoin(1);

    totalValue = quarter.getValue() + dime.getValue() +  nickel.getValue() +  penny.getValue();

    System.out.println("total value of all coins : "  + totalValue);

    for(int i = 0; i < 5; i ++)
    {
      quarter.flip();

      if(quarter.isHeads())
      {
        System.out.println("Heads");
      }
      else
      {
        System.out.println("Tails");
      } 
    }//end for loop for testing flip method
  
  }//end main method
}//end main class aka the driver