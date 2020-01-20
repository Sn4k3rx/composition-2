package applicattion;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Ramon é muito gato :)");
		Comment c2 = new Comment("Eu pegava esse lindo");

		Post p1 = new Post(sdf.parse("30/05/2002 00:00:00"), "RAMON", "O terror das novinhas", 5000000);

		p1.addComment(c1);
		p1.addComment(c2);
		

		Comment c3 = new Comment("Ramon é muito gato :)");
		Comment c4 = new Comment("Eu pegava esse lindo");

		Post p2 = new Post(sdf.parse("30/05/2002 00:00:00"), "RAMON", "O terror das novinhas", 5000000);

		p2.addComment(c3);
		p2.addComment(c4);

	}

}
