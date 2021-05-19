public class info{

    public static void main(String[] args) {
        float first = 10.5f, second = 5.98f;

        System.out.println("Previous");
        System.out.println("The First number is = " + first);
        System.out.println("The Second number is = " + second);
        float temp = first;
        first = second;
        second = temp;

        System.out.println("After");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}