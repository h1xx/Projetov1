package project;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1) Cadastros veículo\n2)Lista veículos\n3)Vendas\n4)Sair");
        String menu = input.nextLine();


        input.close();
    }

}

