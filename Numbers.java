import java.util.Random;
/**
 * Write a description of class Numbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Numbers
{
    // instance variables - replace the example below with your own
    int[] nums;
    Random r = new Random();
    /**
     * Constructor for objects of class Numbers
     */
    public Numbers(int n)
    {
        // initialise instance variables
        nums = new int[n];
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void fillRandomly()
    {
        for(int i = 0; i< nums.length ; i ++)
        {
            nums [i] = r.nextInt(1001);
        }
    }
    
    public double calcAverage()
    {
        int sum = 0;
        double average = 0;
        
        for (int i = 0; i < nums.length; i++)
        {
            sum += nums [i];
        }
        
        average = (sum/nums.length);
        return average;
    }
    
    public int findMin()
    {
        int min = nums[0];
        for(int i = 0; i < nums.length; i++)
        {
            if(nums [i] < min)
            {
                min = nums [i];
            }
        }
        return min;
    }
    
    public int findMax()
    {
        int max = nums[0];
        for(int i = 0; i < nums.length; i++)
        {
            if(nums [i] > max)
            {
                max = nums [i];
            }
        }
        return max;
    }
}