public class privateaccessmodifier {
    public static void main(String[] args){
        Data d = new Data();
        d.setName("Sisam");
        System.out.println(d.getName());
    }
}
class Data{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
