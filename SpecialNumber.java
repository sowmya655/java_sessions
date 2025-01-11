public class SpecialNumber {
    public boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    public static void main(String[] args) {
        SpecialNumber obj = new SpecialNumber();

        // Test cases
        System.out.println(obj.specialEleven(22));  // true (22 is a multiple of 11)
        System.out.println(obj.specialEleven(23));  // true (23 is one more than a multiple of 11)
        System.out.println(obj.specialEleven(24));  // false
    }
}
