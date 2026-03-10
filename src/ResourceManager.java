class ResourceManager
{
    Resource resources[]=new Resource[10];
    int count=0;

    void addResource(int id,String name)
    {
        resources[count++]=new Resource(id,name);
    }

    void displayResources()
    {
        for(int i=0;i<count;i++)
        {
            System.out.println(resources[i].id+" "+resources[i].name+" "+resources[i].allocated);
        }
    }
}
