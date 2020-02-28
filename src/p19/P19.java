package p19;

import java.util.Scanner;

public class P19 {

    static Scanner keyboard = new Scanner(System.in);
    static int Nmax;
    static int[] arrayNmax;
    static String[] arraynames;
    static int[] arrayGoals;
    static int[] arrayPoints;
    static int[] arrayPoints2 = arrayPoints;
    static int[] arrayGoals2;
    static int maxPosition = 0;

    public static void main(String[] args) {

        int option = -1;

        do {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {//inicio switch
                case 1: //ok
                    System.out.print("Nmax Teams?: ");
                    Nmax = keyboard.nextInt();
                    arrayNmax = new int[Nmax];
                    arraynames = new String[Nmax];
                    arrayGoals = new int[Nmax];
                    arrayPoints = new int[Nmax];
                    arrayGoals2 = new int[Nmax];

                    for (int i = 0; i < Nmax; i++) {

                        System.out.print("Team name?: ");
                        arraynames[i] = keyboard.next();

                        System.out.print("Points?: ");
                        arrayPoints[i] = keyboard.nextInt();

                        System.out.print("Goals?: ");
                        arrayGoals[i] = keyboard.nextInt();

                        System.out.print("Goals recived?: ");
                        arrayGoals2[i] = keyboard.nextInt();
                    }
                    break;

                case 2: //ok
                    int maxValue = 0;

                    for (int i = 1; i < arrayNmax.length; i++) {
                        if (arrayPoints[i] > maxValue) {
                            maxValue = arrayPoints[i];
                            maxPosition = i;
                        }

                    }
                    System.out.println("The winner is: " + arraynames[maxPosition]);
                    break;
                case 3:
                    int pointChampion = 0;
                    int positionChampion2 = 0;

                    for (int i = 0; i < arraynames.length; i++) {
                        if (pointChampion < arrayPoints[i] && i != positionChampion2) {
                            pointChampion = arrayPoints[i];
                            positionChampion2 = i;
                        }

                    }
                    System.out.println("The second team is: " + arraynames[positionChampion2]);

                    break;

                case 4: //ok
                    int lessGoals = 0;
                    for (int i = 1; i < arrayNmax.length; i++) {
                        if (arrayGoals2[i] > lessGoals) {
                            lessGoals = arrayGoals2[i];
                            lessGoals = i;
                        }
                    }
                    System.out.println("The team that has received fewer goals is: " + arraynames[lessGoals]);
                    break;

                case 5: //ok
                    int moreGoals = 0;
                    for (int i = 1; i < arrayNmax.length; i++) {
                        if (arrayGoals[i] < moreGoals) {
                            moreGoals = arrayGoals[i];
                            moreGoals = i;
                        }
                        System.out.println("The team that has scored the most is: " + arraynames[moreGoals]);
                    }

                    break;
                case 6: //ok
                    float medValue = arrayGoals[0];
                    for (int i = 1; i < arrayNmax.length; i++) {
                        medValue += arrayGoals[i];
                    }
                    medValue = medValue / arrayNmax.length;

                    float medValue2 = arrayGoals2[0];
                    for (int i = 1; i < arrayNmax.length; i++) {
                        medValue2 += arrayGoals2[i];
                    }
                    medValue2 = medValue2 / arrayNmax.length;

                    System.out.println("The average number of goals scored is: " + medValue);
                    System.out.println("The average number of goals received is: " + medValue2);
                    break;

                case 7: //no aparece el sout
                    int pointMin = arrayPoints[0];
                    int positionMin = 0;
                    for (int i = 0; i < arraynames.length; i++) {
                        if (arrayPoints[i] < pointMin) {
                            pointMin = arrayPoints[i];
                            positionMin = i;
                        }
                    }                    

                    System.out.println("Tell me a team name: ");
                    String teamName = keyboard.next();
                    if (teamName.equals(arrayPoints[positionMin])) {
                        System.out.println("Down!!!");

                    } else {
                        System.out.println("Stay there");
                    }
                    break;
                    
                    
                case 8: //ok
                    for (int i = 0; i < Nmax; i++) {
                        System.out.println("Team: " + arraynames[i] + " got " + arrayPoints[i] + " points, and socred " + arrayGoals[i] + " goals, but the others teams, sored to " + arraynames[i] + " " + arrayGoals2[i] + " goals.");
                    }
                    break;
                case 9:                  
                    for (int i = 0; i < arrayNmax.length; i++) {
                        int sum = +arrayGoals[i];
                        int subs = +arrayGoals2[i];
                        int total = sum - subs;
                        Math.abs(total);
                        System.out.println("The difference is: " + total);
                    }

                    break;
                case 10: //ok
                    System.out.println("Quieres salir? Y/N");
                    String res = keyboard.next();
                    if (res.equals("Y")) {
                        System.out.println("Asta la procsimaa");
                    } else {
                        option = 90;
                        System.out.println("Continue: ");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
            }//fin switch

        } while (option
                != 10);
    }

    private static void p0() {
        System.out.println("");
        System.out.println("gracias ......     adeu");
    }

    private static void userMenu() {
        System.out.println();
        System.out.println("Opción 1- (--)");
        System.out.println("Opción 2- (--)");
        System.out.println("Opción 3-(--)");
        System.out.println("Opción 4-(--)");
        System.out.println("Opción 5- (--)");
        System.out.println("Opción 6- (--):");
        System.out.println("Opción 7- (--):");
        System.out.println("Opción 8- (--)):");
        System.out.println("Opción 9- (--):");
        System.out.println("Opción 10- (--):");
        System.out.print("\nOpcion ?: ");
    }
}
