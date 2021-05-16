
package burger.resturent.manager;

public class HealthyBurger extends NormalBurger{
 private String rollBreadType;
 
    public HealthyBurger() {
        super();
    }

    
    public void setRollBreadType(){
        rollBreadType = "brown";
        totalPrice += 10.0;
    }


    public void getAdditions(int num) {
        switch (num) {
            case 1:
                totalPrice += 6;
                break;
            case 2:
                totalPrice += 7;
                break;
            case 3:
                totalPrice += 15;
                break;
        }}}


