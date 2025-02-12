class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Park");
    }
}
public class Example
{
    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args){
        A obj=new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
