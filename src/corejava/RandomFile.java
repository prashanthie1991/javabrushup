package corejava;

import java.io.File;
import java.util.List;
import java.util.Random;

//Puzzle: Get random file name from a folder which is not repetitive
public class RandomFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// first read filenames from a folder which is exist
		String path = "/Users/prashanthierrabelly/Documents/drivers";
		RandomFile rf = new RandomFile();
		String[] fileNames = rf.readFiles(path);
		
		String fileName = rf.getRandomFileName(fileNames);
		System.out.println(fileName);

	}

	private String getRandomFileName(String[] fileNames) {
		// TODO Auto-generated method stub
		int fileNamesLength = fileNames.length;
		Random random = new Random();
		int randomIndex = random.nextInt(fileNamesLength);
		String fileName = fileNames[randomIndex];
		
		return fileName;
	}

	public String[] readFiles(String path) {

		File folderObjects = new File(path);
		String[] filesList = folderObjects.list();
		return filesList;

	}

}
