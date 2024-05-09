public class Operador {
    char operador;
    public Operador(char operador) {
        this.operador = operador;
    }

    public char getOperador(){
        return operador;
    }

    public String operacao(double num1, double num2){
        switch (operador){
            case '+':
                return String.valueOf(num1 + num2);

            case '-':
                return String.valueOf(num1 - num2);

            case '*':
                return String.valueOf(num1 * num2);

            case '/':
                return String.valueOf(num1 / num2);
        }
        return "erro";
    }
}
