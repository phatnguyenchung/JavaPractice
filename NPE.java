public class NPE {
    public static void main(String[] args){
        String _text = null ;
        System.out.println(_text);
        int length = _text.length();
        System.out.println(length);
    }
}
