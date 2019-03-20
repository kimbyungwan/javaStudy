package ch07;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageDownloader {
	public static void main(String[] args) {
		File outputFile = new File("c://dev/test.jpg");
		 
		URL url = null;
		BufferedImage bi = null;
		        
		try {
		    url = new URL("http://www.bloter.net/wp-content/themes/denim/assets/images/bloter_headerlogo_744x180.png");
		    bi = ImageIO.read(url);
		    ImageIO.write(bi, "jpg", outputFile);
		 
		} catch (MalformedURLException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
}
