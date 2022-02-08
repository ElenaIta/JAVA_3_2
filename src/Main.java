public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float index = service.calculate(63.4F, 1.63F);
        System.out.println("ваш индекс массы тела составляет:" + index);

    }
}
