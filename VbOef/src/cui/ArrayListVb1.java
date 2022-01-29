package cui;
import java.util.ArrayList;
import java.util.List;

public class ArrayListVb1 {
	public static void main(String[] args) {
		
		List<String> colorList=new ArrayList<>();
		colorList.add("magenta");
		colorList.add("yellow");
		colorList.add(1,"green");
		System.out.printf("%s", colorList.set(1,"black") );
	}
}
