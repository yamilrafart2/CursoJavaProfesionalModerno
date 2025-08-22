package RutaJavaModerno;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class Nio {
    
    public static void main(String[] args) {
    
        String fileName = "/Users/yamilrafart/CursoJavaProfesionalModerno/RutaJavaModerno/some_data.json";
        copyWithStreams(fileName, fileName + ".streams.bak");
        copyWithReaderWriter(fileName, fileName + ".reader_writer.bak");

        echoServer();
        

    }

    private static void copyWithStreams(String sourceFile, String outputFile) {
        // FileInputStream inStream;
        // FileOutputStream outStream;

        /* VIEJA ESCUELA
        try {
            inStream = new FileInputStream(fileName);
            outStream = new FileOutputStream(fileName + ".bak");
            
            int chunk;
            while ((chunk = inStream.read()) != -1) {
                outStream.write(chunk);
            }
            inStream.close();
            outStream.close();
        } catch (IOException ioException) {
            throw new RuntimeException("Algo fallo con los archivos", ioException);
        }
        */

        // MODERNO
        try(
            FileInputStream inStream = new FileInputStream(sourceFile);
            FileOutputStream outStream = new FileOutputStream(outputFile);
        ) {
            int chunk;
            while ((chunk = inStream.read()) != -1) {
                outStream.write(chunk);
            }
        } catch (IOException ioException) {
            throw new RuntimeException("Algo fallo con los archivos", ioException);
        }
    }

    private static void copyWithReaderWriter(String sourceFile, String outputFile) {
        // MODERNO
        try(
            FileReader inStream = new FileReader(sourceFile);
            FileWriter outStream = new FileWriter(outputFile);
        ) {
            int chunk;
            while ((chunk = inStream.read()) != -1) {
                outStream.write(chunk);
            }
        } catch (IOException ioException) {
            throw new RuntimeException("Algo fallo con los archivos", ioException);
        }
    }

    private static void echoServer() {
        
        try {
            Selector selector = Selector.open();

            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.bind(new InetSocketAddress("localhost", 8888));
            serverSocketChannel.configureBlocking(false);
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

            System.out.println("Server running...");

            while (true) {
                selector.select();
                Set<SelectionKey> selectionKeysSet = selector.selectedKeys();
                Iterator<SelectionKey> selectionKeyIterator = selectionKeysSet.iterator();
                while (selectionKeyIterator.hasNext()) {
                    SelectionKey key = selectionKeyIterator.next();

                    if (key.isAcceptable()) {
                        ServerSocketChannel serverChannel = (ServerSocketChannel) key.channel();
                        SocketChannel socketChannel = serverChannel.accept();
                        socketChannel.configureBlocking(false);
                        socketChannel.register(selector, SelectionKey.OP_READ);
                    } else if (key.isReadable()) {
                        SocketChannel socketChannel = (SocketChannel) key.channel();
                        ByteBuffer buffer = ByteBuffer.allocate(1024);
                        int bytes = socketChannel.read(buffer);

                        if (bytes == -1) {
                            socketChannel.close();
                            System.out.println("Uy se rompio!");
                        } else if (bytes > 0) {
                            buffer.flip();
                            byte[] data = new byte[bytes];
                            buffer.get(data);
                            String echoMessage = new String(data);
                            
                            System.out.println("Mensaje recibido > " + socketChannel.getRemoteAddress() + " --> " + echoMessage);
                            socketChannel.write(ByteBuffer.wrap(data));
                        }
                    }
                    selectionKeyIterator.remove();
                }
            }
        } catch (IOException ioException) {
            throw new RuntimeException("IO Exception cachada pero fallo");
        }

    }

}
