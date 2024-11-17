package StringPrograms;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {


        String k = "hj vghv jih ftyf ";
       // String j = k.trim(); this method is only used replace spaces in string from front and Back
        String j = k.replaceAll("\\s","");
        System.out.println(j);
    }
}
