//Generic Method to print arrays

public class TestGenerics {
    public <E> void  printArray(E[] elements){
        for(E element: elements){
            System.out.println(element);
        }
        System.out.println("");

    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        Character[] chararr = {'G', 'L','O', 'R', 'R','Y'};
        TestGenerics t = new TestGenerics();
        t.printArray(arr);
        t.printArray(chararr);
    }
}
