/*An online shopping cart is a collection of items that a shopper uses to collect things for purchase. A shopper can add items to the cart, remove them, empty the cart, view the items in the cart, and end shopping and proceed to checkout.
Using the Java ArrayList class, you will write a program to support these functions. Each item added to the cart will be represented with the CartItem class (se attached .java files).

When your program begins, you will display a menu of actions the shopper can perform:

SHOPPING CART OPTIONS
1 add an item to your cart
2 remove an item from your cart
3 view the items in your cart
4 end shopping and go to checkout
5 empty your cart
6 exit the program

Your program will allow the shopper to add and remove items to the shopping cart. The program should continue as long as the shopper want to keep going. The shopper can exit by choosing option 6, and in this case the shopper will exit without making a purchase. The shopper can also exit by selecting option 4, and go to checkout. I
*/

package objectAssignment;
import java.util.*;
public class Shopping {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Item> obj=new ArrayList<Item>();
		int count=0;
		boolean flag=true;
		while(flag) {
		System.out.println("Enter Shoping option");
		System.out.println("SHOPPING CART OPTIONS\r\n"
				+ "1 add an item to your cart\r\n"
				+ "2 remove an item from your cart\r\n"
				+ "3 view the items in your cart\r\n"
				+ "4 end shopping and go to checkout\r\n"
				+ "5 empty your cart\r\n"
				+ "6 exit the program\r\n"
				+"7 to see no of items in your cart\r\n");
		int option=sc.nextInt();
		switch(option) {
			case 1:
				count++;
				System.out.println("Enter item name");
				sc.nextLine();
				String n=sc.nextLine();
				System.out.println("Enter item price");
				int p=sc.nextInt();
				obj.add(new Item(p,n));
				break;
			case 2:
				System.out.println("enter name of item you want to remove");
				sc.nextLine();
				String name=sc.nextLine();
				for(Item x:obj) {
					if(name.equals(x.item_name)) {
						obj.remove(x);
						System.out.println("item removed is :"+x.item_name);
					}
				}
				break;
			case 3:
				System.out.println("Items in your cart are displayed");
				System.out.println();
				for(Item x:obj) {
					System.out.println("item name: "+x.item_name+" price :"+x.price);
					}
				break;
			case 4:
				int total=0;
				for(Item x:obj) {
					total=total+x.price;
				}
				System.out.println("total amount you need pay :"+total);
				break;
			case 5:
				obj.clear();
				System.out.println("all items are removed");
				count=0;
				break;
			case 6:
				flag=false;
				break;
			case 7:
				System.out.println("items in your cart is :"+count);
		}
		}
	}
}


class Item{
	int price;
	String item_name;
	Item(int price,String item){
		this.price=price;
		item_name=item;
	}
}


















