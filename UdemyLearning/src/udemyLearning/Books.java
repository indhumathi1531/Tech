package udemyLearning;

public class Books {

	int noOfCopies;

	void openTheBook() {
		System.out.println("Open");
	}

	void setNoOfCopies(int copies) {
		this.noOfCopies = copies;
	}

	int getNoOfCopies() {
		return this.noOfCopies;
	}

	int IncreaseNoOfCopies() {
		return this.noOfCopies += 100;
	}

	int DecreaseNoOfCopies() {
		return this.noOfCopies -= 50;
	}
}
