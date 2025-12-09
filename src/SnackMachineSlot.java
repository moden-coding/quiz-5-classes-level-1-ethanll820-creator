public class SnackMachineSlot {
    private String itemName;
    private double price;
    private int quantity;
    private int itemsSold;


    public SnackMachineSlot(String givenItemName, double initialPrice, int initialQuantity) {
        itemName = givenItemName;
        if (initialPrice < 0) {
            price = 0.0;
        } else {
            price = initialPrice;
        }
        if (initialQuantity < 0) {
            quantity = 0;
        } else {
            quantity = initialQuantity;
        }
        itemsSold = 0;

    }
    public void purchaseOne(){
        if(quantity>0){
            quantity = quantity -1;
            itemsSold = itemsSold +1;

        }else if(quantity == 0){
            return;
        }
    }

     public double getRevenue(){
        return itemsSold * price;
     }


    public String toString() {
        return "Item: " + itemName+"," + " Price: " + price+"," + " In stock: " + quantity+","+" Items sold: "+ itemsSold;
    }

}
