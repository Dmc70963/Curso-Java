package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora"); // s = s.replace("X", "Senhora"); ( Substitue o X por Senhora )
		s = s.toUpperCase(); // s.toUpperCase(); ( Converte para maiúsculo )
		s = s.concat(" !!"); // s = s.concat(" !!"); ( Concatena string com outra string )
		System.out.println(s);
	}
}
