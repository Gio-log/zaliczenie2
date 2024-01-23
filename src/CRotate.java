import java.awt.*;

public class CRotate extends CConvert{
    protected int Eta;

    public int getEta() {
        return Eta;
    }

    public void setEta(int eta) {
        Eta = eta;
    }

    public CRotate(int XP, int YP, int eta) {
        super(XP, YP);
        Eta = eta;
    }

    public CRotate() {
        this.XP = 10*NR;
        this.YP = 10*NR;
        Eta = 4*NR;
    }

    @Override
    public Point doConvert() {
        int x_out = (int)(XP * Math.cos((Eta*Math.PI)/180)-YP*Math.sin((Eta*Math.PI)/180));
        int y_out = (int)(XP * Math.sin((Eta*Math.PI)/180)-YP*Math.cos((Eta*Math.PI)/180));
        java.awt.Point Point = new Point(x_out,y_out);
        return Point;
    }
    public static Point doConvert(Point P, int eta)
    {
        int x_out = (int)(P.x * Math.cos((eta*Math.PI)/180)-P.y*Math.sin((eta*Math.PI)/180));
        int y_out = (int)(P.x * Math.sin((eta*Math.PI)/180)-P.y*Math.cos((eta*Math.PI)/180));
        P = new Point(x_out,y_out);
        return P;
    }

    @Override
    public String toString() {
        return "Punkt przed przekształceniem:\n x = " + XP + "\n y=" + YP +
                "\nPunkt po przekształceniu:\n x = "+doConvert().x+"\ny = "+doConvert().y;
    }
}
