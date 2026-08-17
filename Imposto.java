import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Quantos contribuintes você vai digitar? ");
        int n = sc.nextInt();

        List<TaxPayer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            System.out.println();
            System.out.printf("Digite os dados do %da contribuinte:\n",i+1);
            System.out.print("Renda anual com salário: ");
            double renda_anual= sc.nextDouble();
            System.out.print("Renda anual com prestação de serviço: ");
            double renda_prestacao= sc.nextDouble();
            System.out.print("Renda anual com ganho de capital: ");
            double renda_capital= sc.nextDouble();
            System.out.print("Gastos médicos: ");
            double gastos_medicos= sc.nextDouble();
            System.out.print("Gastos educacionais: ");
            double gastos_educacionais = sc.nextDouble();

            TaxPayer impostos = new TaxPayer(renda_anual,renda_prestacao,renda_capital,gastos_medicos,gastos_educacionais);

            list.add(impostos);
        }
        for(TaxPayer impostos : list){
            System.out.println(impostos);
        }

        sc.close();
    }
}
