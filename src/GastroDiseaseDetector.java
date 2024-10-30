public class GastroDiseaseDetector implements PatternDetector{
    private int index;

    @Override
    public int detect(GenomeAnalyzer analyzer) {
        int idx = -1;
        for (int i = 0; i < analyzer.buffer.length(); i++) {
            if (analyzer.buffer.charAt(i) == 'G' && idx == -1) {
                idx = i;
            } else if (idx != -1) {
                if (analyzer.buffer.charAt(i) == 'G' && i != idx + 1) {
                    index = idx;
                    break;
                } else if (analyzer.buffer.charAt(i) != 'T') {
                    index = -1;
                    break;
                }
            }
        }
        return index;
    }

    @Override
    public String labelString() {
        return "Martian has a gastro disease a martian will have this genome pattern. One G, followed by Ts, then ending in a G. ";
    }

    @Override
    public String additionalInfo() { return "Gastro pattern detected at index " + index; }
}
