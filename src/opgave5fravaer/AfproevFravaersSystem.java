package opgave5fravaer;

public class AfproevFravaersSystem {

    public static void main(String[] args) {
        int[][] fravær = { { 2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0 }, { 1, 2, 1, 2, 1, 2, 0, 2, 0, 0, 4, 0 },
                { 5, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0 } };

        FravaersSystem fraværsSystem = new FravaersSystem();
        fraværsSystem.udskrivFravaer(fravær);
        System.out.println();

        //TODO opgave 5.7
        System.out.println(fraværsSystem.antalUdenFravaer(fravær));
        System.out.println(fraværsSystem.mestFravaer(fravær));
        System.out.println(fraværsSystem.samletFravaer(fravær, 4));
        System.out.println(fraværsSystem.gennemsnit(fravær, 4));
        fraværsSystem.nulstil(fravær,4);
        fraværsSystem.udskrivFravaer(fravær);

    }
}
