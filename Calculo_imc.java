import java.util.Scanner;

public class Calculo_IMC
{
 public static void main(String[] args) 
 {
 Scanner ler = new Scanner(System.in);
 String nome1, nome2;
 float peso1, peso2, altura1, altura2;
 float imc1, imc2;
 String classifica1, classifica2;
 
 System.out.println("Nome da Pessoa 1: ");
 nome1 = ler.nextLine();
 System.out.println("Peso da Pessoa 1 (kg): ");
 peso1 = ler.nextFloat();
 System.out.println("Altura da Pessoa 1 (m): ");
 altura1 = ler.nextFloat();
 ler.nextLine();
 
 System.out.println("Nome da Pessoa 2: ");
 nome2 = ler.nextLine();
 System.out.println("Peso da Pessoa 2 (kg): ");
 peso2 = ler.nextFloat();
 System.out.println("Altura da Pessoa 2 (m): ");
 altura2 = ler.nextFloat(); 
 ler.nextLine();
 
 imc1 = calcularIMC(peso1,altura1);
 imc2 = calcularIMC(peso2,altura2);
 

 }
}
