package fun.learn.service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import fun.learn.object.Apple;

public class AppleService {

	public List<Apple> filterByAction(List<Apple> orgApples, Predicate<Apple> predicate) {
		return orgApples.stream().filter(predicate).collect(Collectors.toList());
	}
}
