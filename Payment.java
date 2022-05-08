import java.util.ArrayList;

public class Payment {
    private static double dailyEarnings = 0;
    ArrayList<Integer> tableList = new ArrayList<Integer>();
    ArrayList<Double> tableList2 = new ArrayList<Double>();
    public Payment() {

    }
    public void payments(double budget, double acc){
        if(budget<acc){
            System.out.println("Insufficient amount");
        }
       else{
           double remainder =  budget - acc;
            System.out.println("The remaining amount"+ remainder);
    }}
    public void daily(double revenues){
        dailyEarnings += revenues;
    }

    public double getDailyEarnings(){
        return dailyEarnings;
    }

    public void setDailyEarnings(double dailyEarnings) {
        this.dailyEarnings = dailyEarnings;
    }
    void addTable(int myTable,double myAcc){
        tableList.add(myTable);
        tableList2.add(myAcc);
    }
    void deleteTable(int myTable){
        tableList.remove(myTable);
        tableList2.remove(myTable);

    }
    void showTable(){
        if(tableList.size()==0){
            System.out.println("No full tables");
        }
        else{
            for(int i=0;i<tableList.size();i++){
                System.out.println("Table "+tableList.get(i)+" = "+tableList.get(i));
            }}
    }
}
