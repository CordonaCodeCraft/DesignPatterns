package specification_pattern;

import java.util.List;
import java.util.stream.Stream;

public interface FilterService<T> {
	Stream<T> filter(List<T> items, Specification<T> spec);
}
