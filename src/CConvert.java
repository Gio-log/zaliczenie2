import java.awt.*;

public abstract class CConvert  implements IConvert{
    static int NR = 1;
    protected int XP;
    protected int YP;

    public int getXP() {
        return XP;
    }

    public void setXP(int XP) {
        try {
            if (XP < -1000 * NR || XP > 1000 * NR) {
                throw new IllegalArgumentException();
            }
            this.XP = XP;
        }catch (Exception e) {
            System.out.println("Wartość nie mieści się w przedziale");
        }
    }

    public int getYP() {
        return YP;
    }

    public void setYP(int YP) {
        try {
            if (YP < -1000 * NR || YP > 1000 * NR) {
                throw new IllegalArgumentException();
            }
            this.YP = YP;
        }catch (Exception e) {
            System.out.println("Wartość nie mieści się w przedziale");
        }
    }

    public CConvert(int XP, int YP) {
        this.XP = XP;
        this.YP = YP;
    }
    public CConvert() {
        this.XP = -NR;
        this.YP = NR;
    }
    public Point getPoint()
    {
        Point Point = new Point(XP,YP);
        return Point;
    }
}
