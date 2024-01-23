import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<IConvert> Points= new ArrayList<>();
        Points.add(new CMove());
        Points.add(new CMove(2,2,2,2));
        Points.add(new CMove(9,29,13,3));
        Points.add(new CRotate());
        Points.add(new CRotate(2,2,2));
        Points.add(new CRotate(23,11,32));
        /*
        Point staticMove = CMove.doConvert(new Point(2,2),2,2);
        Point staticRotate = CRotate.doConvert(new Point(2,2),2);
        System.out.println(Points.get(0).toString());
        System.out.println(Points.get(1).toString());
        System.out.println(Points.get(2).toString());
        System.out.println(Points.get(3).toString());
        System.out.println(Points.get(4).toString());
        System.out.println(Points.get(5).toString());
        System.out.println(staticMove);
        System.out.println(staticRotate);
         */
        while(true){
            System.out.println("\n\nProszę wybrać numer: Move[1], Rotate[2], Wyświetl kolekcje");
            String profil = scanner.nextLine().trim();
            if(profil.equals("1"))
            {
                try {
                    System.out.println("\nProszę podać parametry punktu i przekształcenia\nX = ");
                    int X = Integer.parseInt(scanner.nextLine().trim());
                    if(X>1000*CConvert.NR||X<-1000*CConvert.NR)
                    {
                        throw new IllegalArgumentException();
                    }
                    System.out.println("\nY = ");
                    int Y = Integer.parseInt(scanner.nextLine().trim());
                    if(Y>1000*CConvert.NR||Y<-1000*CConvert.NR)
                    {
                        throw new IllegalArgumentException();
                    }
                    System.out.println("\nPrzemieszczenie X = ");
                    int PX = Integer.parseInt(scanner.nextLine().trim());
                    System.out.println("\nPrzemieszczenie Y = ");
                    int PY = Integer.parseInt(scanner.nextLine().trim());
                    Points.add(new CMove(X,Y,PX,PY));
                }catch(Exception e){
                    System.out.println("\nPodano niepoprawny parametr");
                }
            }
            else if (profil.equals("2"))
            {
                try {
                    System.out.println("\nProszę podać parametry punktu i przekształcenia\nX = ");
                    int X = Integer.parseInt(scanner.nextLine().trim());
                    if(X>1000*CConvert.NR||X<-1000*CConvert.NR)
                    {
                        throw new IllegalArgumentException();
                    }
                    System.out.println("\nY = ");
                    int Y = Integer.parseInt(scanner.nextLine().trim());
                    if(Y>1000*CConvert.NR||Y<-1000*CConvert.NR)
                    {
                        throw new IllegalArgumentException();
                    }
                    System.out.println("\nEta = ");
                    int Eta = Integer.parseInt(scanner.nextLine().trim());
                    Points.add(new CRotate(X,Y,Eta));
                }catch(Exception e){
                    System.out.println("\nPodano niepoprawny parametr");
                }
            }
            else if (profil.equals("3"))
            {
                for (IConvert iteration: Points) {
                    System.out.println(iteration.toString());
                }
            }
            System.out.println("\nCzy chcesz kontynuować?(y/n)\n");
            String repeat =scanner.nextLine().trim();
            if(repeat.equals("n")||repeat.equals("N"))
            {
                break;
            }
        }
    }
}