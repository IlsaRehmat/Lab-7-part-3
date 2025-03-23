/**
 * Set up and control an elementary cellular automaton.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version  2016.02.29
 */
/*
 * Answers for Lab 7 part 3
 * 
 * Question 24
 * Output of the initial state: A line with * (indicating the initial active cell).
 * After calling step: The pattern evolves as the state transitions.
 * After calling run: The automaton continuously runs and shows
 * a dynamic pattern over time.
 * 
 * Question 25
 * The step method pattern is the same but the run method pattern changed.
 * 
 * Question 26
 * There are two versions of the fill method in the java.util.Arrays class
 * that take an int[] parameter. One fills the entire array with a 
 * specified value, and the other fills a specified range of the array.
 * The reset method of Automaton likely uses Arrays.fill to reset the state
 * array to a specific value, usually 0.
 * 
 * Question 27
 * I did not understand.
 * 
 * Question 28
 * 
 * 
 */
public class AutomatonController
{
    // The automaton.
    private Automaton auto;
    
    /**
     * Create an AutomatonController.
     * @param numberOfCells The number of cells in the automaton.
     */
    public AutomatonController(int numberOfCells)
    {
        auto = new Automaton(numberOfCells);
        auto.print();
    }
    
    /**
     * Create an AutomatonController with
     * a default number of cells.
     */
    public AutomatonController()
    {
        this(50);
    }
    
    /**
     * Run the automaton for the given number of steps.
     * @param numSteps The number of steps.
     */
    public void run(int numSteps)
    {
        for(int step = 1; step <= numSteps; step++) {
            step();
        }
    }
    
    /**
     * Run the automaton for a single step.
     */
    public void step()
    {
        auto.update();
        auto.print();
    }
    
    /**
     * Reset the automaton.
     */
    public void reset()
    {
        auto.reset();
        auto.print();
    }
}
