public class NullptrExc {
    public static void generateNullPtrExeption(String s){
        System.out.println(s.length());
    }
    public static void handleNullPtrExeption(String s){
        try {
            System.out.println(s.charAt(3));
        }
        catch (NullPointerException e){
            System.out.println("A Null ptr exeption occured");
        }
    }
    public static void main(String[] args){
        String s = null;
//        System.out.println("Example of generating the ecxeption ");
//        generateNullPtrExeption(s);
        System.out.println("Example of handling the exception ");
        handleNullPtrExeption(s);
    }
}
