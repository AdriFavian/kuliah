public class sortingBubble_18 {
    public static void main(String[] args) {
        String[][] atlit = {
                { "Sayang", "Bambang", "Cinta", "Riri", "Ade"},
                    {"Abay", "Suci", "Dodo", "Ayu", "Bayu"},
                    {"Rara", "Iwan", "Maya", "Doni", "Sasa"},
                    {"Bima", "Lala", "Diki", "Nita", "Yoga"} 
        };

        String[] cabor = { "Badminton", "Tenis Meja", "Basket", "Bola Voly" };

        for (int i = 0; i < atlit.length; i++) {
            for (int j = 0; j < atlit[i].length - 1; j++) {
                for (int k = 0; k < atlit[i].length - 1 - j; k++) {
                    if (atlit[i][k].compareTo(atlit[i][k + 1]) > 0) {
                        String o = atlit[i][k];
                        atlit[i][k] = atlit[i][k + 1];
                        atlit[i][k + 1] = o;
                    }
                }
            }
        }

        for (int i = 0; i < atlit.length; i++) { 
            System.out.println(cabor[i] + ":");
            for (int j = 0; j < atlit[i].length; j++) { 
                System.out.println("Atlit " + cabor[i] + " ke-" + (j + 1) + " adalah " + atlit[i][j]);
            }
            System.out.println();
        }
    }
}