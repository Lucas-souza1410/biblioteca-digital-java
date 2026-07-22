public abstract class Usuario {
protected String nome; protected int id; protected String senha;
public Usuario(String nome,int id,String senha){this.nome=nome;this.id=id;this.senha=senha;}
public abstract void emprestar(Acervo item);
public void devolver(Acervo item){System.out.println("Item devolvido: "+item.getTitulo());}}
