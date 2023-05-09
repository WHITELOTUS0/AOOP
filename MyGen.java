//Generic Class
public class MyGen<T> {
    T number;
    MyGen(T number){
        this.number=number;
    }

    public T getNumber(){
        return number;
    }

    public static void main(String[] args) {
        MyGen<Integer> obj= new MyGen<Integer>(3);
        System.out.println(obj.getNumber());
        MyGen<Double> obj2 = new MyGen<Double>(2.5);
        System.out.println(obj2.getNumber());

    }
    
}
