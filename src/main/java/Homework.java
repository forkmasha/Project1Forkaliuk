public class Homework {
    public static void main(String[] args) {

        int a=5,b=10;
        byte c=3,d=6;
        short e=1300,f=1404;
        float g=22222299999f, h=333377733f;
        double n=999993333333.23432,o=4999934324234.34234234;
        long r = 2_147_483, s= 324_234_243;

        System.out.println("Віднімання від меншого числа більшого(тип інт) "+(a-b));
        System.out.println("Віднімання від більшого числа меншого(тип інт) "+(b-a));
        System.out.println(("Ділення більшого числа на менше "+b/a));
        int k=(int)a/b;
        System.out.println(("Ділення меншого числа на більше (тип інт) "+k));

        byte i= (byte) (d + c);
        System.out.println("Додавання чисел типу byte "+i);
        byte j= (byte) (d * c);
        System.out.println("Множення чисел типу byte "+j);

        int l=e*f;
        System.out.println("Розширення типу short "+l);

        short m= (short) (e*f);
        System.out.println("Звуження типу short "+m);

        float x=(float)(g-h);
        System.out.println("Віднімання чисел типу float "+x);
        float y=(float)(g/h);
        System.out.println("Ділення чисел типу float "+y);

        double p=n/o;
        System.out.println("Ділення чисел типу double"+p);

        long t=r*s;
        System.out.println("Множення чисел типу byte "+t);

    }
}
