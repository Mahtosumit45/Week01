public class PnLCalculator{
    public static void main(String[] args){
        // Created a int variable for cost priceand assigned 129
        int costPrice = 129;

        // Created a int variable for selling price and assigned 191 
        int sellingPrice = 191;

        // Created a variable for profit calculation
        int profit = sellingPrice - costPrice;
        // Created a varibale to store the profit percentage
        double profitPercent =(double)profit /  costPrice * 100.0;
        // Display the output
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Pric is INR "+sellingPrice+"\n The Profit is INR "+profit+" and the Profit Percentage is "+ String.format("%.2f",profitPercent));
    }
}

