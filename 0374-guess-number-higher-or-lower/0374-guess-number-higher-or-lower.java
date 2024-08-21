public class Solution extends GuessGame
{
    public int guessNumber(int n)
    {
        int start = 1 , end = n , mid = 0 , guess = 0;
        while(start <= end)
        {
             mid = start + (end - start)/2;
             guess = guess(mid);

          if(guess == -1)
          {
             end = mid - 1;
          }
          else if(guess == 1)
          {
             start = mid + 1;
          }
          else
          {
            return mid;
          }
        }
        return mid;
    }
}