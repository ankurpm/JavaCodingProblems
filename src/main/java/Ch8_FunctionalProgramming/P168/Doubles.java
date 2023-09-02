package Ch8_FunctionalProgramming.P168;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Doubles {

    public double read(ScannerDoubleFunction scannerDoubleFunction) throws IOException {
        try(Scanner scanner = new Scanner(Path.of("doubles.txt"), StandardCharsets.UTF_8)){
            return scannerDoubleFunction.readDouble(scanner);
        }
    }

    public double getFirst(Scanner scanner){
        if(scanner.hasNextDouble()){
            return scanner.nextDouble();
        }
        return Double.NaN;
    }

    public double sumAll(Scanner scanner){
        double sum = 0.0d;
        while(scanner.hasNextDouble()){
            sum += scanner.nextDouble();
        }
        return sum;
    }
}
