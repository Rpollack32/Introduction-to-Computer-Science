public class StringRec{
 	public static String decompress(String compressed){
		if(compressed.length() == 0){
			return "";
		}else{
			char c = compressed.charAt(0);
		  if(Character.isDigit(c)){
        if(c == '0'){
          return decompress(compressed.substring(2));
			}
			    return compressed.charAt(1) + decompress(((char)(c - 1)) + compressed.substring(1));
			}else{
				  return c + decompress(compressed.substring(1));
			}
		}
	}

	public static void main(String args[]){
		String longWord = IO.readString();
		String word = decompress(longWord);
		System.out.println(word);
	}
}
