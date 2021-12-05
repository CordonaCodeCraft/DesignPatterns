package specification_pattern;

import specification_pattern.FilterService;
import specification_pattern.Product;
import specification_pattern.Specification;

import java.util.List;
import java.util.stream.Stream;

public class FilterServiceImpl implements FilterService<Product> {
	@Override
	public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
		return items.stream().filter(spec::isSatisfied);
	}
}
