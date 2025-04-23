package entities;

public class ManageOfMemory {
    int [] blocoDeMemoria = new int[5];
    private int tamanhoTotal;
    public int tamanhoLivre = 1000;


    public void alocarMemoria(int memoriaParaAlocar){
        if (memoriaParaAlocar < tamanhoLivre){
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

    public int getTamanhoLivre() {
        return tamanhoLivre;
    }


    public int getTamanhoTotal() {
        return tamanhoTotal;
    }

    public void mostrarBlocos(){
        for (int i = 0; i < blocoDeMemoria.length; i++) {
            if (blocoDeMemoria[i] > 0) {
                System.out.printf("Bloco %02d: %d unidades usadas%n", i, blocoDeMemoria[i]);
            }
            else {
                System.out.println("Sem blocos Alocados!");
            }
        }
    }
}

// remover bloco