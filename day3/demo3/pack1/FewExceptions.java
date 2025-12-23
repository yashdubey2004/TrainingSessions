public class FewExceptions {
    public static void main(String[] args) {
        try {
            String city = null;
            System.out.println(city.length());
        } catch (Exception e) {
            System.out.println("An error occurred");
        } 
        finally{
            System.out.println("This is important");
        }
    }
}
