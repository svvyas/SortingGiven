package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

//import junit.framework.Assert;
import main.java.Item;
import org.junit.Assert;
import main.java.SortAlgos;

@SuppressWarnings("unused")
public class AlgoTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testEmptyArray() {
		Item[] arr = {};
		int len = arr.length;
		SortAlgos.bubbleSort(arr);
		assertEquals(len, arr.length);
	}

	@Test
	public void testSingleElement() {
		Item i1 = new Item(1);
		Item[] arr = {i1};
		int key = i1.key;
		SortAlgos.bubbleSort(arr);
		assertEquals(key,arr[0].key);
	}

	@Test
	public void testNodeCoverage() {
		int[] iarr = {4,1,5,8};
		int[] isarr = {1,4,5,8};
		Item it = null;
		Item[] arr = new Item[iarr.length];
		for(int i = 0; i < iarr.length; i++) {
			it = new Item(iarr[i]);
			arr[i] = it;
		}
		SortAlgos.bubbleSort(arr);

		assertEquals(isarr[0], arr[0].key);
		assertEquals(isarr[1], arr[1].key);
		assertEquals(isarr[2], arr[2].key);
		assertEquals(isarr[3], arr[3].key);
	}

	@Test(expected = NullPointerException.class)
	public void testEdgeCoverage() {
		Item[] arr = null;
		SortAlgos.bubbleSort(arr);
	}

	@Test
	public void testConditionCoverage() {
		int[] iarr = {5,3,7,1,2,4};
		int[] isarr = {1,2,3,4,5,7};
		Item it = null;
		Item[] arr = new Item[iarr.length];
		for(int i = 0; i < iarr.length; i++) {
			it = new Item(iarr[i]);
			arr[i] = it;
		}
		SortAlgos.bubbleSort(arr);

		assertEquals(isarr[0], arr[0].key);
		assertEquals(isarr[1], arr[1].key);
		assertEquals(isarr[2], arr[2].key);
		assertEquals(isarr[3], arr[3].key);
		assertEquals(isarr[4], arr[4].key);
		assertEquals(isarr[5], arr[5].key);
	}
	@Test
	public void testSelection() {
		int[] iarr = {9,4,2,1,7};
		int[] isarr = {1,2,4,7,9};
		Item it = null;
		Item[] arr = new Item[iarr.length];
		for(int i = 0; i < iarr.length; i++) {
			it = new Item(iarr[i]);
			arr[i] = it;
		}

		SortAlgos.selectionSort(arr);

		assertEquals(isarr[0], arr[0].key);
		assertEquals(isarr[1], arr[1].key);
		assertEquals(isarr[2], arr[2].key);
		assertEquals(isarr[3], arr[3].key);
		assertEquals(isarr[4], arr[4].key);
	}

	@Test
	public void testInsertion() {
		int[] iarr = {3,6,1,8,4};
		int[] isarr = {1,3,4,6,8};
		Item it = null;
		Item[] arr = new Item[iarr.length];
		for(int i = 0; i < iarr.length; i++) {
			it = new Item(iarr[i]);
			arr[i] = it;
		}
		SortAlgos.insertionSort(arr);

		assertEquals(isarr[0], arr[0].key);
		assertEquals(isarr[1], arr[1].key);
		assertEquals(isarr[2], arr[2].key);
		assertEquals(isarr[3], arr[3].key);
		assertEquals(isarr[4], arr[4].key);
	}
	@Test
	public void testMerge() {
		int[] iarr = {2,5,3,1,10};
		int[] isarr = {1,2,3,5,10};
		Item it = null;
		Item[] arr = new Item[iarr.length];
		for(int i = 0; i < iarr.length; i++) {
			it = new Item(iarr[i]);
			arr[i] = it;
		}
		SortAlgos.mergeSort(arr);

		assertEquals(isarr[0], arr[0].key);
		assertEquals(isarr[1], arr[1].key);
		assertEquals(isarr[2], arr[2].key);
		assertEquals(isarr[3], arr[3].key);
		assertEquals(isarr[4], arr[4].key);
	}
	@Test
	public void testQuick() {
		int[] iarr = {-3,-5,0,10,99,-34};
		int[] isarr = {-34,-5,-3,0,10,99};
		Item it = null;
		Item[] arr = new Item[iarr.length];
		for(int i = 0; i < iarr.length; i++) {
			it = new Item(iarr[i]);
			arr[i] = it;
		}
		SortAlgos.quickSort(arr);

		assertEquals(isarr[0], arr[0].key);
		assertEquals(isarr[1], arr[1].key);
		assertEquals(isarr[2], arr[2].key);
		assertEquals(isarr[3], arr[3].key);
		assertEquals(isarr[4], arr[4].key);
		assertEquals(isarr[5], arr[5].key);
	}

	@Test
	public void testHeap() {
		int[] iarr = {-4, -33, 0, -55, -21, -9, -65};
		int[] isarr = {-65, -55, -33, -21, -9, -4, 0};
		Item it = null;
		int len = iarr.length;
		Item[] arr = new Item[len];
		for(int i = 0; i < len; i++) {
			it = new Item(iarr[i]);
			arr[i] = it;
		}
		SortAlgos.heapSort(arr);
		for(int i = 0; i < len; i++) {
			assertEquals(isarr[i], arr[i].key);
		}
	}

}
