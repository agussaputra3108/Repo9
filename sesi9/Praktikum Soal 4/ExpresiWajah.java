public class ExpresiWajah{
	public String respons(){
		return("Perhatikan ekspresi wajah saya");
	}
}

class Gembira extends ExpresiWajah{
	public String respons() {
		return ("ha ha ha...");
	}
}

class Sedih extends ExpresiWajah{
	public String respons() {
		return ("hik hik ngeee ngeee ngeee....");
	}
}

class Marah extends ExpresiWajah{
	public String respons() {
		return ("Hai Kurang ajar !");
	}
}