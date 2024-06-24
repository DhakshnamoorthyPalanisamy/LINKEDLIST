import java.util.LinkedList;
public class getFirst_getLast {
    public static void main(String args[]){
        LinkedList<String> color=new LinkedList<>();
        color.add("blue");
        color.add("red");
        color.add("green");
        color.add("red");
        color.add("violet");
        color.add("pink");
        System.out.println("LinkedList:" + color);
        System.out.println("First Element: " + color.getFirst());
        System.out.println("Second Element: " + color.getLast());
     

}
}
