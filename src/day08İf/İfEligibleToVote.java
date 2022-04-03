package day08İf;

public class İfEligibleToVote {
    public static void main(String[] args) {
        String name = "josh";
        int age = 38;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA";

        if (isEligible) {
            System.out.println("eligible");
        }
        if (!isEligible) {
            System.out.println("not eligible");

        }

    }


}
