package mvn_sales;

import org.testng.annotations.Test;

public class SampleTest {
	
	@Test(groups="smoke")
	public void create()
	{
		System.out.println("created successfully");
	}
	@Test(groups="regression")
	public void modify()
	{
		System.out.println("modified regression");
	}
	@Test
	public void nayeem() {
		System.out.println("love from india");
	}

}
