public class TestGeneric2 {
    public <T> T m(T anyType){
        return anyType;
    }

    public static void main(String[] args) {
        TestGeneric2 test = new TestGeneric2();
        String s = test.m("hello");
        System.out.println(s);
        int n = test.m(5);
        System.out.println(n);
        //generic
        
    }
    
}
