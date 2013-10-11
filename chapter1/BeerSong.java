public class BeerSong {
    public static void main (String[] args) {
        int count = 99;
        while (count > 1) {
            System.out.println(count + " bottles of beer on the wall.");
            System.out.println(count + " bottles of beer.");
            System.out.println("take one down, pass it around.");
            count--;
            if (count != 1) {
                System.out.println(count + " bottles of beer on the wall.");
            }
        }
        if (count == 1) {
            System.out.println(count + " bottle of beer on the wall.");
            System.out.println(count + " bottle of beer on the wall.");
            System.out.println(count + " bottle of beer.");
            System.out.println("take one down, pass it around.");
            System.out.println("No more bottles of beer on the wall.");
        }
    }
}
