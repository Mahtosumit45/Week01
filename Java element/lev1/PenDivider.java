public class PenDivider{
    public static void main(String[] args){
        // Created a int variable for number of pens and assigned 14 
        int numberOfPen = 14;
    
        // Created a int variable for number of students and assigned 3 
        int numberOfStudents = 3;

        // Created a int variable for storing number of pens each student have
        int penOnStudents = numberOfPen / numberOfStudents;
        // Created a int variable to store the remaining pen
        int penRemaining = numberOfPen % numberOfStudents;
        // Output the result
        System.out.println("The Pen Per Student is "+penOnStudents +" and the remaining pen not distributed is "+penRemaining);
    }
}

