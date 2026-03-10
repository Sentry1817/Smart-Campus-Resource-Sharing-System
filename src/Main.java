import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ResourceManager rm=new ResourceManager();

        rm.addResource(1,"Projector");
        rm.addResource(2,"Laptop");
        rm.addResource(3,"Lab Equipment");

        rm.displayResources();
    }
}
