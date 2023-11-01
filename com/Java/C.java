public class C {
    public static void main(String[] args) {
        String[] treasureChest = {"Book", "Quill", "Gold",
                "Quill", "Document", "Silver", "Gold",
                "Book", "Spoon", "Silver", "Gold"};
        String item = "Document";
        boolean itemFound = false;

        System.out.println("Let the Search for \"" + item + "\" begin!");
        for (int i = 0; i < treasureChest.length; i++) {
            if (treasureChest[i].equals(item)) {
                System.out.println("\nI found it!!!");
                itemFound = true;
                break;
            }
            System.out.format("\n\"%s\" is not what I wanted. Moving on with the search...", treasureChest[i]);
        }
        System.out.println("\nWas the search a success? " + itemFound);
    }
}