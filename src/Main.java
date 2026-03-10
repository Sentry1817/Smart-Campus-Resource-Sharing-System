import java.util.Scanner;

class Resource
{
    int id;
    String name;
    boolean allocated;
    String department;

    Resource(int id,String name)
    {
        this.id=id;
        this.name=name;
        allocated=false;
        department="";
    }
}

public class Main
{
    public static void main(String args[])
    {
        Resource resources[]=new Resource[3];

        resources[0]=new Resource(1,"Projector");
        resources[1]=new Resource(2,"Laptop");
        resources[2]=new Resource(3,"Lab Equipment");

        for(int i=0;i<3;i++)
        {
            System.out.println(resources[i].id+" "+resources[i].name+" Available:"+!resources[i].allocated);
        }
    }
}
