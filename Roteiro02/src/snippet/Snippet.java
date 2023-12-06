package snippet;

public class Snippet {
	NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt","BR"));
	      String valor = nf.format(1234.56789);
}

