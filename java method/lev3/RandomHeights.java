public class RandomHeights {
    public static int[] generateHeight(int size){
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            int height = (int)(Math.random() * 100) + 149;
            heights[i] = height;

        }
        return heights;
    }
    public static int sumHeight(int[] heights){
        int sum = 0;
        for(int it: heights) sum+=it;
        return sum;
    }
    public static double meanHeight(int[] height){
        int sum = sumHeight(height);
        return (double)sum/height.length;
    }
    public static int minHeight(int[] height){
        int mini = height[0];
        for(int it: height) mini = Math.min(mini,it);
        return mini;
    }
    public static int maxHeight(int[] height){
        int maxi = height[0];
        for(int it: height) maxi = Math.max(maxi,it);
        return maxi;
    }
    public static void main(String[] args){
        int[] heights = generateHeight(11);
        System.out.print("The heights of the player are ");
        for(int it: heights) System.out.print(it+" ");
        System.out.println("\nThe tallest height = "+maxHeight(heights));
        System.out.println("The Shortest height = "+minHeight(heights));
        System.out.println("The Sum of heights  = "+sumHeight(heights));
        System.out.println("The Mean height = "+String.format("%.2f",meanHeight(heights)));
    }
}
