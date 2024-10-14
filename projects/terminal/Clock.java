/* learning points:
 * - 2D array
 * - java.time API
 */
import java.time.*;
import java.util.*;

class Clock{
	private static int[][] big_1 = {
			{ 0, 0, 1, 0, 0, },
			{ 0, 0, 1, 0, 0, },
			{ 0, 0, 1, 0, 0, },
			{ 0, 0, 1, 0, 0, },
			{ 0, 0, 1, 0, 0, },
		};
	private static int[][] big_2 = {
			{ 1, 1, 1, 1, 1, },
			{ 0, 0, 0, 0, 1, },
			{ 1, 1, 1, 1, 1, },
			{ 1, 0, 0, 0, 0, },
			{ 1, 1, 1, 1, 1, },
		};
	private static int[][] big_3 = {
			{ 1, 1, 1, 1, 1, },
			{ 0, 0, 0, 0, 1, },
			{ 1, 1, 1, 1, 1, },
			{ 0, 0, 0, 0, 1, },
			{ 1, 1, 1, 1, 1, },
		};
	private static int[][] big_4 = {
			{ 1, 0, 0, 0, 1, },
			{ 1, 0, 0, 0, 1, },
			{ 1, 1, 1, 1, 1, },
			{ 0, 0, 0, 0, 1, },
			{ 0, 0, 0, 0, 1, },
		};
	private static int[][] big_5 = {
			{ 1, 1, 1, 1, 1, },
			{ 1, 0, 0, 0, 0, },
			{ 1, 1, 1, 1, 1, },
			{ 0, 0, 0, 0, 1, },
			{ 1, 1, 1, 1, 1, },
		};
	private static int[][] big_6 = {
			{ 1, 1, 1, 1, 1, },
			{ 1, 0, 0, 0, 0, },
			{ 1, 1, 1, 1, 1, },
			{ 1, 0, 0, 0, 1, },
			{ 1, 1, 1, 1, 1, },
		};
	private static int[][] big_7 = {
			{ 1, 1, 1, 1, 1, },
			{ 0, 0, 0, 0, 1, },
			{ 0, 0, 0, 0, 1, },
			{ 0, 0, 0, 0, 1, },
			{ 0, 0, 0, 0, 1, },
		};
	private static int[][] big_8 = {
			{ 1, 1, 1, 1, 1, },
			{ 1, 0, 0, 0, 1, },
			{ 1, 1, 1, 1, 1, },
			{ 1, 0, 0, 0, 1, },
			{ 1, 1, 1, 1, 1, },
		};
	private static int[][] big_9 = {
			{ 1, 1, 1, 1, 1, },
			{ 1, 0, 0, 0, 1, },
			{ 1, 1, 1, 1, 1, },
			{ 0, 0, 0, 0, 1, },
			{ 1, 1, 1, 1, 1, },
		};
	private static int[][] big_0 = {
			{ 1, 1, 1, 1, 1, },
			{ 1, 0, 0, 0, 1, },
			{ 1, 0, 0, 0, 1, },
			{ 1, 0, 0, 0, 1, },
			{ 1, 1, 1, 1, 1, },
		};
	private static int[][] big_colon = {
			{ 0, 0, 0, 0, 0, },
			{ 0, 0, 1, 0, 0, },
			{ 0, 0, 0, 0, 0, },
			{ 0, 0, 1, 0, 0, },
			{ 0, 0, 0, 0, 0, },
		};
	private static int[][] big_space = {
			{ 0, 0, 0, 0, 0, },
			{ 0, 0, 0, 0, 0, },
			{ 0, 0, 0, 0, 0, },
			{ 0, 0, 0, 0, 0, },
			{ 0, 0, 0, 0, 0, },
		};
	private static int[][] big_hyphen = {
			{ 0, 0, 0, 0, 0, },
			{ 0, 0, 0, 0, 0, },
			{ 1, 1, 1, 1, 1, },
			{ 0, 0, 0, 0, 0, },
			{ 0, 0, 0, 0, 0, },
		};

	private HashMap<String,int[][]> map;

	public Clock(){
		this.map = new HashMap<String, int[][]>();
		map.put("1", big_1);
		map.put("2", big_2);
		map.put("3", big_3);
		map.put("4", big_4);
		map.put("5", big_5);
		map.put("6", big_6);
		map.put("7", big_7);
		map.put("8", big_8);
		map.put("9", big_9);
		map.put("0", big_0);
		map.put(":", big_colon);
		map.put(" ", big_space);
		map.put("-", big_hyphen);
	}

	public void showBig(Terminal term, String s){
		int offset_x = 0;
		for(int c : s.codePoints().toArray()){
			int[][] big = map.get(String.format("%c", c));
			for(int y=0; y<5; y++){
				for(int x=0; x<5; x++){
					if(big[y][x] == 1){
						term.moveTo(y+1,offset_x+x+1);
						term.print(" ");
					}
				}
			}
			offset_x += 6;
		}
	}

	public void showTime(Terminal term, String color){
		term.setBgColor(color);
		LocalDateTime now = LocalDateTime.now();
		String out = String.format("%04d-%02d-%02d %02d:%02d:%02d",
				now.getYear(), now.getMonthValue(), now.getDayOfMonth(), now.getHour(),
				now.getMinute(), now.getSecond());
		showBig(term, out);
		term.print("\n");
	}
}
