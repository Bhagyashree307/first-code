public class TypeConversion {
    public static void main (String[] args) {
       // automatic conversion
       byte a=120;
       short b=a;
       int c=b;
       long d=c;
       float e=d;
       double f=e;
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);
       System.out.println(e);
       System.out.println(f);

       //explicit conversion
       long k=2147483650L;
       int o=(int)k;
       System.out.println(o);

       long m=214748360L;
       short h=(short)m;
       System.out.println(h);

       long n=214748360L;
       byte x=(byte)n;
       System.out.println(x);

       long z=214748360L;
       double l=(double)z;
       System.out.println(l);

       int q=12879;
       short s=(short)q;
       System.out.println(s);

       int w=12684683;
       byte j=(byte)w;
       System.out.println(j);

       short v=32767;
       byte g=(byte)v;
       System.out.println(g);

       float u= 10.50f;
       int p=(int)u;
       System.out.println(p);

       double r=10.98656;
       int y=(int)r;
       System.out.println(y);
       }

    }

