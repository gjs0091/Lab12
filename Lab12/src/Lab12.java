import java.util.*;
import java.io.*;
public class Lab12 {

	public Lab12() {
		
	}

	public static void main(String[] args) {
		int id;
		String name;
		double gpa;
		String advisor;
		String scanline;
		File file = new File("src/students.in");
		Scanner scan = null;
		try {
			scan = new Scanner(file);
		
		
		;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(scan.hasNextLine()) {
			scanline = scan.nextLine();
			
			id = Integer.valueOf(scanline.substring(0,2));
			name = scanline.substring(3, 6);
			gpa = Double.valueOf(scanline.substring(7, 10));
		if(scanline.length() > 10) {
			advisor = scanline.substring(11,16);
		}
		}
		
		scan.close();
		}

}
