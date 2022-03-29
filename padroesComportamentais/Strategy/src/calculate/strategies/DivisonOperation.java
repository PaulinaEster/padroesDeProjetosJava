package calculate.strategies;

public class DivisonOperation implements OperationStrategy{

	@Override
	public int calculate(int num1, int num2) {
		return num1 / num2;
	}

}
