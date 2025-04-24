package entities;

public class ManageOfMemory {
    private final int [] blocoDeMemoria = new int[5];
    private int tamanhoTotal;
    private final int  tamanhoLivre = 1000;
    private int memoriaTemp;


    public int[] getBlocoDeMemoria() {
        return blocoDeMemoria;
    }

    public int getMemoriaTemp() {
        memoriaTemp = tamanhoLivre - tamanhoTotal;
        return memoriaTemp;
    }

    public void setTamanhoTotal(int tamanhoTotal) {
        this.tamanhoTotal = tamanhoTotal;
    }

    public int getTamanhoTotal() {
        return tamanhoTotal;
    }


    public void alocarMemoria(int memoriaParaAlocar){
        if (memoriaParaAlocar <= getMemoriaTemp()){
            tamanhoTotal += memoriaParaAlocar;
            int i1 = tamanhoLivre - tamanhoTotal;
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
        tamanhoTotal -=  blocoDeMemoria[indiceRemover];
        blocoDeMemoria[indiceRemover] = 0;

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

