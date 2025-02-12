class KeerthiException extends Exception {
    public KeerthiException(String string) {
        super(string);
    }
}

public class Demo {
    static int i = 20;
    static int j = 0;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            j = 18 / i;
            if (j == 0)
                throw new KeerthiException("getting output");
        } catch (KeerthiException e) {
            j = 18 / i;
            System.out.println("thats the default output"+ e);
        } catch (Exception e) {
            j = 18 / i;
            System.out.println("thats the default output");
        }
    }
}





