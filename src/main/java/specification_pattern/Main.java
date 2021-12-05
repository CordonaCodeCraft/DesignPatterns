package specification_pattern;

import java.util.List;

import static specification_pattern.Product.Color.BLUE;
import static specification_pattern.Product.Color.GREEN;
import static specification_pattern.Product.Size.*;

public class Main {

	public static void main(String[] args) {
		final Product apple = new Product("Apple", GREEN, SMALL);
		final Product tree = new Product("Tree", GREEN, LARGE);
		final Product house = new Product("House", BLUE, HUGE);

		final List<Product> products = List.of(apple, tree, house);

		final ColorSpecification colorSpec = new ColorSpecification(GREEN);
		final SizeSpecification sizeSpec = new SizeSpecification(LARGE);
		final AndSpecification andSpecification = new AndSpecification(colorSpec, sizeSpec);
		final FilterServiceImpl filter = new FilterServiceImpl();

//		filter.filter(products, colorSpec).forEach(i -> System.out.println(i.getName()));

		filter.filter(products, andSpecification).forEach(i -> System.out.println(i.getName()));

	}
}
