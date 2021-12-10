package classes;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;

public class SaveAndLoad {
    private ArrayList<byte[]> parallelogramData = new ArrayList<>();
    private ArrayList<byte[]>quadrangleData = new ArrayList<>();

    public void saveParallelogram(ArrayList<Parallelogram>list) throws IOException {
        OutputStream os = new FileOutputStream("parallelogram.bin");
        BufferedOutputStream bos = new BufferedOutputStream(os);
        String size =  Integer.toString(list.size());
        byte[] listSize = size.getBytes(StandardCharsets.UTF_8);
        bos.write(listSize);
        bos.close();
        os.close();
        os = new FileOutputStream("parallelogram.bin",true);
        for (var el : list){
            double angle1 = el.angle1;
            double angle2 = el.angle2;
            double coord1X =el.getDot1().getX();
            double coord1Y = el.getDot1().getY();
            double coord2X =el.getDot2().getX();
            double coord2Y = el.getDot2().getY();
            double coord3X =el.getDot3().getX();
            double coord3Y = el.getDot3().getY();
            double coord4X =el.getDot4().getX();
            double coord4Y = el.getDot4().getY();
            os.write((Double.toString(angle1)).getBytes(StandardCharsets.UTF_8));
            os.write((Double.toString(angle2)).getBytes(StandardCharsets.UTF_8));
            os.write((Double.toString(coord1X)).getBytes(StandardCharsets.UTF_8));
            os.write((Double.toString(coord1Y)).getBytes(StandardCharsets.UTF_8));
            os.write((Double.toString(coord2X)).getBytes(StandardCharsets.UTF_8));
            os.write((Double.toString(coord2Y)).getBytes(StandardCharsets.UTF_8));
            os.write((Double.toString(coord3X)).getBytes(StandardCharsets.UTF_8));
            os.write((Double.toString(coord3Y)).getBytes(StandardCharsets.UTF_8));
            os.write((Double.toString(coord4X)).getBytes(StandardCharsets.UTF_8));
            os.write((Double.toString(coord4Y)).getBytes(StandardCharsets.UTF_8));
        }
        os.close();
    }

    public void saveQuadrangles(ArrayList<Quadrangle>list) throws IOException {
        OutputStream os = new FileOutputStream("quadrangle.bin");
        BufferedOutputStream bos = new BufferedOutputStream(os);
        String size =  Integer.toString(list.size());
        byte[] listSize = size.getBytes(StandardCharsets.UTF_8);
        bos.write(listSize);
        bos.close();
        os.close();
        os = new FileOutputStream("quadrangle.bin",true);
        for (var el : list){
            double angle1 = el.angle1;
            double angle2 = el.angle2;
            double coord1X =el.getDot1().getX();
            double coord1Y = el.getDot1().getY();
            double coord2X =el.getDot2().getX();
            double coord2Y = el.getDot2().getY();
            double coord3X =el.getDot3().getX();
            double coord3Y = el.getDot3().getY();
            double coord4X =el.getDot4().getX();
            double coord4Y = el.getDot4().getY();
            os.write((Double.toString(angle1)).getBytes(StandardCharsets.UTF_8));
            os.write((Double.toString(angle2)).getBytes(StandardCharsets.UTF_8));
            os.write((Double.toString(coord1X)).getBytes(StandardCharsets.UTF_8));
            os.write((Double.toString(coord1Y)).getBytes(StandardCharsets.UTF_8));
            os.write((Double.toString(coord2X)).getBytes(StandardCharsets.UTF_8));
            os.write((Double.toString(coord2Y)).getBytes(StandardCharsets.UTF_8));
            os.write((Double.toString(coord3X)).getBytes(StandardCharsets.UTF_8));
            os.write((Double.toString(coord3Y)).getBytes(StandardCharsets.UTF_8));
            os.write((Double.toString(coord4X)).getBytes(StandardCharsets.UTF_8));
            os.write((Double.toString(coord4Y)).getBytes(StandardCharsets.UTF_8));
        }
        os.close();
    }

    public void loadParallelogram() throws IOException {
        FileInputStream inFile = new FileInputStream("parallelogram.bin");
        int bytesAvailable = inFile.available();
        byte[] bytesReaded = new byte[bytesAvailable];
        int count = inFile.read(bytesReaded, 0, bytesAvailable);

        System.out.println("Было считано байт: " + count);
        System.out.println(Arrays.toString(bytesReaded));

    }

    public void loadQuadrangle() throws IOException {
        FileInputStream inFile = new FileInputStream("quadrangle.bin");
        int bytesAvailable = inFile.available();
        byte[] bytesReaded = new byte[bytesAvailable];
        int count = inFile.read(bytesReaded, 0, bytesAvailable);

        System.out.println("Было считано байт: " + count);
        System.out.println(Arrays.toString(bytesReaded));
    }
}
