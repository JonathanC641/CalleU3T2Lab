public class Bill {
    private double totalCost;
    private int customers;
    private boolean tipAdded;

    /* Constructor
        PRECONDITION: costOfMeal >= 0, customers > 0
     */
    public Bill(double costOfMeal, int customers) {
        totalCost = costOfMeal;
        this.customers = customers;
        tipAdded = false;
    }

    /* If the tip has not already been added, add a tip to totalCost based on
     the number of guests, and update tipAdded to be true.  Then, return true
     to the caller of this method to inform them the tip was successfully added.

     If the tip has already been added when this method is called,
     this method should NOT add the tip again, then return false to the caller
     to inform them the tip was already added to totalCost.

       To calculate the tip:
     - add 30% to totalCost if there are 8 or more guests
     - add 27% to totalCost if there are 4 or more guests
     - add 25% to totalCost if there are 2 or more guests
     - add 20% to totalCost if the person is dining alone (1 guest)

   */
    public boolean addTip() {
        if (tipAdded == true){
            return tipAdded = false;
        }
        if (customers >= 8){
            totalCost += totalCost * .30;
            return tipAdded = true;
        } else if (customers >= 4){
            totalCost += totalCost * .27;
            return tipAdded = true;
        }else if (customers >= 2){
            totalCost += totalCost * .25;
            return tipAdded = true;
        } else{
            totalCost += totalCost * .20;
            return tipAdded = true;
        }
    }

    /* Returns String with info about the bill */
    public String billInfo() {
        // Round the bill to two decimal places
        double roundedBill = Math.round(totalCost * 100.0) / 100.0;
        return "Total cost for " + customers + " customers is $" + roundedBill;
    }
}
