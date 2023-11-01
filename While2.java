public class While2 {
    public static void main(String[] args) {
        String[] treasureChest = {"Book", "Quill", "Gold",
                "Quill", "Document", "Silver", "Gold",
                "Book", "Spoon", "Silver", "Gold"};
        String item = "Sword";
        boolean itemFound = false;

        int i=0;
        while (!itemFound && i<treasureChest.length){
            if (treasureChest[i].equals(item)){
                System.out.println("\nFound it !!");
                itemFound = true;
                break;
            }
            System.out.format(treasureChest[i]  + "  is not what I wanted. Moving on with the search...\n");
            i++;
        }
        System.out.println("\nWas the search a success? :" +itemFound);

    }
}