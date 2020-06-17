public class DiscountSample {
    public boolean priceCheck(int price) {
        if (price >= 50_000) {
            return true;
        } else {
            return false;
        }
    }

    public double sexCheck(String sex) {
        if (sex.equals("f")) {
            return 0.2;
        } else {
            return 0.1;
        }
    }

    public int ageCheck(int age) {
        if (age < 10) {
            return 3_000;
        } else {
            return 1_000;
        }
    }
}
