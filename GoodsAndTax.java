
import java.util.ArrayList;
import java.util.List;

class Goods {
int S_No;
String Product;
int Prize, GST, Qnt;

public Goods(int S_No, String Product, int Prize, int GST, int Qnt) {
 this.S_No = S_No;
this.Product = Product;
 this.Prize = Prize;
this.GST = GST;
this.Qnt = Qnt;
 }
}

class Product {
 String product;
int Gst_val;

public Product(String product, int Gst_val) {
this.product = product;
 this.Gst_val = Gst_val;
}
}

public class GoodsAndTax {
 public static void main(String[] args) {
List<Goods> list = new ArrayList<Goods>();
int sum = 0, max = 0;
String name=null;
Goods g1 = new Goods(1, "Leather_Wallet", 1100, 18, 1);
Goods g2 = new Goods(2, "Umbrella", 900, 12, 4);
 Goods g3 = new Goods(3, "Cigarette", 200, 28, 3);
Goods g4 = new Goods(4, "Honey", 100, 0, 2);

list.add(g1);
list.add(g2);
 list.add(g3);
 list.add(g4);
List<Product> p_list = new ArrayList<Product>();

for (Goods g : list) {
 int val = (g.Prize * g.GST) / 100;
 Product p1 = new Product(g.Product, val);
p_list.add(p1);

if (g.Prize >= 500) {
sum += ((g.Prize * g.Qnt) - (((g.Prize * g.Qnt) * 5) / 100)) + val;
 } else {
 sum += (g.Prize * g.Qnt) + val;
}
 }

 for (Product p : p_list) {
 if (p.Gst_val > max) {
max = p.Gst_val;
name = p.product;
}
 }
 System.out.println("Product for which we paid maximum GST amount: " + name);
 System.out.println("Total amount to be paid to the shop keeper: " + sum);

 }
}