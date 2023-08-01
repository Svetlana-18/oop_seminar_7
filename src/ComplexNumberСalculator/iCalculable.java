package ComplexNumberСalculator;

public interface iCalculable {
    iCalculable sum(String arg);

    iCalculable multi(String arg);

    iCalculable divis(String arg);

    iCalculable subtraction(String arg);

    String getResult();

}