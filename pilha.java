import java.util.Scanner;
public class pilha2 {
    
    int topo;
    int capacidade;
    String Lista[];
    String magenta = "\033[35m";
    String verdeBrilhante = "\033[92m";
    String amareloBrilhante = "\033[93m";

    public pilha2(int capacidade){
        this.topo = -1;
        this.capacidade=capacidade;
        this.Lista = new String[capacidade];
    }

    public void menu() {
        boolean chave = true;
        Scanner scanner = new Scanner(System.in);

        while (chave) {
            System.out.println(magenta + "(1) To add an item");
            System.out.println("(2) Show the list");
            System.out.println("(3) Delete the top of the stack");
            System.out.println("(4) Quit");
            
            try {
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

                switch (opcao) {
                    case 1:
                        System.out.print("Enter the item to add: ");
                        String item = scanner.nextLine();
                        adicionar(item);
                        break;
                    case 2:
                        exibir();
                        break;
                    case 3:
                        excluir();
                        break;
                    case 4:
                        chave = false; 
                        break;
                    default:
                        System.out.println("Invalid option. Please choose again.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        scanner.close();
    }
    public void adicionar(String item){
        if(topo == capacidade -1){
            System.out.println(verdeBrilhante+"the stack is full");
        }else{
            topo++;
            Lista[topo] = item;
            
        }
    }
    
    public void exibir(){
        if(topo!=-1){
            for(int i = 0; i<=topo;i++){
                System.out.println(amareloBrilhante+"("+i+")"+Lista[i]);
        }}else{
            System.out.println(verdeBrilhante+"List is empty");

        }
    }

    public void excluir(){
        if(topo == -1){
            System.out.println(verdeBrilhante+"list is empty");
        }else{
           
            System.out.println(amareloBrilhante+" the top deleted with id: " + topo);
            topo--;
        }
    }


    public static void main(String[] args) {
        pilha2 minhaPilha = new pilha2(6);
        minhaPilha.menu();
        
    }
}