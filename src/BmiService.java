public class BmiService {
    public float calculate(float body, float growth) {

        float index = body / (growth * growth);
        return index;
    }
}
