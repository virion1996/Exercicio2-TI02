import java.util.Scanner;

//package com.ti2cc;

public class Principal {
	
	//Mostrar usuarios
	public static void listar_users(DAO dao)
	{
		Usuario[] usuarios = dao.getUsuarios();
		System.out.println("==== Mostrar usuarios === ");		
		for(int i = 0; i < usuarios.length; i++) {
			System.out.println(usuarios[i].toString());
		}
				
	}
	
	//Inserir um elemento na tabela
	public static void insert_user(DAO dao)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um ID:");
		String id = sc.nextLine();
		System.out.println("Insira um nome:");
		String nome = sc.nextLine();
		System.out.println("Insira um curso:");
		String curso = sc.nextLine();
		System.out.println("Insira um sexo:");
		String sexo = sc.nextLine();
		System.out.println("Insira uma idade:");
		int idade = sc.nextInt();
		Usuario usuario = new Usuario(id, nome, curso, sexo.charAt(0), idade);
		if(dao.inserirUsuario(usuario) == true) {
			System.out.println("Insercao com sucesso -> " + usuario.toString());
		}
	}		
			
	public static void delete_user(DAO dao)
	{
		System.out.println("Digite o ID que deseja excluir");
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um ID:");
		String id = sc.nextLine();
		
		dao.excluirUsuario(id);
	}
	
	public static void update_user(DAO dao)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o ID atual:");
		String id = sc.nextLine();
		System.out.println("Insira um nome:");
		String nome = sc.nextLine();
		System.out.println("Insira um curso:");
		String curso = sc.nextLine();
		System.out.println("Insira um sexo:");
		String sexo = sc.nextLine();
		System.out.println("Insira uma idade:");
		int idade = sc.nextInt();
		Usuario usuario = new Usuario(id, nome, curso, sexo.charAt(0), idade);
		dao.atualizarUsuario(usuario);
	}
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();		
		
		System.out.println("Escolha uma opcao:");
		System.out.println("1. Lista");
		System.out.println("2. Inserir");
		System.out.println("3. Excluir");
		System.out.println("4. Atualizar");
		System.out.println("5. Sair");
		
		Scanner sc = new Scanner(System.in);
		
		int escolha = sc.nextInt();
		
		do
		{
			switch(escolha)
			{
				case 1: listar_users(dao);
					break;
				
				case 2: insert_user(dao);
					break;
					
				case 3: delete_user(dao);
					break;
				
				case 4: update_user(dao);
					break;
					
				case 5: dao.close();
				
			}
		}while(escolha != 5);
		
		
	}
}
