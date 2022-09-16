class CaesarCipher {
    // Caesar's Cipher
    public static String encrypt(String input, int rotation) {
        // Check for null
        if (input == null) {
            return null;
        }
        // string which we will be use to encrypt input string
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
        int charactersLength = characters.length();

        // Convert to char array
        char[] c = characters.toCharArray();

        String output = "";

        // Traverse no. of times as input length
        for (int i = 0; i < input.length(); i++) {
            // Find the index of each character in input, in the base string i.e. characters
            int index = characters.indexOf(input.charAt(i));
            int shift = index + rotation;

            // Consider the case when index is 0 i.e char is A and rotation is -54 we should
            // encrypt it as " " i.e at index 52 in characters. -54 is not a valid index in
            // characters. We need to find a way to obtain valid index and encrypt correctly
            // Valid index can be obtained by adding the length of base string i.e 53 to
            // remainder of shift divided by length of base string i.e -1.
            // Now valid index is 53 - 1 = 52 i.e., " "
            if (shift % charactersLength < 0) {
                output += c[charactersLength + shift % charactersLength];
            }

            // Valid index can be obtained by remainder of shift divided by charactersLength
            else if (index + rotation > charactersLength || shift % charactersLength == 0) {
                output += c[shift % charactersLength];
            }

            // Valid index is shift when it lies between the interval (0, charactersLength);
            else {
                output += c[shift];
            }
            index = 0;
        }
        return output;
    }

    public static void main(String[] args) {
        String positiveRotation = encrypt("ABCD", 135);
        String negativeRotation = encrypt("ABCD", -87);
        System.out.println("Encrypted value with negative rotation is: " + negativeRotation);
        System.out.println("Encrypted value with positive rotation is: " + positiveRotation);
    }
}