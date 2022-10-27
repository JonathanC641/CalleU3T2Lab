public class GradeGetter {

    // no-parameter constructor
    public GradeGetter() {
    }

    public String letterGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else if (score < 60) {
            return "F";
        }
        else{
            return null;
        }
    }
}
