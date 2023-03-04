public class DataUser extends Print{
 final int id;
 String name;

    public DataUser(int id ,String name )    {
        this.id = id;
        this.name = name;
    }


    @Override
    public void print(String name) {
        super.print(name);
        System.out.println("Name"+ name);
        System.out.println("ID"+ id);
    }

   public  int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
