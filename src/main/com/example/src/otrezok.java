public class otrezok {
        private tochka point1;
        private tochka point2;

        public otrezok (tochka point1,tochka point2)
        {
            this.point1=point1;
            this.point2=point2;
        }
        public tochka getPoint1()
        {
            return point1;
        }

        public void setPoint1(tochka point1)
        {
            this.point1=point1;
        }

        public tochka getPoint2()
        {
            return point2;
        }

        public void setPoint2(tochka point2)
        {
            this.point2=point2;
        }

        public  double calculateLength()
        {
            return Math.sqrt(Math.pow(point2.getX()-point1.getX(),2)+Math.pow(point2.getY()-point1.getY(),2));
        }
}
