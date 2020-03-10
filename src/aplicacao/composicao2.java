package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import entidades.Comentario;
import entidades.Post;

public class composicao2 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date momento = sdf.parse("21/06/2018 13:05:44");
		String titulo = "Viajando para Nova Zelandia";
		String publicacao = "Estou indo visitar este maravilhoso pa�s";
		int likes = 12;
		
		Post post = new Post(momento, titulo, publicacao, likes);
		
		Comentario comentario = new Comentario("Fa�a uma �tima viagem");
		post.adicionarComentario(comentario);
		
		comentario = new Comentario("Wow isto � maravilhoso!");
		post.adicionarComentario(comentario);
		
		System.out.println(post);
		
		momento = sdf.parse("28/07/2018 23:14:19");
		titulo = "Boa noite pessoal";
		publicacao = "Vejo voc�s amanh�";
		likes = 5;
		
		post = new Post(momento, titulo, publicacao, likes);
		
		comentario = new Comentario("Boa noite");
		post.adicionarComentario(comentario);
		
		comentario = new Comentario("Qua a for�a esteja com voc�");
		post.adicionarComentario(comentario);
		
		System.out.println(post);

	}

}
