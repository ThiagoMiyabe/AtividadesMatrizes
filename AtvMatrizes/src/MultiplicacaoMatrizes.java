import java.util.Scanner;

public class MultiplicacaoMatrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ma [][] = new int [2][3];
        int mb [][] = new int [3][2];
        int mab [][] = new int [2][2];

        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                System.out.println("Insira o número da linha " + (i + 1) + " e coluna " + (j + 1) + " da tabela de botões x camisas");
                ma[i][j] = new Scanner(System.in).nextInt();
            }
        }

        for (int i = 0; i < mb.length; i++) {
            for (int j = 0; j < mb[i].length; j++) {
                System.out.println("Digite o elemento da linha " + (i + 1) + " e coluna " + (j + 1) + " da tabela de camisas x messes");
                mb[i][j] = new Scanner(System.in).nextInt();
            }
        }

        mab[0][0] = (ma[0][0] * mb[0][0]) + (ma[0][1] * mb[1][0]) + (ma[0][2] * mb[2][0]);
        mab[0][1] = (ma[0][0] * mb[0][1]) + (ma[0][1] * mb[1][1]) + (ma[0][2] * mb[2][1]);
        mab[1][0] = (ma[1][0] * mb[0][0]) + (ma[1][1] * mb[1][0]) + (ma[1][2] * mb[2][0]);
        mab[1][1] = (ma[1][0] * mb[0][1]) + (ma[1][1] * mb[1][1]) + (ma[1][2] * mb[2][1]);

        System.out.println("A multiplicação de matrizes: ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.print("[ " + mab[i][j] + " ");
                } else {
                    System.out.println(mab[i][j] + " ]");
                }
            }
        }
    }
}
