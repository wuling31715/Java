import java.util.ArrayList;

class Color{
    public static void main(String[] args){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("gold");
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.remove(2);
        System.out.println(colors);
        System.out.println(colors.size());
        colors.add(3, "cyan");
        System.out.println(colors);
        for (int i = 0; i < colors.size(); i++){
            System.out.println(i + " = " + colors.get(i));
        }
    }
}