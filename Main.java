import java.util.Scanner;
/**
 * @author EmineBüşraSalihoğlu
 */
public class Main {
    public static void main(String[] args) {
        Menu menu1 = new Menu();//menuye eklecek olan nesneler
        Menu food1 = new Food(40,"Tas kebabı","Osmanlı Mutfagı");
        Menu food2 = new Food(40,"Kuzu guvec","Osmanlı Mutfagı");
        Menu food3 = new Food(40,"Dana haslama","Osmanlı Mutfagı");
        Menu food4 = new Food(30,"Akdeniz Salatası","Salata");
        Menu food5 = new Food(30,"Sezar Salata","Salata");
        Menu food6 = new Food(30,"Spagetti Blonez","Dünya Mutfagı");
        Menu food7 = new Food(40,"Beff Tagliatelli","Dünya Mutfagı");
        Menu food8 = new Food(30,"Kori soslu Tavuk","Dünya Mutfagı");
        Menu beverage1 = new Beverages(3,"Su",200);
        Menu beverage2 = new Beverages(5,"Cola",250);
        Menu beverage3 = new Beverages(5,"Soda",200);
        Menu beverage4 = new Beverages(5,"Salgam suyu",300);
        Order order1 = new Order(0);
        Payment payment1 = new Payment();
        menu1.addFood((Food) food1);
        menu1.addFood((Food) food2);
        menu1.addFood((Food) food3);
        menu1.addFood((Food) food4);
        menu1.addFood((Food) food5);
        menu1.addFood((Food) food6);
        menu1.addFood((Food) food7);
        menu1.addFood((Food) food8);
        menu1.addBeverage((Beverages) beverage1);
        menu1.addBeverage((Beverages) beverage2);
        menu1.addBeverage((Beverages) beverage3);
        menu1.addBeverage((Beverages) beverage4);
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        boolean flagOne = true;
         while(flagOne){
        System.out.println("Press 1 to add table \nPress 2 to remove table\nPress 3 to show table\npress 1 to exit");
        int entrance = input.nextInt();
       if(entrance == 1){
        System.out.println("Enter table number ==>");
        int myTable = input.nextInt();
        order1.setTableNumber(myTable);//odeme classındaki masaNo yu bizim istedigimiz olarak alır
        int selection;
        int selection2;
        int selection3;
        menu1.showMenu();
        System.out.println("Enter product number = \nPress 0 to exit");
        flag = true;
        while(flag){
            System.out.println("Product Number ==>");
            selection = input.nextInt();
           if(selection == 0){
                flag = false;
            }
            else if (selection>12){
                System.out.println("Invalid Option");
            }
            else{
                if(selection == 1){
                    order1.orderResult(food1.getPrice());
                    order1.orderProduct(food1.getName());
                    order1.orderPrice(food1.getPrice());
                }
                else if(selection == 2){
                    order1.orderResult(food2.getPrice());
                  order1.orderProduct(food2.getName());
                   order1.orderPrice(food2.getPrice());
                }
                else if(selection == 3){
                    order1.orderResult(food3.getPrice());
                    order1.orderProduct(food3.getName());
                    order1.orderPrice(food3.getPrice());
                }
                else if(selection == 4){
                    order1.orderResult(food4.getPrice());
                    order1.orderProduct(food4.getName());
                    order1.orderPrice(food4.getPrice());
                }
                else if(selection == 5){
                    order1.orderResult(food5.getPrice());
                    order1.orderProduct(food5.getName());
                    order1.orderPrice(food5.getPrice());
                }
                else if(selection == 6){
                    order1.orderResult(food6.getPrice());
                    order1.orderProduct(food6.getName());
                    order1.orderPrice(food6.getPrice());
                }
                else if(selection == 7){
                    order1.orderResult(food7.getPrice());
                    order1.orderProduct(food7.getName());
                    order1.orderPrice(food7.getPrice());
                }
                else if(selection == 8){
                    order1.orderResult(food8.getPrice());
                    order1.orderProduct(food8.getName());
                    order1.orderPrice(food8.getPrice());
                }
                else if(selection == 9){
                    order1.orderResult(beverage1.getPrice());
                    order1.orderProduct(beverage1.getName());
                    order1.orderPrice(beverage1.getPrice());
                }
                else if(selection == 10){
                    order1.orderResult(beverage2.getPrice());
                    order1.orderProduct(beverage2.getName());
                    order1.orderPrice(beverage2.getPrice());
                }
                else if(selection == 11){
                    order1.orderResult(beverage3.getPrice());
                    order1.orderProduct(beverage3.getName());
                    order1.orderPrice(beverage3.getPrice());
                }
                else if(selection == 12){
                    order1.orderResult(beverage4.getPrice());
                    order1.orderProduct(beverage4.getName());
                    order1.orderPrice(beverage4.getPrice());
                }
        }
      }

        order1.showBill();
        System.out.println("Total price of table-"+order1.getTableNumber()+"==>"+order1.getTotal());
        System.out.println("Press 1 to remove product,press 0 to continue");
         selection2=input.nextInt();
        if(selection2 == 1) {
            flag = true;

            while (flag) {
                System.out.println("Enter the number of the product you want to remove from your order list \nPress 0 to exit");
                selection3 = input.nextInt();
                if (selection3 == 0) {
                    flag = false;
                } else {
                    order1.orderResult(-(order1.orderList1.get(selection3 - 1)));
                    order1.removeOrder((selection3 - 1));
                }
            }
        }
        order1.showBill();
        System.out.println("Total price "order1.getTableNumber() + "==>" + order1.getTotal());
        payment1.daily(order1.getTotal());
        payment1.addTable(order1.getTableNumber(),order1.getTotal());
        order1.setTotal(0);
        order1.deleteOrder();
        }

        else if(entrance==2){//masa silip hesasın odenmesi icin gereken blogtur
           System.out.println("Enter the table number to be paid==>");
           int selection4 = input.nextInt();
           int a = payment1.tableList.indexOf(selection4);//masa numarasinin indexi bulunur
           System.out.println("Amount to be paid ==> "+payment1.tableList2.get(a));
            System.out.println("Amount Paid ==> ");
            double budget=input.nextDouble();
            payment1.payments(budget,payment1.tableList2.get(a));
           payment1.deleteTable(a);
    }
        else if(entrance==3){
            payment1.showTable();
           System.out.println("Total revenue-->"+payment1.getDailyEarnings());
           System.out.println("\n");
        }
        else{
            flagOne=false;
        }


        }
    }
}