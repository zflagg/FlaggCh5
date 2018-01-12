
public class Probability implements ProbabilityCalc, Comparable<Probability> {
    private double prob;
    private int sampleSpace;
    private int favorable;
    public Probability(int fav, int sample){
        //initiallize variables
        this.favorable = fav;
        this.sampleSpace = sample;
        prob = ((double)favorable)/sampleSpace;
    }
    public double probabilityAND(){
        if(
    }
    public double probabilityOR(){
        
    }
    public int commpareTo(Probability other) {
        if(this.prob > other.prob) {
            return 1;
        }
        else if(this.prob < other.prob) {
            return -1;
        }
        else {
            return 0;
        }
    }
}