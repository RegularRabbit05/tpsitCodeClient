package client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8000);
        OutputStream s = socket.getOutputStream();
        Class<Run> clazz = Run.class;
        byte[] bytes = new byte[4096000];
        int v = clazz.getClassLoader().getResourceAsStream(clazz.getName().replace('.', '/') + ".class").read(bytes);
        s.write(bytes, 0, v);
        socket.close();
    }
}
