public class GeniusDetector implements PatternDetector {
    private int index;

    @Override
    public int detect(GenomeAnalyzer analyzer) {
        index = analyzer.findSimpleSequence("GAGA");
        return index;
    }

    @Override
    public String labelString() {
        return "Genius Detector detects if a Martian is a genius. a martian is a genius if it has the string, “GAGA” anywhere in its genome. ";
    }

    @Override
    public String additionalInfo() {
        return "Pattern 'GAGA' detected at index" + index;
    }
}
