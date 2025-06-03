package com.mycompany.sistemaacademico2;

import javax.swing.JOptionPane;

public class SistemaAcademico2 {

    public static void main(String[] args) {
        String menu = "1 - Cadastrar\n2 - Atualizar\n3 - Apagar\n4 - Listar\n0 - Sair";
        int op;
        
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch(op) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome:");
                    String fone = JOptionPane.showInputDialog("Digite o fone: ");
                    String email = JOptionPane.showInputDialog("Digite o email: ");
                    
                    var pessoa = new Pessoa(nome, fone, email);
                    var dao = new PessoaDAO();
                    
                    pessoa.setNome(nome);
                    pessoa.setFone(fone);
                    pessoa.setEmail(email);
                    dao.cadastrar(pessoa);
                    break;
                case 2:
                    
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite uma opção válida");
            }
        } while(op != 0);
    }
}
