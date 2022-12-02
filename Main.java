public class Main {
    public static void main(String[] args) {
        Double triangle = calcTriangleArea(10.0, 5.0);
        System.out.println("三角形の面積：" + triangle + "cm^2");

        Double circle = calcCircleArea(5.0);
        System.out.println("円の面積：" + circle + "cm^2");
    }

    public static double calcTriangleArea(double bottom,double height) {
        double ans = bottom * height / 2;
        return ans;
    }

    public static double calcCircleArea(double radius) {
        double ans = radius * radius * Math.PI ;
        return ans;
    }
}