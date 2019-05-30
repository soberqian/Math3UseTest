package random.test;

import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.UniformRandomGenerator;
/*
 * author:�Ϸʹ�ҵ��ѧ ��ԺѧԺ Ǯ�� 
 *1563178220@qq.com
 *���͵�ַ:http://blog.csdn.net/qy20115549/
*/
public class UniformRandomTest {

	public static void main(String[] args) {
		RandomGenerator rg = new JDKRandomGenerator();
		rg.setSeed(10);
		UniformRandomGenerator generator = new UniformRandomGenerator(rg);
		double[] sample = new double[10];
		for (int i = 0; i < sample.length; ++i) {
			sample[i] = generator.nextNormalizedDouble();
			System.out.println(sample[i]);
		}
	}
}
