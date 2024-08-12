package udemyLearning;

public class BookRunner {

	public static void main(String[] args) {
		Books secret = new Books();
		Books artOfLiving = new Books();
		Books atomicHabits = new Books();

		secret.openTheBook();
		artOfLiving.openTheBook();
		atomicHabits.openTheBook();

		secret.setNoOfCopies(500);
		artOfLiving.setNoOfCopies(1000);
		atomicHabits.setNoOfCopies(1500);

		System.out.println(secret.getNoOfCopies());
		System.out.println(atomicHabits.getNoOfCopies());
		System.out.println(artOfLiving.getNoOfCopies());

		secret.IncreaseNoOfCopies();
		artOfLiving.IncreaseNoOfCopies();
		atomicHabits.IncreaseNoOfCopies();

		System.out.println(secret.getNoOfCopies());
		System.out.println(atomicHabits.getNoOfCopies());
		System.out.println(artOfLiving.getNoOfCopies());

		secret.DecreaseNoOfCopies();
		artOfLiving.DecreaseNoOfCopies();
		atomicHabits.DecreaseNoOfCopies();

		System.out.println(secret.getNoOfCopies());
		System.out.println(atomicHabits.getNoOfCopies());
		System.out.println(artOfLiving.getNoOfCopies());
	}

}
