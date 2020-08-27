import java.util.List;
import java.util.ArrayList;

class Test4{
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add("Robb");
        names.add("Jim");
        names.add("Ricky");
        names.add("Jim");
        if (names.remove("Jim")){
            System.out.println(names.remove("Tom"));  
        }
        System.out.println(names);
    }
}