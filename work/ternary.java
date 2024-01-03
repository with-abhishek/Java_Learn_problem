package work;

public class ternary {
    public static void main(String[] args) {
        int max,a=10,b=90,c=80,d=110;
        // max=((a>b)?(a>c?a:c)?(b>a?b:a)):(c>d?c:d);
        max = (a>b&&a>c&&a>d?a:b>a&&b>c&&b>d?b:c>a&&c>b&&c>d?c:d);
        System.out.println(max);

    }
}
