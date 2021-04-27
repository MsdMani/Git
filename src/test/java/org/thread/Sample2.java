package org.thread;

import org.testng.annotations.Test;

public class Sample2 {
	@Test
	private void tc31() {
		System.out.println("Test3 Thread Count:"+Thread.currentThread().getId());
		
	}
	@Test
	private void tc32() {
		System.out.println("Test3 Thread Count:"+Thread.currentThread().getId());
	}
	@Test
	private void tc33() {
		System.out.println("Test3 Thread Count:"+Thread.currentThread().getId());

}
}