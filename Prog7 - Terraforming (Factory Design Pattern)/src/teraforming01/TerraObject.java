package teraforming01;
public abstract class TerraObject {
  protected int impact;
  protected String objectName;
  String name;
  
  public String toString() 
  {
    return name + ":" + impact; 
  }

  public int getImpact(){ 
    return impact;  
  }  
}