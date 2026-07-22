import java.util.ArrayList;
public class Leitor extends Usuario{private ArrayList<Acervo> emprestimos=new ArrayList<>(); public Leitor(String nome,int id,String senha){super(nome,id,senha);} public void emprestar(Acervo item){if(emprestimos.size()<3){emprestimos.add(item);System.out.println("Item emprestado: "+item.getTitulo());}else System.out.println("Limite de empréstimos atingido.");}}
