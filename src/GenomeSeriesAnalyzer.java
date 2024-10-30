import java.util.ArrayList;

public class GenomeSeriesAnalyzer extends GenomeAnalyzer {
    private ArrayList<PatternDetector> detectors = new ArrayList<>();

    public GenomeSeriesAnalyzer(String filename) {
        super(filename);
    }

    public void addDetector(PatternDetector detector) {
        detectors.add(detector);
    }

    public void run() {
        for (PatternDetector detector : detectors) {
            int index = detector.detect(this);
            System.out.print(detector.labelString());
            String additionalInfo = detector.additionalInfo();
            System.out.println(additionalInfo);
            System.out.println();
        }
    }
}
