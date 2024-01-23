// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        IConvert[] Points = new IConvert[6];
        Points[0] = new CMove();
        Points[1] = new CMove(2,2,2,2);
        Points[2] = new CMove(9,29,13,3);
        Points[3] = new CRotate();
        Points[4] = new CRotate(2,2,2);
        Points[5] = new CRotate(23,11,32);
        System.out.println(Points[0].toString());
        System.out.println(Points[1].toString());
        System.out.println(Points[2].toString());
        System.out.println(Points[3].toString());
        System.out.println(Points[4].toString());
        System.out.println(Points[5].toString());
        
    }
}