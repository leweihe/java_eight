package learn.example.one.test;

import org.junit.Test;

import learn.example.one.util.AppleUtil;

public class FilterAppleTest {

	@Test
	public void filterAppleTest() {
		AppleUtil.printAppleInComplexWay(AppleUtil.filterHeavyApples(AppleUtil.getAllApples()));
		AppleUtil.printAppleInSimpleWay(AppleUtil.filterHeavyApples(AppleUtil.getAllApples()));
	}
}
