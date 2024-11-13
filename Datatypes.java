public class Datatypes {
    public static void main(String[] args)
    {
        byte a=127;
        short b=32767;
        int c=2147483647;
        long d=9223372036854775807L;
        float e=10.555556f;
        double f=10.132456870954360;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        a+=1;
        b+=1;
        c+=1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        char g='A';
        System.out.println(g);
        int h= g;
        System.out.println(h);
        String word="My name is Prachi";
        System.out.println(word);

        boolean value=true;
        System.out.println(value);
        if(b==-32768){
            value=false;

        }
        System.out.println(value);

    }
}


