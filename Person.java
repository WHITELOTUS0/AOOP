import java.io.*;

class Person implements Externalizable {
    private String name;
    private int age;
    
    public Person() {
        // Required no-argument constructor
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        // Custom serialization logic
        out.writeObject(name);
        out.writeInt(age);
    }
    
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // Custom deserialization logic
        name = (String) in.readObject();
        age = in.readInt();
    }
    
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

class SerializationExample {
    public static void main(String[] args) {
        String filename = "person.ser";
        
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            Person person = new Person("John Doe", 30);
            oos.writeObject(person);
            System.out.println("Object serialized and saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Person person = (Person) ois.readObject();
            System.out.println("Object deserialized: " + person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
