/*
A�adir EN ESTE ORDEN:
- Literales reales: 3.15, 78.23, ... (parte entera obligatoria/parte decimal OPCIONAL)
- Operadores aritm�ticos y otros simbolos:  + - * / . : = ; [ ] ( ) { } < >
- Palabras reservadas: if, while, read, print, int y float
*/

package lexer;

import java.io.*;
import java.util.*;

public class Lexico {
    public static final int END = 0;

    public static final int LITENT = 256;
    public static final int IDENT = 257;
    public static final int LITREAL = 259;
    public static final int WHILE = 260;
    public static final int IF = 261;
    public static final int INT = 262;
    public static final int FLOAT = 263;
    public static final int PRINT = 264;
    public static final int READ = 265;

    private Reader input;
    private int currentChar; // Se inicializa en constructor

    private String tokensDeUnChar;
    private Map<String, Integer> palabrasReservadas;
    private int line = 1;

    public Lexico(Reader reader) throws IOException {

        this.input = reader;

        // Esto deber�a estar fuera del L�xico. Es s�lo un ejemplo.
        this.tokensDeUnChar = "+-*/.:=;[](){}<>";

        // Esto deber�a estar fuera del L�xico. Es s�lo un ejemplo.
        palabrasReservadas = new HashMap<String, Integer>();
        palabrasReservadas.put("while", WHILE);
        palabrasReservadas.put("if", IF);
        palabrasReservadas.put("int", INT);
        palabrasReservadas.put("float", FLOAT);
        palabrasReservadas.put("print", PRINT);
        palabrasReservadas.put("read", READ);

        readNext();
    }

    public Lexico(Reader reader, String tokensDeUnChar, Map<String, Integer> palabrasReservadas) throws IOException {
        this.input = reader;
        this.tokensDeUnChar = tokensDeUnChar;
        this.palabrasReservadas = palabrasReservadas;

        readNext();
    }

    // Funciones auxiliares -------------------------------
    private int readNext() throws IOException {
        currentChar = input.read();
        return currentChar;
    }

    private int getChar() throws IOException {
        return currentChar;
    }

    // Aqu� empieza el Analizador L�xico ------------------
    public Token nextToken() throws IOException {

        while (true) {
            while (Character.isWhitespace(getChar())) {
                if (getChar() == '\n')
                    line++;
                readNext();
            }

            if (getChar() == -1)
                return new Token(END, null, line);

            int index = tokensDeUnChar.indexOf(getChar());
            if (index != -1) {
                int character = getChar();
                readNext();
                return new Token(character, Character.toString((char) character), line);
            }

            if (Character.isDigit(getChar())) {
                StringBuffer buffer = new StringBuffer();
                buffer.append((char) getChar());
                while (Character.isDigit(readNext()))
                    buffer.append((char) getChar());

                if (getChar() != '.')
                    return new Token(LITENT, buffer.toString(), line);

                buffer.append((char) getChar());
                while (Character.isDigit(readNext()))
                    buffer.append((char) getChar());
                return new Token(LITREAL, buffer.toString(), line);
            }

            if (Character.isLetter(getChar())) {
                StringBuffer buffer = new StringBuffer();
                buffer.append((char) getChar());
                while (Character.isLetterOrDigit(readNext()))
                    buffer.append((char) getChar());

                String lexeme = buffer.toString();
                Object token = palabrasReservadas.get(lexeme);
                if (token != null)
                    return new Token((Integer) token, lexeme, line);

                return new Token(IDENT, buffer.toString(), line);
            }

            System.out.println("Error l�xico en linea " + line + ": '" + (char) getChar() + "'");
            readNext();
        }
    }
}
