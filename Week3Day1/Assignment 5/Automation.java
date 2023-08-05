package week3.day1;

public class Automation extends MultipleLangauge implements Language {

	public static void main(String[] args) {
	
		Automation aa=new Automation();
		aa.Java();
		aa.Selenium();
		aa.ruby();
		aa.python();
			
	}

	@Override
	public void python() {
		super.python();
	}

	public void Java() {
		System.out.println("JAVA-Write Once, Run Anywhere");
		
		
	}

	@Override
	public void ruby() {
		System.out.println("The Language Ruby can be used with selenium");	
		
	}

	public void Selenium() {
		System.out.println("Selenium is a Open Source Tool for Automation that supports JAVA");
		
	}

}
