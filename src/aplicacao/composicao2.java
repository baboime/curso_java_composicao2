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
		String publicacao = "Estou indo visitar este maravilhoso país";
		int likes = 12;
		
		Post post = new Post(momento, titulo, publicacao, likes);
		
		Comentario comentario = new Comentario("Faça uma ótima viagem");
		post.adicionarComentario(comentario);
		
		comentario = new Comentario("Wow isto é maravilhoso!");
		post.adicionarComentario(comentario);
		
		System.out.println(post);
		
		momento = sdf.parse("28/07/2018 23:14:19");
		titulo = "Boa noite pessoal";
		publicacao = "Vejo vocês amanhã";
		likes = 5;
		
		post = new Post(momento, titulo, publicacao, likes);
		
		comentario = new Comentario("Boa noite");
		post.adicionarComentario(comentario);
		
		comentario = new Comentario("Qua a força esteja com você");
		post.adicionarComentario(comentario);
		
		System.out.println(post);

	}

}
