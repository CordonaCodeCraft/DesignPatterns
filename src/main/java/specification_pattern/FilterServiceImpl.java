package specification_pattern;

import java.util.List;
import java.util.stream.Stream;

public class FilterServiceImpl implements FilterService<Product> {
	@Override
	public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
		return items.stream().filter(spec::isSatisfied);
	}
}
