/**
 * @Decription TODO
 * @Date 2023��2��2��
 */
package com.fengdi.pojo;

import org.junit.Test;

/**
 * @author hdm
 * @description TODO
 * @Date 2023��2��2��
 */
public class MetricsTest {

	/**
	 * Test method for {@link com.fengdi.pojo.Metrics#toString()}.
	 */
	@Test
	public void testToString() {
		Metrics metrics = new Metrics("cpu", (float) Math.random());
		metrics.setLabels("plateform", "windows");
		System.out.println(metrics.toString());
	}

}
