package serialization;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;   
class Person implements Serializable   
{   
    transient String name = " ";  
    public Person(String name)    
    {   
        this.name = name;   
    }         
}   
// class Employee extends Person  
// {   
//     float salary;  
//     public Employee(String name, float salary)    
//     {   
//         super(name);   
//         this.salary = salary;   
//     }   
//     private void writeObject(ObjectOutputStream out) throws IOException   
//     {   
//         throw new NotSerializableException();   
//     }   
//     private void readObject(ObjectInputStream in) throws IOException   
//     {   
//         throw new NotSerializableException();   
//     }   
        
// }   
public class LearnSerialization   
{   
    public static void main(String[] args)
            throws Exception
    {
        //Create an object 
        Person emp = new Person("Danish Ahmad Alhamdullilah");

        //Serailize the object and store in a file
        FileOutputStream fos = new FileOutputStream("src\\main\\java\\com\\oracle\\learn\\output.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos); //Serializer
        oos.writeObject(emp);  //MOST IMPORTANT STEP
                
        oos.close();
        fos.close();
                
        System.out.println("Object has been serialized");

        //Deserialize the object from the File
        FileInputStream fis = new FileInputStream("src\\main\\java\\com\\oracle\\learn\\output.txt");
        ObjectInputStream ois = new ObjectInputStream(fis); //DeSerializer
        Person p = (Person)ois.readObject(); //read the de serialized object and store in p
        ois.close();
        fis.close();
        System.out.println("Object has been deserialized");
        System.out.println("name = " + p.name);
    }
}