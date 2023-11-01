public class WhileLoop {
public static void main(String[] args){
    String[] treasureChest = {"Book", "Quill", "Gold",
            "Quill", "Document", "Silver", "Gold",
            "Book", "Spoon", "Silver", "Gold"};

    int i=0;

    while(i < treasureChest.length) {
        System.out.println("Found " + treasureChest[i]);
        i++;
    }
}
}