public class SignedText {
    private String first;
    private String last;
    private String Signature;

    public SignedText(String first, String last) {
        this.first = first;
        this.last = last;
        this.Signature = first.equals("") ? last : first.substring(0,1) + "-" + last;
    }

    public String getSignature() {
        return Signature;
    }

    public String addSignature(String text) {
        if(text.indexOf(Signature)==0) {
            return text.substring(Signature.length()) + Signature;
        } 
        if (text.indexOf(Signature)==-1) {
            return text + Signature;
        } else {
            return text;
        }
    }
}
