Package Koebmand;

import java.io.Serializable;

public Class Goods implements Serializable
{
  private int ID;
  private String name;
  private int price;
  private int quantity;
 
  public Goods(int ID, String name, int price)
  {
    this.ID = ID;
    this.name = name;
    this.price = price;
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
