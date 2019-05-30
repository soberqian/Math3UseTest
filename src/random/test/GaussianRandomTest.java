package random.test;

import org.apache.commons.math3.random.GaussianRandomGenerator;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomGenerator;
/*
 * author:合肥工业大学 管院学院 钱洋 
 *1563178220@qq.com
 *博客地址:http://blog.csdn.net/qy20115549/
*/
public class GaussianRandomTest {

	public static void main(String[] args) {
		RandomGenerator rg = new JDKRandomGenerator();
//		rg.setSeed(17399225432l);  
		GaussianRandomGenerator rawGenerator = new GaussianRandomGenerator(rg);
		for (int i = 0; i < 10; i++) {
			double g = rawGenerator.nextNormalizedDouble();
			System.out.println(g);
		}
	}
}
