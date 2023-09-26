public class Algs {
	public String umkehren(String s) {
		if(s.length() <= 1) {
			return s;
		}
		return umkehren(s.substring(1)) + s.charAt(0);
	}
	public String glaetten(String pText, int n) {
		if(n == pText.length()) {return pText}
		if(Character.isLetter(pText.charAt(n))) {return glaetten(pText, n+1);}
		return glaetten(pText.substring(0,n) + pText.substring(n+1), n+1)
	}
	public boolean palindrom(String s) {
		if(s.compareTo(umkehren(s)) == 0) {return true;}
		return false;
	}
	public String verwandelInGrossbuchstaben(String s, int n) {
		if(n == s.length) {return s;}
		s = s.substring(0, n) + ((char) ((int) s.charAt(n))) - 32 + s.substring(n+1);
		return verwandelInGrossbuchstaben(s, n+1);
	}
    public String stripSpaces(String s) {
        if(s.equals(" ")) {return "";}
        if(s.length() == 1) {return s;}
        if(s.charAt(0) == ' ') {return stripSpaces(s.substring(1));}
        return s.substring(0,1) + stripSpaces(s.substring(1))
    }
    public int lsnr(String s, int compare, int i) {
        System.out.println("just got called with lsnr(" + s + ", " + compare + ", " + i + ");");
        if(s.length() <= 1) {return s.length();}
        if(compare == s.length()) {return s.length();}
        if(i == s.length()) {return lsnr(s, compare+1, compare+2);}
        if(s.charAt(compare) == s.charAt(i)) {
            // potential optimization because if the first one return something longer
            // than the second parts length why calculate the second part at all?
            return Math.max(lsnr(s.substring(0,i), 0, 1), lsnr(s.substring(compare+1), 0, 1));
        }
        return lsnr(s, compare, i+1);
    }
}
