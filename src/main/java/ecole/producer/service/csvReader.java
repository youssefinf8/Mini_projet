package ecole.producer.service;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.opencsv.bean.CsvToBeanBuilder;
import ecole.producer.model.Ecolecsv;
@Service
public class csvReader {

 private static final Logger log = LoggerFactory.getLogger(csvReader.class);
    
    private final String dataFolder;

    public csvReader(@Value("${ecole.data-folder}")String dataFolder)
     {
        this.dataFolder = dataFolder;
    }

    public List<Ecolecsv> readEcole(String fileName) {
        String filePath = dataFolder + File.separator + fileName;
        log.debug("Parsing file: {}", filePath);
        try {
            return new CsvToBeanBuilder<Ecolecsv>(new FileReader(filePath))
                    .withType(Ecolecsv.class)
                    .build()
                    .parse();
        } catch (Exception e) {
            log.error("Could not parse file: {}", filePath, e);
            throw new RuntimeException("Could not parse Csv file: " + fileName + ". Cause by: " + e, e);
        }
    }
    
}
