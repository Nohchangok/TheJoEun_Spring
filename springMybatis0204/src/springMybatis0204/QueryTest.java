package springMybatis0204;

public class QueryTest {

	public static void main(String[] args) {

		String str = "select * from blog ";
		String title ="";
		String anuthor="";

		if (title != null) {
			str += "where title like #{title}";
			if (anuthor != null) {
				str += " and author_name like #{author}";
			}
		} else if (anuthor != null) {
			str += "where author_name like #{author}";
		} 
		System.out.println(str);
	
	}

}
