public class Main {


    public static boolean shouldWakeUp(boolean isBarking, int clock) {
    if (clock<0|| clock>23) return false;
    if(!isBarking) return false;
    return ( clock <8 || clock>=20);
    }

    public static boolean hasTeen(int num1 , int num2, int num3 ) {
        return (num1>=13 && num1<=19) ||
                (num2>=13 && num2<=19) ||
                (num3>=13&& num3<=19);

    }

    public static boolean isCatPlaying( boolean isSummer, int temp ) {
        if (isSummer){
            return (temp>25 && temp <= 45);
        }if (!isSummer){
            return (temp > 25 && temp<=35);
        }
        return isSummer;
    }

    public static double area(double x , double y) {
        if(x<0 || y <0){
            System.out.println("alan değeri 0 dan büyük olmalı");
            return -1;
        }
         return x*y;
    }

    public static double circleArea(double radius) {
        if(radius<0){
            return -1;
        }
      return radius*radius* Math.PI;
    }


    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
        System.out.println(circleArea(5.0));
        System.out.println(circleArea(-1));
    }
}

