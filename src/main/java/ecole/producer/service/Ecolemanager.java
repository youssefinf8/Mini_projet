package ecole.producer.service;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ecole.producer.model.Ecolecsv;

@Service
public class Ecolemanager {
    private static final Logger log = LoggerFactory.getLogger(Ecolemanager.class);

    private final csvReader csvReader;
    private final KafkaSender kafkaSender;
    
    public Ecolemanager(csvReader csvReader,
                                KafkaSender kafkaSender) {
        this.csvReader = csvReader;
        this.kafkaSender = kafkaSender;
    }

    public void transfer(String csvFileName) {
        log.info("Transferring data from CSV file: {} to Kafka", csvFileName);

        List<Ecolecsv> csvEcole = csvReader.readEcole(csvFileName);
        log.info("Sending csv ecole to kafka");
        
        csvEcole
        .stream()
        .map(csv  -> EcoleMapper.toJson(csv))
        .forEach(ecole -> 
        {
            kafkaSender.sendEcole(ecole);
        }
        );
        log.info("Finished transferring file: {}", csvFileName);
    }
    
}
