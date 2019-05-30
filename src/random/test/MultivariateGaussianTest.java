package random.test;


import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.random.CorrelatedRandomVectorGenerator;
import org.apache.commons.math3.random.GaussianRandomGenerator;
import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomGenerator;
/*
 * author:合肥工业大学 管院学院 钱洋 
 *1563178220@qq.com
 *博客地址:http://blog.csdn.net/qy20115549/
*/
public class MultivariateGaussianTest {

	public static void main(String[] args) {
		RandomGenerator rg = new JDKRandomGenerator();
		rg.setSeed(17399225432l);  
		GaussianRandomGenerator rawGenerator = new GaussianRandomGenerator(rg);
		double[] mean = {1, 2, 5};
		double[][] arrA = {{1, 2, 3}, {3, 4, 5}, {4, 5, 6}};
		RealMatrix matrixA = MatrixUtils.createRealMatrix(arrA); 
		RealMatrix covariance = matrixA.multiply (matrixA.transpose());
		CorrelatedRandomVectorGenerator generator = 
		    new CorrelatedRandomVectorGenerator(mean, covariance, 1.0e-12 * covariance.getNorm(), rawGenerator);
		double[] randomVector = generator.nextVector();
		for(double d : randomVector){
			System.out.println(d);
		}
	}
}
