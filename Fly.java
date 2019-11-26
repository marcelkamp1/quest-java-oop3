public interface Fly {
	
	void takeOff();
	
	int ascend(int neters);
	
	int descend(int meters);
	
	void land();
	
	default void glide() {
		System.out.println("Glides into the air.");
	}
	
}