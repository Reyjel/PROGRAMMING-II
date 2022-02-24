public class ReyjelRemoveWhiteSpace {
    public static void main(String[] args){
        String str = "The easiest way to introduce yourself on GitHub is by creating a README in a repository about you! ";
       System.out.println("Before removing whitespace" + str);
       str = str.replaceAll("\\s", "");
       System.out.println("After removing" + str);
         System.out.println(str);
    }
}

