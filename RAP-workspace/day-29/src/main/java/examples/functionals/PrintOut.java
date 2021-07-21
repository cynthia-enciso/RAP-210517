package examples.functionals;

import java.util.function.Consumer;

public class PrintOut<T> implements Consumer<T>{

	@Override
	public void accept(T t) {
		System.out.println(t);
	}

}
