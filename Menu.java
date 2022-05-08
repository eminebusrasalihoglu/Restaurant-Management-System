import java.util.ArrayList;

public class Menu{
    private double price;
    private String name;
    ArrayList<Food> foodList= new ArrayList<Food>();
    ArrayList<Beverages> beverageList= new ArrayList<Beverages>();

    public Menu(){
        this(0,"no information");
    }
    public Menu(double price,String name){

        this.price = price;
        this.name = name;
    }
    void addFood(Food a){
        foodList.add(a);
    }

    void addBeverage(Beverages a){
        beverageList.add(a);
    }



    public void showMenu(){
        System.out.println("   FOOD ");
        for(int i=0;i<foodList.size();i++){
            System.out.println((i+1)+") "+foodList.get(i).getCategory()+" "+foodList.get(i).getName()+" price"+foodList.get(i).getPrice());
        }
        System.out.println("   BEVERAGES ");
        for(int i = foodList.size();i<(beverageList.size()+foodList.size());i++){
            System.out.println((i+1)+") "+beverageList.get(i-foodList.size()).getName()+" price"+beverageList.get(i-foodList.size()).getPrice()+"-->"+beverageList.get(i-foodList.size()).getMl()+" ml");
        }
    }





    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}