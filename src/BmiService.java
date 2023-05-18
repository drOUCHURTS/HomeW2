public class BmiService {
    public int bmi(int weight, double height) {

        double height2 = height * height;

        int result = (int) (weight / height2);

        return result;
    }
}
