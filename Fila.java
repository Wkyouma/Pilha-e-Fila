import java.util.Scanner;

public class Fila {
    int primeiro;
    int ultimo;
    int capacidade;
    String dados[];
    int quantidade;

    public Fila(int capacidade){
    this.quantidade = 0;
    this.primeiro = 0;
    this.ultimo = -1;
    this.capacidade = capacidade;
    this.dados = new String[capacidade];  
    }

    public void adicionar(String item){
        if(quantidade ==  capacidade){
        System.out.println("cheio");            
        }else{
            
            ultimo = (ultimo + 1) % capacidade;
            dados[ultimo] = item;
            quantidade++;

        }
    }
    public void remover(){
        if(ultimo==-1){
            System.out.println("Lista vazia");
        }else{
            primeiro = (primeiro + 1) % capacidade;
            quantidade--;
         
        }
    }
    public void exibir(){
        if(ultimo == -1){
            System.out.println("lista vazia");
        }else{
            for(int i = primeiro; i < ultimo+1 ; i++){
                System.out.println(dados[i]);

            }

        }
    }

    public void menu(){
        boolean A = true;
        Scanner scanner = new Scanner(System.in);
        while(A){
        System.out.println("1 2 3");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao) {
            case 1:
                String chave = scanner.nextLine();
                adicionar(chave);
                break;
            case 2:
                exibir();
                break;
            case 3:
                remover();
                break;
            default:
                break;
        }}

    }
     public static void main(String[] args) {
        Fila fila = new Fila(8);
        fila.menu();        
     }
}