import java.lang.Math;

class Line {

    void lineMethod(Double d1, Double d2) {
        System.out.println("Are the Lengths equal : " + d1.equals(d2));

        int check = d1.compareTo(d2);
        switch (check) {
            case 1:
                System.out.println("Line 1 is greater than Line 2");
                break;
            case -1:
                System.out.println("Line 1 is smaller than Line 2");
                break;
            default:
                System.out.println("Both Lines are equal");
        }
    }
}

class LineProblem extends Line {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

        double x1 = 40.0, x2 = 52.0, y1 = 63.0, y2 = 77.0;
        double a = Math.sqrt(x2 - x1);
        double b = Math.sqrt(y2 - y1);

        System.out.println(a + " " + b);

        Double d1 = Double.valueOf(a);
        Double d2 = Double.valueOf(b);

        Line l = new Line();
        l.lineMethod(d1, d2);

    }
}
