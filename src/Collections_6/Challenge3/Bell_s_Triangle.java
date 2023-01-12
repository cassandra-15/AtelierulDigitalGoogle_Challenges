package Collections_6.Challenge3;

public class Bell_s_Triangle {
    public static void main(String[] args) {
        int n=6;
        System.out.println("Bell:"+n+"\n");
        bellNumber(n);
    }

    public static void bellNumber(int n)
    {
        StringBuilder triangle = new StringBuilder();
        int[][] bell=new int[n+1][n+1];
        bell[0][0]=1;
        triangle.append(bell[0][0]+"\n");
        for(int i=1;i<=n;i++)
        {
            bell[i][0]=bell[i-1][i-1];
            triangle.append(bell[i][0]+" ");
            for(int j=1;j<=i;j++) {
                bell[i][j] = bell[i - 1][j - 1] + bell[i][j - 1];
                triangle.append(bell[i][j]+" ");
            }
            triangle.append("\n");
        }
        System.out.println(triangle);
    }
}
