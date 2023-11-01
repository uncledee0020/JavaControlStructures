//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class For {

    public static void main(String[] var0) {
        String[] var1 = new String[]{"Book", "Quill", "Gold", "Quill", "Document", "Silver", "Gold", "Book", "Spoon", "Silver", "Gold"};
        String var2 = "Document";
        boolean var3 = false;
        System.out.println("Let the Search for \"" + var2 + "\" begin!");

        for(int var4 = 0; var4 < var1.length; ++var4) {
            if (var1[var4].equals(var2)) {
                System.out.println("\nI found it!!!");
                var3 = true;
                break;
            }

            System.out.format("\n\"%s\" is not what I wanted. Moving on with the search...", var1[var4]);
        }

        System.out.println("\nWas the search a success? " + var3);
    }
}
