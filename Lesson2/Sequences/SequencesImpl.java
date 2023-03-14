package Lesson2.Sequences;

public class SequencesImpl implements Sequences{
    @Override
    public void a(int n) {
        int a = 0;
        System.out.print("A. ");
        for (int i = 1; i <= n; i++) {
            a = a + 2;
            if (i < n) {
                System.out.print(a + ", ");
            }else System.out.print(a);
        }
    }
    @Override
    public void b(int n) {
        int a = 1;
        System.out.print("B. ");
        for (int i = 1; i <= n; i++) {
            if (i < n) {
                System.out.print(a + ", ");
            }else System.out.print(a);
            a = a + 2;
        }
    }

    @Override
    public void c(int n) {
        int a = 1;
        int c = 3;
        System.out.print("C. ");
        for (int i = 1; i <= n; i++) {
            if (i < n) {
                System.out.print(a + ", ");
            }else System.out.print(a);
            a= a+c;
            c = c + 2;
        }
    }

    @Override
    public void d(int n) {
        double a = 1;
        int b = 1;
        int d = 3;
        System.out.print("D. ");
        for (int i = 1; i <= n; i++) {
            a= Math.pow(b, d);
            if (i < n) {
                System.out.print(a + ", ");
            }else System.out.print(a);
            b = b + 1;
        }
    }

    @Override
    public void e(int n) {
        int a = 1;
        System.out.print("E. ");
        for (int i = 1; i <= n; i++) {
            if (i < n) {
                System.out.print(a + ", ");
            }else System.out.print(a);
            a= a * -1;
        }
    }

    @Override
    public void f(int n) {
        int a = 1;
        int f = 1;
        System.out.print("F. ");
        for (int i = 1; i <= n; i++) {
            if (i < n) {
                System.out.print(a + ", ");
            }else System.out.print(a);
            if(a<0){
                a= (a - f) * (-1);
            }else a= (a+f)*(-1);
        }
    }

    @Override
    public void g(int n) {
        int a = 1;
        int g = 3;
        System.out.print("G. ");
        for (int i = 1; i <= n; i++) {
            if (i < n) {
                System.out.print(a + ", ");
            }else System.out.print(a);
            if(a<0){
                a= (a - g) * (-1);
            }else a= (a+g)*(-1);
            g=g+2;
        }
    }

    @Override
    public void h(int n) {
        int a = 1;
        int h = 1;
        System.out.print("H. ");
        for (int i = 1; i <= n; i++) {
            if (i < n) {
                System.out.print(a + ", ");
            }else System.out.print(a);
            if (a > 0) {
                a=a-a;
                h=h+1;
            }else a=h;
        }
    }

    @Override
    public void i(int n) {
        int a = 1;
        int i = 1;
        System.out.print("I. ");
        for (int j = 1; j <= n; j++) {
            i++;
            if (j < n) {
                System.out.print(a + ", ");
            }else System.out.print(a);
            a=a*i;
        }
    }

    @Override
    public void j(int n) {
        int a = 1;
        int b = 0;
        int c;
        System.out.print("J. ");
        for (int i = 1; i <= n; i++) {
            c=a+b;
            if (i < n) {
                System.out.print(a + ", ");
            }else System.out.print(a);
            b=a;
            a=c;
        }
    }
}
