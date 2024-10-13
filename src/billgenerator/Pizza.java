package billgenerator;

public class Pizza {

    private boolean isVeg;

    private int basePriceVeg = 300;
    private int basePriceNonVeg = 400;

    private boolean extraCheese;
    private int extraCheesePrice = 80;

    private boolean extraToppings;
    private int extraToppingsPrice = 70;

    private boolean isTakeAway;
    private int takeAwayBagPrice = 20;

    private int price;

    String bill;

    public Pizza(boolean isVeg){
        this.isVeg = isVeg;
        price += (isVeg) ? basePriceVeg : basePriceNonVeg;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {
        if(extraCheese==false){
            extraCheese = true;
            price += extraCheesePrice;
        }
    }

    public void addExtraToppings() {
        if(extraToppings==false){
            extraToppings = true;
            price += extraToppingsPrice;
        }
    }

    public void addTakeaway() {
        if(isTakeAway==false){
            isTakeAway = true;
            price += takeAwayBagPrice;
        }
    }

    public String getBill(){
        StringBuilder billOutput = new StringBuilder();

        billOutput.append("Base Price Of The Pizza: ");
        if(isVeg){
            billOutput.append(basePriceVeg+"\n");
        } else {
            billOutput.append(basePriceNonVeg+"\n");
        }

        if(extraCheese) billOutput.append("Extra Cheese Added: " + extraCheesePrice +"\n");
        if(extraToppings) billOutput.append("Extra Toppings Added: " + extraToppingsPrice+"\n");
        if(isTakeAway) billOutput.append("PaperBag Added: " + takeAwayBagPrice+"\n");
        billOutput.append("Total Price: " + price+"\n");

        bill = billOutput.toString();

        return bill;
    }




}
