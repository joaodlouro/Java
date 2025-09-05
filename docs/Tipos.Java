public class Tipos {
    public static void main(String[] args) {
        
        // 🔢 Numéricos inteiros
        byte b = 100;           // 8 bits  (-128 a 127)
        short s = 10000;        // 16 bits (-32.768 a 32.767)
        int i = 100000;         // 32 bits (-2bi a 2bi)
        long l = 100000L;       // 64 bits (-9E18 a 9E18)

        // 🔢 Numéricos decimais
        float f = 230.47f;      // 32 bits (precisão simples)
        double d = 123.4;       // 64 bits (precisão dupla)

        // 🔤 Texto e caracteres
        char c = 'W';           // um caractere
        String st = "Fulano";   // sequência de caracteres

        // ✅ Booleano
        boolean bo1 = true;
        boolean bo2 = false;

        // 🔄 Arrays
        int[] numeros = {1, 2, 3, 4, 5};
        int[] vazio = new int[4]; // espaço para 4 valores

        // 🔎 Comparação de Strings
        String nome = "Pedro";
        if (nome.equals("Pedro")) {
            System.out.println("É Pedro!");
        } else {
            System.out.println("Não é Pedro.");
        }

        // ✅ Saídas
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("String: " + st);
        System.out.println("boolean: " + bo1 + ", " + bo2);
    }
}
