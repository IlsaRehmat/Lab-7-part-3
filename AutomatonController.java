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
 * Question 29
 * A new nextState array is used to store the next iteration's state 
 * without altering the current state while it’s being processed. 
 * If you modify the state array directly, you risk using updated values 
 * in the same iteration, leading to incorrect behavior.
 * 
 * Question 30
 * We use nextState to avoid overwriting the state array while updating it.
 * If we modify state directly, we might change values that are still
 * needed for calculating the next cells, leading to incorrect results.
 * Using nextState ensures we always use the original values
 * for calculations and then update the state array at the end.
 * Modifying state directly would cause errors, so creating a new array 
 * is the safest solution.
 * 
 * Question 33
 * Given the three binary values for the neighbors (left, center, right),
 * there are 8 possible combinations of these three values 
 * (since each can be either 0 or 1). 
 * Each combination can result in either a 0 or 1 for the next state.
 * Thus, there are 8 possible combinations of left, center, and right, 
 * and for each combination, you can choose one of two states (0 or 1). 
 * This gives 256 unique possible rules (since `2^8 = 256.
 * 
 * Question 34
 * 
 * 
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
