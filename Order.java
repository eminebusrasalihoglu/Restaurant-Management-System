import java.util.ArrayList;

public class Order {
    private int tableNumber;
    static int total = 0;
    ArrayList<String> orderList=new ArrayList<>();
    ArrayList<Double> orderList1=new ArrayList<>();

    public Order(){
        this(0);
    }
    public Order(int tableNumber) {
        this.tableNumber = tableNumber;
    }
    public void showBill(){
        System.out.println("   Order   ");
        for(int i=0;i<orderList.size();i++){
            System.out.println( (i+1)+orderList.get(i)+ " ----->"+ orderList1.get(i));
        }

    }
    void orderProduct(String b){
        orderList.add(b);
    }
    void orderPrice(double b){
        orderList1.add(b);
    }
    void removeOrder(int c){
        orderList.remove(c);
        orderList1.remove(c);
    }
    public void deleteOrder(){
        orderList1.clear();
        orderList.clear();
    }


    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Order.total = total;
    }

    public int orderResult(double price){
    total+=price;
return total;
}
}