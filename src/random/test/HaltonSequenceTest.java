package random.test;

import org.apache.commons.math3.random.HaltonSequenceGenerator;
/*
 * author:合肥工业大学 管院学院 钱洋 
 *1563178220@qq.com
 *博客地址:http://blog.csdn.net/qy20115549/
*/
public class HaltonSequenceTest {

	public static void main(String[] args) {
		HaltonSequenceGenerator randomVectorGenerator = new HaltonSequenceGenerator(3);
		randomVectorGenerator.skipTo(999999); 
		double[] b = randomVectorGenerator.nextVector();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		HaltonSequenceGenerator randomVectorGenerator1 = new HaltonSequenceGenerator(4, new int[] { 3, 5, 7,11, 13 }, null);
		randomVectorGenerator1.skipTo(999999); 
		double[] b1 = randomVectorGenerator1.nextVector();
		for (int i = 0; i < b1.length; i++) {
			System.out.println(b1[i]);
		}
	}
}
