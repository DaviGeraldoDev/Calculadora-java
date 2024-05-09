public class Main {
    public static void main(String[] args) {
        Number n1 = new Number(10);
        Number n2 = new Number(15);
        Operador op = new Operador('*');
        String result = op.operacao(n1.getValor(), n2.getValor());

        if (result == "erro") {
            System.out.println("Algo deu errado");
        }else{
            System.out.println("O resultado de " + n1.getValor() + " " + op.getOperador() + " " + n2.getValor() + " é " + result);
        }
    }
}
