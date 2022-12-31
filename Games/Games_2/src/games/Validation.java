/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package games;

import java.util.regex.*;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Desi
 */
public class Validation {

    public boolean Username(String username1) {

        Pattern p = Pattern.compile("\\w+{2,30}");

        Matcher m = p.matcher(username1);

        return m.matches();
    }

    public boolean Age(String age1) {

        char[] age = age1.toCharArray();

        boolean a = true;
        double age2 = 0;

        for (int i = 0; i < age.length; i++) {
            age2 = (age[age.length - 1 - i] - 48) * Math.pow(10, i);
        }

        if (age2 < 18 || age2 > 118) {

            a = false;

        }

        return a;

    }

    public boolean Email(String email1) {

        Pattern p = Pattern.compile("\\w+@\\\\w+\\\\.[a-zA-Z]{2,3}$");

        Matcher m = p.matcher(email1);

        return m.matches();
    }

    public boolean Password(String password1) {

        Pattern p = Pattern.compile("\\[a-zA-Z_0-9-$%@]{5,17}$");

        Matcher m = p.matcher(password1);

        return m.matches();

    }

    public boolean RepeatPassword(String p1, String p2) {

        if (p1.compareTo(p2) == 0) {

            return true;
        } else {
            return false;
        }
    }

    public void File(String a) throws FileNotFoundException {
        PrintStream fileWriter = new PrintStream("C:\\Registrations.txt");

        fileWriter.println(a);
        fileWriter.close();
    }

    public  boolean Registrations(String a) throws FileNotFoundException {

        File file = new File("C:\\Registrations.txt");
        Scanner fileReader = new Scanner(file);
        int lineNumber = 0;

        int n = 0;

        while (fileReader.hasNextLine()) {

            lineNumber++;

            if (fileReader.nextLine().compareTo(a) == 0) {

                n++;
            }
        }

        fileReader.close();

        if (n == 0) {

            return true;
        } else {

            return false;
        }

    }
    
    int n=0;
}
