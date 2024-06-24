import java.util.LinkedList;
class addFirst_addLast{
    public static void main(String args[]){
        LinkedList <String> color=new LinkedList<>();
        color.add("red");
        color.add("black");
        color.add("white");
        color.add("green");
        System.out.println("LinkedList: " + color);
        color.addFirst("pink");
        System.out.println("First Element:" + color);
        color.addLast("violet");
        System.out.println("Second Element:" + color);
      
       



    }
}

