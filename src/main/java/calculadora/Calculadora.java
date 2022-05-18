package calculadora;

public class Calculadora {

    public String calcula(String expressao) {
        Double resultado = 0.0;

        if(expressao.contains("+")){
            String[] numeros = expressao.split("\\+");

            for (int i = 0; i < numeros.length; i++) {
                resultado = resultado + Double.valueOf(numeros[i]);
            }
        }


        return String.valueOf(resultado);
    }
}
