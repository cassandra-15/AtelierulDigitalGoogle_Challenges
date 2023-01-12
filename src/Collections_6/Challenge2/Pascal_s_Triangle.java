package Collections_6.Challenge2;


public class Pascal_s_Triangle {
    public static void main(String[] args) {
        buildTriangle(5);
    }

    public static void buildTriangle(int n) {
        StringBuilder triangle = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                triangle.append(pascalValue(i, j) + " ");
            }
            triangle.append("\n");
        }
        System.out.println(triangle);
    }

    public static int pascalValue(int i, int j) {
        if (j == 0 || j == i)
            return 1;
        else {
            return pascalValue(i - 1, j - 1) + pascalValue(i-1 , j);
        }
    }
}
