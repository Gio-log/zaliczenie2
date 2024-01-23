import java.awt.*;

public class CMove extends CConvert{
    protected int DX;
    protected int DY;

    public int getDX() {
        return DX;
    }

    public void setDX(int DX) {
        this.DX = DX;
    }

    public int getDY() {
        return DY;
    }

    public void setDY(int DY) {
        this.DY = DY;
    }

    public CMove(int XP, int YP, int DX, int DY) {
        super(XP, YP);
        this.DX = DX;
        this.DY = DY;
    }

    public CMove() {
        this.XP = -2*NR;
        this.YP = 2*NR;
        this.DX = 3*NR;
        this.DY = -NR;
    }

    @Override
    public Point doConvert() {
        int x_out = XP + DX;
        int y_out = YP + DY;
        java.awt.Point Point = new Point(x_out,y_out);
        return Point;
    }
    public static Point doConvert(Point P, int dx, int dy)
    {
        int x_out = P.x + dx;
        int y_out = P.y + dy;
        P = new Point(x_out,y_out);
        return P;
    }

    @Override
    public String toString() {
        return "Punkt przed przekształceniem:\n x = " + XP + "\n y=" + YP +
                "\nPunkt po przekształceniu:\n x = "+doConvert().x+"\ny = "+doConvert().y;
    }
}
