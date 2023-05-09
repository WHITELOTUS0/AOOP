//Generic Method to print arrays

public class TestGenerics {
    public <E> void  printArray(E[] elements){
        for(E element: elements){
            System.out.println(element);
        }

    }
}
