Package Koebmand;

import java.io.Serializable;

public Class Goods implements Serializable
{
  private int ID = 0;
  private String name;
  private int price;
  private int quantity;
 
  public Goods(int ID, String name, int price, int quantity)
  {
    this.ID = ID;
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }
  
  public Goods()
  {
    
  }
  
  public int getQuantity()
  {
    return quantity;
  }
  
  public void addGoods(int addQuantity)
  {
    quantity += addQuantity;
  }
  
  public void removeGoods()
  {
    quantity--;
  }
  
  public void removeGoods(int removeQuantity)
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
