package specification_pattern;


public class AndSpecification implements Specification<Product> {
	private final Specification<Product> first;
	private final Specification<Product> second;

	public AndSpecification(final Specification<Product> first, final Specification<Product> second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public boolean isSatisfied(final Product item) {
		return first.isSatisfied(item) && second.isSatisfied(item);
	}
}
