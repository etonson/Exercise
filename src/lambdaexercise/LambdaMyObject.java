package lambdaexercise;

import java.util.Arrays;
import java.util.Comparator;

class Product {
	private String name;
	private int price;
	private int qty;

	public Product(String _name, int _price, int _qty) {
		name = _name;
		price = _price;
		qty = _qty;
	}

	public int getTotal() {
		return price * qty;
	}

	public void show() {
		System.out.println(name + "\t" + price + "\t" + qty + "\t" + getTotal() + "\t");
	}
}

class ProductComparator implements Comparator<Product> {
	public int compare(Product o1, Product o2) {
		int a, b, r = 1;
		a = o1.getTotal();
		b = o1.getTotal();
		if (a > b) {
			r = 1;
		} else if (a == b) {
			r = 0;
		} else {
			r = -1;
		}
		return r;
	}
}

public class LambdaMyObject {
	public static void main(String[] args) {
		Product[] p = new Product[] { new Product("火影忍者", 120, 77), new Product("海賊王", 1000, 88),
				new Product("多拉A夢", 120, 99), new Product("小丸子", 560, 99) };
		Arrays.sort(p, new ProductComparator());
		System.out.println("品名 \t 價格 \t 數量 \t 金額 \t名次");
		System.out.println("--------------------------------");
		for (int i = p.length - 1, k = 1; i >= 0; i--, k++) {
			p[i].show();
			System.out.print(k);
		}
	}
}
