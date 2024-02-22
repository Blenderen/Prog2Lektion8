package opgave1_2dobbelArray;

public class Opg2DobbelArray {

    public static void udskrivArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + "  ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        final int ROW = 8;
        final int COL = 8;
        int[][] values = new int[ROW][COL];

        //Udskriv values på tabel form
       udskrivArray(values);
        

        // TODO Opgave 2.1  lav ændringer i values så der står 5 på alle pladser
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = 5;
            }
        }
        System.out.println();
        System.out.println("Nedenfor skulle der stå 5 på alle pladser");
        System.out.println();
        udskrivArray(values);
        
       // TODO Opgave 2.2  lav ændringer i values så der står 2 i lige rækker og 3 i ulige
        for (int i = 0; i < values.length; i++) {
            if (i%2 == 0) {
                for (int j = 0; j < values[i].length; j++) {
                    values[i][j] = 2;
                }
            } else {
                for (int j = 0; j < values[i].length; j++) {
                    values[i][j] = 3;
                }
            }
        }
        System.out.println();
        System.out.println("Nedenfor skulle der stå 2 og 3 på hver anden række");
        System.out.println();
        udskrivArray(values);
        
       // TODO Opgave 2.3  lav ændringer i values så der står 2 i lige søjler og 3 i ulige
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (j%2==0) {
                    values[i][j] = 2;
                } else {
                    values[i][j] = 3;
                }
            }
        }
        System.out.println();
        System.out.println("Nedenfor skulle der stå 2 og 3 på hver anden søjle");
        System.out.println();
        udskrivArray(values);
        
        
        // TODO Opgave 2.4 lav ændringer i values så den har skiftende 0'er og 1'er som på et
        // skakbræt
        for (int i = 0; i < values.length; i++) {
            if (i%2 == 0) {
                for (int j = 0; j < values[i].length; j++) {
                    if (j%2==0) {
                        values[i][j] = 1;
                    } else {
                        values[i][j] = 0;
                    }
                }
            } else {
                for (int j = 0; j < values[i].length; j++) {
                    if (j%2==0) {
                        values[i][j] = 0;
                    } else {
                        values[i][j] = 1;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Nedenfor skulle der stå 0 og 1 på alle pladser som på skakbræt");
        System.out.println();
        udskrivArray(values);

        // TODO Opgave 2.5 lav ændringer så alle elementer i nederste og øverste række samt første
        // og sidste søjle er 5 og resten skal være 2.
        for (int i = 0; i < values.length; i++) {
            if (i == 0 || i == values.length-1) {
                for (int j = 0; j < values[i].length; j++) {
                    values[i][j] = 5;
                }
            } else {
                for (int j = 0; j < values[i].length; j++) {
                    if (j == 0 || j == values[i].length-1){
                        values[i][j] = 5;

                    }else {
                        values[i][j] = 2;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Nedenfor skulle der stå 5 i kanten og 2 ellers");
        System.out.println();
        udskrivArray(values);


    }



}
