package Atividade1;
import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		Scanner input4 = new Scanner(System.in);
		
		
		System.out.println("Digite o nome do primeiro autor:");
		String nome = input1.nextLine();
		System.out.println("Digite o e-mail do primeiro autor:");
		String email = input1.nextLine();
		System.out.println("Digite o genero do primeiro autor:");
		char genero = input1.next().charAt(0);
		Autor autor1 = new Autor(nome, email, genero);
		
		
		
		System.out.println("Digite o nome do segundo autor:");
		nome = input2.nextLine();
		System.out.println("Digite o e-mail do segundo autor:");
		email = input2.nextLine();
		System.out.println("Digite o genero do segundo autor:");
		genero = input2.next().charAt(0);
		Autor autor2 = new Autor(nome, email, genero);
		
		
		
		System.out.println("Digite o nome do primeiro livro:");
		String nomeLivro = input3.nextLine();
		System.out.println("Digite o preco do primeiro livro:");
		double preco = input3.nextDouble();
		System.out.println("Digite a quantidade em estoque do primeiro livro:");
		int qtyInStock = input3.next().charAt(0);
		Livro livro1 = new Livro(nomeLivro, preco, qtyInStock, autor1);
		
		
		
		System.out.println("Digite o nome do segundo livro:");
		nomeLivro = input4.nextLine();
		System.out.println("Digite o preco do segundo livro:");
		preco = input4.nextDouble();
		System.out.println("Digite a quantidade em estoque do segundo livro:");
		qtyInStock = input4.next().charAt(0);
		Livro livro2 = new Livro(nomeLivro, preco, qtyInStock, autor2);		
		
		
		
		System.out.println(livro1.toString());
		System.out.println(livro2.toString());
			
		input1.close();
		input2.close();
		input3.close();
		input4.close();
	}

}
