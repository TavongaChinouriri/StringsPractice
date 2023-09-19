public class StringMethods{
    public static void main(String[] args){
        String prac = "Tavonga Chinouriri  ";
        System.out.println(prac);
        System.out.println(prac.length());
        System.out.println(prac.trim());
        System.out.println(prac.lastIndexOf('g'));
        System.out.println(prac.indexOf('v'));
        System.out.println(prac.toLowerCase());
        System.out.println(prac.toUpperCase());
        System.out.println(prac.charAt(4));
        System.out.println(prac.substring(8, 20));
        System.out.println(prac.substring(3));
        System.out.println(prac.replace('C', 'B'));
        String prac1 = prac.replace('C', 'c');
        System.out.println(prac1);

    }
}