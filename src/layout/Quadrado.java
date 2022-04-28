package layout;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Quadrado extends Rectangle {

	private static int i = 0;

	private String[] cores = { "#e00a1a", "#00b900", "#0080ff", "#28d79a", "6657a8", "fb750e" };

	public Quadrado() {

		this(100);
	}

	public Quadrado(int tamanho) {

		setWidth(tamanho);
		setHeight(tamanho);

		setFill(Color.web(cores[i]));

		i++;
		if (i == 6)
			i = 0;
	}

}
