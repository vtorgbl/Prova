package provaa1vitorgabriel;

import java.util.Scanner;

public class ProvaA1VitorGabriel {

    public static void main(String[] args) {

        String Nome[] = new String[10];
        double Notas[] = new double[10];
        int Frequencia[] = new int[10];
        int posMaior = 0, posMenor = 0, porcentagemfrequencia = 0, Maior, Menor, PercApv, PercRpv, AlunoAprovado, AlunoReprovado;
        double QtdAlunoApr = 0, QtdAlunoRep = 0, Soma = 0, Media;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < Nome.length; i++) {
            System.out.print("Digite o nome do aluno: ");
            Nome[i] = input.next();
            System.out.print("Digite a nota do " + Nome[i] + ": ");
            Notas[i] = input.nextDouble();
            Soma = Soma + Notas[i];
            System.out.print("Digite a frequência do " + Nome[i] + ": ");
            Frequencia[i] = input.nextInt();
            porcentagemfrequencia = (Frequencia[i] / 100) * 80;
        }
        for (int i = 0; i < Notas.length; i++) {
            if (Notas[i] >= 70 && Frequencia[i] >= porcentagemfrequencia) {
                QtdAlunoApr++;
                System.out.println("Os alunos " + Nome[i] + " foram aprovados com as notas " + Notas[i] + "  frequência " + Frequencia[i]);
            } else {
                QtdAlunoRep++;
                System.out.println("O aluno " + Nome[i] + " foram reprovados com a notas " + Notas[i] + " e frequência " + Frequencia[i]);
            }
        }
        Maior = (int) Notas[0];
        Menor = (int) Notas[0];
        for (int i = 0; i < Notas.length; i++) {
            if (Notas[i] > Maior) {
                Maior = (int) Notas[i];
                posMaior = i;
            } else if (Notas[i] < Menor) {
                Menor = (int) Notas[i];
                posMenor = i;
            }
        }
        Media = Soma / 10;
        PercRpv = (int) ((QtdAlunoApr * 100) / 10);
        PercApv = (int) ((QtdAlunoRep * 100) / 10);
        
        System.out.println("O aluno " + Nome[posMaior] + " teve a maior nota " + Notas[posMaior]);
        System.out.println("O aluno " + Nome[posMenor] + " teve a menor nota " + Notas[posMenor]);
        System.out.println("O percentual de aprovados da turma é: " + PercApv + "%");
        System.out.println("O percentual de reprovados da turma é: " + PercRpv + "%");
        System.out.println("A media da sala é: " + Media);

    }
}
