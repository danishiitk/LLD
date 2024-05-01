package iostream;

class App{
    public static void main(String[] args) {
        int ans = gcd(5, 2);
        System.out.println(ans);
    }
    public static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
}
