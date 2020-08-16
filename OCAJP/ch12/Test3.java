class Test3{
    public String toString() {
        return "override";
    }
    public static void main(String[] args){
        Test3 t3 = new Test3();
        System.out.println(t3);
        System.out.println(t3.toString());        
    }
}