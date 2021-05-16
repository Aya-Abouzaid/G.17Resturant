
package burger.resturent.manager;


public class DeluxBerger extends NormalBurger {
    private String name = "Deluxe Burger";
    private String meatType;
    private String rollBreadType;
     private String add_1, add_2;
    public String getName(){
        return name;
    }

     public void setMeatType(){
        meatType = "beef";
    }
    
    public  void setRollBreadType(){
        rollBreadType = "white";
    }

    
    public void getAdditions(){
        add_1 = "chips";
        add_2 = "cola";
    }
    @Override
    public float getPrice(){
		return (float) 60.00;
	}

    
}
