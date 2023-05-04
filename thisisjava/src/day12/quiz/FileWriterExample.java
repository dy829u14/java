package day12.quiz;

import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws Exception {
		try(FileWriter fw = new FileWriter("file.txt")) {
			fw.write("java");
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
