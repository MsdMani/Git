package org.thread;

import org.testng.annotations.Test;

public class Sample {
@Test
private void tc10() {
	System.out.println("Test1 Thread count:"+Thread.currentThread().getId());

}
@Test
private void tc11() {
	System.out.println("Test1 Thread count:"+Thread.currentThread().getId());

}
@Test
private void tc12() {
	System.out.println("Test1 Thread count:"+Thread.currentThread().getId());
}
}