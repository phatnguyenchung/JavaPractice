public class ConceptRevision {
    public ConceptRevision(String s){
        String subject = s;
    }
    public static void main(String[] args){
        ConceptRevision cr = new ConceptRevision("Adi");
        ConceptRevision cr1 = new ConceptRevision("aDi");
        System.out.println(cr==cr1);
        System.out.println(cr.equals(cr1));
    }
}
