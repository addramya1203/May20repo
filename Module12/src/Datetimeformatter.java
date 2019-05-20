import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datetimeformatter {
	public static void GenerateCurrentDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

		LocalDateTime now = LocalDateTime.now();

		String str = dtf.format(now);
		String dateformat = str.replace("/", "").replace(":", "").replace(" ", "");
		System.out.println(dateformat);

	}

	public static void main(String[] args) {

		GenerateCurrentDate();

	}

}
