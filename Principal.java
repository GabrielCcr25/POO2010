package br.com.exemploclassearratlist;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Pessoa p1;
        String nome;
        int idade;
        int opcao;
        int i=0;
        nome = JOptionPane.showInputDialog("Digite o Nome");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade"));
        String cpf = JOptionPane.showInputDialog("Digite o CPF");
        p1 = new Pessoa(nome, idade, cpf);
        pessoas.add(p1);


        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("<1> Cadastrar\n<2>Visualizar\n<3>Sair"));

            switch (opcao) {
                case 1:
                    nome = JOptionPane.showInputDialog("Entre com o nome:");
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com sua idade: "));
                    cpf = JOptionPane.showInputDialog("Digite o cpf: ");
                    p1 = new Pessoa((nome,idade,cpf);
                    pessoas.add(p1);
                    break;

                case 2:
                    for (Pessoa contato: pessoas) {
                        System.out.printf("Posição %d- %s %s %d\n", i, contato.getNome(), contato.getCpf(), contato.getIdade() );
                        i++;
                    }
                    break;

                case 3:
                    String buscar = JOptionPane.showInputDialog("Nome pra excluir");
                    int j;
                    for (j=0;j<pessoas.size();j++){
                        if(pessoas.get(j).getNome().equals(buscar)){
                            pessoas.remove(j);
                            JOptionPane.showMessageDialog(null,"Nome excluido com sucesso");
                        }

                }
                    break;



            }


            }while (i<=3);

    }
}

