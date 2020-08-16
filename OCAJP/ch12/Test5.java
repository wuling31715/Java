class Super{
    int x = 0;
}
class Test5 extends Super{
    int y = 1;
    public static void main(String[] args){
        Test5 t5 = new Test5();
        System.out.println(t5.x);
        System.out.println(t5.y);
        Super s = new Test5();
        System.out.println(s.x);        
        // System.out.println(s.y);  error
    }
}