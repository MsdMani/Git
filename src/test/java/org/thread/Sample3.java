package org.thread;

import org.testng.annotations.Test;

public class Sample3 {
	@Test
	private void tc41() {
	System.out.println("Test2 Thread Count:"+Thread.currentThread().getId());

	}
	@Test
	private void tc42() {
	System.out.println("Test2 Thread Count:"+Thread.currentThread().getId());

}
	@Test
	private void tc43() {
	System.out.println("Test2 Thread Count:"+Thread.currentThread().getId());
}
}