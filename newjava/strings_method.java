public class strings_method {
    public static void main(String[]args){
        //length
        String str="Harry";
        String str1=new String("Haarry");
        int value =str.length();
        System.out.println(value);
        //Tolowercase
        String lvr=str.toLowerCase();
        System.out.println(lvr);
        //ToUppercase
        String upr=str.toUpperCase();
        System.out.println(upr);
        //trim
        String nontrimstring="      This is my home ";
        System.out.println(nontrimstring);
        String Trimstring=nontrimstring.trim();
        System.out.println(Trimstring);
        System.out.println(str.substring(2,4));
        System.out.println(str.replace("r","p"));
        //name.startWith()
        System.out.println(str.startsWith("ha"));
        //name.endsWith()
        System.out.println(str.endsWith("ry"));
        //charAt
        System.out.println(str.charAt(0));
        //indexOf(H)
        System.out.println(str.indexOf('H'));
        //form indexOf(H)
        System.out.println(str.indexOf('y',2));
        //lastindexOf(H)
        System.out.println(str.lastIndexOf('r'));
        //equal or not
        System.out.println(str.equals("harry"));
        //equal or not case ignore
        System.out.println(str.equalsIgnoreCase("harRy"));
        
        
        
    }
}
