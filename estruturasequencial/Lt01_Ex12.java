/*
Objetivo:      Receba o ano de nascimento e o ano atual. Calcule e mostre a 
               sua idade e quantos anos terá daqui a 17 anos.
Programador:   Danilo Santos
Data:          06/02/2020
*/

import java.util.Scanner;

public class Lt01_Ex12
{
    public static void main(String[] args) 
    {
        
        Scanner ano = new Scanner (System.in);
        System.out.print("Digite o ano de nascimento: ");
        int an = ano.nextInt();
        System.out.print("Digite o ano atual: ");
        int aa = ano.nextInt();
        
        int idade = aa - an;
        
        System.out.println("Sua idade é: " + idade);
        
        int idfut = idade + 17;
        
        System.out.println("Daqui 17 anos você terá: " + idfut);
    }  
}

