package one;

import java.io.IOException;

public class main {
    public static void main (String[] args){

        jib jib = new jib();

        try {
            jib.job();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
