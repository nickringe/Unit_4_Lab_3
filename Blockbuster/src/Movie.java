import java.util.ArrayList;


public abstract class Movie {

	private String title;
	private int runTime;
	private ArrayList<String> scenes = new ArrayList<>();
	
	public Movie() {
		
	}

	public Movie(String title, int runTime, ArrayList<String> scenes) {
		this.title = title;
		this.runTime = runTime;
		this.scenes = scenes;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public ArrayList<String> getScenes() {
		return scenes;
	}

	public void setScenes(ArrayList<String> scenes) {
		this.scenes = scenes;
	}
	
	public void printInfo() {
		System.out.println(this.title);
		System.out.println(this.runTime);
	}
	
	public void printScenes() {
		for (int i = 0; i < scenes.size(); i++) {
		System.out.println(scenes.get(i));
		}
	}
	
	public abstract void play();

	@Override
	public String toString() {
		return "Movie Title: " + title + ", Run Time: " + runTime + ", Scenes: " + scenes;
	}
	
	
}
