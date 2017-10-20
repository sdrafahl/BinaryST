import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySTTest {

	@Test
	void testBinaryST() {
		BinaryST bst = new BinaryST();
		assertTrue(bst.size() == 0);
	}
	
	@Test
	void testBinarySTStringArray1() {
		String[] data = {"ABC", "AA", "BCA"};
		BinaryST bst = new BinaryST(data);
		assertTrue(bst.search("AA"));
	}
	
	@Test
	void testBinarySTStringArray2() {
		String[] data = {"ABC", "AA", "BCA"};
		BinaryST bst = new BinaryST(data);
		assertTrue(bst.search("BCA"));
	}
	
	@Test
	void testBinarySTStringArray3() {
		String[] data = {"ABC", "AA", "BCA"};
		BinaryST bst = new BinaryST(data);
		assertTrue(bst.search("ABC"));
	}
	
	@Test
	void testBinarySTStringArray4() {
		String[] data = {"ABC", "AA", "BCA"};
		BinaryST bst = new BinaryST(data);
		bst.add("CBA");
		assertTrue(bst.search("CBA"));
	}
	
	@Test
	void testBinarySTStringArray5() {
		String[] data = {"ABC", "AA", "BCA"};
		BinaryST bst = new BinaryST(data);
		bst.add("CBA");
		bst.remove("BCA");
		boolean flag1 = !bst.search("BCA");
		boolean flag2 = bst.search("CBA");
		assertTrue(flag1 && flag2);
	}
	
	@Test
	void testBinarySTStringArray6() {
		BinaryST bst = new BinaryST();
		bst.add("D");
		bst.add("C");
		bst.add("B");
		bst.add("BA");
		bst.add("E");
		bst.add("F");
		bst.add("G");
		int height = 4;
		assertTrue(bst.height() == height);
	}
	
	@Test
	void testBinarySTStringArray7() {
		BinaryST bst = new BinaryST();
		bst.add("D");
		bst.add("C");
		bst.add("B");
		bst.add("BA");
		bst.add("E");
		bst.add("F");
		bst.add("G");
		bst.add("GA");
		bst.add("A");
		bst.remove("F");
		int height = 4;
		int value = bst.height();
		assertTrue(value == height);
	}
	
	@Test
	void testBinarySTStringArray8() {
		BinaryST bst = new BinaryST();
		bst.add("D");
		bst.add("C");
		bst.add("E");
		bst.add("B");
		bst.add("CA");
		bst.remove("E");
		int height = 3;
		int value = bst.height();
		assertTrue(value == height);
	}
	
	@Test
	void testBinarySTStringArray9() {
		BinaryST bst = new BinaryST();
		bst.add("D");
		bst.add("C");
		bst.add("E");
		bst.add("B");
		bst.add("CA");
		bst.add("DA");
		bst.add("F");
		int quan = 7;
		int value = bst.size();
		assertTrue(value == quan);
	}
	
	@Test
	void testBinarySTStringArray10() {
		BinaryST bst = new BinaryST();
		bst.add("D");
		bst.add("C");
		bst.add("E");
		bst.add("B");
		bst.add("CA");
		bst.add("DA");
		bst.add("F");
		bst.remove("E");
		bst.remove("C");
		bst.remove("DA");
		bst.remove("B");
		int height = 2;
		int value = bst.height();
		assertTrue(value == height);
	}
	
	@Test
	void testBinarySTStringArray11() {
		BinaryST bst = new BinaryST();
		bst.add("D");
		bst.add("C");
		bst.add("E");
		bst.add("E");
		int unique = 3;
		int value = bst.distinctSize();
		assertTrue(value == unique);
	}
	
	@Test
	void testBinarySTStringArray12() {
		String[] data = {"ABC", "AA", "BCA", "AA"};
		BinaryST bst = new BinaryST(data);
		int unique = 3;
		int value = bst.distinctSize();
		assertTrue(value == unique);
	}
	
	@Test
	void testBinarySTStringArray15() {
		String[] data = {"ABC", "AA", "BCA", "AA", "Z", "AA", "AA", "DCA"};
		BinaryST bst = new BinaryST(data);
		int value = bst.frequency("AA");
		int freq = 4;
		assertTrue(value == freq);
	}
	
	@Test
	void testBinarySTStringArray16() {
		BinaryST bst = new BinaryST();
		bst.add("D");
		bst.add("C");
		bst.add("E");
		bst.add("B");
		bst.add("CA");
		bst.add("DA");
		bst.add("F");
		String[] inorder = bst.inOrder();
		String[] answer = {"B", "C", "CA", "D", "DA", "E", "F"};
		for(int x=0;x<inorder.length;x++) {
			if(!inorder[x].equals(answer[x])) {
				assertTrue(false);
			}
		}
		assertTrue(true);
	}
	
	@Test
	void testBinarySTStringArray17() {
		String[] data = {"A", "B", "AC", "C", "BA", "D"};
		BinaryST bst = new BinaryST(data);
		String[] inorder = bst.inOrder();
		String[] answer = {"A", "AC", "B", "BA", "C", "D"};
		for(int x=0;x<inorder.length;x++) {
			if(!inorder[x].equals(answer[x])) {
				assertTrue(false);
			}
		}
		assertTrue(true);
	}
	
	@Test
	void testBinarySTStringArray18() {
		String[] data = {"A","A" , "B", "AC", "AC" , "C", "BA", "D"};
		BinaryST bst = new BinaryST(data);
		String[] inorder = bst.inOrder();
		String[] answer = {"A", "A", "AC", "AC", "B", "BA", "C", "D"};
		for(int x=0;x<inorder.length;x++) {
			if(!inorder[x].equals(answer[x])) {
				assertTrue(false);
			}
		}
		assertTrue(true);
	}
	
	@Test
	void testBinarySTStringArray19() {
		BinaryST bst = new BinaryST();
		bst.add("D");
		bst.add("C");
		bst.add("E");
		bst.add("B");
		bst.add("CA");
		bst.add("DA");
		bst.add("F");
		int answer = 6;
		int input = bst.rankOf("F");
		assertTrue(answer == input);
	}
	
	@Test
	void testBinarySTStringArray20() {
		BinaryST bst = new BinaryST();
		bst.add("D");
		bst.add("C");
		bst.add("E");
		bst.add("B");
		bst.add("CA");
		bst.add("DA");
		bst.add("F");
		int answer = 2;
		int input = bst.rankOf("CA");
		assertTrue(answer == input);
	}
	
	@Test
	void testBinarySTStringArray21() {
		BinaryST bst = new BinaryST();
		bst.add("D");
		bst.add("C");
		bst.add("E");
		bst.add("B");
		bst.add("CA");
		bst.add("DA");
		bst.add("F");
		int answer = 3;
		int input = bst.rankOf("D");
		assertTrue(answer == input);
	}
	
	@Test
	void testBinarySTStringArray22() {
		BinaryST bst = new BinaryST();
		bst.add("D");
		bst.add("C");
		bst.add("E");
		bst.add("B");
		bst.add("CA");
		bst.add("DA");
		bst.add("F");
		bst.remove("B");
		int answer = 5;
		int input = bst.rankOf("F");
		assertTrue(answer == input);
	}
	
	@Test
	void testBinarySTStringArray23() {
		BinaryST bst = new BinaryST();
		bst.add("D");
		bst.add("C");
		bst.add("E");
		bst.add("B");
		bst.add("CA");
		bst.add("DA");
		bst.add("F");
		String[] preOrder = bst.preOrder();
		String[] answer = {"D", "C", "B", "CA", "E", "DA", "F"};
		for(int x=0;x<preOrder.length;x++) {
			if(!preOrder[x].equals(answer[x])) {
				assertTrue(false);
			}
		}
		assertTrue(true);
	}
	
	@Test
	void testBinarySTStringArray24() {
		BinaryST bst = new BinaryST();
		int answer = 0;
		int value = bst.size();
		int value1 = bst.distinctSize();
		assertTrue(value == value1 && value == answer);
	}
	
	@Test
	void testBinarySTStringArray25() {
		BinaryST bst = new BinaryST();
		bst.add("D");
		bst.add("C");
		bst.add("E");
		bst.add("B");
		bst.add("CA");
		bst.add("DA");
		bst.add("F");
		bst.add("C");
		int value = bst.rankOf("E");
		int answer = 5;
		assertTrue(value == answer);
	}
	
	@Test
	void testBinarySTStringArray26() {
		BinaryST bst = new BinaryST();
		bst.add("D");
		bst.add("C");
		bst.add("E");
		bst.add("B");
		bst.add("CA");
		bst.add("DA");
		bst.add("F");
		bst.add("C");
		bst.remove("D");
		int answer = 4;
		int value = bst.height();
		assertTrue(value == answer);
	}
	
	@Test
	void testBinarySTStringArray27() {
		BinaryST bst = new BinaryST();
		bst.add("D");
		bst.add("C");
		bst.add("E");
		bst.add("B");
		bst.add("CA");
		bst.add("DA");
		bst.add("F");
		bst.add("C");
		bst.remove("D");
		bst.remove("DA");
		int answer = 3;
		int value = bst.rankOf("E");
		assertTrue(value == answer);
	}
	
	@Test
	void testBinarySTStringArray28() {
		BinaryST bst = new BinaryST();
		bst.add("D");
		bst.add("C");
		bst.add("E");
		bst.add("B");
		bst.add("CA");
		bst.add("DA");
		bst.add("F");
		bst.add("C");
		bst.remove("D");
		bst.remove("DA");
		bst.add("D");
		bst.add("D");
		bst.add("D");
		int answer = 3;
		int value = bst.frequency("D");
		assertTrue(value == answer);
	}
	
	@Test
	void testBinarySTStringArray29() {
		BinaryST bst = new BinaryST();
		bst.add("D");
		bst.add("C");
		bst.add("E");
		bst.add("B");
		bst.add("CA");
		bst.add("DA");
		bst.add("F");
		bst.add("C");
		bst.remove("D");
		bst.remove("DA");
		bst.add("D");
		bst.add("D");
		bst.add("D");
		bst.remove("D");
		int answer = 2;
		int value = bst.frequency("D");
		assertTrue(value == answer);
	}
	
}
