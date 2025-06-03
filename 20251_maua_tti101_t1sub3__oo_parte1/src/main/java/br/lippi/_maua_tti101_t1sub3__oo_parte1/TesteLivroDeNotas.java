package br.lippi._maua_tti101_t1sub3__oo_parte1;

public class TesteLivroDeNotas {
    public static void main(String[] args) {
        System.out.println("Começou...");
        var livro1 = new LivroDeNotas();
        livro1.nomeMateria = "POO";
        livro1.exibirMensagem();
        var livro2 = new LivroDeNotas();
        livro2.nomeMateria = "LP";
        livro2.exibirMensagem();
        System.out.println("Acabou!");
    }
}
