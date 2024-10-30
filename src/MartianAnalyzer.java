public class MartianAnalyzer {
    public static void main(String[] args) {
        GenomeSeriesAnalyzer analyzer = new GenomeSeriesAnalyzer("test.txt");
        analyzer.addDetector(new GeniusDetector());
        analyzer.addDetector(new RepeaterDetector('G', 5));
        analyzer.addDetector(new GastroDiseaseDetector());
        analyzer.run();
    }
}
