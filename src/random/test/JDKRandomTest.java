package random.test;

import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomGenerator;
/*
 * author:�Ϸʹ�ҵ��ѧ ��ԺѧԺ Ǯ�� 
 *1563178220@qq.com
 *���͵�ַ:http://blog.csdn.net/qy20115549/
*/
public class JDKRandomTest {

	public static void main(String[] args) {
		RandomGenerator rg = new JDKRandomGenerator();
		for (int i = 0; i < 2; i++) {
			System.out.println("double:" + rg.nextDouble());
			System.out.println("boolean:" + rg.nextBoolean());
			System.out.println("float:"  + rg.nextFloat());
			System.out.println("gaussian:" + rg.nextGaussian());
			System.out.println("int:" + rg.nextInt());
			System.out.println("long:" + rg.nextLong());
			System.out.println();
		}
		
	}
}
