package learn.example.one.util;

import java.util.ArrayList;
import java.util.List;

import learn.example.one.object.Apple;
import learn.example.one.service.AppleService;

public class AppleUtil {

	private static final Integer WEIGHT_LINE = 100;
	private AppleService appleService = new AppleService();
	private List<Apple> allApples = getAllApples();

	public List<Apple> filterRedApples() {
		return this.appleService.filterByAction(allApples, (Apple a) -> "RED".equals(a.getColor()));
	}

	public List<Apple> filterGreenApples() {
		return this.appleService.filterByAction(allApples, (Apple a) -> "GREEN".equals(a.getColor()));
	}

	public List<Apple> filterHeavyApples() {
		return this.appleService.filterByAction(allApples, (Apple a) -> a.getWeight() > WEIGHT_LINE);
	}

	public List<Apple> filterRedAndHeavyApples() {
		return this.appleService.filterByAction(allApples,
				(Apple a) -> "RED".equals(a.getColor()) && a.getWeight() > WEIGHT_LINE);
	}

	public List<Apple> getAllApples() {
		this.allApples = new ArrayList<Apple>();
		// TODO
		return allApples;
	}
}
