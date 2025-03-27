/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
import java.util.ArrayList;

class Banco{
    private String cpf;
    private double dinheiro;
    
    public Banco(String cpf, double dinheiro){
        this.cpf = cpf;
        this.dinheiro = dinheiro;
    }
    
    public String getCpf(){
        return cpf;
    }
    public double getDinheiro(){
        return dinheiro;
    }
    
    public String toString(){
        return "Cpf" + cpf + "\n R$ " + dinheiro;
    }
}

public class Main
{
    private static ArrayList<Banco> listaBanco = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
	    listaBanco.add(new Banco("00011122233", 10000));
	    
	    boolean sair = false;
	    
		while(!sair){
		    exibirMenu();
		    int opcao = scanner.nextInt();
		    scanner.nextLine();
		    
		    switch(opcao){
		        case 1:
		            inserirUsuario();
		            break;
		        case 2:
		            listarUsuarios();
		            break;
		        case 3:
		            transferencia();
		            break;
		        case 4:
		            excluirUsuario();
		            break;
		        case 5:
		            System.out.println("Saindo!!!");
		            sair = true;
		            break;
		        default:
		            System.out.println("Opcao invalida, escolha novamente!!");
		            
		    }
		}
		
		
	}
	public static void exibirMenu(){
        System.out.println("Banco\n");
        System.out.println("1. Inserir um usuario\n");
        System.out.println("2. Listar usuarios\n");
        System.out.println("3. Transferencia de valor\n");
        System.out.println("4. Excluir um usuario\n");
        System.out.println("5. Sair do programa\n");

    }
    public static void inserirUsuario(){
        System.out.println("Insira o nome do usuario: ");
        String cpf = scanner.nextLine();
        

        
        
        for(Banco u: listaBanco){
            if(u.getCpf().equals(cpf)){
                System.out.println("Cpf ja cadastrado!!");
                return;
            }
        }
        
        System.out.println("\nInsira o valor: ");
        double dinheiro = scanner.nextInt();
        
        listaBanco.add(new Banco(cpf, dinheiro));
        System.out.println("\nUsuario e valor adicionados com sucesso\n");
    }
    public static void listarUsuarios(){
        System.out.println("\nLista dos usuarios\n");
        
        if(listaBanco.isEmpty()){
            System.out.println("\nLista de usuarios esta vazia\n");
        }else{
            for(int i = 0; i <= listaBanco.size(); i++){
                System.out.println((i + 1) + " " + listaBanco.get(i));
            }
        }
    }
    public static void transferencia(){
        listarUsuarios();
        
        System.out.println("\nDigite o numero do usuario: ");
        int usuarioUm = scanner.nextInt();
        
        System.out.println("\nDigite o numero do usuario: \n");
        int usuarioUm = scanner.nextInt();
        
        String userUm = listaBanco.get(usuarioUm);
        String userDois = listaBanco.get(usuarioDois);
        
        if(listaBanco){
            
        }
            
        }
    }
    public static void excluirUsuario(){
        //
    }
}
