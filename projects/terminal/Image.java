import java.io.File;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

class Image {
	private String filename;

	public Image(String filepath){
		this.filename = filepath;		
	}

	public void show(Terminal term) throws Exception{
		File file = new File(this.filename);
		BufferedImage img = ImageIO.read(file);

		int width = img.getWidth();
		int height = img.getHeight();
		for(int r=0; r<height; r++){
			for(int c=0; c<width; c++){
				int pixel = img.getRGB(c, r);
				Color color = new Color(pixel, true);
				int red = color.getRed();
				int green = color.getGreen();
				int blue = color.getBlue();
				term.moveTo(r, c);
				term.setBgColor(red, green, blue);
				term.print(" ");
			}
		}
		term.print("\n");
	}
}
