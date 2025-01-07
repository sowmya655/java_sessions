public class Cigar {
    public static void main(String[] args) {
        Cigar p = new Cigar(); // Corrected: Use the Cigar class
        System.out.println(p.cigarParty(30, false)); // Should print false
        System.out.println(p.cigarParty(50, false)); // Should print true
        System.out.println(p.cigarParty(70, true));  // Should print true
        System.out.println(p.cigarParty(30, true));  // Should print false
    }

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars >= 40;  // On weekends, cigars need to be at least 40
        } else {
            return cigars >= 40 && cigars <= 60;  // On weekdays, cigars need to be between 40 and 60
        }
    }
}
