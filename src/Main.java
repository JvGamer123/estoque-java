import constants.MenuConstants;
import constants.MessageConstants;
import model.Vendedor;
import model.Funcionario;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(MessageConstants.WELCOME_MESSAGE);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma opacao para acessar o sistema" +
                "\n 1) Cadastrar funcionario" +
                "\n 2) Realizar venda" +
                "\n 3) Consultar carro em estoque \n");

        int codigo = sc.nextInt();

        if (MenuConstants.CADASTRAR_FUNCIONARIO == codigo) {

            Funcionario funcionario = new Funcionario();
            System.out.println("Digite o nome do funcionario: ");
            funcionario.setNome(sc.nextLine());

        } else if (MenuConstants.REALIZAR_VENDA == codigo) {
            Locale ptBr = new Locale("pt", "BR");

            Vendedor vendedor = new Vendedor();
            sc.nextLine();
            System.out.println("Qual o nome do vendedor: ");
            vendedor.setNome(sc.nextLine());

            System.out.println("Qual o valor da venda ? ");
            vendedor.vender(sc.nextDouble());

            String comissaoConvertida = NumberFormat.getCurrencyInstance(ptBr).format(vendedor.getComissao());
            System.out.println(comissaoConvertida);



        } else if (MenuConstants.CONSULTAR_CARROS == codigo) {

        }

//        vendedor.vender(200000);

//        Tema do sistema = ?
//        1) na classe main a gente vai printar o Tema do nosso sistema = OK
//        2) Criar no minimo 3 classe (superclasse) = Entidades / Dominios = OK
//        3) Criar no minimo 1 classe filha para cada superclasse = OK
//        4) Todas classes precisam ter os atributos privados com GETTERS e SETTERS = OK
//        5) Todas classes precisam ter construtores = OK
//        6) A classe filha precisa sobrecarregar 1 metodo = OK
//        7) Na classe main voces vao precisar instanciar todas classes Filhas = EM ANDAMENTO
//        8) Usar scanner para atribuir valores da classe e filha = EM ANDAMENTO
//        9) e usar scanner para acionar metodos = EM ANDAMENTO

        // duvidas

        // 01 -
        // 02 -
        // 03 -
        // 04 -
        // 05 -

//        Orientacao a objeto
//        encapsulamento
//        atributos
//        metodos
//        heranca
//        polimorfismo
//        condicao
//        repeticao


//        listas -> outra aula

    }


}