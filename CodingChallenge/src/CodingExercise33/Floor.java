package CodingExercise33;

public class Floor {
    // Declare variables
	private double width;
	private double length;

    // Constructor, two param's (width, length)
	public Floor(double width, double length) {

		if (width < 0) {
			this.width = 0;
		} else {
			this.width = width;
		}

		if (length < 0) {
			this.length = 0;
		} else {
			this.length = length;
		}

	}

    // Method named getArea(no param's)
	public double getArea() {
		return width * length;
	}
}
