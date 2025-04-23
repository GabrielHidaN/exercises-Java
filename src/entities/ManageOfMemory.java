package entities;

public class ManageOfMemory {
    int [] blocoDeMemoria = new int[5];
    public int tamanhoTotal = 0;
    public int tamanhoLivre = 1000;



    public int getTamanhoLivre() {
        return tamanhoLivre;
    }


    public int getTamanhoTotal() {
        return tamanhoTotal;
    }


    public void alocarMemoria(int memoriaParaAlocar){
        if (memoriaParaAlocar <= tamanhoLivre){
            tamanhoTotal += memoriaParaAlocar;
            tamanhoLivre -= tamanhoTotal;
            for (int i = 0; i < blocoDeMemoria.length ; i++) {
                if(blocoDeMemoria[i] == 0){
                    blocoDeMemoria[i] = memoriaParaAlocar;
                    break;
                }
            }
        }
        else {
            System.out.println("Memoria Livre Insuficiente para Concluir  Operação");
        }
    }

    public void removerBloco(int indiceRemover){
        if (blocoDeMemoria[indiceRemover] == 0){
            System.out.println("Esse Bloco Já Está Vazio");
        }
        blocoDeMemoria[indiceRemover] = 0;
        tamanhoTotal -=  blocoDeMemoria[indiceRemover];
    }

    public void mostrarBlocos(){
        for (int i = 0; i < blocoDeMemoria.length; i++) {
            if (blocoDeMemoria[i] > 0) {
                System.out.printf("Bloco %d: %d unidades usadas%n", i, blocoDeMemoria[i]);
            }
            else {
                System.out.printf("Bloco %d está Vazio%n", i);
            }
        }
    }
}


// Resolver erro da memoriaTotal