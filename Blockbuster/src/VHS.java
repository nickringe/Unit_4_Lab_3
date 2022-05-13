import java.util.ArrayList;

public class VHS extends Movie {

	private int currentTime = 0;
	
	public VHS() {
		super();
	}
	
	public VHS(String title, int runTime, ArrayList<String> scenes) {
		super(title, runTime, scenes);
	}
	
	public VHS(String title, int runTime, ArrayList<String> scenes, int currentTime) {
		super(title, runTime, scenes);
		this.currentTime = currentTime;
	}
	
	public int getCurrentTime() {
		return currentTime;
	}
	
	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	public void play(int a, ArrayList<String> b) {
	System.out.println(b.get(a));
	this.currentTime = currentTime + 1;
	if (a > getScenes().size() || currentTime > getScenes().size()) {
		rewind();
	}
}
	public void rewind() {
		this.currentTime = 0;
	}

	@Override
	public String toString() {
		return "VHS Title: " + getTitle() + ", CurrentTime: " + currentTime + ", Run Time: " + getRunTime() + ", Scenes: " + getScenes();
		
	}


	
	
	

}
