package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        String answer = "Wrong month number";
        switch (monthNumber) {
            case 1, 2, 12 -> answer = "Winter";
            case 3, 4, 5 -> answer = "Spring";
            case 6, 7, 8 -> answer = "Summer";
            case 10, 9, 11 -> answer = "Autumn";
        }
        System.out.println(answer);
    }
}
