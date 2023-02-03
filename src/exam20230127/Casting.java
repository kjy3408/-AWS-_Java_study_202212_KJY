package exam20230127;

public class Casting {

	public static void main(String[] args) {
		
		Program[] programs = new Program[2];
		programs[0] = new Java();
		programs[1] = new C();
		
			
		for(int i = 0; i < 4; i++) {
		
		}
		
		Java j = (Java) programs[0];
		C c = (C) programs[1];
		j.develop();
		j.garbageCollection();
		c.develop();
		c.defineStructure();
	}
}
