package domain;

public class Recursive {

    public double mcd(int x, int y){
        if (y==0)
            return x;
        else return mcd(y,x%y);
    }
    public int ackerman(int m, int n) throws Exception {
        if (n < 0 || m < 0) {
            throw new Exception();
        }
        if (m == 0) {

            return n + 1;
        }

        if (n == 0) {
            return ackerman(m-1, 1);

        }
        return ackerman(m-1, ackerman(m, n-1));
    }


}
