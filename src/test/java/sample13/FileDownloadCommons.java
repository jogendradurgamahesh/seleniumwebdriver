package sample13;

import java.io.File;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class FileDownloadCommons {

	public static void main(String[] args) throws Exception {

        URL url = new URL("https://the-internet.herokuapp.com/download/sample-upload.txt");

        FileUtils.copyURLToFile(url,
                new File("C:\\Downloads\\sample-upload.txt"));

        System.out.println("File downloaded");

    }
	
	
	
}
