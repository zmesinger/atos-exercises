package hr.atos.praksa.zvonimirmesinger.zadatak10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

public class Zadatak10 {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String directory = scanner.next();
		String phrase = scanner.next();
		
		File [] files = searchDirectory(directory);
	
		try {
			searchFileForPhrase(phrase, files);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

	private static void searchFileForPhrase(String phrase, File[] files) throws IOException {
		String currentLine;
		
		try {
			for(File file : files) {
				Scanner scanner = new Scanner(file);
				while(scanner.hasNextLine()) {
					String line = scanner.next();
					if(line.contains(phrase)) {
						System.out.println(file.getName());
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

	private static File[] searchDirectory(String directory) {
			File dir = new File(directory);
			File[] files = dir.listFiles(new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
						return name.endsWith(".txt");
						
						
					
				}
			});
			
		
			return files;
		
	}
	
	
	
	
}
