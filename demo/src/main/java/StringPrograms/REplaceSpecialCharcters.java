package StringPrograms;

public class REplaceSpecialCharcters {
    public static void main(String[] args){
        String s = "@%fyg78%*)@";
        String plaintext = s.replaceAll("[^a-zA-Z]","");
        System.out.println(plaintext);
    }
}
