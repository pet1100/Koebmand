Package Koebmand;

import java.io.Serializable;

public Class Goods implements Serializable
{
  private int ID = 0;
  private String name;
  private int price;
  private int quantity;
 
  public Goods(String name, int price)
  {
    
    setId();
    this.ID = ID;
    this.name = name;
    this.price = price;
  }
  public void setId ()
  {
    ID += 1;
    
  }
  public int getQuantity()
  {
    return quantity;
  }
  
  public void addQuantity(int addQuantity)
  {
    quantity += addQuantity;
  }
  
  public void removeQuantity()
  {
    quantity--;
  }
  
  public void remobeMoreQuantity(int removeQuantity)
  {
    quantity -= removeQuantity;
  }
  
  public int getID()
  {
    return ID;
  }
  
  public String getName()
  {
    return name;
  }
  
  public int getPrice()
  {
    return price;
  }
}
