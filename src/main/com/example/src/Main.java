import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

import java.lang.Math;
class DistanceBTWPoint
{
    public static void main(String arg[])
    {
        tochka point1 = new tochka(1,2);
        tochka point2 = new tochka(4,6);
        otrezok Otrezok = new otrezok(point1,point2);
        System.out.println("Длина отрезка:"+Otrezok.calculateLength());
    }
}