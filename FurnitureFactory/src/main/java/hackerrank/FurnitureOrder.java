package hackerrank;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    
    HashMap<Furniture,Integer> fm= new HashMap<Furniture,Integer>();

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    
    
    FurnitureOrder() {
       super();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        
      //  HashMap<Furniture,Integer> finalOrder= new HashMap<Furniture,Interger>();
        fm.add(type,furnitureCount);
        
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
       return fm;
    }

    public float getTotalOrderCost() {
        float totalOrderCost=0f;
        for(float f : map.values()) {
         totalOrderCost += f;
        }
            return totalOrderCost;
    }

    public int getTypeCount(Furniture type) {
        int count=0;
       for(int 0;i<=fm.size();i++)
       {
       if(fm.getKey==type)
           {
            count++;   
            }
       }
        return count;
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        return -1.0f;
    }

    public int getTotalOrderQuantity() {
         int totalqyt=0;
      for(float f : map.keys())
      {
         totalqyt =totalqyt+fm.getValue(f);
       }
        return totalqyt;
    }
}
