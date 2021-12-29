package specification_pattern;

public interface Specification<T> {
	boolean isSatisfied(T item);
}
