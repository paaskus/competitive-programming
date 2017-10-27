public class Substitute {
    
    public static void main(String[] args) {
        getValue("ABCDEFGHIJ", "ALKCJQPJLJ"); //13000
        getValue("ABCDEFGHIJ", "MANHWS"); //18
        getValue("ABCDEFGHIJ", "OPHYTHKVH"); //888
    }

    public static int getValue(String key, String code) {
        String result = "";
        
        for (int i = 0; i < code.length(); i++) {
            char currentChar = code.charAt(i);
            
            for (int j = 1; j <= key.length(); j++) {
                if (currentChar == key.charAt(j - 1)) {
                    if (j == 10) {
                        result = result + 0;
                    } else {
                        result = result + j;
                    }
                }
            }
        }
        System.out.println(result);
        return (int) Integer.parseInt(result);
    }
}