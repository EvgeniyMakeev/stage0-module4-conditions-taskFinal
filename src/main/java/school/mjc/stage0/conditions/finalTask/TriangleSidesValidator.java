package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean isValid = (firstSide > 0 && secondSide > 0 && thirdSide > 0) &&
                (firstSide < secondSide + thirdSide &&
                        secondSide < firstSide + thirdSide &&
                        thirdSide <  firstSide + secondSide);
        String answer = isValid ? "this is a valid triangle" : "it's not a triangle";
        System.out.println(answer);
    }
}
