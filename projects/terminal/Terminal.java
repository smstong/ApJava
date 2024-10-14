import java.io.File;
import java.io.FileWriter;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

class Terminal {
	private String fgColor;
	private String bgColor;

	public Terminal(String fgColor, String bgColor){
		this.fgColor = fgColor;
		this.bgColor = bgColor;
	}
	public Terminal(){
		this.fgColor = "White";
		this.bgColor = "Black";
	}
	public String toString(){
		String output = String.format("fgColor: %s\nbgColor: %s\n", this.fgColor, this.bgColor);
		return output;
	}

	public String fgCode(String color){
		String[] colors = {"Black", "Red", "Green", "Yellow", "Blue", "Magenta", "Cyan", "White"};
		String[] codes = {"30", "31", "32", "33", "34", "35", "36", "37" };
		for(int i=0; i<colors.length; i++){
			if(color.equals(colors[i])) {
				return codes[i];
			}
		}
		return null;
	}

	public String bgCode(String color){
		String[] colors = {"Black", "Red", "Green", "Yellow", "Blue", "Magenta", "Cyan", "White"};
		String[] codes = {"40", "41", "42", "43", "44", "45", "46", "47" };
		for(int i=0; i<colors.length; i++){
			if(color.equals(colors[i])) {
				return codes[i];
			}
		}
		return null;
	}

	public String setFgColor(String color){
		String oldColor = this.fgColor;
		this.fgColor = color;
		String code = this.fgCode(color);
		System.out.print("\033[" + code + "m");
		return oldColor;
	}
	public void setFgColor(int r, int g, int b){
		int R = (int)Math.round(r/255.0*5.0);
		int G = (int)Math.round(g/255.0*5.0);
		int B = (int)Math.round(g/255.0*5.0);
		int code = 16 + 36*R + 6*G + B;
		System.out.print(String.format("\033[38;5;%dm", code));
	}
	public void setBgColor(int r, int g, int b){
		int R = (int)Math.round(r/255.0*5.0);
		int G = (int)Math.round(g/255.0*5.0);
		int B = (int)Math.round(g/255.0*5.0);
		int code = 16 + 36*R + 6*G + B;
		System.out.print(String.format("\033[48;5;%dm", code));
	}

	public String setBgColor(String color) {
		String oldColor = this.bgColor;
		this.bgColor = color;
		String code = this.bgCode(color);
		System.out.print("\033[" + code + "m");
		return oldColor;
	}

	public void clear(){
		System.out.print("\033[2J");
		System.out.print("\033[H");
	}

	public void reset(){
		System.out.print("\033[0m");
	}

	public void moveCursor(int r, int c){
		System.out.print(String.format("\033[%d;%dH", r, c));
	}

	public void print(Object... args){
		for(Object arg : args){
			System.out.print(arg);
		}
	}

	public void showImage(String filename) throws Exception{
		File file = new File(filename);
		BufferedImage img = ImageIO.read(file);
		int width = img.getWidth();
		int height = img.getHeight();
		print(width, ",", height);
		for(int r=0; r<height; r++){
			for(int c=0; c<width; c++){
				int pixel = img.getRGB(c, r);
				Color color = new Color(pixel, true);
				int red = color.getRed();
				int green = color.getGreen();
				int blue = color.getBlue();
				moveCursor(r, c);
				setBgColor(red, green, blue);
				print(" ");
			}
		}
	}

}
