package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private String titulo;
	private String publicacao;
	private Integer likes;
	
	private List<Comentario> comentarios = new ArrayList<>();
	
	public Post() {
	}

	public Post(Date momento, String titulo, String publicacao, Integer likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.publicacao = publicacao;
		this.likes = likes;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(String publicacao) {
		this.publicacao = publicacao;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public void adicionarComentario(Comentario comentario) {
		comentarios.add(comentario);
	}
	
	public void removerComentario(Comentario comentario) {
		comentarios.remove(comentario);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(momento) + "\n");
		sb.append(publicacao + "\n");
		sb.append("Comentarios: " + "\n");
		for (Comentario c : comentarios) {
			sb.append(c.getTexto() + "\n");
		}
		return sb.toString();
	}
	
}
