package Swimming;
import java.time.*;

public class swimming_pool {
	double price;
	public double price(boolean member, boolean weekend, boolean group, int age, LocalTime time) throws Exception {
        LocalTime open = LocalTime.parse("05:00:00");
        LocalTime close = LocalTime.parse("22:00:00");
        LocalTime price_off = LocalTime.parse("07:00:00");
        double price;
		if (weekend) {
			price = 250;
			if(time.compareTo(open) < 0 || time.compareTo(close) > 0 ) {
				throw new Exception("킠챞턨짫!");
			}
			if (age < 3 || age > 75) {
				throw new Exception("킠챞턨짫!");
			}
			if (member) {
				return price * 0.5;
			}
			else {
				return price;
			}
		}
		else {
			price = 200;
			if(age < 3 || age > 75) {
				throw new Exception("킠챞턨짫!");
			}
			if(time.compareTo(open) < 0 || time.compareTo(close) > 0) {
				throw new Exception("킠챞턨짫!");
			}
			else if (member) {
				return price * 0.5;
			}
			else if(group) {
				return price * 0.7;
			}
			else if(age <= 12 || age >= 60 || time.compareTo(price_off) < 0) {
				return price *0.8;
			}
			return price;
		}
	}
}
