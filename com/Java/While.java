//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class While {

    public static void main(String[] var0) {
        String[] var1 = new String[]{"Book", "Quill", "Gold", "Quill", "Document", "Silver", "Gold", "Book", "Spoon", "Silver", "Gold"};
        String var2 = "Sword";
        boolean var3 = false;

        for(int var4 = 0; !var3 && var4 < var1.length; ++var4) {
            if (var1[var4].equals(var2)) {
                System.out.println("\nFound it !!");
                var3 = true;
                break;
            }

            System.out.format(var1[var4] + "  is not what I wanted. Moving on with the search...\n");
        }

        System.out.println("\nWas the search a success? :" + var3);
    }
}
