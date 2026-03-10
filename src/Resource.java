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
        this.allocated=false;
        this.department="";
    }
}
