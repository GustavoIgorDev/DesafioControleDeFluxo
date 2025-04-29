public class Contador {

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O primeiro parametro deve ser menor que o segundo");
        }else{
            int quatidade = parametroDois - parametroUm;

            for(int i = 1; i <= quatidade; i++){
                System.out.printf("Imprimindo o número: %d", i);
                System.out.println();
            }
        }

    }

}
